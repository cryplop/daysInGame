package com.example.daysingame.com.example.daysingame
import com.example.daysingame.com.example.daysingame.MyCharacter

public final class Talent(
    val nameTalent: String,
    val levelTalent: Int
){
    constructor(nameTalent: String,
                levelTalent: Int,
                owner: MyCharacter
    ) : this(nameTalent, levelTalent) {
        owner.talents.add(this)
    }
}