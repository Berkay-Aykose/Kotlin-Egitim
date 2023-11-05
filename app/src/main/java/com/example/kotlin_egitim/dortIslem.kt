package com.example.kotlin_egitim

fun main() {
    println(cikarma(10,5))//5
    println(toplama(10,5))//15
    println(bolme(10,5))//2
    println(carpma(10,5))//50
}

fun cikarma(x: Int, y: Int): Int {
    /*
    var sonuc = x - y
    return sonuc
    */
    return x - y
}

fun toplama(x: Int, y: Int): Int {
    return x + y
}

fun carpma(x: Int, y: Int): Int {
    return x * y
}

fun bolme(x: Int, y: Int): Int {
    return x / y
}