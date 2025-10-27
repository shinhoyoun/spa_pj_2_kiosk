package kiosk.LV_4;

import java.util.List;
import java.util.Scanner;
import java.util.InputMismatchException;

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
                System.out.println("0. 종료%s-10");
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
                    System.out.println("0. 뒤로가기");
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




//        Scanner sc = new Scanner(System.in);

//        while (true) {
//            // 메뉴 출력
//            System.out.println("[ SHAKESHACK MENU ]");
//            for (int i = 0; i < menuItems.size(); i++) {
//                MenuItem menuItem = menuItems.get(i);
//                System.out.println((String.format("%d. %-13s   | W %.1f | %s", (i + 1), menuItem.getName(), menuItem.getPrice(), menuItem.getDescription())));
//                // %-10s 왼쪽정렬+10공간확보   / %10s 오른쪽정렬+10공간확보
//            }
//            System.out.println("0. 종료             | 종료\n");
//
//            // 사용자 입력
//            System.out.print("번호를 입력하세요 : ");
////            int cn = sc.nextInt();  // ChoiceNumber   // 밑에 try-catch문에서 입력받아서 처리할거라 의미없음. 2번 입력받는꼴
//            int cn;
//
//              // try-catch 예외처리
//            while (true) {
//                try {
//                    cn = sc.nextInt();  // 정수 입력되면
//                    break;              // 탈출
//                } catch (InputMismatchException e) {
//                    System.out.println("숫자만 입력해주세요.\n");
////                    mOutput();
//                    sc.nextLine();  // 버퍼에 남은 문자열 제거 무조건 해줘야한다고 함
//                }
//            }


            // 종료 조건
//            if (0 < cn && cn <= menuItems.size()) {
//                MenuItem selected = menuItems.get(cn - 1);   // 인덱스는 0부터 시작이라 -1
//                System.out.println("\n" + cn + "번을 선택하셨습니다.");
//                System.out.println("선택한 메뉴 : " + selected.getName());
//                System.out.println(String.format("가격 : W %.1f   설명 : %s\n", selected.getPrice(), selected.getDescription()));
////                System.out.println("설명 : " + selected.getDescription());  // lv2때 사용
//            } else if (cn == 0) {
//                System.out.println("프로그램을 종료합니다.");
//                break;
//            } else {
//                System.out.println("잘못된 입력입니다. 다시입력해주세요\n");
//                continue;
//            }

        }

    }

}
