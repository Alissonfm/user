package com.register.user.service;

import com.register.user.domain.People;
import com.register.user.repository.PeopleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@Service
public class PeopleService {

    private final PeopleRepository peopleRepository;

    @Autowired
    public PeopleService(PeopleRepository peopleRepository) {
        this.peopleRepository = peopleRepository;
    }

    public People saveOrUpdate(final People people) {
        return this.peopleRepository.save(people);
    }

    public Optional<People> getById(final Integer id) {
        return this.peopleRepository.findById(id);
    }

    public List<People> getAll() {
        return this.peopleRepository.findAll();
    }

    public void delete(final People people) {
        this.peopleRepository.delete(people);
    }
}
