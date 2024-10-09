package com.projects.eventticketingsystem.model;


import jakarta.persistence.*;
import lombok.Data;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;

@Entity
@Data
public class Ticket {
    @Id
    private int id;
    private float price;
    private String type;

    @Enumerated(EnumType.STRING)
    private TicketStatus status;
    @ManyToOne
    private Event event;

    public enum TicketStatus {
        PURCHASED, AVAILABLE
    }

}
