package com.digi.petclinic.owner_service.dao;

import com.digi.petclinic.owner_service.entity.Owner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OwnerRepository extends JpaRepository<Owner,Integer>{

}
