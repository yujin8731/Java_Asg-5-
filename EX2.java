package ASG5;

//함수의 인자로 정수형 배열 arr과 양의 정수 n이 주어진다.
// 이때, arr의 모든 요소에 n을 곱해 배열의 형태로 리턴하는 함수를 작성하시오

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EX2 {

    static int[] solution(int n) {
        int[] answer = new int[n];

        for (int i= n; i > 0; i--) {
            answer[n-i] = i;
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] answer = solution(n);

        System.out.print("[");
        for(int i = 0; i < answer.length; i++) {
            if(i == answer.length - 1) {
                System.out.print(answer[i]);
            } else {
                System.out.print(answer[i] + ",");
            }
        }
        System.out.println("]");

    }
}