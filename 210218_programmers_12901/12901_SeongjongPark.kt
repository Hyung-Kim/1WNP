package com.bwkkoo.myapplication

class Solution {
    fun solution(a: Int, b: Int): String {
        val monthDay = arrayListOf<Int>(31,29,31,30,31,30,31,31,30,31,30,31)
        var daySum = 0
        if(a >1){
        for(i in 0 until a-1){
            daySum+=monthDay[i]
        }}
        daySum += b

        return when(if (daySum > 7) daySum % 7 else daySum){
            1 -> "FRI"
            2 -> "SAT"
            3 -> "SUN"
            4 -> "MON"
            5 -> "TUE"
            6 -> "WED"
            0 -> "THU"
            else -> ""
        }
    }
}