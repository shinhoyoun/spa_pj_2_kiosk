package kiosk.nga.Lv_1;

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

        if (name == null || name.isBlank()) {
            this.name = "NoName";
        } else {
            this.name = name;
        }
        this.menuItems = new ArrayList<>();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("카테고리 이름 비어있을수없음");
        }
    }


    public List<MenuItem> getMenuItems() {
        return menuItems;
    }

    public void addMenuItem(MenuItem item) {
        if(item == null) {
            throw new IllegalArgumentException("Item 은 null이 수 없습니다.");
        }
            menuItems.add(item);
    }

//    public void addMenuItem(MenuItem item) {
//        menuItems.add(item);
//    }

    public boolean removeMenuItem(MenuItem item) {
        return menuItems.remove(item);
    }

    public int size() {
        return menuItems.size();
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