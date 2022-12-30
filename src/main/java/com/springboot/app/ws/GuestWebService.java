package com.springboot.app.ws;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.app.model.dao.GuestRepository;
import com.springboot.app.model.entity.Guest;

@RestController
@RequestMapping("/guests")
public class GuestWebService {

	@Autowired
	private GuestRepository guestRepository;

	@GetMapping
	public Iterable<Guest> getAllGuests()
	{
		return guestRepository.findAll();
	}

	@GetMapping("/{id}")
	public Guest getGuest(@PathVariable("id") Long id)
	{
		return guestRepository.findById(id).orElse(null);
	}

}
