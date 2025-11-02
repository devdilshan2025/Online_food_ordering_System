package edu.icet.ecom.Controller;

import edu.icet.ecom.Model.dto.Item;
import edu.icet.ecom.Service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("Item")
@RestController
public class ItemController {

    @Autowired
    ItemService itemService;

    @GetMapping("/all")
    public List<Item> getAll(){

        return itemService.getAll();
    }

    @PostMapping("/add")
    public void add(@RequestBody Item item){

        itemService.add(item);
    }
}
