package com.supportticket.model;

import javax.persistence.*;
import java.util.Set;

@lombok.Getter
@lombok.Setter
@Entity
@Table(name = "st_organization")
public class Organization {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer sid;
    @Column
    private String name;
    @Column
    private String description;

    @OneToMany(mappedBy = "organization", cascade = CascadeType.ALL)
    private Set<Department> departments;
}
