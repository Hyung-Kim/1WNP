package com.bwkkoo.myapplication

class Solution {
    fun solution(n: Int): Int {
        var answer: Int = 0
        val sam = mutableListOf<Int>()
        var result = n
        while (true) {
            val dim = result.div(3)
            if (result < 3) {
                sam.add(result)
                break
            } else if (dim == 1) {
                sam.add(result.rem(3))
                sam.add(1)
                break
            } else {
                sam.add(result % 3)
            }
            result = dim
        }
        sam.reverse()

        for (i in 0 until sam.size) {
            var decimals = 1
            for (j in 1..i) {
                decimals *= 3
            }
            answer += decimals * sam[i]
        }
        return answer
    }

}