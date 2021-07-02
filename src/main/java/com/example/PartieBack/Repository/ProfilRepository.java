package com.example.PartieBack.Repository;

import com.example.PartieBack.entities.Profil;
import com.example.PartieBack.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfilRepository extends JpaRepository<Profil,Long> {

}
