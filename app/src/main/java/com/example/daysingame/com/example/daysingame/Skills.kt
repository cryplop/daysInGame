package com.example.daysingame.com.example.daysingame

class Skills(
    val nameSkills: String,
    val levelSkills: Int
) {
    constructor(nameSkills: String,
                levelSkills: Int,
                owner: Adventurer
    ) : this(nameSkills, levelSkills) {
        owner.skills.add(this)
    }
}
