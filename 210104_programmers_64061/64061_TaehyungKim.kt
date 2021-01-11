import java.util.*

fun main(args: Array<String>){
    println("sdfdsfdsdf");
    var solution = Solution()
    var moves = intArrayOf(1,5,3,5,1,2,1,4)

    var board = arrayOf(
    intArrayOf(0,0,0,0,0)
    ,intArrayOf(0,0,1,0,3)
    ,intArrayOf(0,2,5,0,1)
    ,intArrayOf(4,2,4,4,2)
    ,intArrayOf(3,5,1,3,1))

    var answer = solution.solution(board, moves)
    println(answer)
}

class Solution {
    fun solution(board: Array<IntArray>, moves: IntArray): Int {
        var answer = 0
        var stack = Stack<Int>()

        for (n in moves){
            var column =  n - 1

            for(row in board.indices) {
                 if(board[row][column] != 0){
                     var target = board[row][column]
                     board[row][column] = 0

                     if(stack.isNotEmpty())
                     {
                         var top = stack.peek()
                         if(top == target)
                         {
                             answer+=2
                             stack.pop()
                             break
                         }
                     }
                     stack.push(target)
                     break
                 }
             }
        }

        return answer
    }
}

