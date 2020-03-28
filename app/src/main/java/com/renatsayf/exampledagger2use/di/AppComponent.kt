package com.renatsayf.exampledagger2use.di

import com.renatsayf.exampledagger2use.MainActivity
import com.renatsayf.exampledagger2use.MyClass
import com.renatsayf.exampledagger2use.di.modules.MessageModule
import com.renatsayf.exampledagger2use.di.modules.MyClassModule
import dagger.Component
import javax.inject.Singleton

//TODO Шаг 3: Создаем интерфейс AppComponent
@Singleton
@Component(modules = [MyClassModule::class, MessageModule::class])
interface AppComponent
{
    fun inject(mainActivity: MainActivity)      // для инъекции в MainActivity
    fun inject(myClass: MyClass)                // для инъекции в MyClass
}