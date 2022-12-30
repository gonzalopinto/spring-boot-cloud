package com.springboot.app.model.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springboot.app.model.entity.Reservation;

@Repository
public interface ReservationRepository extends CrudRepository<Reservation, Long> {

}
