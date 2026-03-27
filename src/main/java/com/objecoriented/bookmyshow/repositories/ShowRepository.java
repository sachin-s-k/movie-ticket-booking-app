package com.objecoriented.bookmyshow.repositories;

import com.objecoriented.bookmyshow.models.Show;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShowRepository  extends JpaRepository<Show, Long> {
}
