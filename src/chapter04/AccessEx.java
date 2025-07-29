package chapter04;

// 예제 4-7 오류가 난 이유를 설명하고 오류를 수정하라.
class Sample{
    public int a;
    private int b; // private라 다른 클래스에서 접근 불가
    int c; // 같은 패키지에 속한 AccessEx 라서 접근 가능

    public int getb() {return b;}
    public void setb(int x) {this.b = x;}
}

public class AccessEx {
    public static void main(String[] args) {
        Sample aClass = new Sample();
        aClass.a = 10;
        //aClass.b = 10;
        aClass.setb(10);
        System.out.println("b: " + aClass.getb());
        aClass.c = 10;
    }
}
