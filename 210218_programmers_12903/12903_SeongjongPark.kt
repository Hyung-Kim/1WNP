package com.bwkkoo.myapplication

class Solution {
    fun solution(s: String): String {
        var answer = ""
        val stringLength = s.length
        if(stringLength % 2 == 0){
            answer = s.substring(stringLength/2-1,stringLength/2+1)
        }else{
            answer = s[stringLength/2].toString()
        }
            return answer
    }
}