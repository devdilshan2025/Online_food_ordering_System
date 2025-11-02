package edu.icet.ecom.Controller;

import edu.icet.ecom.Model.dto.Order;
import edu.icet.ecom.Service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public class OrderController {

    @Autowired
    OrderService  orderService;

    @GetMapping("get/{id}")
    public Order getById(@PathVariable String id){

        return orderService.getById(id);
    }
}
