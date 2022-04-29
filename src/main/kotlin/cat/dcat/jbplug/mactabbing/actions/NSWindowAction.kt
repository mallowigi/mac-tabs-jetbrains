package cat.dcat.jbplug.mactabbing.actions

import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.ui.mac.foundation.Foundation

/**
 * Call Foundation's native window actions
 *
 * @property selector method name
 * @property args optional args
 */
abstract class NSWindowAction(private val selector: String, private val args: Any? = null) : AnAction() {

  /** Call Foundation's native window actions on NSApplication. */
  override fun actionPerformed(event: AnActionEvent) {
    val app = Foundation.invoke("NSApplication", "sharedApplication")
    val mainWindow = Foundation.invoke(app, Foundation.createSelector("mainWindow"))
    Foundation.invoke(
      mainWindow,
      Foundation.createSelector("performSelectorOnMainThread:withObject:waitUntilDone:"),
      Foundation.createSelector(selector),
      args,
      false
    )
  }

  /** Allows running in dumb mode. */
  override fun isDumbAware(): Boolean = true
}
