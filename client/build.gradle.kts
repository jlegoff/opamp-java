description = "OpenTelemetry Opamp Client implementation"

plugins {
  id("otel.java-conventions")
}

val protobufVersion = "3.19.4"

dependencies {
  implementation(project(":proto"))
  implementation("com.google.protobuf:protobuf-java:$protobufVersion")
}
