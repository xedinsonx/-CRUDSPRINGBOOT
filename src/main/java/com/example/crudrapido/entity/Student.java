package com.example.crudrapido.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="tbl_student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long studentId;
    private String firstName;
    private String lastName;
//  este codigo sirve para modificar el campo @Column ademas unique = true es para que sea unico //
    @Column(name="email_address",unique = true)
    private String email;

}
