package kiosk.nga.Lv_1;

import java.util.ArrayList;
import java.util.List;

/**
 * 장바구니 관리
 */

public class Cart {

    private ArrayList<OrderItem> orderItems = new ArrayList<>();

    // 장바구니에 추가
    public void addToCart(MenuItem newItem, int quantity) {
        for (OrderItem items : orderItems) {
            // 이미 담긴 메뉴는 수량만 증가시킴
            if (items.getMenuItem().equals(newItem.getName())) {    // 이름비교
                items.addQuantity(items.getQuantity());
                return;
            }
        }
        // 새 메뉴는 cartItem으로 추가
        orderItems.add(new OrderItem(newItem, quantity));
    }


    // 장바구니 전체 총액 합산
    public double getTotalPrice() {
        double total = 0;
        for (OrderItem item : orderItems) {
            total += item.getMenuItem().getPrice() * item.getQuantity();
        }
        return total;
    }


    // 장바구니 출력
    public void displayCart() {
        System.out.println("=== 장바구니 ===");
        if (orderItems.isEmpty()) {
            System.out.println("장바구니가 비어있습니다.");
            return;
        } else {
            for (OrderItem item : orderItems) {
                System.out.println("\n[ Shopping Cart ]");
                System.out.printf("%s x%d | W %.1f%n",
                        item.getMenuItem().getName(),
                        item.getQuantity(),
                        item.getTotalPrice());
            }
            System.out.println("-----------------");
            System.out.printf("총액 : W %.1f" , getTotalPrice());
        }
        System.out.println("====================\n");
    }

    // 장바구니 초기화
    public void clearCart() {
        orderItems.clear();
        System.out.println("결제가 완료되었습니다. 장바구니를 초기화합니다.");
    }

    public boolean isEmpty() {
        return orderItems.isEmpty();
    }

}
