package com.supportticket.model;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Set;


@lombok.Getter
@lombok.Setter
@Entity
@Table(name = "st_ticket")
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer sid;
    @Column
    private String title;
    @Column
    private String description;
    @Column
    private int status;

    @ManyToOne
    @JoinColumn(name = "createdBy")
    private User createdBy;
    @ManyToOne
    @JoinColumn(name = "assignedTo")
    private User assignedTo;

    @Column
    private LocalDate creatDate;
    @Column
    private LocalDate lastModifiedDate;

    @OneToMany(mappedBy = "ticket", cascade = CascadeType.ALL)
    private Set<TicketAttachement> ticketAttachement;

    @OneToMany(mappedBy = "ticket", cascade = CascadeType.ALL)
    private Set<TicketDetails> ticketDetails;
}
