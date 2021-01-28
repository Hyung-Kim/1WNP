using System;
using System.Diagnostics;
using System.Linq;

namespace ConsoleApp22
{
    class Program
    {
        static void Main(string[] args)
        {
            int[] lost1 = new int[] { 2, 4 };
            int[] reserve1 = new int[] { 1, 3, 5 };
            var solution = new Solution();
            var ret = solution.solution(5, lost1, reserve1);
            Debug.WriteLine(ret);

            int[] lost2 = new int[] { 2, 4 };
            int[] reserve2 = new int[] { 3 };
            var ret2 = solution.solution(5, lost2, reserve2);
            Debug.WriteLine(ret2);

            int[] lost3 = new int[] { 3 };
            int[] reserve3 = new int[] { 1 };
            var ret3 = solution.solution(3, lost3, reserve3);
            Debug.WriteLine(ret3);
        }
    }
    public class Solution
    {
        public int solution(int n, int[] lost, int[] reserve)
        {
            int[] status = Enumerable.Repeat(1, n + 1).ToArray();
            foreach (var num in lost)
                status[num]--;
            foreach (var num in reserve)
                status[num]++;

            for (int i = 1; i < n; i++)
            {
                //내것만 있는 경우
                if (status[i] == 1)
                    continue;
                //내가 없는 경우
                if (status[i] == 0 && status[i + 1] == 2)
                {
                    status[i + 1]--;
                    status[i]++;
                }
                //내가 여분이 있는 경우
                else if (status[i] == 2 && status[i +1] == 0)
                {
                    status[i]--;
                    status[i + 1]++;
                }
            }

            return status.Skip(1).Where(x => x >= 1).Count();
        }
    }
}
