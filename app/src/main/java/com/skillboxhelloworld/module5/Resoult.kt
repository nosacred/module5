package com.skillboxhelloworld.module5

sealed class Resoult< out T, R>

    data class Success<T, R>(var defaultValue: T) : Resoult<T, R>()

    data class Error<T, R>(var item: R) : Resoult<T, R>()

    fun getResoult() : Resoult<Int, String>{
      val item : Resoult<Int, String> = Success(12)
        return item
    }

fun main() {
    val item1 :Resoult<Int,String> = getResoult()
    val item2 :Resoult<Any, String> = item1
    val item3 :Resoult<Int, CharSequence> = item1
    val item4: Resoult<Int, Any> = item1
    println(item1.toString())
    println(item2.toString())

}