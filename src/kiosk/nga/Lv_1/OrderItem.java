package kiosk.nga.Lv_1;

/**
 * 장바구니 기능
 */
public class OrderItem {
    private  MenuItem menuItem;
    private int quantity;

    public OrderItem(MenuItem menuItem, int quantity) {
        this.menuItem = menuItem;
        this.quantity = quantity;
    }


    public MenuItem getMenuItem() {
        return menuItem;
    }

    public int getQuantity() {
        return quantity;
    }

    public void addQuantity(int amount) {
        this.quantity += amount;
    }

    public double getTotalPrice() {
        return menuItem.getPrice() * quantity;
    }


}
