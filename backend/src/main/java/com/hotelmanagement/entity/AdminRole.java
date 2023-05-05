package com.hotelmanagement.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "admin_role")
public class AdminRole {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "role_name", nullable = false, length = 100)
    private String roleName;

    @Column(name = "staff_management", nullable = false)
    private Boolean staffManagement = false;

    @Column(name = "booking_management", nullable = false)
    private Boolean bookingManagement = false;

    @Column(name = "room_management", nullable = false)
    private Boolean roomManagement = false;

    @Column(name = "manager_management", nullable = false)
    private Boolean managerManagement = false;

    @OneToMany(mappedBy = "role")
    private Set<Admin> admins = new LinkedHashSet<>();

}