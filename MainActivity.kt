//MainActivity.kt
package com.andrebalogo.randomizer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlin.random.Random
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (supportActionBar != null) {
            supportActionBar!!.hide()
        }

        buttonNumber.setOnClickListener(this)

    }
    override fun onClick(v: View?) {
        if (v?.id == R.id.buttonNumber || v?.id == R.id.textPalmeiras) {
            textPalmeiras.text = random().toString()
            textFlamengo.text = random().toString()
        }
    }

    private fun random(): Int {
        return Random.nextInt(6)
    }

}
