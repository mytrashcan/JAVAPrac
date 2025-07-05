// 예제 2-14
import java.util.Scanner;
public class Grading2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char grade;

        while(sc.hasNext()){
            int score = sc.nextInt();
            // 향상된 switch 문
            grade = switch (score / 10) {
                case 10, 9 -> 'A';
                case 8 -> 'B';
                case 7 -> 'C';
                case 6 -> 'D';
                default -> 'F';
            };
            System.out.println("당신의 학점은 " + grade + " 입니다.");
        }
    }
}
