package com.example.app_courses.model

import androidx.annotation.DrawableRes
import androidx.annotation.IntegerRes
import androidx.annotation.StringRes

data class Topic(
    @StringRes val stringResourceId: Int,
    val cursosAsociados: Int,
    @DrawableRes val imageResourceId: Int
)