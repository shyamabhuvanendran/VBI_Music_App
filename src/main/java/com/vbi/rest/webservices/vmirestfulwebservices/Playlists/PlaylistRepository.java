package com.vbi.rest.webservices.vmirestfulwebservices.Playlists;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.vbi.rest.webservices.vmirestfulwebservices.Songs.Song;

@Repository
public interface PlaylistRepository extends JpaRepository<Playlist, Integer>{
		
	@Query("Select p from Playlist p where p.userId = :userId")
	 List<Playlist> findPlaylistByUserId(Integer userId);
	 
	@Query("Select p from Playlist p where lower(p.name) like lower(concat('%', :search,'%')) and p.userId = :userId")
	 List<Playlist> searchPlaylist(String search, Integer userId);
}
