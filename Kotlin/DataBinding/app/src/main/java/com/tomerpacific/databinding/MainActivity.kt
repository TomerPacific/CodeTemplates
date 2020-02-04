package com.tomerpacific.databinding

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun openDataBindingActivity(view: View) {
        val intent : Intent = Intent(this, DataBindingActivity::class.java)
        intent.putExtra("elementData", view.tag.toString())
        startActivity(intent)
    }
}
