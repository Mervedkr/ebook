package com.application.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.application.model.*;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer>{

}
