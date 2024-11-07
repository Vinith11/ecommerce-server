package com.zamozon.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zamozon.modal.Address;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {

}
