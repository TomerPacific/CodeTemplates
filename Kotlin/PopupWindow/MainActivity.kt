package com.tomerpacific.laundry

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import android.widget.PopupWindow

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun showPopup(view: View) {
        val inflater: LayoutInflater =
            applicationContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater


        val localView = inflater.inflate(R.layout.custom_view, null)

        val localButton = localView.findViewById(R.id.closeBtn) as Button

        val popupWindow: PopupWindow = PopupWindow(
            localView,
            LinearLayout.LayoutParams.WRAP_CONTENT,
            LinearLayout.LayoutParams.WRAP_CONTENT
        )


        localButton.setOnClickListener(object : View.OnClickListener{
            override fun onClick(v: View?) {
                popupWindow.dismiss()
        }})

        popupWindow.showAtLocation(view, Gravity.CENTER, 0, 0)
    }

}

