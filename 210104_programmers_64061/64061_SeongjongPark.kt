package com.bwkkoo.myapplication

class Solution {
    fun solution(board: Array<IntArray>, moves: IntArray): Int {
        val result: ArrayList<Int> = arrayListOf()
        val itemSize = board[0].size
        var answer = 0
        for (i in moves.indices) {
            for(k in 0 until itemSize) {
              //  for(k in itemSize-1 downTo  0) {
                    if (board[k][moves[i]-1] != 0) {
                        result.add(board[k][moves[i]-1])
                        board[k][moves[i]-1] = 0
                        break
                    }
                }

            if (result.size > 1) {
                for (i in 0 until result.size) {
                    if(i == result.size-1 || result.size == 1) continue
                    if(result[i] == result[i+1]){
                        result.removeAt(i)
                        result.removeAt(i)
                        answer += 2
                        break
                    }
                }
            }
        }

        return answer
    }
}