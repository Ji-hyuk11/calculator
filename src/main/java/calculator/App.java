package calculator;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // 스캐너 생성
        System.out.print("첫 번째 숫자를 입력하세요: ");
        int num1 = sc.nextInt(); // 첫번째 정수를 입력받습니다.
        System.out.print("사칙연산 기호를 입력하세요: ");
        char enterOperator = sc.next().charAt(0); // 사용자로부터 입력받은 문자열을 변수에 할당합니다.
        System.out.print("두 번째 숫자를 입력하세요: ");
        int num2 = sc.nextInt(); // 두번째 정수를 입력받습니다.
    }
}