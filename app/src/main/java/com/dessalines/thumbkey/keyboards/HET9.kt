@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.dessalines.thumbkey.keyboards

import android.view.KeyEvent
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.outlined.*
import androidx.compose.material.icons.outlined.*
import com.dessalines.thumbkey.utils.*
import com.dessalines.thumbkey.utils.ColorVariant.*
import com.dessalines.thumbkey.utils.FontSizeVariant.*
import com.dessalines.thumbkey.utils.KeyAction.*
import com.dessalines.thumbkey.utils.SwipeNWay.*

// Hebrew letters follow the standard Israeli mobile keypad grouping:
// 2 = דהו, 3 = אבג, 4 = מםנן, 5 = יכךל, 6 = זחט, 7 = רשת, 8 = צץק, 9 = סעפף
// Within each key the letters run right-to-left, matching Hebrew reading order:
// bottomRight, bottom, bottomLeft, then left for the fourth letter.
// Hebrew is caseless, so there is no shifted mode: the top-right key carries emoji
// and language switching, and the symbols key moves down into the old shift slot.
val KB_HE_T9_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("1", size = LARGE),
                    topLeft = KeyC("$", color = MUTED),
                    top = KeyC("%", color = MUTED),
                    topRight = KeyC("&", color = MUTED),
                    right = KeyC("₪", color = MUTED),
                    bottomLeft = KeyC("£", color = MUTED),
                    left = KeyC("€", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("2", size = LARGE),
                    topLeft = KeyC("~", color = MUTED),
                    top = KeyC("`", color = MUTED),
                    topRight = KeyC("^", color = MUTED),
                    bottomRight = KeyC("ד"),
                    bottom = KeyC("ה"),
                    bottomLeft = KeyC("ו"),
                ),
                KeyItemC(
                    center = KeyC("3", size = LARGE),
                    topLeft = KeyC("@", color = MUTED),
                    top = KeyC(":", color = MUTED),
                    topRight = KeyC(";", color = MUTED),
                    bottomRight = KeyC("א"),
                    bottom = KeyC("ב"),
                    bottomLeft = KeyC("ג"),
                    left = KeyC("#", color = MUTED),
                ),
                KeyItemC(
                    center = TOGGLE_EMOJI_MODE_TRUE_KEYC,
                    topLeft = KeyC("\u200E", displayText = "LRM", color = MUTED),
                    topRight = KeyC("\u200F", displayText = "RLM", color = MUTED),
                    left = SWITCH_LANGUAGE_KEYC,
                    backgroundColor = SURFACE_VARIANT,
                ),
            ),
            listOf(
                KeyItemC(
                    center = KeyC("4", size = LARGE),
                    bottomRight = KeyC("מ"),
                    bottom = KeyC("ם"),
                    bottomLeft = KeyC("נ"),
                    left = KeyC("ן"),
                ),
                KeyItemC(
                    center = KeyC("5", size = LARGE),
                    bottomRight = KeyC("י"),
                    bottom = KeyC("כ"),
                    bottomLeft = KeyC("ך"),
                    left = KeyC("ל"),
                ),
                KeyItemC(
                    center = KeyC("6", size = LARGE),
                    bottomRight = KeyC("ז"),
                    bottom = KeyC("ח"),
                    bottomLeft = KeyC("ט"),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            CommitText("-"),
                            size = LARGE,
                            color = SECONDARY,
                        ),
                    topLeft = KeyC("/", color = MUTED),
                    top = KeyC("*", color = MUTED),
                    topRight = KeyC("\\", color = MUTED),
                    right = KeyC("=", color = MUTED),
                    bottomRight = KeyC(">", color = MUTED),
                    bottom = KeyC("_", color = MUTED),
                    bottomLeft = KeyC("<", color = MUTED),
                    left = KeyC("+", color = MUTED),
                    backgroundColor = SURFACE_VARIANT,
                ),
            ),
            listOf(
                KeyItemC(
                    center = KeyC("7", size = LARGE),
                    bottomRight = KeyC("ר"),
                    bottom = KeyC("ש"),
                    bottomLeft = KeyC("ת"),
                ),
                KeyItemC(
                    center = KeyC("8", size = LARGE),
                    bottomRight = KeyC("צ"),
                    bottom = KeyC("ץ"),
                    bottomLeft = KeyC("ק"),
                ),
                KeyItemC(
                    center = KeyC("9", size = LARGE),
                    bottomRight = KeyC("ס"),
                    bottom = KeyC("ע"),
                    bottomLeft = KeyC("פ"),
                    left = KeyC("ף"),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            display = KeyDisplay.TextDisplay("⌫"),
                            action =
                                SendEvent(
                                    KeyEvent(
                                        KeyEvent.ACTION_DOWN,
                                        KeyEvent
                                            .KEYCODE_DEL,
                                    ),
                                ),
                            size = LARGE,
                            color = SECONDARY,
                        ),
                    topLeft =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.SelectAll),
                            action = SelectAll,
                            color = MUTED,
                        ),
                    top =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.ContentCopy),
                            action = Copy,
                            color = MUTED,
                        ),
                    topRight =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.ContentCut),
                            action = Cut,
                            color = MUTED,
                        ),
                    right =
                        KeyC(
                            display = KeyDisplay.TextDisplay("⇥"),
                            action = DeleteWordAfterCursor,
                            color = MUTED,
                        ),
                    bottom =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.ContentPaste),
                            action = Paste,
                            color = MUTED,
                        ),
                    left =
                        KeyC(
                            display = KeyDisplay.TextDisplay("⇤"),
                            action = DeleteWordBeforeCursor,
                            color = MUTED,
                        ),
                    backgroundColor = SURFACE_VARIANT,
                ),
            ),
            listOf(
                KeyItemC(
                    center = KeyC(" ", displayText = "␠", color = SECONDARY),
                    top =
                        KeyC(
                            display = KeyDisplay.TextDisplay("↑"),
                            action =
                                SendEvent(
                                    KeyEvent(
                                        KeyEvent.ACTION_DOWN,
                                        KeyEvent.KEYCODE_DPAD_UP,
                                    ),
                                ),
                            color = MUTED,
                        ),
                    right =
                        KeyC(
                            display = KeyDisplay.TextDisplay("→"),
                            action =
                                SendEvent(
                                    KeyEvent(
                                        KeyEvent.ACTION_DOWN,
                                        KeyEvent.KEYCODE_DPAD_RIGHT,
                                    ),
                                ),
                            color = MUTED,
                        ),
                    bottom =
                        KeyC(
                            display = KeyDisplay.TextDisplay("↓"),
                            action =
                                SendEvent(
                                    KeyEvent(
                                        KeyEvent.ACTION_DOWN,
                                        KeyEvent.KEYCODE_DPAD_DOWN,
                                    ),
                                ),
                            color = MUTED,
                        ),
                    left =
                        KeyC(
                            display = KeyDisplay.TextDisplay("←"),
                            action =
                                SendEvent(
                                    KeyEvent(
                                        KeyEvent.ACTION_DOWN,
                                        KeyEvent.KEYCODE_DPAD_LEFT,
                                    ),
                                ),
                            color = MUTED,
                        ),
                    backgroundColor = SURFACE_VARIANT,
                    nextTapActions =
                        listOf(
                            ReplaceLastText(", ", trimCount = 1),
                            ReplaceLastText(". "),
                            ReplaceLastText("? "),
                            ReplaceLastText("! "),
                            ReplaceLastText(": "),
                            ReplaceLastText("; "),
                        ),
                ),
                KeyItemC(
                    center = KeyC("0", size = LARGE),
                    topLeft = KeyC("{", color = MUTED),
                    topRight = KeyC("}", color = MUTED),
                    right = KeyC(")", color = MUTED),
                    bottomRight = KeyC("]", color = MUTED),
                    bottom = KeyC("|", color = MUTED),
                    bottomLeft = KeyC("[", color = MUTED),
                    left = KeyC("(", color = MUTED),
                ),
                KeyItemC(
                    center =
                        KeyC(
                            CommitText("."),
                            size = LARGE,
                            color = SECONDARY,
                        ),
                    topLeft = KeyC("'", color = MUTED),
                    top = KeyC("־", color = MUTED),
                    topRight = KeyC("\"", color = MUTED),
                    right = KeyC("׳", color = MUTED),
                    bottomRight = KeyC("?", color = MUTED),
                    bottom = KeyC(",", color = MUTED),
                    bottomLeft = KeyC("!", color = MUTED),
                    left = KeyC("״", color = MUTED),
                    backgroundColor = SURFACE_VARIANT,
                ),
                KeyItemC(
                    center =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.AutoMirrored.Outlined.KeyboardReturn),
                            action = IMECompleteAction,
                            size = LARGE,
                            color = SECONDARY,
                        ),
                    topRight =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.Settings),
                            action = GotoSettings,
                            color = MUTED,
                        ),
                    bottomRight =
                        KeyC(
                            display = KeyDisplay.TextDisplay("↔"),
                            action = MoveKeyboard.CycleRight,
                            color = MUTED,
                        ),
                    backgroundColor = SURFACE_VARIANT,
                ),
            ),
        ),
    )

val KB_HE_T9: KeyboardDefinition =
    KeyboardDefinition(
        title = "עברית t9",
        modes =
            KeyboardDefinitionModes(
                main = KB_HE_T9_MAIN,
                shifted = KB_HE_T9_MAIN,
                numeric = NUMERIC_KEYBOARD,
            ),
    )
