package com.example.daysingame.com.example.daysingame

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.daysingame.R

class ViewAdventurer: AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.character_view)
        var skills: MutableList<Skills> = mutableListOf(Skills("qwe",1))
        var talents: MutableList<Talent> = mutableListOf(Talent("qwe",1))
        var adventurer = Adventurer("Тора")//,"Human") //,4, 4, 5, 6, skills, talents)
    }
}