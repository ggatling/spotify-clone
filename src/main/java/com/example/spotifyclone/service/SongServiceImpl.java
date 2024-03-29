package com.example.spotifyclone.service;

import com.example.spotifyclone.model.Song;
import com.example.spotifyclone.respositories.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class SongServiceImpl implements SongService{
    @Autowired
    SongRepository songRepository;


    @Override
    public Iterable<Song> listTitle() {
        return songRepository.findAll();
    }

    @Override
    public Song createSong(Song song) {
        return songRepository.save(song);
    }

    @Override
    public HttpStatus deleteById(Long songId) {
        songRepository.deleteById(songId);
        return null;
    }
}
