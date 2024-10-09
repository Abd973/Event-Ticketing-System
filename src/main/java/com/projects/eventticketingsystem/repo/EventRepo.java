package com.projects.eventticketingsystem.repo;

import com.projects.eventticketingsystem.model.Event;
import com.projects.eventticketingsystem.model.Sponsor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EventRepo extends JpaRepository<Event, Integer> {
    @Query("SELECT e.sponsors FROM Event e where e.title = :eventTitle")
    public List<Sponsor> findSponsorsByEventTitle(@Param("eventTitle") String eventTitle);
}
