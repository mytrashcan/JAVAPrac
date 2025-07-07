package chapter01;

// Example
public class Hello2 {

    public static int sum(int n, int m) {
        return n+m;
    }

    // main() 메소드에서 실행 시작
    public static void main(String[] args) {
        int i = 20;
        int s;
        char a;

        s = sum(i, 10);
        a = '?';
        System.out.println(a);
        System.out.println("chapter01.Hello2");
        System.out.println(s);
        // println()은 여러 데이터 타입 출력, 출력 후 다음 행으로 커서 이동함
    }
}
