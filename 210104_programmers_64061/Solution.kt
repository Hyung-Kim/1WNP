package com.bwkkoo.myapplication

class Solution {
    fun solution(board: Array<IntArray>, moves: IntArray): Int {
        val result: ArrayList<Int> = arrayListOf()
        var answer = 0
        for (i in moves.indices) {
            print(board[0].toString())
            if (board[moves[i] - 1].last() == 0) {
                val newBoard = IntArray(board[moves[i] - 1].size - 1)
                for (j in board[moves[i] - 1].indices) {
                    if (j == board[moves[i] - 1].size - 1) continue
                    newBoard[j] = board[moves[i] - 1][j]
                }
                board[moves[i] - 1] = newBoard
                continue
            }
            result.add(board[moves[i] - 1].last())

            val newBoard = IntArray(board[moves[i] - 1].size - 1)
            for (j in board[moves[i] - 1].indices) {
                if (j == board[moves[i] - 1].size - 1) continue
                newBoard[j] = board[moves[i] - 1][j]
            }
            board[moves[i] - 1] = newBoard

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