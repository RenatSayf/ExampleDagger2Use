package com.renatsayf.exampledagger2use

import android.content.Context
import com.renatsayf.exampledagger2use.di.App
import javax.inject.Inject

class Message @Inject constructor(context: Context)
{
    val text = context.getString(R.string.text_to_display)
}