package im.tony.project.app

import javafx.scene.layout.BorderStrokeStyle
import javafx.scene.paint.Color
import javafx.scene.shape.StrokeLineCap
import javafx.scene.shape.StrokeLineJoin
import javafx.scene.shape.StrokeType
import tornadofx.*

class Styles : Stylesheet() {
  companion object {
    // Define our styles
    val wrapper by cssclass()
    val header by cssclass()

    // Define our colors
    val dangerColor = c("#a94442")
    val hoverColor = c("#d49942")
  }

  init {
    wrapper {
      padding = box(10.px)
      spacing = 10.px
    }

    label {
      fontSize = 56.px
      padding = box(5.px, 10.px)
      maxWidth = infinity
    }

    header {
      fontSize = 20.pt
      textFill = Color.DIMGRAY
    }
  }
}
