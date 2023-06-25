package com.example.daysingame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        days = findViewById(R.id.days)
        quarter = findViewById(R.id.quarter)
    }
    private lateinit var days: TextView
    private lateinit var quarter: TextView
    fun quarterHasPassed(view: View) {
        //Увеличиваем счетчик

        //Считаем количество четвертей
        val countQuqrterString = quarter.text.toString()
        var countQuqrter: Int = Integer.parseInt(countQuqrterString)

        val countDaysString = days.text.toString()
        var countDays: Int = Integer.parseInt(countDaysString)

        //Если четвертей больше 4, то приравниваем к 1 и увеличиваем количество дней

        if (countQuqrter == 4) {
            countQuqrter = 1
            countDays++
            days.text = countDays.toString();
        }
        else {
            countQuqrter++
        }
        quarter.text = countQuqrter.toString();

        //вывети уведомление, что прошла четверть дня
        Toast.makeText(applicationContext,"Четверть дня пройдена!",Toast.LENGTH_SHORT).show();
    }
}