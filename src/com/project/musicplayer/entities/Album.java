package com.project.musicplayer.entities;

import java.util.List;

public class Album {
    private String albumName;

    private Sarkici sarkici;
    private String yayinYili;
    private List<Sarki> songList;

    public Album(String albumName, Sarkici sarkici, String yayinYili, List<Sarki> songList) {
        this.albumName = albumName;
        this.sarkici = sarkici;
        this.yayinYili = yayinYili;
        this.songList = songList;
    }

    // getter ve setter metotları

    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    public Sarkici getArtistName() {
        return sarkici;
    }

    public void setArtistName(Sarkici artistName) {
        this.sarkici = artistName;
    }

    public String getYayinYili() {
        return yayinYili;
    }

    public void setReleaseDate(String yayinYili) {
        this.yayinYili = yayinYili;
    }

    public List<Sarki> getSongList() {
        return songList;
    }

    public void setSongList(List<Sarki> songList) {
        this.songList = songList;
    }

    @Override
    public String toString() {
        return "Album{" +
                "albumName='" + albumName + '\n' +
                ", sarkici=" + sarkici +
                ", yayinYili='" + yayinYili + '\n' +
                ", sarkiList=" + songList +
                '}';
    }
}
