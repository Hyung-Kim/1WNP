package com.bwkkoo.myapplication

class Solution {
    fun solution(answers: IntArray): IntArray {
        var resultanswer = arrayListOf<Int>()
        var answer = hashMapOf<Int, Int>()
        val supoja1 = intArrayOf(1, 2, 3, 4, 5)
        var supoja1Answer = 0
        val supoja2 = intArrayOf(2, 1, 2, 3, 2, 4, 2, 5)
        var supoja2Answer = 0
        val supoja3 = intArrayOf(3, 3, 1, 1, 2, 2, 4, 4, 5, 5)
        var supoja3Answer = 0

        for (i in answers.indices) {
            if (i == 0) {
                if (supoja1[0] == answers[i]) supoja1Answer++
                if (supoja2[0] == answers[i]) supoja2Answer++
                if (supoja3[0] == answers[i]) supoja3Answer++
                continue
            }
            if (supoja1[i % supoja1.size] == answers[i]) supoja1Answer++
            if (supoja2[i % supoja1.size] == answers[i]) supoja2Answer++
            if (supoja3[i % supoja1.size] == answers[i]) supoja3Answer++

        }
        answer[1] = supoja1Answer
        answer[2] = supoja2Answer
        answer[3] = supoja3Answer

        val maxValue = answer.values.max()

        for (i in answer) {
            if (i.value == maxValue) resultanswer.add(i.key)
        }

        print(resultanswer.toString())
        return resultanswer.toIntArray()
    }
}