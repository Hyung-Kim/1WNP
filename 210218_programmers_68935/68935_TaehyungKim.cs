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

            var ret = solution.solution(125);
        }
    }


    
    public class Solution
    {
        int CalcBase(IEnumerable<int> sequence, int b)
        {
            var length = sequence.Count();
            var sum = 0;
            foreach (var elem in sequence.Select((v, i) => new { v, i })) 
            {
                sum += elem.v * (int)Math.Pow(b, length - elem.i - 1);
            }
            return sum;
        }
        IEnumerable<int> ToBaseReverse(int x, int b)
        {
            if (x == 0)
            {
                yield return 0;
                yield break;
            }
            int z = x;
            while (z > 0)
            {
                yield return z % b;
                z /= b;
            }
        }
        public int solution(int n)
        {
            var reversedBytes = ToBaseReverse(n, 3);
            return CalcBase(reversedBytes, 3);
        }
    }
}
