package com.adoptpet.pet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.adoptpet.pet.model.Address;

/**
* Implement an application repository Address.
*
* @author  jessikafernandes
* @since   10/11/2019
*/

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {
  
}
