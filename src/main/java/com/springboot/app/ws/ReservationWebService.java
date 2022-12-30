package com.springboot.app.ws;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.app.model.dao.ReservationRepository;
import com.springboot.app.model.entity.Reservation;

@RestController
@RequestMapping("/reservations")
public class ReservationWebService {

	@Autowired
	private ReservationRepository resRepository;

	@GetMapping
	public Iterable<Reservation> getAllGuests()
	{
		return resRepository.findAll();
	}

	@GetMapping("/{id}")
	public Reservation getRes(@PathVariable("id") Long id)
	{
		return resRepository.findById(id).orElse(null);
	}

}
