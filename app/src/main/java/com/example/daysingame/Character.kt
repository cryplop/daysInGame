package com.example.daysingame.com.example.daysingame

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.daysingame.R
import com.example.daysingame.com.example.daysingame.MyCharacter

class Character: AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.character_view)
        var talents: MutableList<Talent> = mutableListOf(Talent("qwe",1))
        var character = MyCharacter("123",4, talents)

    }
}