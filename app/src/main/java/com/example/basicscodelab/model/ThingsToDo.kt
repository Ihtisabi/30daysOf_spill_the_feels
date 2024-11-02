package com.example.basicscodelab.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.basicscodelab.R

data class Day(
    @DrawableRes val imageRes: Int,
    @StringRes val titleRes: Int,
    @StringRes val descRes: Int
)

object DayRepo {
    val days = listOf(
        Day(R.drawable.image0, R.string.title0, R.string.desc0),
        Day(R.drawable.image1, R.string.title1, R.string.desc1),
        Day(R.drawable.image2, R.string.title2, R.string.desc2),
        Day(R.drawable.image3, R.string.title3, R.string.desc3),
        Day(R.drawable.image4, R.string.title4, R.string.desc4),
        Day(R.drawable.image5, R.string.title5, R.string.desc5),
        Day(R.drawable.image5, R.string.title6, R.string.desc5),
        Day(R.drawable.image5, R.string.title7, R.string.desc5),
        Day(R.drawable.image5, R.string.title8, R.string.desc5),
        Day(R.drawable.image5, R.string.title9, R.string.desc5),
        Day(R.drawable.image5, R.string.title10, R.string.desc5),
        Day(R.drawable.image5, R.string.title11, R.string.desc5),
        Day(R.drawable.image5, R.string.title12, R.string.desc5),
        Day(R.drawable.image5, R.string.title13, R.string.desc5),
        Day(R.drawable.image5, R.string.title14, R.string.desc5),
        Day(R.drawable.image5, R.string.title15, R.string.desc5),
        Day(R.drawable.image5, R.string.title16, R.string.desc5),
        Day(R.drawable.image5, R.string.title17, R.string.desc5),
        Day(R.drawable.image5, R.string.title18, R.string.desc5),
        Day(R.drawable.image5, R.string.title19, R.string.desc5),
        Day(R.drawable.image5, R.string.title20, R.string.desc5),
        Day(R.drawable.image5, R.string.title21, R.string.desc5),
        Day(R.drawable.image5, R.string.title22, R.string.desc5),
        Day(R.drawable.image5, R.string.title23, R.string.desc5),
        Day(R.drawable.image5, R.string.title24, R.string.desc5),
        Day(R.drawable.image5, R.string.title25, R.string.desc5),
        Day(R.drawable.image5, R.string.title26, R.string.desc5),
        Day(R.drawable.image5, R.string.title27, R.string.desc5),
        Day(R.drawable.image5, R.string.title28, R.string.desc5),
        Day(R.drawable.image5, R.string.title29, R.string.desc5)
    )
}