package chapter03;

// 예제 3-6
import java.util.Scanner;
public class BreakExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        while((sc.nextInt()) != -1){
            count++;
        }
        System.out.print("입력된 숫자의 개수는 " + count);
    }
}
