package com.projects.eventticketingsystem.model;

import jakarta.persistence.*;
import lombok.Data;


import java.util.Date;
import java.util.List;


@Entity
@Data
public class Event {
    @Id
    private int id;
    private String title;
    private Date date;
    private String location;
    private String description;
    @ManyToOne
    private Admin admin;//admin who created the event
    @ManyToMany
    private List<Sponsor> sponsors;//sponsors who sponsored the event
    @OneToMany(mappedBy = "event", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Ticket> tickets;//each event has many tickets
}
