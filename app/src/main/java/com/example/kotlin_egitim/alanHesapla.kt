package com.example.kotlin_egitim

import java.util.Scanner

fun main()
{
    //Kullanıcıdan girdi almak için
    val girdi = Scanner(System.`in`)

    println("Dikdortgen alani icin '(1)' basiniz")
    println("Cember alani icin '(2)' basiniz")

    val secim = girdi.nextInt()

    println("Seciminiz : $secim")

    //Dikdortgen
    if (secim == 1)
    {
        println("Dikdortgen 1. kenari")
        val kenarBir = girdi.nextInt()
        println("Dikdortgen 2. kenari")
        val kenarIki = girdi.nextInt()

        val sonuc = kenarIki*kenarBir
        println("Dikdortgen alani = $sonuc")
    }

    //Cember
    else if (secim == 2)
    {
        println("Cember yari Capi")
        val yariCap = girdi.nextInt()

        val sonuc = (3.14)*yariCap*yariCap
        println("Cember alani = $sonuc")
    }
    else
    {
        println("İstenilen sayi girilmedi...")
    }

}