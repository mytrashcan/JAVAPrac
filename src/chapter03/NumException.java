package chapter03;

// 예제 3-16
public class NumException {
    public static void main(String[] args) {
        String[] stringNUmber = {"23", "12", "998", "3.141592"};
        try{
            for(int i = 0; i < stringNUmber.length; i++){
                // Integer.parseInt()는 문자열을 정수(int)로 변환하는 Java 표준 메소드
                int j = Integer.parseInt(stringNUmber[i]);
                System.out.println("숫자로 변환된 값은 " + j);
            }
        }catch (NumberFormatException e){
            System.out.println("정수로 변환할 수 없습니다.");
        }
    }
}
