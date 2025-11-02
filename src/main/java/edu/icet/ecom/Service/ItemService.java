package edu.icet.ecom.Service;

import edu.icet.ecom.Model.dto.Item;
import edu.icet.ecom.Model.entity.ItemEntity;
import edu.icet.ecom.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ItemService {

    @Autowired
    ItemRepository itemRepository;

    public List<Item> getAll(){
        List<ItemEntity> all = itemRepository.findAll();

        List<Item>itemList = new ArrayList<>();

        for (ItemEntity itemEntity : all){
            itemList.add(new Item(
                    itemEntity.getId(),
                    itemEntity.getName(),
                    itemEntity.getManufacDate(),
                    itemEntity.getExpireDate(),
                    itemEntity.getPrice()
            ));
        }
        return itemList;
    }

    public void add(Item item){
        itemRepository.save(new ItemEntity(
            item.getId(),
            item.getName(),
            item.getManufacDate(),
            item.getExpireDate(),
            item.getPrice()
        ));
    }

}
