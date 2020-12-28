package im.tony.project.app.libext

import com.jfoenix.controls.JFXButton
import javafx.geometry.Pos
import tornadofx.*

class JfxTestView : TestViewBase() {
  init {
    this.testViewTitle.set("JFoenix Test View")
    this.testViewContent.set(borderpane {
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
            this.buttonType = JFXButton.ButtonType.FLAT
            action {
              println("Flat Button Clicked")
            }
          }
          jfxButton("Raised Button") {
            this.buttonType = JFXButton.ButtonType.RAISED
            action {
              println("Raised Button Clicked")
            }
          }
          jfxTextField("Whattt")
          jfxPasswordField()
          jfxButton("Open Alert") {
            action {
              jfxAlertUnit(currentWindow) {
                // this.setSize(200.0, 200.0)
                this.setContent(text("I'm a material design alert! So sexy..."))
              }.show()
            }
          }
        }
      }
    })
  }
}
