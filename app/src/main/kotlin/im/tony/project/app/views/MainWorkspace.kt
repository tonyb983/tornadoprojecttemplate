package im.tony.project.app.views

import tornadofx.SingleAssignThreadSafetyMode
import tornadofx.Workspace
import tornadofx.singleAssign

class MainWorkspace : Workspace(title = "Tornado Project Template", navigationMode = Workspace.NavigationMode.Stack) {
  var mainView: MainView by singleAssign(SingleAssignThreadSafetyMode.SYNCHRONIZED)

  override fun onBeforeShow() {
    super.onBeforeShow()
    mainView = find()
    this.dock(mainView)
  }

}
