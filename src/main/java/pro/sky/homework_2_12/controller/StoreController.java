package pro.sky.hw_2_12.controller;

import pro.sky.homework_2_12.model.Item;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.homework_2_12.service.StoreService;

import java.util.List;

@RestController
@RequestMapping("/order")
public class StoreController {
    private final StoreService storeService;

    public StoreController(StoreService storeService){ this.storeService = storeService; }

    @GetMapping
    public String hello(){
        return "hello";
    }

    @GetMapping("/add")
    public List<Item> add(@RequestParam("id") List<Long> ids) {
        ids.forEach(storeService::add);
        return storeService.getItems();
    }

    @GetMapping("/get")
    public List<Item> get() { return storeService.getItems(); }

}
