package com.register.user.resource;

import com.register.user.domain.People;
import com.register.user.service.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/peoples")
public class PeopleResource {

    private final PeopleService peopleService;

    @Autowired
    public PeopleResource(PeopleService peopleService) {
        this.peopleService = peopleService;
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public People save(@RequestBody final People people) {
        return this.peopleService.save(people);
    }


}
