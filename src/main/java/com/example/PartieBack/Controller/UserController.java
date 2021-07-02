package com.example.PartieBack.Controller;

import com.example.PartieBack.Repository.UserRepository;
import com.example.PartieBack.Service.UserService;
import com.example.PartieBack.dto.UserDto;
import com.example.PartieBack.entities.Projet;
import com.example.PartieBack.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController


@CrossOrigin(origins = "http://localhost:4200")
public class UserController {
    @Autowired
    UserRepository userRep;



    @RequestMapping(value = "login/{nomUtilisateur}", method = RequestMethod.GET)
    public User getUserByNomUtilisateur(@PathVariable("nomUtilisateur") String nomUtilisateur) {
        return userRep.findByNomUtilisateur(nomUtilisateur);
    }

    @Autowired
    UserService userService;

    @RequestMapping(value = "users", method = RequestMethod.GET)
    public ResponseEntity<List<User>> getAllUsers() {
        List<User> users = userService.getAllUsers();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    @DeleteMapping("users/delete/{id}")
    public ResponseEntity<?> deleteUserById(@PathVariable("id") Long id) {
        userService.deleteUserById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("users/update")
    public ResponseEntity<User> updateUser(@RequestBody User U) {
        User updateUser = userService.updateUser(U);
        return new ResponseEntity<>(updateUser, HttpStatus.OK);
    }

    @PostMapping("users/add")
    public ResponseEntity<User> addUser(@RequestBody User U) {
        User newUser = userService.SaveUser(U);
        return new ResponseEntity<>(newUser, HttpStatus.CREATED);
    }
    @GetMapping(value = "/user/{id}")
    public User findUserById(@PathVariable ("id") Long id)
    {
        return userService.getUser(id);
    }

    @PutMapping("users/affect")
    public ResponseEntity<User> affectUserToProjet(@RequestBody UserDto U) {
        userService.affecteUserToprojet(U);
        return new ResponseEntity<>(null, HttpStatus.OK);
    }
}
