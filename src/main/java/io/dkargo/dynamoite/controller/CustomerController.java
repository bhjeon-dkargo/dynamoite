package io.dkargo.dynamoite.controller;

import io.dkargo.dynamoite.domain.Customer;
import io.dkargo.dynamoite.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/customers")
public class CustomerController {

    private final CustomerService customerService;

    // create
    @PostMapping("")
    @ResponseStatus(HttpStatus.CREATED)
    public Customer saveCustomer(@RequestBody Customer customer) {
        return customerService.saveCustomer(customer);
    }

    // read - 단건
    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Customer getCustomerById(@PathVariable("id") String customerId) {
        return customerService.getCustomerById(customerId);
    }

    // read - 다건(전체)
    @GetMapping("")
    @ResponseStatus(HttpStatus.OK)
    public List<Customer> getCustomerById() {
        return customerService.getCustomerList();
    }

    @DeleteMapping("/{id}")
    public String deleteCustomerById(@PathVariable("id") String customerId) {
        return customerService.deleteCustomerById(customerId);
    }

    // update - 수정
    @PutMapping("")
    public String updateCustomer(@RequestBody Customer customer) {
        return customerService.updateCustomer(customer);
    }

}
