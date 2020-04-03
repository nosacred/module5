package com.skillboxhelloworld.module5

fun main() {
    val lis = listOf(1,2,3,4.5,7,24.3,22,"as",44,56,4.234)
    genericFun(lis)
}

fun <T> genericFun (numberList : List<T>):List <T>{
    val intList = numberList.filter { it is Int }
    val doubleList = numberList.filter { it is Double }
    val newList = mutableListOf<T>()

    for ( i in numberList){
        if(i is Number){
            if((i.toDouble() - i.toInt() == 0.0)&& (i.toInt()%2==0)){
                newList.add(i)
            }
        }
    }
    println(intList)
    println(doubleList)
    println(newList)

    return newList
}