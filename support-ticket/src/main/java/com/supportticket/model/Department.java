package com.supportticket.model;

import javax.persistence.*;
import java.util.Set;

@lombok.Getter
@lombok.Setter
@Entity
@Table(name = "st_department")
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer sid;
    @Column
    private String name;
    @Column
    private String description;

    @ManyToOne
    @JoinColumn(name = "org_id")
    private Organization organization;

    @OneToMany(mappedBy = "department", cascade = CascadeType.ALL)
    private Set<User> users;
}
