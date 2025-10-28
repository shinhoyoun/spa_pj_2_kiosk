package kiosk.LV_5;

import java.util.ArrayList;
import java.util.List;

/**
 * Mrnu
 * 햄버거, 음료, 사이드 메뉴 등
 * 여러개의 menuitem 포함
 */

public class Menu {

    private final String name;    // 카테고리 이름
    private final List<MenuItem> menuItems;   // 카테고리에 속한 메뉴 리스트

    public Menu(String name) {
        this.name = name;
        this.menuItems = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<MenuItem> getMenuItems() {
        return menuItems;
    }

    public void addMenuItem(MenuItem item) {
        menuItems.add(item);
    }


    /**
     * 메뉴 목록 출력
     */
    public void menuDisplay() {
//        System.out.println(" [ " + name.equalsIgnoreCase() + "";

        System.out.println(" [ " + name.toUpperCase() + " MENU ]"); // toUpperCase() 대문자로 바꿈

        for (int i = 0; i < menuItems.size(); i++) {
            MenuItem m = menuItems.get(i);
            System.out.printf("%d. %-13s | W %.1f | %s\n" , i +1, m.getName(), m.getPrice(), m.getDescription());
        }

//        System.out.println("0. 뒤로가기\n");


    }

}