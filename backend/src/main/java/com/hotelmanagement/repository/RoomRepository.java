package com.hotelmanagement.repository;

import com.hotelmanagement.entity.Room;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoomRepository extends JpaRepository<Room, Long> {

    Page<Room> findAllByRoomType();
}