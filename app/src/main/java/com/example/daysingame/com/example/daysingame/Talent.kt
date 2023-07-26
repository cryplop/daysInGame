package com.example.daysingame.com.example.daysingame

public final class Talent(
    val nameTalent: String,
    val levelTalent: Int
){
    constructor(nameTalent: String,
                levelTalent: Int,
                owner: Adventurer
    ) : this(nameTalent, levelTalent) {
        owner.talents.add(this)
    }
}