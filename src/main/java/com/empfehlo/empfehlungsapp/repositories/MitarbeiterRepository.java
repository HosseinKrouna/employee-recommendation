package com.empfehlo.empfehlungsapp.repositories;


import com.empfehlo.empfehlungsapp.entities.Mitarbeiter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MitarbeiterRepository extends JpaRepository<Mitarbeiter, Long> {
}

