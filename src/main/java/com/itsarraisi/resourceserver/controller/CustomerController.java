package com.itsarraisi.resourceserver.controller;

import com.itsarraisi.resourceserver.model.Customer;
import com.itsarraisi.resourceserver.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api/customer")
public class CustomerController {
    @Autowired
    CustomerService service;

    @GetMapping("/")
    public ResponseEntity<List<Customer>> findAll(){
        return new ResponseEntity<>(service.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Customer> findById(@PathVariable Integer id){
        return new ResponseEntity<>(service.findById(id).get(), HttpStatus.OK);
    }
}
