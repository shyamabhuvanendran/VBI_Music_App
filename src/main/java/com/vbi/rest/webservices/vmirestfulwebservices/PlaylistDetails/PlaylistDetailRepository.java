package com.vbi.rest.webservices.vmirestfulwebservices.PlaylistDetails;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.vbi.rest.webservices.vmirestfulwebservices.Songs.Song;

@Repository
public interface PlaylistDetailRepository extends JpaRepository<Playlist_Detail, Integer>{
	@Query("select s from Song s, Playlist_Detail p where s.songId = p.songId and p.playlistId=:playlistId")
	 List<Song> findSongsOfPlaylist(Integer playlistId);
}
