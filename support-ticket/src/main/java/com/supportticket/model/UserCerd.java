package com.supportticket.model;

import javax.persistence.*;

@lombok.Getter
@lombok.Setter
@Entity(name = "st_user_cred")
public class UserCerd {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer sid;
    @Column
    private String userName;
    @Column
    private String password;
}
