// 예제 2-4
import java.util.Scanner;
public class ScannerExam {
    public static void main(String[] args) {
        // Scanner는 키 입력을 공백 단위로 구분하여 읽음
        Scanner a = new Scanner(System.in);
        System.out.println("나이, 체중, 신장을 빈칸으로 분리하여 순서대로 입력하세요");
        System.out.println("당신의 나이는 " + a.nextInt() + "살입니다.");
        System.out.println("당신의 체중은 " + a.nextDouble() + "kg입니다.");
        System.out.println("당신의 신장은 " + a.nextDouble() + "cm입니다.");
        // next(), nextInt(), nextDouble() 등 여러 데이터 타입에 따라 다름
    }
}