package kiosk.ess.LV_4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

//        List<MenuItem> menuItems = new ArrayList<>();   // 생성
//        Kiosk kiosk = new Kiosk(menus);

//        List<String> ShakeShack = new ArrayList<>();    // lv1때 사용


        // 메뉴 데이터 ( 이름, 가격, 설명) .add로 menuItems에 추가
//        menuItems.add(new MenuItem("ShackBurger", 6.9, "토마토, 양배추 쉑소스가 토핑된 치즈버거"));
//        menuItems.add(new MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
//        menuItems.add(new MenuItem("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
//        menuItems.add(new MenuItem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));

//        // 스케너 선언
//        Scanner sc = new Scanner(System.in);
//
//        // 키오스트 시작
//        kiosk.start();



        // 1. 메뉴 생성
        Menu burgerMenu = new Menu("Burgers");
        burgerMenu.addMenuItem(new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        burgerMenu.addMenuItem(new MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        burgerMenu.addMenuItem(new MenuItem("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        burgerMenu.addMenuItem(new MenuItem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));


        Menu drinksMenu = new Menu("Drinks");
        drinksMenu.addMenuItem(new MenuItem("Coke", 2.0, "콜라"));
        drinksMenu.addMenuItem(new MenuItem("Soda", 2.0, "사이다"));
        drinksMenu.addMenuItem(new MenuItem("Ade", 3.5, "에이드"));


        Menu dessertsMenu = new Menu("Desserts");
        dessertsMenu.addMenuItem(new MenuItem("French Fries", 3.5, "감자튀김"));
        dessertsMenu.addMenuItem(new MenuItem("Shake", 4.5, "쉐이크"));
        dessertsMenu.addMenuItem(new MenuItem("Chees Stick", 3.5, "치즈스틱"));
        dessertsMenu.addMenuItem(new MenuItem("Chicken 1piece", 3.0, "치킨 한조각"));


        List<Menu> menus = new ArrayList<>();
        menus.add(burgerMenu);
        menus.add(drinksMenu);
        menus.add(dessertsMenu);


        Kiosk kiosk = new Kiosk(menus);
        kiosk.start();
    }
}
