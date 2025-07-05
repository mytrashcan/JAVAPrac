// 예제 2-12
import java.util.Scanner;
public class Grading {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char grade;

        while(sc.hasNext()) { // hasNext()는 입력된 키 가 있으면 True, Ctrl-z 가 들어오면 False
            int score = sc.nextInt();
            if (score >= 90)
                grade = 'A';
            else if (score >= 80)
                grade = 'B';
            else if (score >= 70)
                grade = 'C';
            else if (score >= 60)
                grade = 'D';
            else
                grade = 'F';
            System.out.println("학점은 " + grade + "입니다");
        }
    }
}
