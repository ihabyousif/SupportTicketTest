package com.supportticket.model;

import javax.persistence.*;

@lombok.Getter
@lombok.Setter
@Entity
@Table(name = "st_ticket_attachement")
public class TicketAttachement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer sid;
    @Column
    private String path;
    @Column
    private String description;

    @ManyToOne
    @JoinColumn(name = "ticket_id")
    private Ticket ticket;

}
