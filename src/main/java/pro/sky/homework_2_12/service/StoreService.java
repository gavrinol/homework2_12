package pro.sky.homework_2_12.service;

import pro.sky.homework_2_12.component.Basket;
import pro.sky.homework_2_12.model.Item;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StoreService {

    private final Basket basket;

    public StoreService(Basket basket) { this.basket = basket; }

    public Item add(long id){
        Item item = new Item(id);
        basket.add(item);
        return item;
    }

    public List<Item> getItems() { return basket.getItems(); }

}
