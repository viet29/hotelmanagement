package com.hotelmanagement.repository;

import com.hotelmanagement.entity.AdminRole;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRoleRepository extends JpaRepository<AdminRole, Long> {
}