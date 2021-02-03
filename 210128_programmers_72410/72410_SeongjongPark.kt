class Solution {
    fun solution(new_id: String): String {
        var answer: String = new_id
        val first = "[`~!@#\$%^&*()=+[{]}:?,<>/]".toRegex()
        val second = "[.]{2,}".toRegex()
        val third = "[\\s]".toRegex()

        answer = answer.replace(first, "").toLowerCase()
        answer = answer.replace(second, ".")
        answer = answer.replace(third, "")

        if (answer.length < 2) {
            if (answer == ".") answer = answer.replace(".", "a")
            else if (answer == "") answer = "a"
        }

        while (true) {
            if (answer[0].toString() == ".") {
                answer = answer.substring(1, answer.lastIndex)
            } else break
        }
        while (true) {
            if (answer.last().toString() == ".") {
                answer = answer.substring(0, answer.lastIndex)

            } else break
        }

        if (answer.length > 15) {
            answer = answer.substring(0, 15)

            if (answer.last().toString() == ".") {
                answer = answer.substring(0, answer.lastIndex)
            }
        }

        if (answer.length < 3) {
            for (i in answer.length..2)
                answer += answer.last()
        }
        return answer
    }
}