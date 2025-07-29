# 반복문과 배열 그리고 예외 처리
> 본 포스팅은 명품 JAVA Programming 강의자료에 기반함.

## 자바의 예외 처리
### 예외(Exception)
- 실행 중 발생하는 에러는 컴파일러가 알 수 없음
- 자바는 실행 중 발생하는 에러를 예외로 처리
- 예외를 처리하지 않을 시 예외가 발생한 프로그램은 강제 종료
```java
import java.util.Scanner;
public class ExceptionExample1 {
    public static void main(String[] args) {
        Scanner rd = new Scanner(System.in);
        int divisor = 0;  // 나눗수
        int dividend = 0; // 나뉨수

        System.out.print("나뉨수를 입력하세요: ");
        dividend = rd.nextInt();
        System.out.print("나눗수를 입력하세요: ");
        divisor = rd.nextInt();
        System.out.println(dividend + "를 " + divisor + " 로 나누면 몫은 " + dividend/divisor + " 입니다.");
    }
}
```
>나뉨수를 입력하세요: 100  
나눗수를 입력하세요: 0  
Exception in thread "main" java.lang.ArithmeticException: / by zero
at chapter03.ExceptionExample1.main(ExceptionExample1.java:16)

### 예외 처리문 try-catch-finally
```java
try{
    예외가 발생할 가능성이 있는 실행문(try 블록)
}
catch (처리할 예외 타입 선언){
    예외 처리문(catch 블록)
}
finally{
    예외 발생 여부가 관계없이 무조건 실행되는 문장(finally 블록)
}
```
- finally 는 생략 가능

### 자주 발생하는 예외
| 예외 종류                         | 예외 발생 경우                                                         |
|----------------------------------|------------------------------------------------------------------------|
| ArithmeticException              | 정수를 0으로 나눌 때 발생                                               |
| NullPointerException             | null 레퍼런스를 참조할 때 발생                                          |
| ClassCastException               | 변환할 수 없는 타입으로 객체를 변환할 때 발생                           |
| OutOfMemoryError                 | 메모리가 부족한 경우 발생                                              |
| ArrayIndexOutOfBoundsException   | 배열의 범위를 벗어난 접근 시 발생                                       |
| IllegalArgumentException         | 잘못된 인자 전달 시 발생                                               |
| IOException                      | 입출력 동작 실패 또는 인터럽트 시 발생                                 |
| NumberFormatException            | 문자열이 나타내는 숫자와 일치하지 않는 타입의 숫자로 변환 시 발생      |
