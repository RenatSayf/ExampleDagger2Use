package com.renatsayf.exampledagger2use

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.renatsayf.exampledagger2use.di.App
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : AppCompatActivity()
{
    @Inject
    lateinit var myClass: MyClass //TODO Шаг 6: экземпляр нашего класса

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        App(this).appComponent.inject(this) //TODO Шаг 7: Инъекция... Тадааам... Уф!!!

        btnPassContext.setOnClickListener {
            textView.text = myClass.text //Пользуемся...
        }

    }
}
