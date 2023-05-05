package com.hotelmanagement.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "admin")
public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "firstname", nullable = false, length = 50)
    private String firstname;

    @Column(name = "lastname", nullable = false)
    private Long lastname;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "role", nullable = false)
    private AdminRole role;

    @Lob
    @Column(name = "sex", nullable = false)
    private String sex;

    @Column(name = "image_url", nullable = false, length = 250)
    private String imageUrl;

    @Column(name = "cid", nullable = false, length = 15)
    private String cid;

    @Column(name = "email", nullable = false, length = 150)
    private String email;

    @Column(name = "phonenumber", nullable = false, length = 20)
    private String phonenumber;

    @Column(name = "password", nullable = false, length = 300)
    private String password;

    @Lob
    @Column(name = "description", nullable = false)
    private String description;

    @CreationTimestamp
    @Column(name = "date_created", nullable = false)
    private LocalDate dateCreated;

}