package kiosk.LV_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<MenuItem> menuItems = new ArrayList<>();   // 생성
        Kiosk kiosk = new Kiosk(menuItems);

//        List<String> ShakeShack = new ArrayList<>();    // lv1때 사용


        // 메뉴 데이터 ( 이름, 가격, 설명) .add로 menuItems에 추가
        menuItems.add(new MenuItem("ShackBurger", 6.9, "토마토, 양배추 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));

        // 스케너 선언
        Scanner sc = new Scanner(System.in);
        
        // 키오스트 시작
        kiosk.start();


    }
}
