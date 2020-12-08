package com.vbi.rest.webservices.vmirestfulwebservices.Playlists;

import java.net.URI;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.vbi.rest.webservices.vmirestfulwebservices.Exceptions.ItemNotFoundException;
import com.vbi.rest.webservices.vmirestfulwebservices.Exceptions.UserNotFoundException;
import com.vbi.rest.webservices.vmirestfulwebservices.Songs.Song;
import com.vbi.rest.webservices.vmirestfulwebservices.Songs.SongRepository;

@RestController
public class PlaylistResource {

	@Autowired
	PlaylistRepository playlistRepository;

   @GetMapping("/playlists/{id}")
    public List<Playlist> showAllPlaylistUser(@PathVariable String id){
	   	Integer userId = Integer.parseInt(id);
        return playlistRepository.findPlaylistByUserId(userId);
    }

    @PostMapping("/playlist/search")
    public List<Playlist> search(@RequestBody Map<String, String> body){
        String searchTerm = body.get("text");
        int userId=1;
        System.out.println(searchTerm);
        return playlistRepository.searchPlaylist(searchTerm, userId);
    }
    
    @PostMapping("/playlistadd")
    public Playlist create(@RequestBody Map<String, String> body){
        String name = body.get("name");
        Integer userId = Integer.parseInt(body.get("userId"));
        return playlistRepository.save(new Playlist(null, name, null, userId));
    }

    @DeleteMapping("playlist/{id}")
    public boolean delete(@PathVariable String id){
        int playlistId = Integer.parseInt(id);
        playlistRepository.deleteById(playlistId);
        return true;
    }
    
}
