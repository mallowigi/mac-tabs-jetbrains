@file:Suppress("HardCodedStringLiteral")

package cat.dcat.jbplug.mactabbing.actions

/**
 * Select previous tab
 *
 */
class SelectPreviousTab : NSWindowAction("selectPreviousTab:")

/**
 * Select next tab
 *
 */
class SelectNextTab : NSWindowAction("selectNextTab:")

/**
 * Move tab to a new window
 *
 */
class MoveTabToNewWindow : NSWindowAction("moveTabToNewWindow:")

/**
 * Merge all windows
 *
 */
class MergeAllWindows : NSWindowAction("mergeAllWindows:")

/**
 * Toggle tab bar
 *
 */
class ToggleTabBar : NSWindowAction("toggleTabBar:")

/**
 * Toggle tab overview
 *
 */
class ToggleTabOverview : NSWindowAction("toggleTabOverview:")
