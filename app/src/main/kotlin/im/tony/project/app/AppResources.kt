@file:Suppress("DeprecatedCallableAddReplaceWith", "MemberVisibilityCanBePrivate", "unused")

package im.tony.project.app

import javafx.scene.image.Image
import javafx.scene.image.ImageView
import javafx.scene.media.Media
import tornadofx.toJSON
import tornadofx.toJSONArray
import java.io.InputStream
import java.net.URL
import javax.json.JsonArray
import javax.json.JsonObject

data class AppResource(val resource: String) {
  val url get(): URL = this.javaClass.getResource(resource)
  val urlString get(): String = this.javaClass.getResource(resource).toExternalForm()
  val media get(): Media = Media(urlString)
  val stream get(): InputStream = this.javaClass.getResourceAsStream(resource)
  val image get(): Image = Image(stream)
  fun imageview(lazyload: Boolean = false): ImageView = ImageView(Image(urlString, lazyload))
  val json get(): JsonObject = stream.toJSON()
  val jsonArray get(): JsonArray = stream.toJSONArray()
  val text get(): String = stream.use { it.bufferedReader().readText() }
}

object AppResources {
  object Fonts {
    private const val base = "/font"

    @Deprecated("This is not a resource.", replaceWith = ReplaceWith("One of it's children."))
    override fun toString(): String = ""

    val FA_Brands = AppResource("$base/FA Brands.otf")
    val FA_Duotone = AppResource("$base/FA Duotone.otf")
    val FA_Light = AppResource("$base/FA Light.otf")
    val FA_Regular = AppResource("$base/FA Regular.otf")
    val FA_Solid = AppResource("$base/FA Solid.otf")
  }
}
