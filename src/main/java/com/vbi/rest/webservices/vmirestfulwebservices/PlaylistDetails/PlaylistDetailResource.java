package com.vbi.rest.webservices.vmirestfulwebservices.PlaylistDetails;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vbi.rest.webservices.vmirestfulwebservices.Songs.Song;

@RestController
public class PlaylistDetailResource {
	
	@Autowired
	PlaylistDetailRepository playlistDetailRepository;
	
	@PostMapping("/playlistdetail/addsong")
    public Playlist_Detail create(@RequestBody Playlist_Detail playlistDetail){
		System.out.println(playlistDetail.getPlaylistId());
        return playlistDetailRepository.save(playlistDetail);
    }
	
	 @DeleteMapping("playlistdetail/deletesong/")
	 public boolean delete(@RequestBody Playlist_Detail playlistDetail){
		 playlistDetailRepository.delete(playlistDetail);
	     return true;
	 }
	 
	 @GetMapping("/playlistsongs/{id}")
	   public List<Song> show(@PathVariable String id){
		 
	        return playlistDetailRepository.findSongsOfPlaylist(Integer.parseInt(id));
	    }

}
