package com.projects.eventticketingsystem.repo;

import com.projects.eventticketingsystem.model.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TicketRepo extends JpaRepository<Ticket, Integer> {
    @Query(value = "SELECT * FROM ticket t WHERE t.status = 'AVAILABLE' ", nativeQuery = true)
    public List<Ticket> findAvailableTickets();
}
