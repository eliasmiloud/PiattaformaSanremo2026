package it.eliasmiloud.sanremomanager.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import it.eliasmiloud.sanremomanager.models.Song;

public interface SongRepositories extends JpaRepository<Song, Long>{

}
