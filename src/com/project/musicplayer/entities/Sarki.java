package com.project.musicplayer.entities;

import com.project.musicplayer.entities.Sarkici;

import java.util.List;

public class Sarki {
    private String songName;
    private Sarkici sarkici;

    private Album album;
    private String dakika;


    public Sarki(String songName, Sarkici sarkici, Album album, String dakika) {
        this.songName = songName;
        this.sarkici = sarkici;
        this.album = album;
        this.dakika = dakika;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public Sarkici getArtistName() {
        return sarkici;
    }

    public void setArtistName(Sarkici sarkici) {
        this.sarkici = sarkici;
    }

    public String getLength() {
        return dakika;
    }

    public void setLength(String dakika) {
        this.dakika = dakika;
    }

    @Override
    public String toString() {
        return "Sarki{" +
                "name='" + songName + '\n' +
                ", sarkici=" + sarkici +
                ", dakika='" + dakika + '\n' +
                '}';
    }
}
