package com.register.user.resource;

import com.register.user.domain.User;
import com.register.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping(value = "/users")
public class UserResource {
    private final UserService userService;

    @Autowired
    public UserResource(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public User save(@RequestBody final User user) {
        return this.userService.saveOrUpdate(user);
    }

    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    public User update(@RequestBody final User user) {
        return this.userService.saveOrUpdate(user);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Optional<User> getById(@PathVariable final Integer id) {
        return this.userService.getById(id);
    }

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<User> getAll() {
        return this.userService.getAll();
    }

    @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
    public void delete(@RequestBody final User user) {
        this.userService.delete(user);
    }
    
    @RequestMapping(value = "/authenticate", method = RequestMethod.POST)
    public User authenticate(@RequestBody final User user) {
    	System.out.println(user);
        return this.userService.authenticate(user);
    }
    
}
