package chapter03;

// ExceptionExample
import java.util.Scanner;
public class ExceptionExample1 {
    public static void main(String[] args) {
        Scanner rd = new Scanner(System.in);
        int divisor = 0;  // 나눗수
        int dividend = 0; // 나뉨수

        System.out.print("나뉨수를 입력하세요: ");
        dividend = rd.nextInt();
        System.out.print("나눗수를 입력하세요: ");
        divisor = rd.nextInt();
        System.out.println(dividend + "를 " + divisor + " 로 나누면 몫은 " + dividend/divisor + " 입니다.");
    }
}
