package com.renatsayf.exampledagger2use.di.modules

import android.content.Context
import com.renatsayf.exampledagger2use.MainActivity
import dagger.Module
import dagger.Provides
import javax.inject.Inject
import javax.inject.Singleton

//TODO Шаг 3: Содаем модуль для получения контекста
@Module
class AppModule @Inject constructor()
{
    @Provides
    @Singleton
    fun provideContext(app: MainActivity) : Context
    {
        return app.applicationContext
    }
}