package com.example.PartieBack.Repository;
import com.example.PartieBack.entities.Facture;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FactureRepository extends JpaRepository<Facture,Long> {
}
