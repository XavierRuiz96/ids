package com.examen.ids.repository;

import com.examen.ids.model.Airport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface AirportRepository extends JpaRepository<Airport,Integer> {
}
