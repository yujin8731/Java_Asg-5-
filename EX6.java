package ASG5;

public class EX6 {

    static int solution(int[][] arr) {
        int answer = 0;
        int max=arr[0][0]*arr[0][1];
        for(int i=0;i<arr.length;i++){
            if(arr[i][0]*arr[i][1]>max){
                max=arr[i][0]*arr[i][1];
                answer= i;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[][] arr = {
                {1,2},
                {4,6},
                {7,4},
                {5,2}
        };
        System.out.println(solution(arr));
    }
}