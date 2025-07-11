# 반복문과 배열 그리고 예외 처리
> 본 포스팅은 명품 JAVA Programming 강의자료에 기반함.

## 배열

- 인덱스와 인덱스에 대응하는 데이터들로 이루어진 자료 구조
- 같은 타입의 데이터들이 순차적으로 저장되는 공간
- 배열의 인덱스는 0부터 시작함

## 배열의 선언 및 생성
### 배열 선언
```
int[] intArray; // int intArray[]; 도 가능
char[] charArray; // char charArray[]; 도 가능
```
### 배열 생성
```
intArray = new int[10];   // 또는 int[] intArray = new int[10];
charArray = new char[10]; // 또는 char[] charArray = new char[10];
```
### 선언과 초기화
```
int[] intArray = {0,1,2,3,4,5,6,7,8,9}; // 총 10개의 정수 배열 생성 및 값 초기화
```
### 잘못된 배열 선언
```
int intArray[10]; // 컴파일 오류, 배열의 크기를 지정할 수 없음
```
### 배열 참조
```
int[] intArray = new int[5];
int[] myArray = intArray; // myArray와 intArray는 같은 배열을 가리킴 (얕은 복사)

intArray[1] = 2;
myArray[1] = 6;  
```
### 배열 원소 접근
```
int[] intArray;
intArray[4] = 8; // 오류, intArray 배열의 메모리 할당 X

int[] intArray = new int[10];
intArray[3] = 6; // 배열에 값 저장
int n = intArray[3]; // 배열의 값 읽기
```
### 배열 인덱스
- 인덱스는 0 부터 시작하며, 마지막 인덱스는 (배열의 크기 - 1) 임
```
int[] intArray = new int[5]; // 인덱스는 0 ~ 4
int n = intArray[-2]; // 실행 오류, -2 는 인덱스로 적합하지 않음
int m = intArray[5]; // 실행 오류, 5는 인덱스의 범위를 넘었음
```
### 배열 크기
- 배열의 크기는 배열 생성 시 결정되며, 나중에 바꿀 수 없음
- 배열의 크기는 배열의 length 필드에 저장됨
```
int size = intArray.length; // 배열의 크기 리턴
```
### 배열과 for-each 문
```
int[] num = {1,2,3,4,5};
int sum = 0;
for(int k : num) // 반복될 때마다 k에 num[0]...num[4] 값으로 설정
    sum += k;
System.out.print("합은 " + sum);
```
```
String[] names = {"사과", "배", "바나나", "체리", "딸기"};
for (String s : names) // 반복될 때마다 s에 names[0]...names[4] 값으로 설정
    System.out.print(s + ' ');
```
```
// enum: 열거형 타입 정의
enum Week {월, 화, 수, 목, 금, 토, 일};
for (Week day: Week.values()) // 반복될 때마다 day는 월...금 으로 설정
    System.out.print(day + "요일 ");
```
### 2차원 배열 선언
```
int[][] intArray;
```
### 2차원 배열 생성
```
int[][] intArray = new int[2][5];
```
### 2차원 배열 초기화
```
int[][] matrix = {
    {1, 2, 3},
    {4, 5, 6}
};
System.out.println(matrix[1][2]); // 6
```
### 2차원 배열의 크기
```
int[][] i = new int[2][5];
int size1 = i.length; // 2, 2차원 배열의 행의 개수
int size2 = i[0].length; // 5, 0 번째 행의 열의 개수
int size3 = i[1].length; // 5, 1 번째 행의 열의 개수
```
### 정방형 배열
- 각 행이 모두 동일한 열의 개수를 가짐
```
int[][] i = new int[4][4];
```
### 비정방형 배열
- 각 행이 서로 다른 열의 개수를 가짐
```
int[][] i = new int[4][];
i[0] = new int[1];
i[1] = new int[2];
i[2] = new int[3];
i[3] = new int[4];
```
- new int[4][]는 행의 개수만 지정하고, 열은 각 행마다 개별적으로 할당하는 구조.
### 메소드에서 배열 리턴
```
int[] makeArray(){
    int[] temp = new int[4];
    for(int i = 0; i < temp.length; i++)
        temp[i] = i;
    return temp;
}
```
- 배열의 레퍼런스만 리턴
- 메소드가 리턴하는 배열의 타입은 리턴 받는 배열 타입과 일치
- 리턴 타입(int[])에 배열의 크기를 지정하지 않음
## main() 메소드
- main()은 자바 응용프로그램의 실행 시작 메소드
- public static void main(String[] args) {} 형태임
- 모르겠다 나중에 하자