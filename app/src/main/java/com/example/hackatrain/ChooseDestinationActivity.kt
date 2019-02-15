package com.example.hackatrain

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class ChooseDestinationActivity : AppCompatActivity() {

    private lateinit var btn_train : Button
    private lateinit var btn_car : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_choose_destination)

        btn_train = findViewById(R.id.btn_train)
        btn_car = findViewById(R.id.btn_car)

    }

    fun next(view: View){
        var intent = Intent(this, MissionSneakPeekActivity::class.java)
//        intent.putExtra("name", name)

        startActivity(intent)
    }

    fun select_train(view: View){
        btn_train.setBackgroundResource(R.drawable.train_2)
        btn_car.setBackgroundResource(R.drawable.car)
    }

    fun select_car(view: View){
        btn_train.setBackgroundResource(R.drawable.train)
        btn_car.setBackgroundResource(R.drawable.car_2)
    }
}
