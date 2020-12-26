package im.tony.project.app

import com.goxr3plus.fxborderlessscene.borderless.BorderlessScene
import im.tony.project.app.views.StartingView
import javafx.scene.Scene
import javafx.scene.layout.StackPane
import javafx.stage.Stage
import javafx.stage.StageStyle
import org.kordamp.bootstrapfx.BootstrapFX
import tornadofx.App
import tornadofx.SingleAssignThreadSafetyMode
import tornadofx.UIComponent
import tornadofx.singleAssign


class TornadoApp : App(StartingView::class, Styles::class) {
  var stage: Stage by singleAssign()
  var borderlessScene: BorderlessScene by singleAssign(SingleAssignThreadSafetyMode.SYNCHRONIZED)

//  override fun start(stage: Stage) {
//    // super.start(stage)
//    val stackPane = StackPane()
//    stackPane.setPrefSize(800.0, 600.0)
//
//    //BorderPane
//    val borderPane = BorderPane()
//    borderPane.setPrefSize(800.0, 570.0)
//
//    stackPane.add(borderPane)
//
//    //Create a Top Label
//    val topLabel = Label("Drag Me :)")
//    topLabel.minHeight = 50.0
//    topLabel.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE)
//    topLabel.style = "-fx-background-color:#303030; -fx-text-fill:white; -fx-font-weight:bold;"
//    topLabel.alignment = Pos.CENTER
//    borderPane.top = topLabel
//
//    //Close Button
//    // val closeButton = Button("Exit")
//    val betterButton = JFXButton("", FontHelper.FA.create(FontAwesome.Glyph.CLOSE).color(Color.SLATEGREY))
//    betterButton.setPrefSize(30.0, 30.0)
////    closeButton.onAction = EventHandler {
////      Platform.exit()
////      // stage.close()
////    }
//    betterButton.onAction = EventHandler {
//      Platform.exit()
//      // stage.close()
//    }
//    stackPane.add(betterButton)
//    StackPane.setAlignment(betterButton, Pos.TOP_RIGHT)
//
//    // Constructor using your primary stage and the root Parent of your content.
//    this.borderlessScene = BorderlessScene(stage, StageStyle.UNDECORATED, stackPane, 250.0, 250.0)
//    this.borderlessScene.stylesheets.add(BootstrapFX.bootstrapFXStylesheet())
//    stage.scene = borderlessScene // Set the scene to your stage and you're done!
//
//    //Close Button
//    // val removeDefaultCSS = Button("Remove Default Corners CSS")
//    // removeDefaultCSS.onAction = EventHandler { (stage.scene as? BorderlessScene)?.removeDefaultCSS() }
//
//    //BorderPane
//    // val hbox =  HBox(removeDefaultCSS, closeButton)
//    // hbox.alignment = Pos.CENTER
//    // hbox.spacing = 15.0
//    // borderPane.center = hbox
//    val view = find<StartingView>()
//    borderPane.center = view.root
//
//    //remove the default css style
//    //scene.removeDefaultCSS();
//
//    // Maximise (on/off) and minimise the application:
//    //scene.maximizeStage();
//    //scene.minimizeStage();
//
//    // To move the window around by pressing a node:
//    borderlessScene.setMoveControl(topLabel)
//
//    // To disable resize:
//    //scene.setResizable(false);
//
//    // To switch the content during runtime:
//    //scene.setContent(yourNewParent);
//
//    // Check if maximised:
//    //Boolean bool = scene.isMaximised();
//
//    // Get windowed* size and position:
//    //scene.getWindowedSize();
//    //scene.getWindowedPosition();
//
//    //Show
//    stage.title = "Draggable and Undecorated JavaFX Window"
//
//    // super.start(stage)
//    // stage.show()
//  }

  override fun start(stage: Stage) {
    this.stage = stage
    super.start(stage)
  }

  override fun createPrimaryScene(view: UIComponent): Scene {
    this.borderlessScene = BorderlessScene(stage, StageStyle.UNDECORATED, StackPane(), 250.0, 250.0)
    this.borderlessScene.stylesheets.add(BootstrapFX.bootstrapFXStylesheet())
    return super.createPrimaryScene(view)
  }
}
