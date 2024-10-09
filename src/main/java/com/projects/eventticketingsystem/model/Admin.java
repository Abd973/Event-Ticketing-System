package com.projects.eventticketingsystem.model;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ModelAttribute;


import java.util.List;

@Entity
@Data
public class Admin {
    @Id
    private int id;
    private String name;
    private int age;
    private String email;
    @OneToMany(mappedBy = "admin", cascade = CascadeType.ALL)
    private List<Event> events;//events that admin created

}
