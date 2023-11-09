package com.example.kotlin_egitim

import java.util.Scanner

fun main()
{
    val girdi = Scanner(System.`in`)

    println("Kaç ders girmek istersiniz?")
    val x = girdi.nextInt()
    val dersler = Array<String>(x) {""}//{"","","","",""}
    val notlar = Array<Int>(x) {0}//{0,0,0,0,0}



    //count() dizi kaç elamlı bulmaya yarar
    for (i in 0  until dersler.count())//0,1,2,3,4
    {
        println("${i+1}. dersin ismini giriniz")
        val ders = girdi.next()
        dersler[i] = ders

        println("${i+1}. dersin notunu giriniz")
        val not = girdi.nextInt()
        notlar[i] = not
    }

    for(i in 0 until notlar.count())
    {
        println("${dersler[i]} : ${notlar[i]}")
    }

}
