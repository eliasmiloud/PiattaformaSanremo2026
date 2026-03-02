package it.eliasmiloud.sanremomanager.controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import it.eliasmiloud.sanremomanager.models.Song;
import it.eliasmiloud.sanremomanager.services.SongService;

@RestController
public class SongController {
	
	private SongService songService;

	public SongController(SongService songService) {
		super();
		this.songService = songService;
	} 
	
	@GetMapping("api/songs")
	public ResponseEntity<List<Song>> all(){
		List<Song> songs = this.songService.getAll();
		return ResponseEntity.ok(songs);
	}

}
