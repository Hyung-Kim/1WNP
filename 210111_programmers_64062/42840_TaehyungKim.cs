using System;
using System.Collections.Generic;
using System.Diagnostics;
using System.Linq;

namespace ConsoleApp19
{
    class Program
    {
        static void Main(string[] args)
        {
            var solution = new Solution();
            var ret = solution.solution(new int[] { 1, 2, 3, 4, 5 });
            foreach (var num in ret)
                Debug.WriteLine(num);
        }
    }
    public class Solution
    {
        private readonly int[][] Patterns =
        {
            new int[]{1, 2, 3, 4, 5},
            new int[]{2, 1, 2, 3, 2, 4, 2, 5},
            new int[]{3, 3, 1, 1, 2, 2, 4, 4, 5, 5}
        };

        public int[] solution(int[] answers)
        {
            var order = 0;
            var ret = new List<Tuple<int, int>>(); // ORDER, CNT
            foreach (var pattern in Patterns)
            {
                var cnt = answers.Where((v, i) => v == pattern[(i % pattern.Length)]).Count();
                ret.Add(Tuple.Create(order++, cnt));
            }
            var top = ret.OrderByDescending(x => x.Item2).FirstOrDefault();
            return ret.Where(x => x.Item2 == top.Item2).Select(x => x.Item1 + 1).ToArray();
        }
    }

}
