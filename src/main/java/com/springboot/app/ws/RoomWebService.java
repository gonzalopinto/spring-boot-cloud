package com.springboot.app.ws;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.app.model.dao.RoomRepository;
import com.springboot.app.model.entity.Room;

@RestController
@RequestMapping("/rooms")
public class RoomWebService {

	@Autowired
	private RoomRepository roomRepository;

	@GetMapping
	public Iterable<Room> getAllGuests()
	{
		return roomRepository.findAll();
	}

	@GetMapping("/{id}")
	public Room getRes(@PathVariable("id") Long id)
	{
		return roomRepository.findById(id).orElse(null);
	}

}
