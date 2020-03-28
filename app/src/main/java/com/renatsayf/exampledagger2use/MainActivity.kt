package com.renatsayf.exampledagger2use

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.renatsayf.exampledagger2use.di.AppComponent
import com.renatsayf.exampledagger2use.di.DaggerAppComponent
import com.renatsayf.exampledagger2use.di.modules.MessageModule
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : AppCompatActivity()
{
    companion object
    {
        lateinit var appComponent : AppComponent //TODO Шаг 4 объявляем статическую переменную
    }

    @Inject
    lateinit var myClass: MyClass //TODO Шаг 5: экземпляр нашего класса

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        appComponent = DaggerAppComponent.builder()
            .messageModule(MessageModule(this)) //TODO Шаг 6: передаем контекст в нужный модуль
            .build()

        appComponent.inject(this) //TODO Шаг 7: Инъекция... Тадааам... Уф!!!

        btnPassContext.setOnClickListener {
            textView.text = myClass.text //Пользуемся...
        }

    }
}
