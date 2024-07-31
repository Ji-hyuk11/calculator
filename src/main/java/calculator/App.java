package calculator;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // 스캐너 생성

        boolean theEnd = false; // 종료 할지 여부를 boolean에 저장하기 위해 변수 생성.
        do { // 첫번째는 무조건 실행.
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int num1 = sc.nextInt(); // 첫번째 정수를 입력받습니다.
            System.out.print("사칙연산 기호를 입력하세요: ");
            char enterOperator = sc.next().charAt(0); // 사용자로부터 입력받은 문자열을 변수에 할당합니다.
            System.out.print("두 번째 숫자를 입력하세요: ");
            int num2 = sc.nextInt(); // 두번째 정수를 입력받습니다.

            int result = 0;
            switch (enterOperator) { // operator 값에 따라 네 가지 case로 분류
                case '+': // 덧셈 연산 수행하여 result에 저장
                    result = num1 + num2;
                    break;
                case '-': // 뺄셈 연산 수행하여 result에 저장
                    result = num1 - num2;
                    break;
                case '*': // 곱샘 연산 수행하여 result에 저장
                    result = num1 * num2;
                    break;
                case '/': // 나눗셈 연산 수행하여 result에 저장
                    if (num2 == 0) // 분모가 0일 경우 아래 문구 출력
                        System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                    else
                        result = num1 / num2;
                    break;
            }
            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            theEnd = sc.next().equals("exit"); // 입력 받은 답변이 "exit"라면 isEnd는 true 아니면 false 유지
        } while (!theEnd);
    }
}
