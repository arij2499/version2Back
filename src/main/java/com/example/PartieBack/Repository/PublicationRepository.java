package com.example.PartieBack.Repository;

import com.example.PartieBack.entities.User;
import com.example.PartieBack.entities.publication;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PublicationRepository extends JpaRepository<publication,Long> {
}
