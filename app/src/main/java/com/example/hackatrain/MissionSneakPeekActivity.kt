package com.example.hackatrain

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MissionSneakPeekActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mission_sneak_peek)
    }

    fun sneakPeekMission(view: View){
        val newFragment = MissionDialogFragment()
        newFragment.show(supportFragmentManager, "mission")
    }

    fun next(view: View){
        var intent = Intent(this, MapsActivity::class.java)
//        intent.putExtra("name", name)

        startActivity(intent)
    }
}
