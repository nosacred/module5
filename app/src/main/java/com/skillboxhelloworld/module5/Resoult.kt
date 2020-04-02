package com.skillboxhelloworld.module5

sealed class Resoult<out T,in R>

    data class Success<T:Number, R:String>(var item: T) : Resoult<T, R>()

    data class Error<T:Any, R:String>(var item: R) : Resoult<T, R>()

    fun getResoult(resoult: Resoult<Any,String>) : Resoult<Int, String>{
         when (resoult){
            is Success ->
            is Error ->
        }
        return
    }

fun main() {

}