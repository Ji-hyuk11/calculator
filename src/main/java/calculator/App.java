package calculator;
import java.util.LinkedList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        LinkedList<Integer> results = new LinkedList<>(); // 연산 결과를 저장하기 적합한 컬렉션인 LinkedList 생성

        Scanner sc = new Scanner(System.in); // 스캐너 생성

        boolean theEnd = false; // 종료 할지 여부를 boolean에 저장하기 위해 변수 생성.
        do { // 첫번째는 무조건 실행.
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int num1 = sc.nextInt(); // int를 입력 받는다.
            System.out.print("사칙연산 기호를 입력하세요: ");
            char enterOperator = sc.next().charAt(0); // 입력 받은 string의 인덱스 0번 char을 가져온다.
            System.out.print("두 번째 숫자를 입력하세요: ");
            int num2 = sc.nextInt(); // int를 입력 받는다.

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
                    if(num2 == 0) // 분모가 0일 경우 아래 문구 출력
                        System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                    else
                        result = num1 / num2;
                    break;
            }

            System.out.println("결과: " + result);

            results.add(result); // 리스트에 결과 추가

            System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
            if(sc.next().equals("remove")) { // 입력 받은 답변이 "remove"일 경우
                results.removeFirst(); // 첫 결과 삭제
            }

            System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
            if(sc.next().equals("inquiry")) { // 입력 받은 답변이 "inquiry"일 경우
                for(int element : results ) { // foreach 문 사용하여 results linkedlist 순회
                    System.out.print(element + " "); // 출력하고 한 칸 띄기
                }
                System.out.println(); // 구분을 위한 한 줄 내리기
            }

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            theEnd = sc.next().equals("exit"); // 입력 받은 답변이 "exit"라면 isEnd는 true 아니면 false 유지
        } while (!theEnd);
    }
}
