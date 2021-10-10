package com.smolianinovasiuzanna.myapplication

import org.intellij.lang.annotations.RegExp

//Given a string s, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
//
//Example 1:
//
//Input: s = "A man, a plan, a canal: Panama"
//Output: true
//Explanation: "amanaplanacanalpanama" is a palindrome.
//Example 2:
//
//Input: s = "race a car"
//Output: false
//Explanation: "raceacar" is not a palindrome.
//
//Constraints:
//
//1 <= s.length <= 2 * 105
//s consists only of printable ASCII characters.

fun main(){
    println(isPalindrome("0P"))
}

fun isPalindrome(s: String): Boolean {

    val filteredS = s.filter { it.isLetterOrDigit()}.lowercase()
    return filteredS.reversed() == filteredS

}