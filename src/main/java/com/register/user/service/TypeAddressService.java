package com.register.user.service;

import com.register.user.domain.TypeAddress;
import com.register.user.repository.TypeAddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TypeAddressService {

    private final TypeAddressRepository typeAddressRepository;

    @Autowired
    public TypeAddressService(TypeAddressRepository typeAddressRepository) {
        this.typeAddressRepository =  typeAddressRepository;
    }

    public TypeAddress saveOrUpdate(final TypeAddress typeAddress) {
        return this.typeAddressRepository.save(typeAddress);
    }

    public Optional<TypeAddress> getById(final Integer id) {
        return this.typeAddressRepository.findById(id);
    }

    public List<TypeAddress> getAll() {
        return this.typeAddressRepository.findAll();
    }

    public void delete(final TypeAddress typeAddress) {
        this.typeAddressRepository.delete(typeAddress);
    }
}
