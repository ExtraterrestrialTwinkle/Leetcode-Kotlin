package com.smolianinovasiuzanna.myapplication
//
//Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.
//
//Example 1:
//
//Input: s = "leetcode"
//Output: 0
//Example 2:
//
//Input: s = "loveleetcode"
//Output: 2
//Example 3:
//
//Input: s = "aabb"
//Output: -1
//
//Constraints:
//
//1 <= s.length <= 105
//s consists of only lowercase English letters.

fun main(){
    firstUniqChar("loveleetcode")

}

fun firstUniqChar(s: String): Int {
    var index = -1
    var s1 = ""
    for(i in 0 until s.length){
        val s2 = s.substring(i+1)
        if (!s1.contains(s[i]) && !s2.contains(s[i])) {
            index = i
            break
        } else
            s1 += s[i]
            continue
        }
    println ("index = $index")
    return index
}


