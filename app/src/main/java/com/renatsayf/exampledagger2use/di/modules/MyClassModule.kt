package com.renatsayf.exampledagger2use.di.modules

import com.renatsayf.exampledagger2use.MyClass
import dagger.Module
import dagger.Provides
import javax.inject.Inject
import javax.inject.Singleton


@Module
class MyClassModule @Inject constructor()
{
    @Singleton
    @Provides
    fun provideMyClass() : MyClass
    {
        return MyClass()
    }
}