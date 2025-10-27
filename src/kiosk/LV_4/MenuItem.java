package kiosk.LV_4;


/**
 * MenuItem : 한 개의 음식을 표현하는 데이터 클래스
 * - name : 메뉴이름
 * - price : 가격
 * - description : 설명
 */
public class MenuItem {

    // 속성   // final로 변경 - 값만 보관할거라서
    private final String name;              // 메뉴 이름
    private final double price;             // 메뉴 가격
    private final String description;       // 메뉴 설명


    // 생성자
    public MenuItem(String name, double price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }


    // 기능
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

}


