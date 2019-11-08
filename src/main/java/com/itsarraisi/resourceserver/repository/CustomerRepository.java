package com.itsarraisi.resourceserver.repository;

import com.itsarraisi.resourceserver.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
