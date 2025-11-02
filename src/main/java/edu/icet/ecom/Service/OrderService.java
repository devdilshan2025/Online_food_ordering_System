package edu.icet.ecom.Service;

import edu.icet.ecom.Model.dto.Order;
import edu.icet.ecom.Model.entity.OrderEntity;
import edu.icet.ecom.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    OrderRepository orderRepository;

    public Order getById(String id){

        Optional<OrderEntity> byId = orderRepository.findById(Long.parseLong(id));
        OrderEntity  orderEntity = byId.get();
        return  new Order(
                orderEntity.getId(),
                orderEntity.getDate(),
                orderEntity.getPrice()

        );


    }
}
