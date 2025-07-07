package chapter02;

// 예제 2-2
public class TypeConversion {
    public static void main(String[] args) {
        // 자동 타입 변환 및 강제 타입 변환 예제
        byte b = 127;
        int i = 100;
        System.out.println(b+i);
        System.out.println(10/4);
        System.out.println(10.0/4);
        System.out.println((char)0x12340041);
        System.out.println((byte)(b+i));
        System.out.println((int)2.9+1.8);
        System.out.println((int)(2.9+1.8));
        System.out.println((int)2.9+(int)1.8);
    }
}
