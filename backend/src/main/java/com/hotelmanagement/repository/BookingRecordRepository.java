package com.hotelmanagement.repository;

import com.hotelmanagement.entity.BookingRecord;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRecordRepository extends JpaRepository<BookingRecord, Long> {
}