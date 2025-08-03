package com.fennec.recipeapp

fun main(){
    println("hi there give me a number :")
    var n: Int

    try {
        n = readln().toInt()
    }catch(e: Exception){
        println("[ERROR]: ${e.message}")
        n=0
    }finally {
        println("[INFO]: try to stay relevant before ai take your job")

    }
    println("[INFO]: number is: $n")

}