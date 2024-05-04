package com.safanner.ecomm.entities;

import com.safanner.ecomm.enums.UserRole;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "User")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String email;

    private String password;

    private String name;

    private  UserRole role;

    @Lob
    @Column(columnDefinition = "longblob")
    private byte[] img;



}
