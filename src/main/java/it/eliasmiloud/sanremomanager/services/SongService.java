package it.eliasmiloud.sanremomanager.services;

import java.util.List;

import org.springframework.stereotype.Service;

import it.eliasmiloud.sanremomanager.exeptions.ResourceNotFoundexception;
import it.eliasmiloud.sanremomanager.models.Song;
import it.eliasmiloud.sanremomanager.repositories.SongRepositories;

@Service
public class SongService {
	
	private SongRepositories songRepositories;

	public SongService(SongRepositories songRepositories) {
		this.songRepositories = songRepositories;
	}
	
	public List<Song> getAll(){
		return this.songRepositories.findAll();
	}
	
	public Song getById(Long id) throws ResourceNotFoundexception {
		Song song = this.songRepositories.findById(id).orElseThrow(
				() -> new ResourceNotFoundexception("evento con id " + id + "non trovato")
				);
		return song;
	}
	
	

}
