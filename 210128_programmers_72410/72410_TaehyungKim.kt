import java.lang.StringBuilder

fun main(args : Array<String>) {
    var arr = arrayOf("...!@BaT#*..y.abcdefghijklm", "z-+.^.", "=.=", "123_.def", "abcdefghijklmn.p")
    val solution = Solution()
    for(word in arr){
        var ret = solution.solution(word)
        println(ret)
    }

}

class Solution {
    fun solution(new_id: String): String {
        val level1 = new_id.toLowerCase()
        val level2 = StringBuilder()
        for(ch in level1) {
            if(ch.isLowerCase() || ch.isDigit() || ch == '-' || ch == '_' || ch == '.') {
                level2.append(ch)
            }
        }
        var level3 = StringBuilder()
        var isPrevDot = false
        for(ch in level2){
            if(ch == '.')
            {
                if(isPrevDot)
                    continue
                isPrevDot = true
                level3.append(ch)
            }else{
                level3.append(ch)
                isPrevDot = false
            }
        }
        var level4:String = level3.toString()
        if(level4.isNotEmpty())
        {
            if(level4.first() == '.')
                level4 = when(level4.length >= 2){
                    true -> level4.substring(1)
                    false -> ""
                }
            if(level4.isNotEmpty() && level4.last() == '.')
                level4 = when(level4.length >= 2){
                    true -> level4.substring(0, level4.length -1)
                    false -> ""
                }

        }
        val level5 = when(level4.isEmpty()){
            true -> "a"
            false -> level4
        }
        var level6 = level5.take(15)
        if(level6.isNotEmpty()){
            while(level6.isNotEmpty() && level6.last() == '.'){
                level6 = level6.substring(0, level6.length -1)
            }
        }

        val level7 = StringBuilder()
        if(level6.length <= 2){
            val diff = 3 - level6.length
            level7.append(level6)
            val lastCh = level6.last()
            for(i in 0 until diff){
                level7.append(lastCh)
            }
        }else{
            level7.append(level6)
        }
        return level7.toString()
    }
}