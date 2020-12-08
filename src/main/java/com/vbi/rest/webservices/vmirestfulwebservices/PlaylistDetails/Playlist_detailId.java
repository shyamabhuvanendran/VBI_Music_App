package com.vbi.rest.webservices.vmirestfulwebservices.PlaylistDetails;

import java.io.Serializable;

public class Playlist_detailId implements Serializable{

	private Integer playlistId;
	
	private Integer songId;

	public Integer getPlaylistId() {
		return playlistId;
	}

	public void setPlaylistId(Integer playlistId) {
		this.playlistId = playlistId;
	}

	public Integer getSongId() {
		return songId;
	}

	public void setSongId(Integer songId) {
		this.songId = songId;
	}

	public Playlist_detailId(Integer playlistId, Integer songId) {
		super();
		this.playlistId = playlistId;
		this.songId = songId;
	}

	public Playlist_detailId() {
		super();
	}
	
	
	
	
	
}
