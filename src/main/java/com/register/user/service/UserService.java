package com.register.user.service;

import com.register.user.domain.User;
import com.register.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User saveOrUpdate(final User user) {
        return this.userRepository.save(user);
    }

    public Optional<User> getById(final Integer id) {
        return this.userRepository.findById(id);
    }

    public List<User> getAll() {
        return this.userRepository.findAll();
    }

    public void delete(final User user) {
        this.userRepository.delete(user);
    }
    
    public User authenticate(final User user) {
    	List<User> users = this.getAll();

    	for(User item: users) {
    		if(
				item.getLogin().equals(user.getLogin()) && 
				item.getPassword().equals(user.getPassword())
			) {
    			return item;
    		}
    	}
    	
    	return null;
    }
}
