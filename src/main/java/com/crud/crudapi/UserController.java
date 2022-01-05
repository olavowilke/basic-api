package com.crud.crudapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping()
    public List<User> getUsers(){
        return userRepository.findAll();
    }

    @PostMapping()
    public User createUser(@RequestBody User user){
        return userRepository.save(user);
    }

    @PutMapping("/{id}")
    public User updateUser(@RequestBody User user, @PathVariable String id){
        Optional<User> userOptional = userRepository.findById(id);
        User userById = userOptional.orElseThrow(EntityNotFoundException::new);
        userById.update(user.getName(), user.getJob());
        return userRepository.save(userById);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteUser(@PathVariable String id){
        userRepository.deleteById(id);
    }

}
