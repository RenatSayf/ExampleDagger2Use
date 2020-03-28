package com.renatsayf.exampledagger2use

import android.content.Context
import javax.inject.Inject

//TODO Шаг 1: Класс который хотим инжектить, и которому нужен контекст приложения
class Message @Inject constructor(context: Context)
{
    val text = context.getString(R.string.text_to_display)
}