package kiosk.ess.LV_3;

import java.util.List;
import java.util.Scanner;

public class Kiosk {

    private List<MenuItem> menuItems;

    public Kiosk(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    public void start() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            // 메뉴 출력
            System.out.println("[ SHAKESHACK MENU ]");
            for (int i = 0; i < menuItems.size(); i++) {
                MenuItem menuItem = menuItems.get(i);
                System.out.println((String.format("%d. %-13s   | W %.1f | %s", (i + 1), menuItem.getName(), menuItem.getPrice(), menuItem.getDescription())));
                // %-10s 왼쪽정렬+10공간확보   / %10s 오른쪽정렬+10공간확보
            }
            System.out.println("0. 종료             | 종료\n");

            // 사용자 입력
            System.out.print("번호를 입력하세요 : ");
            int cn = sc.nextInt();  // ChoiceNumber


            // 종료 조건
            if (0 < cn && cn <= menuItems.size()) {
                MenuItem selected = menuItems.get(cn - 1);   // 인덱스는 0부터 시작이라 -1
                System.out.println("\n" + cn + "번을 선택하셨습니다.");
                System.out.println("선택한 메뉴 : " + selected.getName());
                System.out.println(String.format("가격 : W %.1f   설명 : %s\n", selected.getPrice(), selected.getDescription()));
//                System.out.println("설명 : " + selected.getDescription());  // lv2때 사용
            } else if (cn == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("잘못된 입력입니다. 다시입력해주세요\n");
                continue;
                // string으로 받아서 구분하는 방법밖에없나? string - parse / try-catch
                // TODO : try-catch문 추가해서 적용하기  / parse문은 string안에 있는 숫자를 적용시키는 개념
            }

        }


    }


}
