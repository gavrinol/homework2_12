package pro.sky.homework_2_12.component;

import pro.sky.homework_2_12.model.Item;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;

@Component
@SessionScope
public class Basket {

    private final List<Item> items = new ArrayList<>();

    public void add(Item item) { items.add(item); }

    public List<Item> getItems() { return new ArrayList<>(items); }
}
