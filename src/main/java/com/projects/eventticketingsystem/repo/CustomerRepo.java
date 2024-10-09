package com.projects.eventticketingsystem.repo;


import com.projects.eventticketingsystem.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepo extends JpaRepository<Customer, Integer> {
}
