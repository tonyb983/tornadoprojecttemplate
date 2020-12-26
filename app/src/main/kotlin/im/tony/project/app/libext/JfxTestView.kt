package im.tony.project.app.libext

import com.jfoenix.controls.JFXButton
import de.jensd.fx.glyphs.fontawesome.FontAwesomeIcon
import de.jensd.fx.glyphs.fontawesome.utils.FontAwesomeIconFactory
import javafx.geometry.Pos
import javafx.scene.layout.StackPane
import tornadofx.*
import java.time.LocalDateTime
import kotlin.random.Random

class JfxTestView : View("My View") {
  private val rand = Random(LocalDateTime.now().nano)
  private val maximizeIcon = objectProperty(FontAwesomeIconFactory.get().createIcon(FontAwesomeIcon.WINDOW_MAXIMIZE, "14"))

  override val root = stackpane {
    fitToParentSize()
    borderpane {
      fitToParentSize()
      top {
        hbox(5.0, Pos.CENTER) {
          jfxSpinner {
            alignment = Pos.CENTER
          }
        }
      }

      right {
        vbox(10.0, Pos.CENTER) {
          jfxHamburger {
            useBasicCloseTransition()
          }
          jfxHamburger {
            useSlideCloseTransition()
          }
          jfxHamburger {
            useBackArrowTransition()
          }
          jfxHamburger {
            useNextArrowTransition()
          }
        }
      }

      center {
        jfxMasonPane {
          jfxButton("Flat Button") {
            this.setPrefSize(rand.nextDouble(30.0, 100.0), rand.nextDouble(30.0, 100.0))
            this.buttonType = JFXButton.ButtonType.FLAT
            action {
              println("Flat Button Clicked")
            }
          }
          jfxButton("Raised Button") {
            this.setPrefSize(rand.nextDouble(30.0, 100.0), rand.nextDouble(30.0, 100.0))
            this.buttonType = JFXButton.ButtonType.RAISED
            action {
              println("Raised Button Clicked")
            }
          }
          jfxTextField("Whattt") {
            this.setPrefSize(rand.nextDouble(30.0, 100.0), rand.nextDouble(30.0, 100.0))
          }
          jfxPasswordField {
            this.setPrefSize(rand.nextDouble(30.0, 100.0), rand.nextDouble(30.0, 100.0))
          }
        }
      }
    }
    hbox(5.0, Pos.TOP_RIGHT) {
      setPrefSize(75.0, 25.0)
      jfxButton("", graphic = FontAwesomeIconFactory.get().createIcon(FontAwesomeIcon.WINDOW_MINIMIZE, "14")) {
        setPrefSize(25.0, 25.0)
        action { println("Minimize doesn't work bro.") }
        // alignment = Pos.TOP_RIGHT
      }
      jfxButton("", graphic = maximizeIcon.value) {
        setPrefSize(25.0, 25.0)
        action {
          primaryStage.isMaximized = !primaryStage.isMaximized
          maximizeIcon.set(
            FontAwesomeIconFactory.get()
              .createIcon(if (primaryStage.isMaximized) FontAwesomeIcon.WINDOW_RESTORE else FontAwesomeIcon.WINDOW_MAXIMIZE, "14")
          )
          this.graphic = maximizeIcon.value
        }
        // alignment = Pos.TOP_RIGHT
      }
      jfxButton("", graphic = FontAwesomeIconFactory.get().createIcon(FontAwesomeIcon.CLOSE, "14")) {
        setPrefSize(25.0, 25.0)
        action { primaryStage.close() }
        // alignment = Pos.TOP_RIGHT
      }

      StackPane.setAlignment(this, Pos.TOP_RIGHT)
    }
  }
}
