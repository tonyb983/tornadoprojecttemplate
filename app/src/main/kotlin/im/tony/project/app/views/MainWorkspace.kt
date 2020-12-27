package im.tony.project.app.views

import tornadofx.Workspace
import tornadofx.WorkspaceArea

class MainWorkspace : Workspace(title = "Tornado Project Template", navigationMode = Workspace.NavigationMode.Stack) {

  override val root: WorkspaceArea
    get() = super.root

}
