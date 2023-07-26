package com.example.daysingame.com.example.daysingame

class Adventurer(_name: String){

    val name:String = _name //имя персонажа
    var kin:String = "Undefined"//класс персонажа

    /*---атрибуты---*/
    var strength:Int = 0//сила
    var agility:Int = 0//ловкость
    var wits:Int = 0// смекалка
    var empathy:Int = 0 //эмпатия

    /*---Навыки---*/
    var skills: MutableList<Skills> = mutableListOf(Skills("qwe",1))

    /*---Таланты---*/
    var talents: MutableList<Talent> = mutableListOf(Talent("qwe",1))

}

