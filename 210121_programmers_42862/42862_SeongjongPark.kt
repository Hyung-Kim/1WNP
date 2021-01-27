package com.bwkkoo.myapplication

class Solution {
    fun solution(n: Int, lost: IntArray, reserve: IntArray): Int {
        var answer = 0
        var lose = 0
        var lostList: MutableList<Int> = lost.toMutableList()
        val reserveList: MutableList<Int> = reserve.toMutableList()

        for(data in reserve){
            if(lostList.contains(data)){
                reserveList.remove(data)
                lostList.remove(data)
                lose++
            }
        }

        lostList = lostList.distinct().toMutableList()
        lostList.sort()
        val lostSideStuList: ArrayList<Int> = arrayListOf()
        for (data in lostList) {
            lostSideStuList.add(data - 1)
            lostSideStuList.add(data + 1)
        }
        val dis: MutableList<Int> = lostSideStuList.distinct().toMutableList()
        for (data in reserveList) {
            val result = dis.find { it == data }
            if (result != null) {
                dis.remove(result)
                answer++
            }
        }
        answer += n - lost.size + lose
        if(answer > n) answer = n
        return answer
    }
}
