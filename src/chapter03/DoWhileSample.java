package chapter03;

//예제 3-3
public class DoWhileSample {
    public static void main(String[] args) {
        char a = 'a';

        do {
            System.out.print(a++);
        } while(a <= 'z');
    }
}
