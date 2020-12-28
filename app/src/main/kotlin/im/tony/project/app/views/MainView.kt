package im.tony.project.app.views

import de.jensd.fx.glyphs.fontawesome.FontAwesomeIcon
import de.jensd.fx.glyphs.fontawesome.utils.FontAwesomeIconFactory
import im.tony.project.app.TornadoApp
import im.tony.project.app.libext.FontAwesomeFxTestView
import im.tony.project.app.libext.JfxTestView
import im.tony.project.app.libext.jfxButton
import javafx.beans.property.ReadOnlyBooleanProperty
import javafx.geometry.Pos
import javafx.scene.Node
import javafx.scene.layout.BorderPane
import javafx.scene.layout.StackPane
import javafx.scene.paint.Color
import javafx.scene.text.FontWeight
import tornadofx.*

class MainView : View("My View") {
  private val startingSize = 800.0 to 600.0
  private val maximizeIcon = objectProperty(
    FontAwesomeIconFactory
      .get()
      .createIcon(FontAwesomeIcon.WINDOW_MAXIMIZE, "22")
      .apply { this.fill = Color.GHOSTWHITE }
  )
  private val currentContent = stringProperty("jfx")

  /**
   * Called when a Component becomes the Scene root or
   * when its root node is attached to another Component.
   * @see UIComponent.add
   */
  override fun onDock() {
    super.onDock()
    isShowingProperty_.set(true)
  }

  /**
   * Called when a Component is detached from the Scene
   */
  override fun onUndock() {
    super.onUndock()
    isShowingProperty_.set(false)
  }

  private fun addTopBar(bp: BorderPane) = bp.top {
    stackpane {
      // Set the drag label up top.
      this.hbox(0.0, Pos.TOP_CENTER) {
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
        StackPane.setAlignment(this, Pos.CENTER)
        TornadoApp.borderlessSceneRef.setMoveControl(this)
      }

      this.hbox(10.0, Pos.CENTER_RIGHT) {
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
        StackPane.setAlignment(this, Pos.CENTER_RIGHT)
      }
    }
  }

  override val root = borderpane {
    addTopBar(this)
    right {
      vbox(20.0, Pos.CENTER_LEFT) {
        button("Load JFoenix") {
          action {
            if (currentContent.get() != "jfx") {
              currentContent.set("jfx")
              this@MainView.updateContent(find<JfxTestView>().root)
            }
          }
        }
        button("Load FontAwesomeFx") {
          action {
            if (currentContent.get() != "fafx") {
              currentContent.set("fafx")
              this@MainView.updateContent(find<FontAwesomeFxTestView>().root)
            }
          }
        }
      }
    }
    center {
      fitToParentSize()
      this.add<JfxTestView>()
    }
  }

  fun updateContent(node: Node): Unit {
    this.root.center.removeFromParent()
    this.root.center {
      this.fitToParentSize()
      this.add(node)
      this.requestLayout()
    }
  }

  companion object {
    private val isShowingProperty_ = booleanProperty(false)
    val isShowingProperty: ReadOnlyBooleanProperty
      get() = ReadOnlyBooleanProperty.readOnlyBooleanProperty(isShowingProperty_)

    fun setContent(node: Node): Boolean {
      if (!isShowingProperty.get()) {
        return false
      }

      find<MainView>().updateContent(node)
      return true
    }
  }
}
