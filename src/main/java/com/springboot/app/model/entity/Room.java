package com.springboot.app.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ROOM")
public class Room {

	@Id
	// @Column(name = "GUEST_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "NAME")
	private String roomName;

	@Column(name = "ROOM_NUMBER")
	private String roomNumber;

	@Column(name = "BED_INFO")
	private String bedInfo;

	public Long getId()
	{
		return this.id;
	}

	public void setId(Long id)
	{
		this.id = id;
	}

	public String getRoomName()
	{
		return this.roomName;
	}

	public void setRoomName(String roomName)
	{
		this.roomName = roomName;
	}

	public String getRoomNumber()
	{
		return this.roomNumber;
	}

	public void setRoomNumber(String roomNumber)
	{
		this.roomNumber = roomNumber;
	}

	public String getBedInfo()
	{
		return this.bedInfo;
	}

	public void setBedInfo(String bedInfo)
	{
		this.bedInfo = bedInfo;
	}

}
