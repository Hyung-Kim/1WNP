using System;
using System.Diagnostics;

namespace Programmers.Study
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Hello World!");
            var solution = new Solution();
            var ret = solution.solution(1, 2);
            Debug.WriteLine(ret);
                
        }
    }
    public class Solution
    {
        public string solution(int a, int b) =>
            new DateTime(2016, a, b).DayOfWeek.ToString().Substring(0, 3).ToUpper();
    }
}
