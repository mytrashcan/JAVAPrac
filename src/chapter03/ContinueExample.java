package chapter03;

// 예제 3-5
public class ContinueExample {
    public static void main(String[] args) {
        int sum = 0;
        for(int i = 1; i<=100; i++){
            if(i%2==0)
                sum += i;
            else
                continue;
        }
        System.out.print(sum);
    }
}
