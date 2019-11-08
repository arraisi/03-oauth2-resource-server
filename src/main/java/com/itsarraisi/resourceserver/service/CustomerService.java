package com.itsarraisi.resourceserver.service;

import com.itsarraisi.resourceserver.model.Customer;
import com.itsarraisi.resourceserver.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {
    @Autowired
    CustomerRepository repository;

    public List<Customer> findAll(){
        return repository.findAll();
    }

    public Optional<Customer> findById(Integer id){
        return repository.findById(id);
    }
}
