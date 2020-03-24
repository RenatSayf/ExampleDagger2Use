package com.renatsayf.exampledagger2use

import android.content.Context
import com.renatsayf.exampledagger2use.di.App
import javax.inject.Inject

//TODO Шаг 1: Класс который хотим инжектить, и которому нужен контекст приложения
class MyClass @Inject constructor(context: Context)
{
    @Inject
    lateinit var message: Message // MyClass зависит от класса Message и тому также нужен Context

    init {
        App(context as MainActivity).appComponent.inject(this)
    }

    val text : String = message.text
}