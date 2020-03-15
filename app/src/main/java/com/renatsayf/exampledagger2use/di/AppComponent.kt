package com.renatsayf.exampledagger2use.di

import com.renatsayf.exampledagger2use.MainActivity
import com.renatsayf.exampledagger2use.MyClass
import com.renatsayf.exampledagger2use.di.modules.AppModule
import com.renatsayf.exampledagger2use.di.modules.MyClassModule
import dagger.Component
import javax.inject.Singleton

//TODO Шаг 4: Создаем интерфейс AppComponent
@Singleton
@Component(modules = [AppModule::class, MyClassModule::class])
interface AppComponent
{
    fun inject(mainActivity: MainActivity)
    fun inject(myClass: MyClass)                // для инъекции в MyClass
    fun inject(myClassModule: MyClassModule)    // для инъекции в MyClassModule
}