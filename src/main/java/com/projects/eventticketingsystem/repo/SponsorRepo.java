package com.projects.eventticketingsystem.repo;

import com.projects.eventticketingsystem.model.Sponsor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SponsorRepo extends JpaRepository<Sponsor, Integer> {
}
