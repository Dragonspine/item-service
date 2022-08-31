package hello.itemservice.domain.item;

import lombok.Data;

/**
 * packageName    : hello.itemservice.domain.Item
 * fileName       : Item
 * author         : kanghyun Kim
 * date           : 2022/08/31
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/08/31        kanghyun Kim      최초 생성
 */

@Data
public class Item {

    private Long id;
    private String itemName;
    private Integer price;
    private Integer quantity;

    public Item() {
    }

    public Item(String itemName, Integer price, Integer quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
}
