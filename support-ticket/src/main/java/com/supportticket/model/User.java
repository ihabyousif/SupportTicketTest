package com.supportticket.model;

import javax.persistence.*;
import java.util.Set;

@lombok.Getter
@lombok.Setter
@Entity(name = "st_user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer sid;
    @Column
    private String fname;
    @Column
    private String lname;
    @Column
    private String rule;
    @Column
    private String description;
    @Column
    private Integer status;

    @ManyToOne
    @JoinColumn(name = "dept_id")
    private Department department;

    @OneToMany(mappedBy = "createdBy", cascade = CascadeType.ALL)
    private Set<Ticket> ticketsCreatedByMe;

    @OneToMany(mappedBy = "assignedTo", cascade = CascadeType.ALL)
    private Set<Ticket> ticketsAssignedToMe;
}
