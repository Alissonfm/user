package com.register.user.service;

import com.register.user.domain.Address;
import com.register.user.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AddressService {

    private final AddressRepository addressRepository;

    @Autowired
    public AddressService(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    public Address save(final Address address) {
        return this.addressRepository.save(address);
    }

    public Optional<Address> getById(final Integer id) {
        return this.addressRepository.findById(id);
    }
}
