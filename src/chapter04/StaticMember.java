package chapter04;

// 예제 4-8
class CurrencyConverter {
    private static double rate; // 한국 원화에 대한 환율
    public static double toDollar(double won){
        return won/rate;
    }
    public static double toKWR(double dollar){
        return dollar*rate;
    }
    public static void setRate(double r){
        rate = r; // 환율 설정 KWR/$1
    }
}

public class StaticMember{
    public static void main(String[] args) {
        CurrencyConverter.setRate(1398); // 환율 설정
        System.out.println("백만원은 " + CurrencyConverter.toDollar(1000000) + "달러 입니다.");
        System.out.println("백달러은 " + CurrencyConverter.toKWR(100) + "원 입니다.");
    }
}
