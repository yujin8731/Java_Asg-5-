package ASG2;

public class da {
    class Solution {
        public int solution(int x, int y, int z) {
            int answer =0;
            if (x*x< y*y+ z*z){
                answer = 1;
            }
            else if (x*x == y*y+ z*z) {
                answer = 2;
            } else {
                answer = 3;
            }


            return answer;
        }
    }
}
