# 클래스와 객체
> 본 포스팅은 명품 JAVA Programming 강의자료에 기반함.

## 객체지향 언어의 목적, 절차 지향, 객체 지향, 캡슐화, 상속, 다형성
> 생략

## 클래스 구성
```java
public class Person {   // 접근 권한, 키워드, 이름
    public String name; // 필드
    public int age;     // 필드
    
    public Person() { }                      // 생성자
    public Person(String s) { name = s; }    // 생성자
    public String getName() { return name; } // 메소드
}
```
- 접근 권한: 다른 클래스에서 이 클래스를 사용하거나 접근할 수 있음을 선언
- 필드: 값을 저장할 멤버 변수
- 생성자: 클래스 이름과 동일한 메소드, 객체 생성시에만 호출됨
- 메소드: 함수이며 객체의 행위를 구현함

## 생성자
- 생성자는 메소드이다
- 생성자의 이름은 클래스 이름과 동일하다
- 생성자는 new 키워드를 통해 객체를 생성할 때만 호출된다.
- 생성자도 오버로딩하여 여러개 작성 가능
- 생성자는 리턴 타입을 지정할 수 없음
- 생성자는 하나 이상 선언되어야 함, 만약 생성자를 작성하지 않으면 컴파일러에 의해 디폴트 생성자가 선언됨\
```java
class Samp {
    int id;
    public Samp(int x) {this.id = x;} // 생성자 1
    public Samp() {this.id = 0;} // 생성자 2
    // 만약 생성자가 존재하지 않는다면
    // public Samp() {} // 컴파일러가 삽입한 디폴트 생성자
    // 이 상태에서 아래와 같이 매개변수가 있는 생성자 호출 시 오류가 발생함
    // 클래스에 생성자가 하나라도 존재하면 디폴트 생성자가 자동 삽입되지 않음
    public static void main(String[] args) {
        Samp ob1 = new Samp(3); // 생성자 1 호출
        Samp ob2 = new Samp(4); // 생성자 1 호출
        Samp s; // 생성자 호출하지 않음
    }
}
```
## 생성자에서 this의 활용
- this()는 반드시 생성자 코드의 최상단에 작성되어야함
```java
public class Book {
    String title;
    String author;
    String ISBN;
    
    // 생성자 1
    public Book(String title, String author, String ISBN){
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }
    // 생성자 2
    public Book(String title, String ISBN){
        this(title, "Anonymous", ISBN); // title, ISBN을 가지고 생성자 1로 이동
    }
    // 생성자 3
    public Book(){
        this(null, null, 0); // 0 을 가지고 생성자 1로 이동
        System.out.println("생성자가 호출되었음");
    }

    // 예제에 int로 ISBN을 선언하였는데 적절하지 않은 것 같음
    public static void main(String[] args) {
        Book GOAT = new Book("The Fragrant Flower Blooms with Dignity 1", "三香見サカ", "9791170628606");
        Book MESSI = new Book("Holy Bible", 1); // 생성자 2 호출
        Book emptyBook = new Book();
    }
}
```
```java
// this() 사용 실패 예
public Book(){
    System.out.println("생성자가 호출되었음");
    this(null, null, 0); // 생성자 코드의 최상단이 아니기 때문에 컴파일 오류 발생
}
```
## 객체 생성 및 활용
```java
public static void main(String[] args) {
    Person aPerson;                // 객체에 대한 레퍼런스 변수 선언
    aPerson = new Person("김미남"); // 객체 생성
    
    aPerson.age = 30;             // 객체 멤버 접근
    int i = aPerson.age;          // 30
    String s = aPerson.getName(); // 객체 메소드 호출
}
```
- new 키워드를 이용하여 객체를 생성함, new는 객체의 생성자 호출
- aPerson.age를 통해 aPerson 객체의 age 필드에 접근함

## 객체 배열
```java
public static void main(String[] args) {
    Person[] pa;         // 배열에 대한 레퍼런스 선언
    pa = new Person[10]; // 레퍼런스 배열 생성
    for(int i = 0; i<pa.length; i++) {
        pa[i] = new Person(); // 배열의 원소 객체 생성
        pa[i].age = 30 + i;   // 객체 배열 사용
    }
    
    for(int i = 0; i<pa.length; i++) // 배열 pa의 모든 원소 객체의 age 출력
        System.out.print(pa[i].age + " ");
}
```
- 배열을 동적 생성하고, 그 다음 배열에 객체를 동적 생성하는것

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
```

## 클래스 접근 지정자
1. public 접근 지정자
```java
public class Person {}
```
- 다른 모든 클래스가 접근 가능
2. 접근 지정자 생략 (default 접근 지정자)
```java
class Person {}
```
- 같은 패키지(디렉토리) 내에 있는 클래스에서만 접근 가능

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