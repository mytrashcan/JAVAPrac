package chapter02;

// 예제 2-5
import java.util.Scanner;
public class ArithmeticOperator {
    public static void main(String[] args){
        int time, hour, minute, second;
        Scanner sc = new Scanner(System.in);

        System.out.print("정수를 입력하세요:");
        time = sc.nextInt();
        hour = (time / 60) / 60;
        minute = (time / 60) % 60;
        second = time % 60;

        System.out.println(time + "초는");
        System.out.println(hour + "시간");
        System.out.println(minute + "분");
        System.out.println(second + "초");
    }
}
