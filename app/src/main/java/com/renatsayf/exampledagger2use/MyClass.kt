package com.renatsayf.exampledagger2use

import javax.inject.Inject

class MyClass @Inject constructor()
{
    @Inject
    lateinit var message: Message // MyClass зависит от класса Message и тому нужен Context

    init {
        MainActivity.appComponent.inject(this)
    }

    val text : String = message.text
}