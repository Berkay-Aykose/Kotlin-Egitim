package com.example.kotlin_egitim

import java.util.Scanner

fun main()
{
    val dersler = Array<String>(5) {""}//{"","","","",""}
    val notlar = Array<Int>(5) {0}//{0,0,0,0,0}

    val girdi = Scanner(System.`in`)

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
