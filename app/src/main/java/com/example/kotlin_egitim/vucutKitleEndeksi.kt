package com.example.kotlin_egitim

import java.util.Scanner

fun main()
{
    var girdi = Scanner(System.`in`)

    print("Boyunuzu giriniz : ")
    val boy = girdi.nextDouble()
    print("Kilonuzu giriniz : ")
    val kilo = girdi.nextDouble()

    hesapla(boy,kilo)
}

fun hesapla(boy:Double,kilo:Double)
{
    val sonuc = kilo/(boy*boy)

    println("Vücut kitle indeksizniz = $sonuc ")

    if(sonuc<18.5)
    {
        println("İdeal kilonun altında")
    }
    else if(sonuc<24.9)
    {
        println("İdeal kiloda")
    }
    else if(sonuc<29.9)
    {
        println("İdeal kilonun üstünde")
    }
    else if(sonuc<39.9)
    {
        println("İdeal kilonun çok üstünde (obez)")
    }
    else
    {
        println("İdeal kilonun çok üstünde (morbid obez)")
    }
}

