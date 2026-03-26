package com.objecoriented.bookmyshow.repositories;

import com.objecoriented.bookmyshow.models.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepository extends JpaRepository<City,Long> {
}
