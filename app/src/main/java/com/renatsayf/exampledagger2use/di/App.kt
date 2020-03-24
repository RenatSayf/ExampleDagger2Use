package com.renatsayf.exampledagger2use.di

import android.annotation.SuppressLint
import android.app.Application
import com.renatsayf.exampledagger2use.MainActivity
import com.renatsayf.exampledagger2use.di.modules.MessageModule
import com.renatsayf.exampledagger2use.di.modules.MyClassModule
import javax.inject.Inject

//TODO Шаг 5: Создаем класс-наследник Application в констуктор которого передаем главное активити
@SuppressLint("Registered")
class App @Inject constructor(mainActivity: MainActivity) : Application()
{
    val appComponent : AppComponent = DaggerAppComponent.builder()
        .myClassModule(MyClassModule(mainActivity))
        .messageModule(MessageModule(mainActivity))
        .build()
}