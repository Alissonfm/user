package com.register.user.resource;

import com.register.user.domain.TypeAddress;
import com.register.user.service.TypeAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping(value = "/typeAddresses")
public class TypeAddressResource {
    private final TypeAddressService typeAddressService;

    @Autowired
    public TypeAddressResource(TypeAddressService typeAddressService) {
        this.typeAddressService = typeAddressService;
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public TypeAddress TypeAddress(@RequestBody final TypeAddress typeAddress) {
        return this.typeAddressService.saveOrUpdate(typeAddress);
    }

    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    public TypeAddress update(@RequestBody final TypeAddress typeAddress) {
        return this.typeAddressService.saveOrUpdate(typeAddress);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Optional<TypeAddress> getById(@PathVariable final Integer id) {
        return this.typeAddressService.getById(id);
    }

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<TypeAddress> getAll() {
        return this.typeAddressService.getAll();
    }

    @RequestMapping(method = RequestMethod.DELETE)
    public void delete(@RequestBody final TypeAddress typeAddress) {
        this.typeAddressService.delete(typeAddress);
    }
}
