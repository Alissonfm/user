package com.register.user.repository;

import com.register.user.domain.TypeAddress;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeAddressRepository extends JpaRepository<TypeAddress, Integer> {
}
