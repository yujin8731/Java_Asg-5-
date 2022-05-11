package ASG5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class EX7 {

    static String solution(String str1, String str2) {
        String answer = "";

        for (int i = 0; i < str1.length(); i++) {

            if (str1.charAt(i) != str1.charAt(i)) {
                answer += str1.charAt(i);
            }
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        System.out.println(solution(st.nextToken(), st.nextToken()));

    }
}
