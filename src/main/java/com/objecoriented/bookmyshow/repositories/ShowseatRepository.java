package com.objecoriented.bookmyshow.repositories;

import com.objecoriented.bookmyshow.models.ShowSeat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShowseatRepository  extends JpaRepository<ShowSeat, Long> {
}
