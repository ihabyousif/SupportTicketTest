package com.supportticket.model;

import javax.persistence.*;
import java.time.LocalDate;

@lombok.Getter
@lombok.Setter
@Entity(name = "st_ticket_details")
public class TicketDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer sid;
    @Column
    private String description;
    @Column
    private int ticket_sid;
    @Column
    private LocalDate pdate;

    @ManyToOne
    @JoinColumn(name = "ticket_id")
    private Ticket ticket;

}
