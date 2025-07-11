package chapter03;

public class foreachEx {
    enum Week {월, 화, 수, 목, 금, 토, 일}

    public static void main(String[] args) {
        int[] num = {1,2,3,4,5};
        String names[] = {"사과", "배", "바나나", "체리", "딸기", "포도"};
        int sum = 0;

        for(int k : num) // 반복될 때마다 k에 num[0]...num[4] 값으로 설정
            sum += k;
        System.out.println("합은 " + sum);

        for (String s : names) // 반복될 때마다 k에 names[0]...names[4] 값으로 설정
            System.out.print(s + ' ');
        System.out.println();

        for (Week day: Week.values()) // 반복될 때마다 day는 월...금 으로 설정
            System.out.print(day + "요일 ");
        System.out.println();
    }
}
