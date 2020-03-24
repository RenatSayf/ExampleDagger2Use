package com.renatsayf.exampledagger2use.di.modules

import android.content.Context
import com.renatsayf.exampledagger2use.Message
import dagger.Module
import dagger.Provides
import javax.inject.Inject
import javax.inject.Singleton

@Module
class MessageModule @Inject constructor(private val context: Context)
{
    @Provides
    @Singleton
    fun provideMessage() : Message
    {
        return Message(context)
    }
}