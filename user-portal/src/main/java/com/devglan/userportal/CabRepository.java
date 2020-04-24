package com.devglan.userportal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface CabRepository extends JpaRepository<Cab, Integer> {
  
    //List<Cab> findAll();
    
    List<Cab> findByCompnyId(String CompnyId);
    
    //Cab save(Cab cab);
    
    Cab findBycid(int cid);
}
