package com.renatsayf.exampledagger2use.di.modules

import android.content.Context
import com.renatsayf.exampledagger2use.MyClass
import dagger.Module
import dagger.Provides
import javax.inject.Inject
import javax.inject.Singleton

//TODO Шаг 2: Создаем модуль класса с конструктором который принимает контекст в качестве параметра
@Module
class MyClassModule @Inject constructor(private val context: Context)
{
    @Singleton
    @Provides
    fun provideMyClass() : MyClass
    {
        return MyClass(context)
    }
}