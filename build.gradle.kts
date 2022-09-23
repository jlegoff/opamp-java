import com.google.protobuf.gradle.*

plugins {
  id("com.google.protobuf")
  id("de.undercouch.download")
  id("io.github.gradle-nexus.publish-plugin")
  id("nebula.release")

  id("otel.java-conventions")
}

val grpcVersion = "1.44.0"
val protobufVersion = "3.19.4"

dependencies {
  api("com.google.protobuf:protobuf-java:$protobufVersion")

  // Workaround for @javax.annotation.Generated
  // see: https://github.com/grpc/grpc-java/issues/3633
  compileOnly("javax.annotation:javax.annotation-api:1.3.2")

  compileOnly("io.grpc:grpc-api:$grpcVersion")
  compileOnly("io.grpc:grpc-protobuf:$grpcVersion")
  compileOnly("io.grpc:grpc-stub:$grpcVersion")
}

repositories {
  mavenCentral()
  mavenLocal()
}

protobuf {
  generatedFilesBaseDir = "$projectDir/proto/src"
  protoc {
    // The artifact spec for the Protobuf Compiler
    artifact = "com.google.protobuf:protoc:$protobufVersion"
  }
}

sourceSets {
  main {
    proto {
      srcDir("opamp-spec/proto")
    }
  }
}
