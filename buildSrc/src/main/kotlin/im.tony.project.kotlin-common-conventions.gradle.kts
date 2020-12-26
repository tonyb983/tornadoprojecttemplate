/*
 * This file was generated by the Gradle 'init' task.
 */

plugins {
  // Apply the org.jetbrains.kotlin.jvm Plugin to add support for Kotlin.
  kotlin("jvm")
}

repositories {
  mavenCentral()
  google()
  jcenter()
  maven(url = "https://dl.bintray.com/kotlin/kotlinx")
  maven(url = "https://kotlin.bintray.com/kotlinx/")
  maven(url = "https://jitpack.io")
  maven(url = "https://oss.sonatype.org/content/repositories/snapshots/")
  maven(url = "https://dl.bintray.com/kotlin/kotlin-plugin/")
  maven(url = "https://kotlin.bintray.com/kotlin-dependencies")
  maven(url = "https://jetbrains.bintray.com/intellij-third-party-dependencies/")
  maven(url = "https://dl.bintray.com/arrow-kt/arrow-kt/")
  maven(url = "https://dl.bintray.com/konform-kt/konform")
  // For ArrowFx snapshot builds
  // maven(url = "https://oss.jfrog.org/artifactory/oss-snapshot-local/")
}

dependencies {
  // Align versions of all Kotlin components
  implementation(platform(Deps.Kotlin.WithBom.Bom))
  // Kotlin StdLibs
  implementation(Deps.Kotlin.WithBom.Stdlib.Jdk8)
  implementation(Deps.Kotlin.WithBom.Stdlib.Common)
  implementation(Deps.Kotlin.WithBom.Stdlib.Core)

  // Align versions of all KotlinX Coroutine Libs
  implementation(platform(Deps.KotlinX.Coroutines.WithBom.Bom))
  // Kotlinx Coroutine Libs
  implementation(Deps.KotlinX.Coroutines.WithBom.Core)
  implementation(Deps.KotlinX.Coroutines.WithBom.Jdk8)
  implementation(Deps.KotlinX.Coroutines.WithBom.Jdk9)
  implementation(Deps.KotlinX.Coroutines.WithBom.Debug)
  testImplementation(Deps.KotlinX.Coroutines.WithBom.Test)

  // Use JUnit Jupiter API for testing.
  testImplementation(Deps.Testing.JUnit.Api)

  // Use JUnit Jupiter Engine for testing.
  testRuntimeOnly(Deps.Testing.JUnit.Engine)

  testImplementation(Deps.Testing.Kotest.Runner.JUnit5) // for kotest framework
  testImplementation(Deps.Testing.Kotest.Assertions.Core) // for kotest core jvm assertions
  testImplementation(Deps.Testing.Kotest.Assertions.Json)
  testImplementation(Deps.Testing.Kotest.Assertions.Sql)
  testImplementation(Deps.Testing.Kotest.Assertions.Konform)
  testImplementation(Deps.Testing.Kotest.Property) // for kotest property test
  testImplementation(Deps.Testing.Kotest.Extensions.Http)
  testImplementation(Deps.Testing.Kotest.Extensions.MockServer)
  testImplementation(Deps.Testing.Kotest.Extensions.TestContainers)

  testImplementation(Deps.Testing.MockK.Common)

  testImplementation(Deps.Kotlin.Test.Common)
  testImplementation(Deps.Kotlin.Test.Junit)
  testImplementation(Deps.Kotlin.Test.Junit5)
  testImplementation(Deps.KotlinX.Coroutines.Core)
  testImplementation(Deps.KotlinX.Coroutines.Test)

}

tasks.test {
  // Use junit platform for unit tests.
  useJUnitPlatform()
  this.failFast = false
  this.ignoreFailures = true
  this.testLogging {
    this.showExceptions = true
    this.showCauses = true
    this.showStandardStreams = true
  }
}
