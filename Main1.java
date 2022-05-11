package ASG5;

public class  Main1 {

    static int[] solution(int[][] param0) {
        int[] answer = new int[param0.length];

        for (int i= 0; i < param0.length; i++) {
            for (int j = 0; j < param0[i].length; j++) {
                answer[i] += param0[i][j];
            }

        }
        return answer;
    }

    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3,4,5},
                {5,2,7,1,7,8,4},
                {8,6,3,2},
        };
        int[] answer = solution(arr);

        System.out.print("{");
        for(int i = 0; i < answer.length; i++) {
            System.out.print(answer[i] + " ");
        }
        System.out.println("}");
    }
}