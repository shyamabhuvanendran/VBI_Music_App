package com.vbi.rest.webservices.vmirestfulwebservices.Songs;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface SongRepository extends JpaRepository<Song, Integer>{
	 
	@Query("select s from Song s where lower(s.title) like lower(concat('%', :search,'%'))")
	 List<Song> searchSongIgnoreCase(String search);
}
