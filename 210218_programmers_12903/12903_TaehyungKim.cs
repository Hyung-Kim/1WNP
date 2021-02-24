using System;
using System.Collections.Generic;
using System.Linq;

namespace Programmers.Study
{
    class Program
    {
        static void Main(string[] args)
        {
            var solution = new Solution();

            var ret = solution.solution("qwer");
        }
    }



    public class Solution
    {
        public string solution(string s)
        {

            var length = s.Length;
            var isEven = (length % 2) == 0;
            var stx = length / 2;
            if (isEven)
            {
                return string.Concat(s.Skip(stx - 1).Take(2));
            }
            else
            {
                return string.Concat(s.Skip(stx).Take(1));
            }
        }
    }
}
