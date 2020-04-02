package com.skillboxhelloworld.module5

sealed class Resoult<out T, R>

    data class Success<T, R>(var defaultValue: T) : Resoult<T, R>()

    data class Error<T, R>(var item: R) : Resoult<T, R>()

    fun getResoult() : Resoult<Int, String>{
      val item : Resoult<Int, String> = Success(12)
        return item
    }

fun main() {
    val red :Resoult<Int,String> = Success(12)
    println(red.toString())

}