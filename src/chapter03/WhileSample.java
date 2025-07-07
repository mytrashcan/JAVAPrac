package chapter03;

// 예제 3-2
import java.util.Scanner;
public class WhileSample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        int n = 0;
        double sum = 0;
        // i = sc.nextInt()는 사용자로부터 정수를 입력받음, 자바는 조건식에 표현식 OK
        while((i = sc.nextInt()) != 0){
            sum += i;
            n++;
        }
        System.out.println("입력된 수의 개수는 " + n + "개이며 평균은 " + sum / n + "입니다.");
    }
}
