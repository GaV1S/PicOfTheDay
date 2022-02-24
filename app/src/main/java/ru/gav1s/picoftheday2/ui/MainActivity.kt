package ru.gav1s.picoftheday2.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ru.gav1s.picoftheday2.R
import ru.gav1s.picoftheday2.ui.main.MainFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, MainFragment.newInstance())
                .commitNow()
        }
    }
}
