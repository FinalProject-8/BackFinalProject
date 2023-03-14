package com.example.backfinalpriject.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@RequiredArgsConstructor
@Table(name = "admin")
public class Admin {

    @Id
    @Column(name = "admin_email")
    private String email;

    @Column(name = "admin_password")
    private String password;

    @Column(name = "admin_name")
    private String name;
}
