package com.projects.eventticketingsystem.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Sponsor {
    @Id
    private int id;
    private String name;
    private String email;
    @ManyToMany
    private List<Event> events;//events that each sponsor sponsored
}
