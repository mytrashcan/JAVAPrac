package chapter02;

// 예제 2-7
public class LogicalOperator {
    public static void main(String[] args) {
        // 논리 연산자와 비트 연산자 혼동 주의
        System.out.println('a' > 'b');
        System.out.println(3 >= 2);
        System.out.println(-1 < 0);
        System.out.println(3.45 <= 2);
        System.out.println(3 == 2);
        System.out.println(3 != 2);
        System.out.println(!(3 != 2));
        // 논리 연산자와 비트 연산자 혼동 주의
        System.out.println((3 > 2) && (3 > 4));
        System.out.println((3 != 2) || (-1 > 0));
        System.out.println((3 != 2) ^ (-1 > 0));
    }
}
