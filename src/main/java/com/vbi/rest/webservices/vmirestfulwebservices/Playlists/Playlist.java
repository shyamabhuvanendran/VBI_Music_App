package com.vbi.rest.webservices.vmirestfulwebservices.Playlists;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Entity
public class Playlist {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer playlistId;
	
	private String name;
	
	private Date created;
	
	private Integer userId;

	public Integer getPlaylistId() {
		return playlistId;
	}

	public void setPlaylistId(Integer playlistId) {
		this.playlistId = playlistId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getCreatedAt() {
		return created;
	}

	public void setCreatedAt(Date created) {
		this.created = created;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Playlist(Integer playlistId, String name, Date created, Integer userId) {
		super();
		this.playlistId = playlistId;
		this.name = name;
		this.created = created;
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "Playlist [playlistId=" + playlistId + ", name=" + name + ", createdAt=" + created + ", userId="
				+ userId + "]";
	}

	public Playlist() {
		super();
	}

	
	
	
	
}
