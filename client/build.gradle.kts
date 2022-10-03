description = "OpenTelemetry Opamp Protobufs"

plugins {
  id("otel.java-conventions")
}

dependencies {
  implementation(project(":proto"))
}
