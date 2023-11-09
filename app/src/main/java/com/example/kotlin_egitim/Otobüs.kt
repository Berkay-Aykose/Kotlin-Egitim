package com.example.kotlin_egitim

class Otobus(var marka_model:String,var kapasite:Int,var Nereden: String,var Nereye: String) {

    fun calistir()
    {
        println("Otobüs $Nereden --> $Nereye güzargahında yola çıktı")
    }
    fun bilgiAl()
    {
        println("Otobüsün marka/modeli = $marka_model")
        println("Yolcu kapasitesi = $kapasite")
        println("Otobüs kalkış şehri = $Nereden")
        println("Otobüs varış şehri = $Nereye")
    }
    fun durdur()
    {
        println("Otobüs durdu")
    }



}