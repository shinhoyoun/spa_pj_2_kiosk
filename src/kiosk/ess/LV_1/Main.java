package kiosk.ess.LV_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<String> ShakeShack = new ArrayList<>();


        // 메뉴 데이터 ( 이름, 가격, 설명)
        String[] names = {"ShackBurger", "SmokeShack", "Cheeseburger", "Hamburger"};
        double[] prices = {6.9, 8.9, 6.9, 5.4};
        String[] descriptions = {
                "토마토, 양상추, 쉑소스가 토핑된 치즈버거",
                "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거",
                "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거",
                "비프패티를 기반으로 야채가 들어간 치즈버거"
        };


        while (true) {

            // 메뉴 출력
            System.out.println("[ SHAKESHACK MENU ]");
            for (int i = 0; i < names.length; i++) {
                System.out.printf("%d. %s   | W %.1f | %s\n", (i + 1), names[i], prices[i], descriptions[i]);
            }
            System.out.println("0. 종료       | 종료");

            // 사용자 입력
            System.out.println("번호를 입력하세요 : ");
            int choice = sc.nextInt();

            // 종료 조건
            if (choice == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            // 번호 확인
            if (choice >= 1 && choice <= names.length) {
                System.out.println("\n" + names[choice - 1] + "를 선택하셨습니다.\n");
            } else {
                System.out.println("\n잘못된 입력입니다. 다시입력해주세요\n");
            }

        }



    }
}
