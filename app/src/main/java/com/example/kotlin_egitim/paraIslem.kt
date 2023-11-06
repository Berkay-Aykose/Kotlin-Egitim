package com.example.kotlin_egitim

import java.util.Scanner

fun main()
{
    val girdi = Scanner(System.`in`)
    println("ISLEMLER\nÇıkmak için-->0\nPara eklemek için-->1\nPara çekmek için-->2\n")

    print("Yapmak istediğiniz işlemi seçiniz :")

    when(girdi.nextInt())
    {
        0 -> println("Çıkılıyor...")
        1 -> paraEkle()
        2 -> paraCek()
    }

}

fun paraCek(cuzdan: Int = 1000)
{
    val girdi = Scanner(System.`in`)

    print("Çekilecek tutarı giriniz:")
    val x = girdi.nextInt()

    if (cuzdan>=x)
    {
        val top = (cuzdan-x)
        println("Yeni tutar = $top")
    }
    else
    {
        println("Bu kadar bakiyeniz yok...")
    }
}

fun paraEkle(cuzdan: Int = 1000)
{
    val girdi = Scanner(System.`in`)

    print("Eklenecek tutarı giriniz:")
    val x = girdi.nextInt()

    val top = (cuzdan+x)
    println("Yeni tutar = $top")
}