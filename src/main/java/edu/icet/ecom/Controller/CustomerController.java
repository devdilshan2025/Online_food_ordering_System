package edu.icet.ecom.Controller;

import edu.icet.ecom.Model.dto.Customer;
import edu.icet.ecom.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("Customer")
@RestController
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @PostMapping("/add")
    public  void add(@RequestBody Customer customer){
        customerService.add(customer);
    }
}
