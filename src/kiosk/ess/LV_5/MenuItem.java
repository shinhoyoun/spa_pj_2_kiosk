package kiosk.ess.LV_5;


/**
 * MenuItem : 한 개의 음식을 표현하는 데이터 클래스
 * - name : 메뉴이름
 * - price : 가격
 * - description : 설명
 */
public class MenuItem {

    // 속성   // final로 변경 - 값만 보관할거라서
    private String name;              // 메뉴 이름
    private double price;             // 메뉴 가격
    private String description;       // 메뉴 설명


    // 생성자
    public MenuItem(String name, double price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }


    // 기능
    // getter
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    // setter
    public void setName(String name) {
        if (name == null) {
            throw new IllegalArgumentException("이름이 없습니다.");
        }
        this.name = name;
    }

    public void setPrice(double price) {
        if (price <= 0) {
            throw new IllegalArgumentException("가격이 음수일수 없습니다.");
        }
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = (description == null ? "" : description);
    }


}


