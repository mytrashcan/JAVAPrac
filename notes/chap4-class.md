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
- 메소드: 멤버 함수이며 객체의 행위를 구현함

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

## 생성자
- 생성자는 객체가 생성될 때 초기화 목적으로 실행되는 메소드
- 생성자의 이름은 클래스 이름과 동일하다
- 생성자는 new 키워드를 통해 객체를 생성할 때만 호출
- 생성자도 오버로딩하여 여러 개 작성 가능
- 생성자는 리턴 타입을 지정할 수 없음
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
## this 레퍼런스
- 객체 자신에 대한 레퍼런스
- 컴파일러에 의해 자동 선언됨
- this.멤버 형태로 멤버를 접근할 때 사용
```java
class Samp{
    int id;
    public Samp(int x) {this.id = x;}
    public void set(int x) {this.id = x;}
    public int get() {return id;}
    
    public Samp me(){
        return this;
    }
}
```
## this()로 다른 생성자 호출
- 같은 클래스의 다른 생성자 호출
- 생성자 내에서만 사용 가능
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
// this() 사용 실패 사례
public Book(){
    System.out.println("생성자가 호출되었음");
    this(null, null, 0); // 생성자 코드의 최상단이 아니기 때문에 컴파일 오류 발생
}
```
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