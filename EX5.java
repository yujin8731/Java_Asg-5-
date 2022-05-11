package ASG5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EX5 {

    static int solution(String str) {
        int answer = 0;
        String[] arr = str.split(" "); //공백을 기준으로 나눔
        answer = arr.length;
        return answer;
    }

    public static void main(String[] args) throws IOException {

        System.out.println(solution("Hello World!"));

    }
}