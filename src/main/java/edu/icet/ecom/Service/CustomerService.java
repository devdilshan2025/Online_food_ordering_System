package edu.icet.ecom.Service;

import edu.icet.ecom.Model.dto.Customer;
import edu.icet.ecom.Model.dto.Item;
import edu.icet.ecom.Model.entity.CustomerEntity;
import edu.icet.ecom.Model.entity.ItemEntity;
import edu.icet.ecom.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    public void add(Customer customer){
        customerRepository.save(new CustomerEntity(
           customer.getId(),
           customer.getName(),
           customer.getAddress(),
           customer.getNumber(),
           customer.getEmail()
        ));


    }
}
