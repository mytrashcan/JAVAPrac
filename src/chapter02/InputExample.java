package chapter02;

// 예제 2-3
import java.io.*;
public class InputExample {
    public static void main(String[] args) {
        InputStreamReader rd = new InputStreamReader(System.in);
        try {
            while(true) {
                int a = rd.read(); // 키 입력 스트림
                if (a == -1) // ctrl + z 입력
                    break;
                System.out.println((char)a);
            }
        }
        catch (IOException e) {
            System.out.println("입력 에러 발생");
        }
    }
}
