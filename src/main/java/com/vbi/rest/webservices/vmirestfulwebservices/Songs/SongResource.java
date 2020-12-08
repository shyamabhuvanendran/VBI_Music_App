package com.vbi.rest.webservices.vmirestfulwebservices.Songs;

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
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.vbi.rest.webservices.vmirestfulwebservices.Exceptions.ItemNotFoundException;
import com.vbi.rest.webservices.vmirestfulwebservices.Exceptions.UserNotFoundException;

@RestController
public class SongResource {

	
	@Autowired
	SongRepository songRepository;
	
	
    @GetMapping("/allsongs")
    public List<Song> index(){
    	System.out.println("inside allsongs song resource");
        return songRepository.findAll();
    }

    @GetMapping("/song/{id}")
    public Optional<Song> show(@PathVariable String id){
        int songId = Integer.parseInt(id);
        return songRepository.findById(songId);
    }

    @PostMapping("/song/search")
    public List<Song> search(@RequestBody Map<String, String> body){
        String searchTerm = body.get("text");
        System.out.println(searchTerm);
        return songRepository.searchSongIgnoreCase(searchTerm);
    }

    @PostMapping("/addsong")
    public Song create(@RequestBody Song song){
        /*String title = body.get("title");
        String singers = body.get("singers");
        String albumn = body.get("albumn");
        Integer playtime = Integer.parseInt(body.get("playtime"));*/
        return songRepository.save(song);
    }


    @DeleteMapping("songdelete/{id}")
    public boolean delete(@PathVariable String id){
    		if(id==null)
			throw new ItemNotFoundException(id);
        int songId = Integer.parseInt(id);
        songRepository.deleteById(songId);
        return true;
    }
}
