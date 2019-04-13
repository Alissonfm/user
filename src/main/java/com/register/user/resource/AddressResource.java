package com.register.user.resource;

import com.register.user.domain.Address;
import com.register.user.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@CrossOrigin
@RestController
@RequestMapping("/addresses")
public class AddressResource {

    private final AddressService addressService;

    @Autowired
    public AddressResource(AddressService addressService) {
        this.addressService = addressService;
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public Address save(@RequestBody final Address address) {
        return this.addressService.save(address);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Optional<Address> getById(@PathVariable final Integer id) {
        return this.addressService.getById(id);
    }
}
