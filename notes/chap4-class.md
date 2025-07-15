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
