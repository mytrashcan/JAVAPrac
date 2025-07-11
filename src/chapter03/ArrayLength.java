package chapter03;

// 예제 3-8
import java.util.Scanner;
public class ArrayLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int intArray[] = new int[5];
        double sum = 0;

        for(int i = 0; i < intArray.length; i++){
            intArray[i] = sc.nextInt();
            sum += intArray[i];
        }
        System.out.print("배열 원소의 평균은 " + sum/intArray.length + " 입니다.");
    }
}
