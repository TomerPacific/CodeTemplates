package com.tomerpacific.databinding

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.tomerpacific.databinding.databinding.ActivityDataBindingBinding

class DataBindingActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val extraString = intent.getStringExtra("elementData")

        val binding: ActivityDataBindingBinding = DataBindingUtil.setContentView(
            this, R.layout.activity_data_binding)

        binding.element = Example(extraString)
    }
}