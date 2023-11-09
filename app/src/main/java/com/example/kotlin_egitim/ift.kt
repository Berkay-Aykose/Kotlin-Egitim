package com.example.kotlin_egitim

import java.util.Scanner

fun main()
{

    val girdi = Scanner(System.`in`)

    println("Bir sayi giriniz...")
    val deger = girdi.nextInt()

    if(deger % 2 == 0)
    {
        println("çift")
    }
    else
    {
        println("tek")
    }
}