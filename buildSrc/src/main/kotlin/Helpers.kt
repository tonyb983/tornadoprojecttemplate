@file:Suppress("unused", "SpellCheckingInspection", "ClassName", "UNUSED_PARAMETER")

import org.gradle.api.artifacts.dsl.DependencyHandler
import org.gradle.kotlin.dsl.DependencyHandlerScope

interface NotDependency {}

@Deprecated("This object is not a dependency, it holds other dependencies.")
fun DependencyHandlerScope.implementation(notDependency: NotDependency) {}
@Deprecated("This object is not a dependency, it holds other dependencies.")
fun DependencyHandlerScope.testImplementation(notDependency: NotDependency) {}
@Deprecated("This object is not a dependency, it holds other dependencies.")
fun DependencyHandlerScope.runtime(notDependency: NotDependency) {}
@Deprecated("This object is not a dependency, it holds other dependencies.")
fun DependencyHandlerScope.compile(notDependency: NotDependency) {}
@Deprecated("This object is not a dependency, it holds other dependencies.")
fun DependencyHandlerScope.api(notDependency: NotDependency) {}
@Deprecated("This object is not a dependency, it holds other dependencies.")
fun DependencyHandlerScope.kapt(notDependency: NotDependency) {}
@Deprecated("This object is not a dependency, it holds other dependencies.")
fun DependencyHandlerScope.kotlin(notDependency: NotDependency) {}

@Deprecated("This object is not a dependency, it holds other dependencies.")
fun DependencyHandler.implementation(notDependency: NotDependency) {}
@Deprecated("This object is not a dependency, it holds other dependencies.")
fun DependencyHandler.testImplementation(notDependency: NotDependency) {}
@Deprecated("This object is not a dependency, it holds other dependencies.")
fun DependencyHandler.runtime(notDependency: NotDependency) {}
@Deprecated("This object is not a dependency, it holds other dependencies.")
fun DependencyHandler.compile(notDependency: NotDependency) {}
@Deprecated("This object is not a dependency, it holds other dependencies.")
fun DependencyHandler.api(notDependency: NotDependency) {}
@Deprecated("This object is not a dependency, it holds other dependencies.")
fun DependencyHandler.kapt(notDependency: NotDependency) {}
@Deprecated("This object is not a dependency, it holds other dependencies.")
fun DependencyHandler.kotlin(notDependency: NotDependency) {}
