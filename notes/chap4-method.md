# 메소드 형식
> 본 포스팅은 명품 JAVA Programming 강의자료에 기반함.

## 메소드
- C/C++ 의 함수와 동일
- 자바의 모든 메소드는 반드시 클래시 안에 있어야 함(캡슐화)

## 메소드 구현 방식
- 접근 지정자: public, private, protected, 디폴트(생략)
- 리턴 타입: 메소드가 반환하는 값의 데이터 타입 (int... string...)
- 인자: 
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
- 뒷 장
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

## this 레퍼런스
- C++ 에서 학습 했으므로 생략
- 자기 자신의 레퍼런스를 반환할 때 사용
## 생성자
- 생략