package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
   //nuevo
        //setSupportActionBar(baBar)
        baBar.replaceMenu(R.menu.menu_bottom_app_bar)
   baBar.setOnMenuItemClickListener { item->
       when(item.itemId){
           R.id.item_home ->{
               Toast.makeText(this,"Click on home",Toast.LENGTH_SHORT).show()
                true
           }
           R.id.item_favorites ->{
               Toast.makeText(this,"Click on favorites",Toast.LENGTH_SHORT).show()
               true
           }

           R.id.item_search ->{
               Toast.makeText(this,"Click on search",Toast.LENGTH_SHORT).show()
               true
           }
            else -> false
       }
   }
baBar.setNavigationOnClickListener {  }
    }
}
