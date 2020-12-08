package com.vbi.rest.webservices.vmirestfulwebservices.Songs;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Entity
public class Song {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer songId;
	
	private String title;
	
	private String singers;
	
	private String albumn;

	private Integer playtime;

	public Integer getSongId() {
		return songId;
	}

	public void setSongId(Integer songId) {
		this.songId = songId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSingers() {
		return singers;
	}

	public void setSingers(String singers) {
		this.singers = singers;
	}

	public String getAlbumn() {
		return albumn;
	}

	public void setAlbumn(String albumn) {
		this.albumn = albumn;
	}

	public Integer getPlaytime() {
		return playtime;
	}

	public void setPlaytime(Integer playtime) {
		this.playtime = playtime;
	}

	@Override
	public String toString() {
		return "Song [songId=" + songId + ", title=" + title + ", singers=" + singers + ", albumn=" + albumn
				+ ", playtime=" + playtime + "]";
	}

	public Song(Integer songId, String title, String singers, String albumn, Integer playtime) {
		super();
		this.songId = songId;
		this.title = title;
		this.singers = singers;
		this.albumn = albumn;
		this.playtime = playtime;
	}
	
	

	public Song() {
		super();
	}
	
}
