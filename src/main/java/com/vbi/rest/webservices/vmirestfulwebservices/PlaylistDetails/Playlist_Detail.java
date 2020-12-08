package com.vbi.rest.webservices.vmirestfulwebservices.PlaylistDetails;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@IdClass(Playlist_detailId.class)
@Table(name="Playlist_Detail")
public class Playlist_Detail {
	@Id
	private Integer playlistId;
	
	@Id
	private Integer songId;

	public Playlist_Detail(Integer playlistId, Integer songId) {
		super();
		this.playlistId = playlistId;
		this.songId = songId;
	}

	@Override
	public String toString() {
		return "PlaylistDetail [playlistId=" + playlistId + ", songId=" + songId + "]";
	}

	public Playlist_Detail() {
		super();
	}

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
	
	
}
