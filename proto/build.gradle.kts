description = "OpenTelemetry Opamp Protobufs"

plugins {
    id("otel.java-conventions")
}

val protobufVersion = "3.19.4"

dependencies {
    implementation("com.google.protobuf:protobuf-java:$protobufVersion")
}
