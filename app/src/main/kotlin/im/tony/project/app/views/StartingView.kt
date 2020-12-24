package im.tony.project.app.views

import im.tony.project.app.Styles
import javafx.geometry.Pos
import javafx.scene.Parent
import javafx.scene.layout.Priority
import tornadofx.*

class StartingView : View("Starting View") {
  override val root: Parent = pane {
    vbox(10.0, Pos.CENTER) {
      spacer(Priority.SOMETIMES)
      text("Hello Tornado") {
        style {
          addClass(Styles.header, Styles.wrapper)
        }
      }
      spacer(Priority.SOMETIMES)
    }
  }
}
