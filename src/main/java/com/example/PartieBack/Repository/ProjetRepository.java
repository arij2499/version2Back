package com.example.PartieBack.Repository;

import com.example.PartieBack.entities.Projet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Set;

public interface ProjetRepository extends JpaRepository<Projet,Long> {
    @Query("select DISTINCT entity  from Projet entity where entity.projet_id in :ids")
    Set<Projet>findByIdsIn(@Param("ids") List<Long> ids);
}
