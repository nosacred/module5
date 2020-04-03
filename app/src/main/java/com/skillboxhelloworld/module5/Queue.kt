package com.skillboxhelloworld.module5

import android.graphics.Insets.add
// 5.1.2
fun main() {
    var test = Queue<String>()
    test.enqueue("Первая строка")
    test.enqueue("Вторая строка строка")
    test.enqueue("Третья строка")
    println(test.dequeue())
    println(test.dequeue())
    println(test.dequeue())
    println(test.dequeue())

}

class Queue <T>() {

    private val stack = mutableListOf<T>()

    fun enqueue(item: T) {
        stack.add(item)
    }

    fun dequeue(): T? {
        if(stack.isNotEmpty()){
            return stack.removeAt(0)
        }
        return null
    }
}