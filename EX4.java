package ASG5;

import java.util.Locale;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class EX4 {

    static String solution(boolean flag, String str) {
        String answer = "";
        if (flag) {
            answer = str.toUpperCase();
        } else {
            answer = str.toLowerCase();

        }
        return answer;
    }

    public static void main(String[] args) throws IOException {

        System.out.println(solution(true, "Hello World"));

    }
}