package kiosk.LV_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<MenuItem> menuItems = new ArrayList<>();   // 생성

//        List<String> ShakeShack = new ArrayList<>();    // lv1때 사용


        // 메뉴 데이터 ( 이름, 가격, 설명) .add로 menuItems에 추가
        menuItems.add(new MenuItem("ShackBurger", 6.9, "토마토, 양배추 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));


        Scanner sc = new Scanner(System.in);

        while (true) {

            // 메뉴 출력
            System.out.println("[ SHAKESHACK MENU ]");
            for (int i = 0; i < menuItems.size(); i++) {
                MenuItem menuItem = menuItems.get(i);
                System.out.printf("%d. %-13s   | W %.1f | %s\n", (i + 1), menuItem.getName(), menuItem.getPrice(), menuItem.getDescription());
                // %-10s 왼쪽정렬+10공간확보   / %10s 오른쪽정렬+10공간확보
            }
            System.out.println("0. 종료             | 종료\n");

            // 사용자 입력
            System.out.print("번호를 입력하세요 : ");
            int cn = sc.nextInt();  // ChoiceNumber



            // 종료 조건
            if ( 0 < cn && cn <= menuItems.size()) {
                MenuItem selected = menuItems.get(cn - 1);   // 인덱스는 0부터 시작이라 -1
                System.out.println("\n" + cn + "번을 선택하셨습니다.");
                System.out.println("선택한 메뉴 : " + selected.getName());
                System.out.println(String.format("가격 : W %.1f   설명 : %s\n", selected.getPrice(), selected.getDescription()));
//                System.out.println("설명 : " + selected.getDescription());
            } else if (cn == 0) {
                System.out.print("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("\n잘못된 입력입니다. 다시입력해주세요\n");
                continue;
            }

        }


    }
}
