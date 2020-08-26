package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.Toast
import com.google.android.material.badge.BadgeDrawable.BOTTOM_START
import com.google.android.material.badge.BadgeDrawable.TOP_END
import kotlinx.android.synthetic.main.activity_bottom_navigation.*

class BottomNavigationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bottom_navigation)

   //
        btnView.setOnNavigationItemReselectedListener {
            item ->
            when(item.itemId){
                R.id.item_home ->{
                    Toast.makeText(this,"Click on home", Toast.LENGTH_SHORT).show()
                    true
                }
                R.id.item_favorites ->{
                    Toast.makeText(this,"Click on favorites", Toast.LENGTH_SHORT).show()
                    true
                }

                R.id.item_search ->{
                    Toast.makeText(this,"Click on search", Toast.LENGTH_SHORT).show()
                    true
                }
                else -> false
            }
        }

        btnView.getOrCreateBadge(R.id.item_search)
        val badge = btnView.getBadge(R.id.item_search)
        badge?.number=2
        badge?.badgeGravity= BOTTOM_START
     }

}
