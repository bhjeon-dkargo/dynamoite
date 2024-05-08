package io.dkargo.dynamoite.service;

import io.dkargo.dynamoite.domain.Customer;
import io.dkargo.dynamoite.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerService {

    private final CustomerRepository customerRepository;

    public Customer saveCustomer(Customer customer) {
        return customerRepository.saveCustomer(customer);
    }

    public Customer getCustomerById(String customerId) {
        return customerRepository.getCustomerById(customerId);
    }

    public List<Customer> getCustomerList() {
        return customerRepository.getCustomerList();
    }

    public String deleteCustomerById(String customerId) {
        return customerRepository.deleteCustomerById(customerId);
    }

    public String updateCustomer(Customer customer) {
        return customerRepository.updateCustomer(customer);
    }
}
