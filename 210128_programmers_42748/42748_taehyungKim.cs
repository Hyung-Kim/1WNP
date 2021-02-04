using System;
using System.Collections.Generic;
using System.Linq;

namespace ConsoleApp23
{
    class Program
    {
        static void Main(string[] args)
        {

            var arr1 = new int[] { 1, 5, 2, 6, 3, 7, 4 };
            var commands1 = new int[,]
            {
                { 2,5,3},
                { 4,4,1},
                {1,7,3 }
            };
            var solution = new Solution();
            var ret= solution.solution(arr1, commands1);
            
        }

        public class Solution
        {
            public int[] solution(int[] array, int[,] commands)
            {
                var ret = new List<int>();

                var row = commands.GetLength(0);
                var col = commands.GetLength(1);
                for (int i = 0; i < row; i++)
                {
                    var skip = commands[i, 0];
                    var take = commands[i, 1] - skip + 1;
                    var kth = commands[i, 2];

                    var num = array.Skip(skip - 1).Take(take).OrderBy(x => x).ElementAt(kth - 1);
                    ret.Add(num);
                }
                return ret.ToArray();
            }
        }
    }
}
