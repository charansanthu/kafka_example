package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.model.Price;
@Repository
public interface PriceRepository extends JpaRepository<Price, Integer>{

}
