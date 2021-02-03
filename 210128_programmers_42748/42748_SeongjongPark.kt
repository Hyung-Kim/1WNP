package com.bwkkoo.myapplication

class Solution {
    fun solution(array: IntArray, commands: Array<IntArray>): IntArray {
        val answer:ArrayList<Int> = arrayListOf()

        for(data in commands){
            val i = if(data[0] == 0) 0 else data[0] -1
            val intArray :MutableList<Int> = arrayListOf()
            for(subArray in i until data[1]){
                intArray.add(array[subArray])
            }
            intArray.sort()
            answer.add(intArray[data[2]-1])
        }
        return answer.toIntArray()
    }
}
