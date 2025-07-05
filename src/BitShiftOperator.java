// 예제 2-6
public class BitShiftOperator {
    public static void main(String[] args) {
        short a = (short)0x55ff;
        short b = 0x00ff;
        
        // 비트 연산
        System.out.printf("%x\n", a & b); // a 와 b 비트 간 AND 연산
        System.out.printf("%x\n", a | b); // a 와 b 비트 간 OR 연산
        System.out.printf("%x\n", a ^ b); // a 와 b 비트 간 XOR 연산
        System.out.printf("%x\n", ~a); // a 비트의 NOT 연산

        byte c = 20; // 0x14
        byte d = -8; // 0xf8
        
        // 시프트 연산 ( byte, short, char 타입 시프트 연산 시 원하지 않는 결과 발생 가능 )
        System.out.println(c << 2); // <<는 1비트 왼쪽 시프트: 2로 곱하는 결과
        System.out.println(c >> 2); // >>는 1비트 오른쪽 시프트: 2로 나누는 결과
        System.out.println(d >> 2);
        System.out.printf("%x\n", d >>> 2); // >>>는 산술 효과 X, 항상 최상위 비트 0
    }
}
