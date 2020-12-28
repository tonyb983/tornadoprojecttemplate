package im.tony.project.app.libext

import javafx.beans.property.ObjectProperty
import javafx.beans.property.StringProperty
import javafx.scene.Node
import javafx.scene.Parent
import tornadofx.*

abstract class TestViewBase : View("Base Test View") {
  protected val testViewTitle: StringProperty = stringProperty("Default Title")
  protected val testViewContent: ObjectProperty<Node> = objectProperty()

  final override val root: Parent = titledpane(testViewTitle, testViewContent.value, false) {
    fitToParentSize()
    testViewContent.addListener { _, _, new ->
      if (new != null) {
        this.content = new
      }
    }
  }
}
