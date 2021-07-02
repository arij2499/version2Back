package com.example.PartieBack.Repository;

import com.example.PartieBack.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
    User findByNomUtilisateur (String nomUtilisateur);
}
