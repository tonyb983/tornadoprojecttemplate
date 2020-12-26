@file:Suppress("unused", "SpellCheckingInspection", "ClassName")

object Deps : NotDependency {
  object TestFx : NotDependency {
    const val Core = "org.testfx:testfx-core:${Versions.TestFx}"
    const val JUnit5 = "org.testfx:testfx-junit5:${Versions.TestFx}"
  }

  object TornadoFx : NotDependency {
    const val Core = "no.tornado:tornadofx:${Versions.TornadoFx.Core}"
    const val ControlsFxExtensions = "no.tornado:tornadofx-controlsfx:${Versions.ControlsFx.TornadoExtensions}"
  }

  object JfxLibs : NotDependency {
    /**
     * ### JFoenix Material Design Component Library
     *
     * [Website](http://www.jfoenix.com/)
     * [Github](https://github.com/jfoenixadmin/JFoenix)
     */
    const val JFoenix = "com.jfoenix:jfoenix:${Versions.JfxLibs.JFoenix}"

    /**
     * ### A Borderless scene for use in JavaFX.
     *
     * [Github](https://github.com/goxr3plus/FX-BorderlessScene)
     */
    const val BorderlessScene = "com.github.goxr3plus:FX-BorderlessScene:${Versions.BorderlessScene}"

    /**
     * ### A JavaFX library for Gauges. The main focus of this project is to provide Gauges that can be configured in multiple ways.
     *
     * [Github](https://github.com/HanSolo/Medusa)
     */
    const val Medusa = "eu.hansolo:Medusa:${Versions.JfxLibs.Medusa}"

    /**
     * ### A collection of JavaFX controls and utilities.
     *
     * [Github](https://github.com/dlsc-software-consulting-gmbh/GemsFX)
     */
    const val GemsFx = "com.dlsc.gemsfx:gemsfx:${Versions.JfxLibs.GemsFx}"

    /**
     * ### A JavaFX library containing tiles for Dashboards.
     *
     * [Github](https://github.com/HanSolo/tilesfx)
     */
    const val TilesFx = "eu.hansolo:tilesfx:${Versions.JfxLibs.TilesFx}"

    const val ControlsFX = "org.controlsfx:controlsfx:${Versions.ControlsFx.Core}"
    const val ScenicView = "net.raumzeitfalle.fx:scenic-view:${Versions.ScenicView}"

    object FontAwesomeFx {
      const val Commons = "de.jensd:fontawesomefx-commons:${Versions.FontAwesomeFx.Commons}"
      const val Controls = "de.jensd:fontawesomefx-controls:${Versions.FontAwesomeFx.Commons}"
      const val EmojiOne = "de.jensd:fontawesomefx-emojione:${Versions.FontAwesomeFx.EmojiOne}"
      const val FontAwesome = "de.jensd:fontawesomefx-fontawesome:${Versions.FontAwesomeFx.FontAwesome}"
      const val Icons525 = "de.jensd:fontawesomefx-icons525:${Versions.FontAwesomeFx.Icons525}"
      const val MaterialDesignFont = "de.jensd:fontawesomefx-materialdesignfont:${Versions.FontAwesomeFx.MaterialDesignFont}"
      const val MaterialIcons = "de.jensd:fontawesomefx-materialicons:${Versions.FontAwesomeFx.MaterialIcons}"
      const val MaterialStackIcons = "de.jensd:fontawesomefx-materialstackicons:${Versions.FontAwesomeFx.MaterialStackIcons}"
      const val Octicons = "de.jensd:fontawesomefx-octicons:${Versions.FontAwesomeFx.Octicons}"
      const val WeatherIcons = "de.jensd:fontawesomefx-weathericons:${Versions.FontAwesomeFx.WeatherIcons}"
    }

    const val AdvancedBindings = "eu.lestard:advanced-bindings:${Versions.JfxLibs.AdvancedBindings}"
    const val BootstrapFx = "org.kordamp.bootstrapfx:bootstrapfx-core:${Versions.JfxLibs.BootstrapFx}"
  }

  object JfExtras : NotDependency {
    private const val group = "org.jfxtras"
    private const val std = "$group:jfxtras"

    const val Agenda = "$std-agenda:${Versions.JFExtras.Core}"
    const val Common = "$std-common:${Versions.JFExtras.Core}"
    const val Controls = "$std-controls:${Versions.JFExtras.Core}"
    const val FontRoboto = "$std-font-roboto:${Versions.JFExtras.Core}"
    const val Fxml = "$std-fxml:${Versions.JFExtras.Core}"
    const val GaugeLinear = "$std-gauge-linear:${Versions.JFExtras.Core}"
    const val iCalendarFx = "$std-icalendarfx:${Versions.JFExtras.Core}"
    const val Menu = "$std-menu:${Versions.JFExtras.Core}"
    const val Parent = "$std-parent:${Versions.JFExtras.Core}"
    const val TestSupport = "$std-test-support:${Versions.JFExtras.Core}"
    const val Window = "$std-window:${Versions.JFExtras.Core}"
    const val JMetro = "$group:jmetro:${Versions.JFExtras.JMetro}"
  }

  object iKonli : NotDependency {
    private const val group = "org.kordamp.ikonli"
    private const val prefix = "$group:ikonli"

    const val Core = "$prefix-core:${Versions.iKonli}"
    const val DevkitIconsPack = "$prefix-devicons-pack:${Versions.iKonli}"
    const val JavaFx = "$prefix-javafx:${Versions.iKonli}"
    const val MaterialDesignPack = "$prefix-materialdesign-pack:${Versions.iKonli}"
  }

  const val Faker = "io.github.serpro69:kotlin-faker:${Versions.KotlinFaker}"

  object Validation : NotDependency {
    const val Konform = "io.konform:konform-jvm:${Versions.Validation.Konform}"
    const val Kalidation = "com.capraro:kalidation:${Versions.Validation.Kalidation}"

    object Valiktor : NotDependency {
      private const val base = "org.valiktor:valiktor"
      private const val version = Versions.Validation.Valiktor

      const val Core = "$base-core:$version"
      const val JavaMoney = "$base-javamoney:$version"
      const val JavaTime = "$base-javatime:$version"
      const val JodaMoney = "$base-jodamoney:$version"
      const val JodaTime = "$base-jodatime:$version"
      const val Spring = "$base-spring:$version"
      const val SpringBootAutoConfigure = "$base-spring-boot-autoconfigure:$version"
      const val SpringBootStarter = "$base-spring-boot-starter:$version"
      const val Test = "$base-test:$version"
    }
  }

  const val Jafama = "net.jafama:jafama:${Versions.Jafama}"

  object Exposed : NotDependency {
    private const val group = "org.jetbrains.exposed"
    private const val prefix = "$group:exposed"

    const val Core = "$prefix-core:${Versions.Exposed}"
    const val Dao = "$prefix-dao:${Versions.Exposed}"
    const val Jdbc = "$prefix-jdbc:${Versions.Exposed}"
    const val JodaTime = "$prefix-jodatime:${Versions.Exposed}"
    const val JavaTime = "$prefix-java-time:${Versions.Exposed}"
  }

  const val JavaStringSimilarity = "info.debatty:java-string-similarity:${Versions.JavaStringSimilarity}"

  object Db : NotDependency {
    const val H2 = "com.h2database:h2:${Versions.Db.H2}"
    const val Sqlite = "org.xerial:sqlite-jdbc:${Versions.Db.Sqlite}"
  }

  object Arrow : NotDependency {
    private const val group = "io.arrow-kt"

    private const val version = Versions.Arrow.Stable

    const val Core = "$group:arrow-core:$version"
    const val CoreData = "$group:arrow-core-data:$version"
    const val Optics = "$group:arrow-optics:$version"
    const val FxCoroutines = "$group:arrow-fx-coroutines:$version"
    const val FxRx2 = "$group:arrow-fx-rx2:$version"
    const val FxReactor = "$group:arrow-fx-reactor:$version"
    const val Syntax = "$group:arrow-syntax:$version"
    const val Mtl = "$group:arrow-mtl:$version"
    const val MtlData = "$group:arrow-mtl-data:$version"
    const val OpticsMtl = "$group:arrow-optics-mtl:$version"
    const val Recursion = "$group:arrow-recursion:$version"
    const val RecursionData = "$group:arrow-recursion-data:$version"
    const val Free = "$group:arrow-free:$version"
    const val FreeData = "$group:arrow-free-data:$version"
    const val Aql = "$group:arrow-aql:$version"

    object Kapt : NotDependency {
      const val Meta = "$group:arrow-meta:$version"
      const val Generic = "$group:arrow-generic:$version"
    }
  }

  /**
   * Kotlin Language Dependencies
   */
  object Kotlin : NotDependency {
    private const val group = "org.jetbrains.kotlin"
    private const val kotlinVersion = Versions.Kotlin.Lang

    /**
     * Libraries without version numbers as well as the [Bom] platform dependency
     */
    object WithBom : NotDependency {
      const val Bom = "$group:kotlin-bom:$kotlinVersion"

      /**
       * Kotlin Standard Library
       * #### These dependencies do not have version numbers appended, for use with Bom file
       *
       * [API reference](https://kotlinlang.org/api/latest/jvm/stdlib/)
       */
      object Stdlib : NotDependency {
        private const val prefix = "$group:kotlin-stdlib"

        const val Core = prefix
        const val Jdk7 = "$prefix-jdk7"

        const val Jdk8 = "$prefix-jdk8"

        const val Js = "$prefix-js"

        const val Common = "$prefix-common"
      }

      /**
       * The `kotlin.test` library provides annotations to mark test functions,
       * and a set of utility functions for performing assertions in tests,
       * independently of the test framework being used.
       * #### These dependencies do not have version numbers appended, for use with Bom file
       *
       * [Documentation and API reference](https://kotlinlang.org/api/latest/kotlin.test/)
       */
      object Test : NotDependency {
        private const val prefix = "$group:kotlin-test"
        const val AnnotationsCommon = "$prefix-annotations-common"
        const val Common = "$prefix-common"
        const val Js = "$prefix-js"
        const val JsRunner = "$prefix-js-runner"

        const val Junit = "$prefix-junit"
        const val Junit5 = "$prefix-junit5"
      }
    }

    /**
     * Kotlin Standard Library
     *
     * [API reference](https://kotlinlang.org/api/latest/jvm/stdlib/)
     */
    object Stdlib : NotDependency {
      private const val prefix = "$group:kotlin-stdlib"

      /** org.jetbrains.kotlin:kotlin-stdlib-core:[Versions.Kotlin.Lang] */
      const val Core = "$prefix:$kotlinVersion"

      /** org.jetbrains.kotlin:kotlin-stdlib-jdk7:[Versions.Kotlin.Lang] */
      const val Jdk7 = "$prefix-jdk7:$kotlinVersion"

      /** org.jetbrains.kotlin:kotlin-stdlib-jdk8:[Versions.Kotlin.Lang] */
      const val Jdk8 = "$prefix-jdk8:$kotlinVersion"

      /** org.jetbrains.kotlin:kotlin-stdlib-js:[Versions.Kotlin.Lang] */
      const val Js = "$prefix-js:$kotlinVersion"

      /** org.jetbrains.kotlin:kotlin-stdlib-common:[Versions.Kotlin.Lang] */
      const val Common = "$prefix-common:$kotlinVersion"
    }

    /**
     * The `kotlin.test` library provides annotations to mark test functions,
     * and a set of utility functions for performing assertions in tests,
     * independently of the test framework being used.
     *
     * [Documentation and API reference](https://kotlinlang.org/api/latest/kotlin.test/)
     */
    object Test : NotDependency {
      private const val prefix = "$group:kotlin-test"

      /** org.jetbrains.kotlin:kotlin-test-annotations-common:[Versions.Kotlin.Lang] */
      const val AnnotationsCommon = "$prefix-annotations-common:$kotlinVersion"

      /** org.jetbrains.kotlin:kotlin-test-common:[Versions.Kotlin.Lang] */
      const val Common = "$prefix-common:$kotlinVersion"

      /** org.jetbrains.kotlin:kotlin-test-js:[Versions.Kotlin.Lang] */
      const val Js = "$prefix-js:$kotlinVersion"

      /** org.jetbrains.kotlin:kotlin-test-js-runner:[Versions.Kotlin.Lang] */
      const val JsRunner = "$prefix-js-runner:$kotlinVersion"

      /** org.jetbrains.kotlin:kotlin-test-junit:[Versions.Kotlin.Lang] */
      const val Junit = "$prefix-junit:$kotlinVersion"

      /** org.jetbrains.kotlin:kotlin-test-junit5:[Versions.Kotlin.Lang] */
      const val Junit5 = "$prefix-junit5:$kotlinVersion"
    }
  }

  /**
   * Kotlin Extension Libraries
   */
  object KotlinX : NotDependency {
    private const val group = "org.jetbrains.kotlinx"
    private const val artifactBase = "$group:kotlinx"

    /** org.jetbrains.kotlinx:kotlinx-datetime:[Versions.Kotlinx.DateTime] */
    const val DateTime = "$artifactBase-datetime:${Versions.Kotlinx.DateTime}"

    /**
     * ### Library support for Kotlin coroutines.
     * + Brings structured concurrency and reactive programming with `Flow`.
     * + [Coroutines Guide on Kotlin's website](https://kotlinlang.org/docs/reference/coroutines/coroutines-guide.html)
     * + Kotlin coroutines on Android: [d.android.com/kotlin/coroutines](http://d.android.com/kotlin/coroutines)
     * + Talks by Roman Elizarov (co-author of kotlinx.coroutines):
     *    - [Structured concurrency](https://www.youtube.com/watch?v=Mj5P47F6nJg)
     *    - [Asynchronous Data Streams with Kotlin Flow](https://www.youtube.com/watch?v=tYcqn48SMT8)
     * + [Change log](https://github.com/Kotlin/kotlinx.coroutines/blob/master/CHANGES.md)
     * + GitHub page: [Kotlin/kotlinx.coroutines](https://github.com/Kotlin/kotlinx.coroutines)
     */
    object Coroutines : NotDependency {
      private const val artifactPrefix = "$artifactBase-coroutines"

      /**
       * Coroutines Dependency strings without the version number appended (for use with a Bom)
       */
      object WithBom : NotDependency {
        const val Bom = "$artifactPrefix-bom:${Versions.Kotlinx.Coroutines}"
        /** org.jetbrains.kotlinx:kotlinx-coroutines-core */
        const val Core = "$artifactPrefix-core"
        /** org.jetbrains.kotlinx:kotlinx-coroutines-core-js */
        const val CoreJs = "$artifactPrefix-core-js"
        /** org.jetbrains.kotlinx:kotlinx-coroutines-javafx */
        const val JavaFx = "$artifactPrefix-javafx"
        /** org.jetbrains.kotlinx:kotlinx-coroutines-jdk8 */
        const val Jdk8 = "$artifactPrefix-jdk8"
        /** org.jetbrains.kotlinx:kotlinx-coroutines-jdk9 */
        const val Jdk9 = "$artifactPrefix-jdk9"
        /** org.jetbrains.kotlinx:kotlinx-coroutines-slf4j */
        const val Slf4J = "$artifactPrefix-slf4j"
        /** org.jetbrains.kotlinx:kotlinx-coroutines-guava */
        const val Guava = "$artifactPrefix-guava"
        /** org.jetbrains.kotlinx:kotlinx-coroutines-reactive */
        const val Reactive = "$artifactPrefix-reactive"
        /** org.jetbrains.kotlinx:kotlinx-coroutines-reactor */
        const val Reactor = "$artifactPrefix-reactor"
        /** org.jetbrains.kotlinx:kotlinx-coroutines-rx2 */
        const val Rx2 = "$artifactPrefix-rx2"
        /** org.jetbrains.kotlinx:kotlinx-coroutines-rx3 */
        const val Rx3 = "$artifactPrefix-rx3"
        /** org.jetbrains.kotlinx:kotlinx-coroutines-debug */
        const val Debug = "$artifactPrefix-debug"
        /** org.jetbrains.kotlinx:kotlinx-coroutines-test */
        const val Test = "$artifactPrefix-test"
      }

      /** org.jetbrains.kotlinx:kotlinx-coroutines-core:[Versions.Kotlinx.Coroutines] */
      const val Core = "$artifactPrefix-core:${Versions.Kotlinx.Coroutines}"
      /** org.jetbrains.kotlinx:kotlinx-coroutines-core-js:[Versions.Kotlinx.Coroutines] */
      const val CoreJs = "$artifactPrefix-core-js:${Versions.Kotlinx.Coroutines}"
      /** org.jetbrains.kotlinx:kotlinx-coroutines-javafx:[Versions.Kotlinx.Coroutines] */
      const val JavaFx = "$artifactPrefix-javafx:${Versions.Kotlinx.Coroutines}"
      /** org.jetbrains.kotlinx:kotlinx-coroutines-jdk8:[Versions.Kotlinx.Coroutines] */
      const val Jdk8 = "$artifactPrefix-jdk8:${Versions.Kotlinx.Coroutines}"
      /** org.jetbrains.kotlinx:kotlinx-coroutines-jdk9:[Versions.Kotlinx.Coroutines] */
      const val Jdk9 = "$artifactPrefix-jdk9:${Versions.Kotlinx.Coroutines}"
      /** org.jetbrains.kotlinx:kotlinx-coroutines-slf4j:[Versions.Kotlinx.Coroutines] */
      const val Slf4J = "$artifactPrefix-slf4j:${Versions.Kotlinx.Coroutines}"
      /** org.jetbrains.kotlinx:kotlinx-coroutines-guava:[Versions.Kotlinx.Coroutines] */
      const val Guava = "$artifactPrefix-guava:${Versions.Kotlinx.Coroutines}"
      /** org.jetbrains.kotlinx:kotlinx-coroutines-reactive:[Versions.Kotlinx.Coroutines] */
      const val Reactive = "$artifactPrefix-reactive:${Versions.Kotlinx.Coroutines}"
      /** org.jetbrains.kotlinx:kotlinx-coroutines-reactor:[Versions.Kotlinx.Coroutines] */
      const val Reactor = "$artifactPrefix-reactor:${Versions.Kotlinx.Coroutines}"
      /** org.jetbrains.kotlinx:kotlinx-coroutines-rx2:[Versions.Kotlinx.Coroutines] */
      const val Rx2 = "$artifactPrefix-rx2:${Versions.Kotlinx.Coroutines}"
      /** org.jetbrains.kotlinx:kotlinx-coroutines-rx3:[Versions.Kotlinx.Coroutines] */
      const val Rx3 = "$artifactPrefix-rx3:${Versions.Kotlinx.Coroutines}"
      /** org.jetbrains.kotlinx:kotlinx-coroutines-debug:[Versions.Kotlinx.Coroutines] */
      const val Debug = "$artifactPrefix-debug:${Versions.Kotlinx.Coroutines}"
      /** org.jetbrains.kotlinx:kotlinx-coroutines-test:[Versions.Kotlinx.Coroutines] */
      const val Test = "$artifactPrefix-test:${Versions.Kotlinx.Coroutines}"
    }

    /**
     * ### Kotlin multiplatform / multi-format serialization.
     * + [Page on Kotlin's website](https://kotlinlang.org/docs/reference/serialization.html)
     * + [Kotlin Serialization Guide](https://github.com/Kotlin/kotlinx.serialization/blob/master/docs/serialization-guide.md)
     * + [Change log](https://github.com/Kotlin/kotlinx.serialization/blob/master/CHANGELOG.md)
     * + GitHub page: [Kotlin/kotlinx.serialization](https://github.com/Kotlin/kotlinx.serialization)
     */
    object Serialization : NotDependency {
      private const val artifactPrefix = "$artifactBase-serialization"
      /** org.jetbrains.kotlinx:kotlinx-serialization-core:[Versions.Kotlinx.Serialization] */
      const val Core = "$artifactPrefix-core:${Versions.Kotlinx.Serialization}"
      /** org.jetbrains.kotlinx:kotlinx-serialization-json:[Versions.Kotlinx.Serialization] */
      const val Json = "$artifactPrefix-json:${Versions.Kotlinx.Serialization}"
      /** org.jetbrains.kotlinx:kotlinx-serialization-protobuf:[Versions.Kotlinx.Serialization] */
      const val Protobuf = "$artifactPrefix-protobuf:${Versions.Kotlinx.Serialization}"
      /** org.jetbrains.kotlinx:kotlinx-serialization-cbor:[Versions.Kotlinx.Serialization] */
      const val Cbor = "$artifactPrefix-cbor:${Versions.Kotlinx.Serialization}"
      /** org.jetbrains.kotlinx:kotlinx-serialization-properties:[Versions.Kotlinx.Serialization] */
      const val Properties = "$artifactPrefix-properties:${Versions.Kotlinx.Serialization}"
      //TODO: Add hocon Artifact once documented.
    }

    object Collections : NotDependency {
      private const val artPrefix = "$artifactBase-collections-immutable"

      /**
       * ### Immutable persistent collections for Kotlin.
       * org.jetbrains.kotlinx:kotlinx-collections-immutable:[Versions.Kotlinx.Collections]
       * + [Library API proposal](https://github.com/Kotlin/kotlinx.collections.immutable/blob/master/proposal.md)
       * + [Change log](https://github.com/Kotlin/kotlinx.collections.immutable/blob/master/CHANGELOG.md)
       * + GitHub page: [Kotlin/kotlinx.collections.immutable](https://github.com/Kotlin/kotlinx.collections.immutable)
       */
      const val Immutable = "$artPrefix:${Versions.Kotlinx.Collections}"

      /**
       * ### Immutable persistent collections for Kotlin.
       * org.jetbrains.kotlinx:kotlinx-collections-immutable-jvm:[Versions.Kotlinx.Collections]
       * + [Library API proposal](https://github.com/Kotlin/kotlinx.collections.immutable/blob/master/proposal.md)
       * + [Change log](https://github.com/Kotlin/kotlinx.collections.immutable/blob/master/CHANGELOG.md)
       * + GitHub page: [Kotlin/kotlinx.collections.immutable](https://github.com/Kotlin/kotlinx.collections.immutable)
       */
      const val ImmutableJvmOnly = "$artPrefix-jvm:${Versions.Kotlinx.Collections}"
    }

    /**
     * ### Kotlin DSL for HTML.
     * + [Wiki](https://github.com/kotlin/kotlinx.html/wiki)
     * + [GitHub releases](https://github.com/Kotlin/kotlinx.html/releases)
     * + GitHub page: [Kotlin/kotlinx.html](https://github.com/Kotlin/kotlinx.html)
     */
    object Html : NotDependency {
      private const val artifactPrefix = "$artifactBase-html"
      /** org.jetbrains.kotlinx:kotlinx-html-jvm:[Versions.Kotlinx.Html] */
      const val Jvm = "$artifactPrefix-jvm:${Versions.Kotlinx.Html}"
      /** org.jetbrains.kotlinx:kotlinx-html-js:[Versions.Kotlinx.Html] */
      const val Js = "$artifactPrefix-js:${Versions.Kotlinx.Html}"
    }

    /**
     * ### Kotlin multiplatform I/O library. (Experimental as of 2020-09-14)
     * + [Change log](https://github.com/Kotlin/kotlinx-io/blob/master/CHANGELOG.md)
     * + GitHub page: [Kotlin/kotlinx-io](https://github.com/Kotlin/kotlinx-io)
     */
    object Io : NotDependency {
      private const val artifactPrefix = "$artifactBase-io"
      /** org.jetbrains.kotlinx:kotlinx-io-jvm:[Versions.Kotlinx.Io] */
      const val Jvm = "$artifactPrefix-jvm:${Versions.Kotlinx.Io}"
    }

    /**
     * ### Lightweight library allowing to introspect basic stuff about Kotlin symbols.
     * _As of version 1.0, it only supports getting names of parameters and the nullability of
     * their types._
     * + [Documentation (of full reflection)](https://kotlinlang.org/docs/reference/reflection.html)
     * + [API reference (of full reflection)](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.reflect/)
     * + [Change log](https://github.com/Kotlin/kotlinx-nodejs/blob/master/CHANGELOG.md)
     * + GitHub page: [Kotlin/kotlinx.reflect.lite](https://github.com/Kotlin/kotlinx.reflect.lite)
     */
    object Reflect : NotDependency {
      /** org.jetbrains.kotlinx:kotlinx.reflect.lite:[Versions.Kotlinx.ReflectLite] */
      const val Lite = "$artifactBase.reflect.lite:${Versions.Kotlinx.ReflectLite}"
    }

    /**
     * ### Lightweight Benchmarking library written in Kotlin for Kotlin
     * + [Examples](https://github.com/Kotlin/kotlinx-benchmark/tree/master/examples)
     * + GitHub page: [Kotlin/kotlinx-benchmark](https://github.com/Kotlin/kotlinx-benchmark)
     */
    object Benchmark : NotDependency {
      private const val artifactPrefix = "$artifactBase.benchmark"
      /**
       * ### The Kotlinx Benchmark Plugin
       * kotlinx.benchmark
       */
      const val Plugin = "kotlinx.benchmark"
      /** org.jetbrains.kotlinx:kotlinx.benchmark.runtime:[Versions.Kotlinx.Benchmark] */
      const val Runtime = "$artifactPrefix.runtime:${Versions.Kotlinx.Benchmark}"
      /** org.jetbrains.kotlinx:kotlinx.benchmark.runtime-jvm:[Versions.Kotlinx.Benchmark] */
      const val RuntimeJvmOnly = "$artifactPrefix.runtime-jvm:${Versions.Kotlinx.Benchmark}"
    }
  }

  object Logging : NotDependency {
    object KotlinLogger : NotDependency {
      private const val group = "io.github.microutils"

      const val Lib = "$group:kotlin-logging-jvm:${Versions.Logging.KotlinLogger}"
    }

    const val PlayLogback = "com.typesafe.play:play-logback_2.13:${Versions.Logging.PlayLogback}"

    object Slf4 : NotDependency {
      private const val group = "org.slf4j"
      const val Api = "$group:slf4j-api:${Versions.Logging.Slf4j.Api}"
      const val Simple = "$group:slf4j-simple:${Versions.Logging.Slf4j.Api}"
    }

    object Logback : NotDependency {
      private const val group = "ch.qos.logback"
      const val Core = "$group:logback-core:${Versions.Logging.Logback.Core}"
      const val Classic = "$group:logback-classic:${Versions.Logging.Logback.Core}"
      const val Access = "$group:logback-access:${Versions.Logging.Logback.Core}"
    }
  }

  object Google : NotDependency {
    private const val groupBase = "com.google"

    const val JimFs = "$groupBase.jimfs:jimfs:${Versions.Google.JimFs}"

    object ApiServices  : NotDependency {
      private const val group = "$groupBase.apis:google-api-services"

      const val Docs = "$group-docs:${Versions.Google.Apis.Docs}"
      const val Sheets = "$group-sheets:${Versions.Google.Apis.Sheets}"
      const val Drive = "$group-drive:${Versions.Google.Apis.Drive}"
      const val Logging = "$group-logging:${Versions.Google.Apis.Logging}"
      const val File = "$group-file:${Versions.Google.Apis.File}"
    }

    object Clients : NotDependency {
      private const val group = groupBase

      object Api : NotDependency {
        private const val apiBase: String = "$group.api-client"

        const val Base = "$apiBase:google-api-client:${Versions.Google.ApiClient}"
        const val Java6 = "$apiBase:google-api-client-java6:${Versions.Google.ApiClient}"
        const val Jackson2 = "$apiBase:google-api-client-jackson2:${Versions.Google.ApiClient}"
        const val GSON = "$apiBase:google-api-client-gson:${Versions.Google.ApiClient}"
      }

      object OAuth : NotDependency {
        private const val oauthBase = "$group.oauth-client"

        const val Base = "$oauthBase:google-oauth-client:${Versions.Google.OAuthClient}"
        const val Java6 = "$oauthBase:google-oauth-client-java6:${Versions.Google.OAuthClient}"
        const val Jetty = "$oauthBase:google-oauth-client-jetty:${Versions.Google.OAuthClient}"
      }
    }
  }

  object Testing : NotDependency {
    /**
     * Run unit tests in the JVM with the Android environment.
     *
     * GitHub page: [robolectric/robolectric](https://github.com/robolectric/robolectric)
     */
    const val RoboElectric = "org.robolectric:robolectric:${Versions.RoboElectric}"

    /**
     * ### Small portable container images for database testing.
     * + Official website: [testcontainers.org](https://www.testcontainers.org/)
     * + Quickstart [JUnit 5](https://www.testcontainers.org/quickstart/junit_5_quickstart/)
     * + Quickstart [Spok](https://www.testcontainers.org/quickstart/spock_quickstart/)
     * + GitHub page: [junit-team/junit5](https://github.com/junit-team/junit5)
     * + [API reference (JavaDoc)](https://junit.org/junit5/docs/current/api/)
     */
    object TestContainers : NotDependency {
      object WithBom : NotDependency {
        private const val group = "org.testcontainers"

        /** org.testcontainers:testcontainers-bom:[Versions.TestContainers] */
        const val Bom = "$group:testcontainers-bom:${Versions.TestContainers}"

        /** org.testcontainers:testcontainers */
        const val Core = "$group:testcontainers"
        /** org.testcontainers:junit-jupiter */
        const val JUnit = "$group:junit-jupiter"
        /** org.testcontainers:spock */
        const val Spock = "$group:spock"

        /** org.testcontainers:mockserver */
        const val Mockserver = "$group:mockserver"

        /** org.testcontainers:gcloud */
        const val GCloud = "$group:gcloud"
        /** org.testcontainers:mysql */
        const val MySql = "$group:mysql"
        /** org.testcontainers:pulsar */
        const val Pulsar = "$group:pulsar"
        /** org.testcontainers:toxiproxy */
        const val Toxiproxy = "$group:toxiproxy"
        /** org.testcontainers:selenium */
        const val Selenium = "$group:selenium"
        /** org.testcontainers:mariadb */
        const val MariaDb = "$group:mariadb"
        /** org.testcontainers:clickhouse */
        const val Clickhouse = "$group:clickhouse"
        /** org.testcontainers:orientdb */
        const val OrientDb = "$group:orientdb"
        /** org.testcontainers:r2dbc */
        const val R2Dbc = "$group:r2dbc"
        /** org.testcontainers:vault */
        const val Vault = "$group:vault"
        /** org.testcontainers:database-commons */
        const val DatabaseCommons = "$group:database-commons"
        /** org.testcontainers:mssqlserver */
        const val MsSqlServer = "$group:mssqlserver"
        /** org.testcontainers:nginx */
        const val Nginx = "$group:nginx"
        /** org.testcontainers:oracle-xe */
        const val OracleXe = "$group:oracle-xe"
        /** org.testcontainers:jdbc */
        const val Jdbc = "$group:jdbc"
        /** org.testcontainers:localstack */
        const val Localstack = "$group:localstack"
        /** org.testcontainers:presto */
        const val Presto = "$group:presto"
        /** org.testcontainers:postgresql */
        const val PostgresQl = "$group:postgresql"
        /** org.testcontainers:solr */
        const val Solr = "$group:solr"
        /** org.testcontainers:influxdb */
        const val InfluxDb = "$group:influxdb"
        /** org.testcontainers:rabbitmq */
        const val RabbitMq = "$group:rabbitmq"
        /** org.testcontainers:neo4j */
        const val Neo4j = "$group:neo4j"
        /** org.testcontainers:kafka */
        const val Kafka = "$group:kafka"
        /** org.testcontainers:cassandra */
        const val Cassandra = "$group:cassandra"
        /** org.testcontainers:elasticsearch */
        const val ElasticSearch = "$group:elasticsearch"
        /** org.testcontainers:db2 */
        const val Db2 = "$group:db2"
        /** org.testcontainers:dynalite */
        const val Dynalite = "$group:dynalite"
        /** org.testcontainers:cockroachdb */
        const val CockroachDb = "$group:cockroachdb"
        /** org.testcontainers:mongodb */
        const val MongoDb = "$group:mongodb"
        /** org.testcontainers:couchbase */
        const val Couchbase = "$group:couchbase"
      }

      private const val group = "org.testcontainers"
      private const val version = Versions.TestContainers

      /** org.testcontainers:testcontainers:[Versions.TestContainers] */
      const val Core = "$group:testcontainers:$version"
      /** org.testcontainers:junit-jupiter:[Versions.TestContainers] */
      const val JUnit = "$group:junit-jupiter:$version"
      /** org.testcontainers:spock:[Versions.TestContainers] */
      const val Spock = "$group:spock:$version"

      /** org.testcontainers:mockserver:[Versions.TestContainers] */
      const val Mockserver = "$group:mockserver:$version"

      /** org.testcontainers:gcloud:[Versions.TestContainers] */
      const val GCloud = "$group:gcloud:$version"
      /** org.testcontainers:mysql:[Versions.TestContainers] */
      const val MySql = "$group:mysql:$version"
      /** org.testcontainers:pulsar:[Versions.TestContainers] */
      const val Pulsar = "$group:pulsar:$version"
      /** org.testcontainers:toxiproxy:[Versions.TestContainers] */
      const val Toxiproxy = "$group:toxiproxy:$version"
      /** org.testcontainers:selenium:[Versions.TestContainers] */
      const val Selenium = "$group:selenium:$version"
      /** org.testcontainers:mariadb:[Versions.TestContainers] */
      const val MariaDb = "$group:mariadb:$version"
      /** org.testcontainers:clickhouse:[Versions.TestContainers] */
      const val Clickhouse = "$group:clickhouse:$version"
      /** org.testcontainers:orientdb:[Versions.TestContainers] */
      const val OrientDb = "$group:orientdb:$version"
      /** org.testcontainers:r2dbc:[Versions.TestContainers] */
      const val R2Dbc = "$group:r2dbc:$version"
      /** org.testcontainers:vault:[Versions.TestContainers] */
      const val Vault = "$group:vault:$version"
      /** org.testcontainers:database-commons:[Versions.TestContainers] */
      const val DatabaseCommons = "$group:database-commons:$version"
      /** org.testcontainers:mssqlserver:[Versions.TestContainers] */
      const val MsSqlServer = "$group:mssqlserver:$version"
      /** org.testcontainers:nginx:[Versions.TestContainers] */
      const val Nginx = "$group:nginx:$version"
      /** org.testcontainers:oracle-xe:[Versions.TestContainers] */
      const val OracleXe = "$group:oracle-xe:$version"
      /** org.testcontainers:jdbc:[Versions.TestContainers] */
      const val Jdbc = "$group:jdbc:$version"
      /** org.testcontainers:localstack:[Versions.TestContainers] */
      const val Localstack = "$group:localstack:$version"
      /** org.testcontainers:presto:[Versions.TestContainers] */
      const val Presto = "$group:presto:$version"
      /** org.testcontainers:postgresql:[Versions.TestContainers] */
      const val PostgresQl = "$group:postgresql:$version"
      /** org.testcontainers:solr:[Versions.TestContainers] */
      const val Solr = "$group:solr:$version"
      /** org.testcontainers:influxdb:[Versions.TestContainers] */
      const val InfluxDb = "$group:influxdb:$version"
      /** org.testcontainers:rabbitmq:[Versions.TestContainers] */
      const val RabbitMq = "$group:rabbitmq:$version"
      /** org.testcontainers:neo4j:[Versions.TestContainers] */
      const val Neo4j = "$group:neo4j:$version"
      /** org.testcontainers:kafka:[Versions.TestContainers] */
      const val Kafka = "$group:kafka:$version"
      /** org.testcontainers:cassandra:[Versions.TestContainers] */
      const val Cassandra = "$group:cassandra:$version"
      /** org.testcontainers:elasticsearch:[Versions.TestContainers] */
      const val ElasticSearch = "$group:elasticsearch:$version"
      /** org.testcontainers:db2:[Versions.TestContainers] */
      const val Db2 = "$group:db2:$version"
      /** org.testcontainers:dynalite:[Versions.TestContainers] */
      const val Dynalite = "$group:dynalite:$version"
      /** org.testcontainers:cockroachdb:[Versions.TestContainers] */
      const val CockroachDb = "$group:cockroachdb:$version"
      /** org.testcontainers:mongodb:[Versions.TestContainers] */
      const val MongoDb = "$group:mongodb:$version"
      /** org.testcontainers:couchbase:[Versions.TestContainers] */
      const val Couchbase = "$group:couchbase:$version"
    }

    /**
     * ### JUnit 5: The new major version of the programmer-friendly testing framework for Java
     * + Official website: [junit.org/junit5](https://junit.org/junit5/)
     * + [User Guide](https://junit.org/junit5/docs/current/user-guide/)
     * + [Release Notes](https://junit.org/junit5/docs/current/release-notes/)
     * + GitHub page: [junit-team/junit5](https://github.com/junit-team/junit5)
     * + [API reference (JavaDoc)](https://junit.org/junit5/docs/current/api/)
     */
    object JUnit : NotDependency {
      private const val group = "org.junit.jupiter"
      private const val artifactPrefix = "$group:junit-jupiter"
      private const val version = Versions.JUnit.Core

      /** org.junit.jupiter:junit-jupiter-api:[Versions.JUnit] */
      const val Api = "$artifactPrefix-api:$version"
      /** org.junit.jupiter:junit-jupiter-engine:[Versions.JUnit] */
      const val Engine = "$artifactPrefix-engine:$version"
      /** org.junit.jupiter:junit-jupiter-params:[Versions.JUnit] */
      const val Params = "$artifactPrefix-params:$version"
      /** org.junit.jupiter:junit-jupiter-migrationsupport:[Versions.JUnit] */
      const val MigrationSupport = "$artifactPrefix-migrationsupport:$version"
    }

    /**
     * ### Powerful, elegant and flexible test framework for Kotlin
     * + Official website: [kotest.io](https://kotest.io/)
     * + [Change log](https://kotest.io/changelog/)
     * + GitHub page: [kotest/kotest](https://github.com/kotest/kotest)
     */
    object Kotest : NotDependency {
      private const val group = "io.kotest"
      private const val artifactBase = "$group:kotest"
      private const val version = Versions.Kotest.Release

      /** io.kotest:kotest-core:[Versions.Kotest.Release] */
      const val Core = "$artifactBase-core:$version"
      /** io.kotest:kotest-property:[Versions.Kotest.Release] */
      const val Property = "$artifactBase-property:$version"
      /** io.kotest:kotest-property-arrow:[Versions.Kotest.Release] */
      const val PropertyArrow = "$artifactBase-property-arrow:$version"

      /**
       * ### Runners for [Kotest]
       */
      object Runner : NotDependency {
        private const val artifactPrefix = "$artifactBase-runner"

        /** io.kotest:kotest-framework-engine-jvm:[Versions.Kotest.Release] */
        const val KotestEngine = "${artifactBase}-framework-engine-jvm:$version"
        /** io.kotest:kotest-runner-junit5:[Versions.Kotest.Release] */
        const val JUnit5 = "$artifactPrefix-junit5:$version"
      }

      /**
       * ### Plugins for [Kotest]
       */
      object Plugins : NotDependency {
        private const val artifactPrefix = "$artifactBase-plugins"

        /** io.kotest:kotest-plugins-pitest:[Versions.Kotest.Release] */
        const val PiTest = "$artifactPrefix-pitest:$version"
      }

      /**
       * ### Extensions for [Kotest]
       */
      object Extensions  : NotDependency {
        private const val artifactPrefix = "$artifactBase-extensions"

        /** io.kotest:kotest-extensions-spring:[Versions.Kotest.Release] */
        const val Spring = "$artifactPrefix-spring:$version"
        /** io.kotest:kotest-extensions-koin:[Versions.Kotest.Release] */
        const val Koin = "$artifactPrefix-koin:$version"
        /** io.kotest:kotest-extensions-allure:[Versions.Kotest.Release] */
        const val Allure = "$artifactPrefix-allure:$version"
        /** io.kotest:kotest-extensions-testcontainers:[Versions.Kotest.Release] */
        const val TestContainers = "$artifactPrefix-testcontainers:$version"
        /** io.kotest:kotest-extensions-http:[Versions.Kotest.Release] */
        const val Http = "$artifactPrefix-http:$version"
        /** io.kotest:kotest-extensions-mockserver:[Versions.Kotest.Release] */
        const val MockServer = "$artifactPrefix-mockserver:$version"
      }

      /**
       * ### Assertions for [Kotest]
       */
      object Assertions  : NotDependency {
        private const val artifactPrefix = "$artifactBase-assertions"

        /** io.kotest:kotest-assertions-core:[Versions.Kotest.Release] */
        const val Core = "$artifactPrefix-core:$version"
        /** io.kotest:kotest-assertions-ktor:[Versions.Kotest.Release] */
        const val Ktor = "$artifactPrefix-ktor:$version"
        /** io.kotest:kotest-assertions-json:[Versions.Kotest.Release] */
        const val Json = "$artifactPrefix-json:$version"
        /** io.kotest:kotest-assertions-arrow:[Versions.Kotest.Release] */
        const val Arrow = "$artifactPrefix-arrow:$version"
        /** io.kotest:kotest-assertions-konform:[Versions.Kotest.Release] */
        const val Konform = "$artifactPrefix-konform:$version"
        /** io.kotest:kotest-assertions-jsoup:[Versions.Kotest.Release] */
        const val JSoup = "$artifactPrefix-jsoup:$version"
        /** io.kotest:kotest-assertions-klock:[Versions.Kotest.Release] */
        const val Klock = "$artifactPrefix-klock:$version"
        /** io.kotest:kotest-assertions-sql:[Versions.Kotest.Release] */
        const val Sql = "$artifactPrefix-sql:$version"
        /** io.kotest:kotest-assertions-compiler:[Versions.Kotest.Release] */
        const val Compiler = "$artifactPrefix-compiler:$version"
      }
    }

    /**
     * ### A specification framework for Kotlin
     * + Official website: [spekframework.org](https://www.spekframework.org/)
     * + GitHub page: [spekframework/spek](https://github.com/spekframework/spek)
     * + [GitHub releases](https://github.com/spekframework/spek/releases)
     */
    object Spek : NotDependency {
      private const val group = "org.spekframework.spek2"
      private const val artifactBase = "$group:spek"

      object Dsl : NotDependency {
        private const val prefix = "$artifactBase-dsl"
        /** org.spekframework.spek2:spek-dsl-jvm:[Versions.Spek.Release] */
        const val Jvm = "$prefix-jvm:${Versions.Spek.Release}"
        /** org.spekframework.spek2:spek-dsl-js:[Versions.Spek.Release] */
        const val Js = "$prefix-js:${Versions.Spek.Release}"
        /** org.spekframework.spek2:spek-dsl-metadata:[Versions.Spek.Release] */
        const val Metadata = "$prefix-metadata:${Versions.Spek.Release}"
      }

      object Runner : NotDependency {
        private const val prefix = "$artifactBase-runner"
        /** org.spekframework.spek2:spek-runner-junit5:[Versions.Spek.Release] */
        const val JUnit5 = "$prefix-junit5:${Versions.Spek.Release}"
      }

      object Runtime : NotDependency {
        private const val prefix = "$artifactBase-runtime"
        /** org.spekframework.spek2:spek-runtime-jvm:[Versions.Spek.Release] */
        const val Jvm = "$prefix-jvm:${Versions.Spek.Release}"
        /** org.spekframework.spek2:spek-runtime-metadata:[Versions.Spek.Release] */
        const val Metadata = "$prefix-metadata:${Versions.Spek.Release}"
      }
    }

    /**
     * ### Strikt is an assertion library for Kotlin intended for use with a test runner such as JUnit or Spek.
     *
     * Official website: [strikt.io](https://strikt.io/)
     * + [Change log](https://strikt.io/changelog/)
     * + [GitHub releases](https://github.com/robfletcher/strikt/releases)
     * + GitHub page: [robfletcher/strikt](https://github.com/robfletcher/strikt)
     */
    object Strikt : NotDependency {
      private const val group = "io.strikt"
      private const val prefix = "$group:strikt"
      const val version = Versions.Strikt

      object WithBom : NotDependency {
        /** io.strikt:strikt-bom:[Versions.Strikt] */
        const val Bom = "$prefix-bom:$version"
        /** io.strikt:strikt-core */
        const val Core = "$prefix-core"
        /** io.strikt:strikt-arrow */
        const val Arrow = "$prefix-arrow"
        /** io.strikt:strikt-gradle */
        const val Gradle = "$prefix-gradle"
        /** io.strikt:strikt-jackson */
        const val Jackson = "$prefix-jackson"
        /** io.strikt:strikt-java-time */
        const val JavaTime = "$prefix-java-time"
        /** io.strikt:strikt-mockk */
        const val Mockk = "$prefix-mockk"
        /** io.strikt:strikt-protobuf */
        const val Protobuf = "$prefix-protobuf"
        /** io.strikt:strikt-spring */
        const val Spring = "$prefix-spring"
      }

      /** io.strikt:strikt-core:[Versions.Strikt] */
      const val Core = "$prefix-core:$version"
      /** io.strikt:strikt-arrow:[Versions.Strikt] */
      const val Arrow = "$prefix-arrow:$version"
      /** io.strikt:strikt-gradle:[Versions.Strikt] */
      const val Gradle = "$prefix-gradle:$version"
      /** io.strikt:strikt-jackson:[Versions.Strikt] */
      const val Jackson = "$prefix-jackson:$version"
      /** io.strikt:strikt-java-time:[Versions.Strikt] */
      const val JavaTime = "$prefix-java-time:$version"
      /** io.strikt:strikt-mockk:[Versions.Strikt] */
      const val Mockk = "$prefix-mockk:$version"
      /** io.strikt:strikt-protobuf:[Versions.Strikt] */
      const val Protobuf = "$prefix-protobuf:$version"
      /** io.strikt:strikt-spring:[Versions.Strikt] */
      const val Spring = "$prefix-spring:$version"
    }

    /**
     * ### Mocking library for Kotlin.
     * + Official Website: [mockk.io](https://mockk.io/)
     * + [GitHub releases](https://github.com/mockk/mockk/releases)
     * + GitHub page: [mockk/mockk](https://github.com/mockk/mockk)
     */
    object MockK : NotDependency {
      private const val group = "io.mockk"

      /** io.mockk:mockk-common:[Versions.Mockk] */
      const val Common = "$group:mockk-common:${Versions.Mockk}"
    }
  }
}
