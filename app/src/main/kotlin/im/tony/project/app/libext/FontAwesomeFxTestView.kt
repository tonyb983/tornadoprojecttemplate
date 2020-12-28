package im.tony.project.app.libext

import de.jensd.fx.glyphs.fontawesome.FontAwesomeIcon
import de.jensd.fx.glyphs.materialdesignicons.MaterialDesignIcon
import de.jensd.fx.glyphs.materialicons.MaterialIcon
import de.jensd.fx.glyphs.octicons.OctIcon
import javafx.geometry.Insets
import javafx.geometry.Pos
import javafx.scene.control.ContentDisplay
import javafx.scene.layout.*
import javafx.scene.paint.Color
import tornadofx.action
import tornadofx.fitToParentSize
import tornadofx.hbox
import tornadofx.vbox

class FontAwesomeFxTestView : TestViewBase() {
  init {
    this.testViewTitle.set("FontAwesomeFx Test View")
    this.testViewContent.set(hbox(10.0, Pos.CENTER) {
      fitToParentSize()
      background = Background(BackgroundFill(Color.BLACK, CornerRadii.EMPTY, Insets.EMPTY))
      vbox(10.0, Pos.CENTER) {
        fontAwesomeIconText(FontAwesomeIcon.ADDRESS_BOOK, 16, Color.LAWNGREEN)
        fontAwesomeIconView(FontAwesomeIcon.AMBULANCE, 20, Color.GREENYELLOW)
        fontAwesomeFactory {
          this.createIconButton(FontAwesomeIcon.ASTERISK, "Crazy ass star like a fkin asterisk.").apply {
            action {
              // this.border = Border(BorderStroke(Color.DODGERBLUE, BorderStrokeStyle.DASHED, CornerRadii(3.0), BorderWidths(2.0)))
              this.borderProperty().set(Border(BorderStroke(Color.DODGERBLUE, BorderStrokeStyle.DASHED, CornerRadii(3.0), BorderWidths(2.0))))
            }
          }
        }
        fontAwesomeFactory(create = {
          this.createIconLabel(FontAwesomeIcon.AUTOMOBILE, "Here is a car.", "14", "12", ContentDisplay.BOTTOM)
        }) {
          this.background = Background(BackgroundFill(Color.RED, CornerRadii(5.0), Insets(5.0)))
        }

        glyphCheckbox(FontAwesomeIcon.EJECT, MaterialIcon.CHECK, "Here is a checkbox.") {
          this.background = Background(BackgroundFill(Color.WHITESMOKE, CornerRadii(5.0), Insets(5.0)))
          this.padding = Insets(10.0)
        }
      }

      vbox(10.0, Pos.CENTER) {
        materialDesignIconText(MaterialDesignIcon.CONSOLE, 16, Color.LAWNGREEN)
        materialDesignIconView(MaterialDesignIcon.AIRPLAY, 20, Color.GREENYELLOW)
        materialDesignIconFactory {
          this.createIconButton(MaterialDesignIcon.STAR, "Crazy ass star like a fkin asterisk.").apply {
            action {
              // this.border = Border(BorderStroke(Color.DODGERBLUE, BorderStrokeStyle.DASHED, CornerRadii(3.0), BorderWidths(2.0)))
              this.borderProperty().set(Border(BorderStroke(Color.DODGERBLUE, BorderStrokeStyle.DASHED, CornerRadii(3.0), BorderWidths(2.0))))
            }
          }
        }
        materialDesignIconFactory(create = {
          this.createIconLabel(MaterialDesignIcon.AMAZON, "Here is a car.", "14", "12", ContentDisplay.BOTTOM)
        }) {
          this.background = Background(BackgroundFill(Color.RED, CornerRadii(5.0), Insets(5.0)))
        }
      }

      vbox(10.0, Pos.CENTER) {
        materialIconText(MaterialIcon.ADB, 16, Color.LAWNGREEN)
        materialIconView(MaterialIcon.BUILD, 20, Color.GREENYELLOW)
        materialIconFactory {
          this.createIconButton(MaterialIcon.DOCK, "Crazy ass star like a fkin asterisk.").apply {
            action {
              // this.border = Border(BorderStroke(Color.DODGERBLUE, BorderStrokeStyle.DASHED, CornerRadii(3.0), BorderWidths(2.0)))
              this.borderProperty().set(Border(BorderStroke(Color.DODGERBLUE, BorderStrokeStyle.DASHED, CornerRadii(3.0), BorderWidths(2.0))))
            }
          }
        }
        materialIconFactory(create = {
          this.createIconLabel(MaterialIcon.CLASS, "Here is a car.", "14", "12", ContentDisplay.BOTTOM)
        }) {
          this.background = Background(BackgroundFill(Color.RED, CornerRadii(5.0), Insets(5.0)))
        }
      }

      vbox(10.0, Pos.CENTER) {
        octIconText(OctIcon.BOOK, 16, Color.LAWNGREEN)
        octIconView(OctIcon.PULSE, 20, Color.GREENYELLOW)
        octIconFactory {
          this.createIconButton(OctIcon.CODE, "Crazy ass star like a fkin asterisk.").apply {
            action {
              // this.border = Border(BorderStroke(Color.DODGERBLUE, BorderStrokeStyle.DASHED, CornerRadii(3.0), BorderWidths(2.0)))
              this.borderProperty().set(Border(BorderStroke(Color.DODGERBLUE, BorderStrokeStyle.DASHED, CornerRadii(3.0), BorderWidths(2.0))))
            }
          }
        }
        octIconFactory(create = {
          this.createIconLabel(OctIcon.GIT_COMMIT, "Here is a car.", "14", "12", ContentDisplay.BOTTOM)
        }) {
          this.background = Background(BackgroundFill(Color.RED, CornerRadii(5.0), Insets(5.0)))
        }
      }
    })
  }
}
