# 메소드 형식
> 본 포스팅은 명품 JAVA Programming 강의자료에 기반함.

## 메소드
- C/C++ 의 함수와 동일
- 자바의 모든 메소드는 반드시 클래시 안에 있어야 함(캡슐화)

## 메소드 구현 방식
- 접근 지정자: public, private, protected, 디폴트(접근 지정자 생략)
- 리턴 타입: 메소드가 반환하는 값의 데이터 타입
```java
public int getSum(int i, int j){
    int sum;
    sum = i + j;
    return sum;
}
```

## 인자 전달 방식
### call by value
- 값이 복사되어 전달
- 메소드의 매개 변수가 변경되어도 호출된 실인자에 영향 X
- 객체나 배열에 대한 레퍼런스(0번째 인덱스)만 복사되어 전달
- 메소드의 매개 변수와 호출된 실인자가 객체나 배열을 공유하게 됨(오류 발생)
### call by reference
- 객체 또는 배열의 레퍼런스를 전달
## 메소드 오버로딩
- 한 클래스 내에서 두 개 이상의 이름이 같은 메소드 작성
- 메소드 이름 동일, 매개 변수의 개수 또는 타입 다름
- 리턴 타입은 상관 X
```java
// 성공 사례
class MethodOverloading{
    public int getSum(int i, int j){
        return i+j;
    }
    public int getSum(int i, int j, int k){
        return i+j+k;
    }
    public double getSum(double i, double j) {
        return i+j;
    }
}
```
```java
// 실패 사례
class MethodOverloadingFail{
    public int getSum(int i, int j){
        return i+j;
    }
    public double getSum(int i, int j){
        return (double)i+j;
    }
}
```
```java
// 호출 사례
public static void main(String[] args) {
    MethodSample a = new MethodSample();
    int i = a.getSum(1, 2);
    int j = a.getSum(1, 2, 3);
    double k = a.getSum(1.1, 2.2);
}
```
## 객체의 치환
- 객체의 치환은 객체가 복사되는 것이 아니며 레퍼런스가 복사된다.
```java
class Samp {
    int id;
    public Samp(int x) {this.id = x;}
    public void set(int x) {this.id = x;}
    public int get() {return id;}

    public static void main(String[] args) {
        Samp ob1 = new Samp(3);
        Samp ob2 = new Samp(4);
        Samp s;

        s = ob2;
        ob1 = ob2;
        // 이 과정에서 ob1은 가비지(garbage)가 됨
        System.out.println("ob1.id=" + ob1.id);
        System.out.println("ob2.id=" + ob2.id);
    }
}
```

## 객체의 소멸과 가비지
- 객체 소멸: new에 의해 생성된 객체 메모리를 자바 가상 기계로 되돌려 주는 행위
- 자바 응용프로그램에서 임의로 객체 소멸할 수 없음
- 가비지: 가리키는 레퍼런스가 하나도 없는 객체 즉 더이상 접근이 불가능함
- 가비지 컬렉션: 자바 가상 기계의 가비지 컬렉터가 자동으로 가비지를 수집하여 반환
```java
Person a,b;
a = new Person("황기태");
b = new Person("정기태");
b = a; // b를 가리키던 객체는 가비지가 됨
System.gc(); // 가비지 컬렉션 작동 요청
```

## 자바의 패키지 개념
- 패키지: 상호 관련 있는 클래스 파일(컴파일된 .class)을 저장하여 관리하는 디렉터리
- 자바 응용프로그램은 하나 이상의 패키지로 구성

## 클래스 접근 지정자
- public 접근 지정자: 다른 모든 클래스가 접근 가능
```java
public class Person {}
```
- 접근 지정자 생략 (default 접근 지정자): 같은 패키지(디렉토리) 내에 있는 클래스에서만 접근 가능
```java
class Person {}
```

## 멤버 접근 지정자
1. 디폴트(default) 멤버
- 같은 패키지 내의 다른 클래스만 접근 가능
2. public 멤버
- 패키지에 관계 없이 모든 클래스에서 접근 가능
3. private 멤버
- 클래스 내에서만 접근 가능
- 상속 받은 하위 클래스에서도 접근 불가
4. protected 멤버
- 같은 패키지 내의 다른 모든 클래스에서 접근 가능
- 상속 받은 하위 클래스는 다른 패키지에 있어도 접근 가능

| 멤버에 접근하는 클래스         | default | private | protected | public |
|-------------------------------|:-------:|:-------:|:---------:|:------:|
| 같은 패키지의 클래스          |   ○     |    ✕    |     ○     |   ○    |
| 다른 패키지의 클래스          |   ✕     |    ✕    |     ✕     |   ○    |
|접근 가능 영역| 클래스 내 | 동일 패키지 내 | 동일 패키지와 자식 클래스| 모든 클래스|

## static 멤버와 non-static 멤버
```java
class StaticSample{
    int n; // non-static 필드
    void g() {...} // non-static 메소드
    
    static int m; // static 필드
    static void f() {...} // static 메소드
}
```
### non-static 멤버의 특성
- 공간적: 멤버들은 객체마다 독립적으로 별도 존재(인스턴스 멤버)
- 시간적: 필드와 메소드는 객체 생성 후 사용 가능
- 공유의 특성: 멤버들은 여러 객체에 의해 공유되지 않고 배타적
### static 멤버의 특성
- 공간적: static 멤버들은 클래스 당 하나만 생성
- 시간적: static 멤버들은 클래스가 로딩될 때 공간 할당
- 공유의 특성: static 멤버들은 동일한 클래스의 모든 객체에 의해 공유

### static의 활용
- 전역 변수와 전역 함수를 만들 때 사용, 이때 자바의 캡슐화 원칙을 지킴
```java
// 객체의 멤버로 접근하는 방법
class StaticSample{
    public int n;
    
    public void g() {m = 20;}
    public void h() {m = 30;}
    
    public static int m;
    public static void f() {m = 5;}
    
    public class Ex{
        public static void main(String[] args){
            StaticSample s1, s2;
            s1 = new StaticSample();
            s1.n = 5;
            s1.g();
            s1.m = 50; // static
            
            s2 = new StaticSample();
            s2.n = 8;
            s2.h();
            s2.f(); // static
            System.out.println(s1.m);            
        }
    }
}
```
```java
// 클래스 이름으로 접근하는 방법
class StaticSample{
    public int n;

    public void g() {m = 20;}
    public void h() {m = 30;}

    public static int m;
    public static void f() {m = 5;}

    public class Ex{
        public static void main(String[] args){
            StaticSample.m = 10;
            
            StaticSample s1;
            s1 = new StaticSample();
            System.out.println(s1.m);
            s1.f();
            StaticSample.f();
        }
    }
}
```

### static의 제약 조건
- static 메소드는 오직 static 멤버에만 접근 가능
- static 메소드는 this 키워드 사용 불가
- 그 이유는 객체가 생성되기 전에 static 메서드가 실행될 수 있기 때문
- 즉, non-static 멤버에서 static 멤버에 접근하는 것은 가능하지만, static 메서드에서는 non-static 멤버에 접근할 수 없다.

## final 클래스와 메소드
- final 클래스: 더 이상 클래스 상속 불가능
- final 메소드: 더 이상 오버라이딩 불가능
```java
final class FinalClass{
    ...
}
class DerivedClass Extends FinalClass { // 컴파일 오류
    ...
}

public class SuperClass{
    protected final int finalMethod() {...}
}
class DerivedClass extgends SuperClass{
    protected final int finalMethod() {...} // 컴파일 오류, 오버라이딩 불가
}
```
## final 필드
- final 필드: 상수를 선언할 때 사용, 선언 시 초기 값을 지정해야한다
```java
class SharedClass{
    public static final double PI = 3.14;
}
```
```java
public class FinalFieldClass{
    final int ROWS = 10; // 상수 선언 및 초기 값(10) 지정
    
    void f(){
        int[] intArray = new int[ROWS];
        ROWS = 30; // 컴파일 오류 발생, final 필드의 값을 변경할 수 없다
    }
}
```