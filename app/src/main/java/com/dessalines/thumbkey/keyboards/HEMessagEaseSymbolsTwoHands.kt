@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.dessalines.thumbkey.keyboards

import com.dessalines.thumbkey.utils.*
import com.dessalines.thumbkey.utils.ColorVariant.*
import com.dessalines.thumbkey.utils.FontSizeVariant.*
import com.dessalines.thumbkey.utils.KeyAction.*
import com.dessalines.thumbkey.utils.SwipeNWay.*

val KB_HE_MESSAGEASE_SYMBOLS_TWO_HANDS_MAIN =
    KeyboardC(
        listOf(
            KB_HE_MESSAGEASE_SYMBOLS_MAIN.arr[0] +
                KB_HE_MESSAGEASE_SYMBOLS_MAIN.arr[0].subList(0, 3),
            KB_HE_MESSAGEASE_SYMBOLS_MAIN.arr[1] +
                KB_HE_MESSAGEASE_SYMBOLS_MAIN.arr[1].subList(0, 3),
            KB_HE_MESSAGEASE_SYMBOLS_MAIN.arr[2] +
                KB_HE_MESSAGEASE_SYMBOLS_MAIN.arr[2].subList(0, 3),
            KB_HE_MESSAGEASE_SYMBOLS_MAIN.arr[3] +
                KB_HE_MESSAGEASE_SYMBOLS_MAIN.arr[3].subList(0, 1),
        ),
    )

// Numeric mode keeps the Hebrew letters and symbols under the left thumb and puts the
// number pad under the right one, the same split the english two-handed symbols layout uses.
val KB_HE_MESSAGEASE_TWO_HANDS_NUMERIC =
    KeyboardC(
        listOf(
            KB_HE_MESSAGEASE_SYMBOLS_MAIN.arr[0] +
                KB_EN_MESSAGEASE_NUMERIC.arr[0].subList(0, 3),
            KB_HE_MESSAGEASE_SYMBOLS_MAIN.arr[1].subList(0, 3) +
                listOf(ABC_KEY_ITEM) +
                KB_EN_MESSAGEASE_NUMERIC.arr[1].subList(0, 3),
            KB_HE_MESSAGEASE_SYMBOLS_MAIN.arr[2] +
                KB_EN_MESSAGEASE_NUMERIC.arr[2].subList(0, 3),
            KB_HE_MESSAGEASE_SYMBOLS_MAIN.arr[3] +
                KB_EN_MESSAGEASE_NUMERIC.arr[3].subList(0, 2),
        ),
    )

val KB_HE_MESSAGEASE_SYMBOLS_TWO_HANDS: KeyboardDefinition =
    KeyboardDefinition(
        title = "עברית messagease symbols two-hands",
        modes =
            KeyboardDefinitionModes(
                main = KB_HE_MESSAGEASE_SYMBOLS_TWO_HANDS_MAIN,
                shifted = KB_HE_MESSAGEASE_SYMBOLS_TWO_HANDS_MAIN,
                numeric = KB_HE_MESSAGEASE_TWO_HANDS_NUMERIC,
            ),
    )
