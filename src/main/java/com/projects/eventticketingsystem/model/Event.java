package com.projects.eventticketingsystem.model;

import jakarta.persistence.*;
import lombok.Data;


import java.util.Date;
import java.util.List;


@Entity
@Data
public class Event {
    @Id
    private int eventId;
    private String title;
    private Date date;
    private String location;
    private String description;
    @ManyToOne
    private Admin admin;//admin who created the event
    @ManyToMany
    private List<Sponsor> sponsors;//sponsors who sponsored the event
    @OneToMany
    private List<Ticket> tickets;//each event has many tickets
}
