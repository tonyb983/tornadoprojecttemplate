package im.tony.project.app.libext

import com.jfoenix.controls.JFXButton
import de.jensd.fx.glyphs.fontawesome.FontAwesomeIcon
import de.jensd.fx.glyphs.fontawesome.utils.FontAwesomeIconFactory
import im.tony.project.app.TornadoApp
import javafx.geometry.Pos
import javafx.scene.layout.StackPane
import javafx.scene.paint.Color
import javafx.scene.text.FontWeight
import tornadofx.*
import java.time.LocalDateTime
import kotlin.random.Random

class JfxTestView : View("My View") {
  private val rand = Random(LocalDateTime.now().nano)
  private val maximizeIcon = objectProperty(
    FontAwesomeIconFactory
      .get()
      .createIcon(FontAwesomeIcon.WINDOW_MAXIMIZE, "22")
      .apply { this.fill = Color.GHOSTWHITE }
  )

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
          jfxButton("Open Alert") {
            this.setPrefSize(rand.nextDouble(30.0, 100.0), rand.nextDouble(30.0, 100.0))
            action {
              jfxAlertUnit(currentWindow) {
                // this.setSize(200.0, 200.0)
                this.setContent(text("I'm a material design alert! So sexy..."))
              }.show()
            }
          }
        }
      }
    }
    // Set the drag label up top.
    hbox(0.0, Pos.TOP_CENTER) {
      label("Tornado Project Template :D") {
        prefHeight = 25.0
        fitToParentWidth()
        maxHeight = 50.0
        alignment = Pos.CENTER
        style {
          backgroundColor = multi(c("#303030"))
          textFill = Color.WHITESMOKE
          fontWeight = FontWeight.BOLD
          fontSize = 12.px
        }
      }
      prefHeight = 25.0
      fitToParentWidth()
      maxHeight = 30.0
      StackPane.setAlignment(this, Pos.TOP_CENTER)
      TornadoApp.borderlessSceneRef.setMoveControl(this)
    }

    hbox(5.0, Pos.TOP_RIGHT) {
      jfxButton(
        "",
        graphic = FontAwesomeIconFactory
          .get()
          .createIcon(FontAwesomeIcon.WINDOW_MINIMIZE, "22")
          .apply { this.fill = Color.GHOSTWHITE }
      ) {
        setPrefSize(25.0, 25.0)
        action { TornadoApp.borderlessSceneRef.minimizeStage() }
        // alignment = Pos.TOP_RIGHT
      }
      jfxButton("", graphic = maximizeIcon.value) {
        setPrefSize(25.0, 25.0)
        action {
          TornadoApp.borderlessSceneRef.maximizeStage()
          maximizeIcon.set(
            FontAwesomeIconFactory.get()
              .createIcon(if (TornadoApp.borderlessSceneRef.isMaximized) FontAwesomeIcon.WINDOW_RESTORE else FontAwesomeIcon.WINDOW_MAXIMIZE, "22")
              .apply { this.fill = Color.GHOSTWHITE }
          )
          this.graphic = maximizeIcon.value
        }
        // alignment = Pos.TOP_RIGHT
      }
      jfxButton("", graphic = FontAwesomeIconFactory.get().createIcon(FontAwesomeIcon.CLOSE, "22").apply { this.fill = Color.GHOSTWHITE }) {
        setPrefSize(25.0, 25.0)
        action { primaryStage.close() }
        // alignment = Pos.TOP_RIGHT
      }

      setPrefSize(75.0, 25.0)
      setMaxSize(100.0, 30.0)
      StackPane.setAlignment(this, Pos.TOP_RIGHT)
    }
  }
}
