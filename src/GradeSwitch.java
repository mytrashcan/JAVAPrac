// 예제 2-13
public class GradeSwitch {
    public static void main(String[] args) {
        char grade = 'C';
        switch(grade){
            case 'A':
            case 'B':
                System.out.println("참 잘했어요.");
                break;
            case 'C':
            case 'D':
                System.out.println("노력하세요.");
                break;
            case 'F':
                System.out.println("당신은 무엇입니까?");
                break;
            default:
                System.out.println("잘못된 학점입니다.");
                // break;
        }
    }
}
