package com.smolianinovasiuzanna.myapplication


fun main(){
    print(tribonacci(25))
}

    fun tribonacci(n: Int): Int {
        val array = IntArray(38)
        array[0] = 0
        array[1] = 1
        array[2] = 1
        for (n in 3..37){
            array[n] = array[n-1] + array[n-2] + array[n-3]
        }
        return array[n]
    }
