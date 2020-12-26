package im.tony.project.app.views

import im.tony.project.app.libext.JfxTestView
import javafx.scene.Parent
import javafx.scene.paint.Color
import javafx.util.Duration
import tornadofx.*

class StartingView : View("Starting View") {
  private val startingSize = 800.0 to 600.0
  // private val transitionTo: View by find<MainView>()

  init {
    runLater(1.seconds) {
      replaceWith<JfxTestView>(ViewTransition.Wipe(Duration.seconds(0.75)))
    }
  }

  override val root: Parent = pane {
    rectangle {
      val (x, y) = startingSize
      this.width = x
      this.height = y
      this.fill = Color.BLACK
    }
  }
}
