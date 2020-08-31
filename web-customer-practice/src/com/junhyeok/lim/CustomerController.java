package com.junhyeok.lim;

import com.junhyeok.lim.dao.CustomerDAO;
import com.junhyeok.lim.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/customer")
public class CustomerController {

    //DAO injection to access data
    @Autowired
    private CustomerDAO customerDAO;
    //show list jsp

    @RequestMapping("/list")
    public String listCustomer(Model theModel){

        // get customers from the dao
        List<Customer> customerList=customerDAO.getCustomers();

        // add customers to the model
        theModel.addAttribute(customerList);

        return "list-customers";
    }
}
