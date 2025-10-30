package kiosk.ess.LV_4;

import java.util.List;
import java.util.Scanner;

/**
 * 메인 메뉴
 * 카테고리 선택
 * 메뉴 선택
 * 종료 / 뒤로가기
 */

public class Kiosk {

    private final List<Menu> menus;

    public Kiosk(List<Menu> menus) {
        this.menus = menus;
    }

//    public void mOutput() {
//        // 메뉴 출력
//        System.out.println("[ SHAKESHACK MENU ]");
//        for (int i = 0; i < menuItems.size(); i++) {
//            MenuItem menuItem = menuItems.get(i);
//            System.out.println((String.format("%d. %-13s   | W %.1f | %s", (i + 1), menuItem.getName(), menuItem.getPrice(), menuItem.getDescription())));
//            // %-10s 왼쪽정렬+10공간확보   / %10s 오른쪽정렬+10공간확보
//        }
//        System.out.println("0. 종료             | 종료\n");
//    }

    public void start() {

        try (Scanner sc = new Scanner(System.in)) {
            boolean running = true;


            while (running) {   // 메인 메뉴 반복
                System.out.println("\n[ MAIN MENU ]");
                for (int i = 0; i < menus.size(); i++) {
                    System.out.printf("%d. %s%n", i + 1, menus.get(i).getName());
                }
                System.out.println("0. 종료");
                System.out.print("번호를 입력하세요 : ");

                String input = sc.nextLine().trim();    // 문자열 앞뒤 공백 제거 -> 명령어 비교 오류 예방

                if (input.isEmpty()) {
                    System.out.println("다시 입력하세요.");
                    continue;
                }

                // 종료
                if ("0".equals(input)) {
                    System.out.println(" 키오스크를 종료합니다. ");
                    break;
                }

                int mainChoice;
                try {
                    mainChoice = Integer.parseInt(input);
                } catch (NumberFormatException e) {
                    System.out.println("숫자만 입력 가능합니다.");
                    continue;
                }

                if (mainChoice == 0) {
                    System.out.println("프로그램을 종료합니다.");
                    break; // 전체 종료
                }

                if (mainChoice < 1 || mainChoice > menus.size()) {
                    System.out.println("잘못된 카테고리 번호입니다.");
                    continue;
                }


                Menu selectedMenu = menus.get(mainChoice - 1);  // 선택된 메뉴 가져오기

                boolean inCategory = true;                      // 카테고리 루프 상태

                while (inCategory) {
                    selectedMenu.menuDisplay();
                    System.out.println("0. 뒤로가기\n");
                    System.out.print("메뉴 번호를 입력하세요: ");

                    String choiceInput = sc.nextLine().trim();
                    int itemNum;

                    try {
                        itemNum = Integer.parseInt(choiceInput);
                    } catch (NumberFormatException e) {
                        System.out.println("숫자만 입력 가능합니다.");
                        continue;
                    }

                    if (itemNum == 0) {
                        inCategory = false; // 카테고리 루프 종료
                        continue;
                    }

                    if (itemNum < 1 || itemNum > selectedMenu.getMenuItems().size()) {
                        System.out.println("잘못된 메뉴 번호입니다. 다시 시도하세요.");
                        continue;
                    }

                    MenuItem chosen = selectedMenu.getMenuItems().get(itemNum - 1);
                    System.out.printf("선택한 메뉴: %s | W %.1f | %s%n",
                            chosen.getName(), chosen.getPrice(), chosen.getDescription());
                }
            }

        }

    }

}
