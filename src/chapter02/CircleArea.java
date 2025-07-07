package chapter02;

// 예제 2-1
public class CircleArea {
    public static void main(String[] args) {
        final double PI = 3.14;
        double radius = 10;
        double circleArea = 0;

        circleArea = radius * radius * PI;

        System.out.print("원의 면적 = ");
        System.out.println(circleArea);
    }
}
