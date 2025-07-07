package chapter02;

// 예제 2-8
public class UnaryOperator {
    public static void main(String[] args) {
        int opr = 0;
        opr += 3;
        System.out.println(opr++);
        System.out.println(opr);
        System.out.println(++opr);
        System.out.println(opr);
        System.out.println(opr--);
        System.out.println(opr);
        System.out.println(--opr);
        System.out.println(opr);
    }
}
