package com.smolianinovasiuzanna.myapplication


//Given two strings s and t, return true if t is an anagram of s, and false otherwise.
//Example 1:
//
//Input: s = "anagram", t = "nagaram"
//Output: true
//Example 2:
//
//Input: s = "rat", t = "car"
//Output: false

fun main(){
    println(isAnagram("qwertyq", "rqewtyq"))
}
fun isAnagram(s: String, t: String): Boolean {

    if (s.length != t.length) return false

    val arrayS = s.toCharArray()
    val arrayT = t.toCharArray()

    arrayS.sort()
    arrayT.sort()
    return arrayS.contentEquals(arrayT)

}
