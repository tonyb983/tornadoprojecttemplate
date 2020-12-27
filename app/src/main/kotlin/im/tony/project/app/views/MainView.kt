package im.tony.project.app.views

import im.tony.project.utilities.getRandomQuote
import tornadofx.View
import tornadofx.stackpane
import tornadofx.stringProperty

class MainView : View("My View") {
  private val textProp = stringProperty()
  private val whiteBlackLabelText = stringProperty("-----Transparent Aero Snap Background Window-----")
  private val bottomLabelText = stringProperty("")
  private val startingSize = 800.0 to 600.0

  init {
    textProp.set(getRandomQuote())
  }

  private fun changeText() = textProp.set(getRandomQuote())

  override val root = stackpane {
    setPrefSize(startingSize.first, startingSize.second)
  }
}
