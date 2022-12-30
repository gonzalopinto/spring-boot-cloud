package com.springboot.app.model.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "RESERVATION")
public class Reservation {

	@Id
	// @Column(name = "GUEST_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "ROOM_ID")
	private Long roomId;

	@Column(name = "GUEST_ID")
	private Long guestId;

	@Column(name = "RES_DATE")
	private Date date;

	public Long getId()
	{
		return this.id;
	}

	public void setId(Long id)
	{
		this.id = id;
	}

	public Long getRoomId()
	{
		return this.roomId;
	}

	public void setRoomId(Long roomId)
	{
		this.roomId = roomId;
	}

	public Long getGuestId()
	{
		return this.guestId;
	}

	public void setGuestId(Long guestId)
	{
		this.guestId = guestId;
	}

	public Date getDate()
	{
		return this.date;
	}

	public void setDate(Date date)
	{
		this.date = date;
	}

}
