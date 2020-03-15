package com.renatsayf.exampledagger2use

import android.content.Context
import javax.inject.Inject

//TODO Шаг 1: Класс который хотим инжектить, и которому нужен контекст приложения
class MyClass @Inject constructor(context: Context)
{
    val message : String = context.getString(R.string.text_to_display)
}