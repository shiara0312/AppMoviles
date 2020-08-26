package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class BottomSheetActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bottom_sheet)

    val modalBottomSheetFragment = ModalBottomSheetFragment()
        modalBottomSheetFragment.show(supportFragmentManager, ModalBottomSheetFragment.TAG)

    }
}
