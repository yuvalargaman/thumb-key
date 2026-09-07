@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.dessalines.thumbkey.keyboards

import com.dessalines.thumbkey.utils.*
import com.dessalines.thumbkey.utils.ColorVariant.*
import com.dessalines.thumbkey.utils.FontSizeVariant.*
import com.dessalines.thumbkey.utils.KeyAction.*
import com.dessalines.thumbkey.utils.SwipeNWay.*

// A two-handed עברית messagease: each row of the single-handed layout is repeated on both
// sides of the emoji / numeric / backspace column, so either thumb can reach every letter.
// Hebrew is caseless, so there is no shifted mode.
val KB_HE_MESSAGEASE_TWO_HANDS_MAIN =
    KeyboardC(
        listOf(
            KB_HE_MESSAGEASE_MAIN.arr[0] +
                KB_HE_MESSAGEASE_MAIN.arr[0].subList(0, 3),
            KB_HE_MESSAGEASE_MAIN.arr[1] +
                KB_HE_MESSAGEASE_MAIN.arr[1].subList(0, 3),
            KB_HE_MESSAGEASE_MAIN.arr[2] +
                KB_HE_MESSAGEASE_MAIN.arr[2].subList(0, 3),
            listOf(
                RETURN_KEY_ITEM,
                BACKSPACE_KEY_ITEM,
                SPACEBAR_KEY_ITEM,
                BACKSPACE_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_HE_MESSAGEASE_TWO_HANDS: KeyboardDefinition =
    KeyboardDefinition(
        title = "עברית messagease two-hands",
        modes =
            KeyboardDefinitionModes(
                main = KB_HE_MESSAGEASE_TWO_HANDS_MAIN,
                shifted = KB_HE_MESSAGEASE_TWO_HANDS_MAIN,
                numeric = KB_EN_MESSAGEASE_TWO_HANDS_NUMERIC,
            ),
    )
