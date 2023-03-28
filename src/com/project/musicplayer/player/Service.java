package com.project.musicplayer.player;

import com.project.musicplayer.entities.Album;
import com.project.musicplayer.entities.Sarki;
import com.project.musicplayer.entities.Sarkici;
import com.project.musicplayer.entities.User;

import java.util.ArrayList;
import java.util.List;

public class Service {

     public static final List<Sarki> SARKI_LIST = new ArrayList<>();
     public static final List<User> USERS = new ArrayList<>();

    public static void createAlbum() {
        Sarkici sarkici1 = new Sarkici("Sezen", "Aksu");
        Album album1 = new Album("Serçe", sarkici1, "1978", SARKI_LIST);

        USERS.add(new User("ebrukaya", "noreply@email.com","İstanbul", "1111111111"));
        USERS.add(new User("zeynepozdemir", "noreply@email.com","Antalya", "1111111111"));
        USERS.add(new User("tugceagar", "noreply@email.com","Denizli", "1111111111"));
        USERS.add(new User("nurberin", "noreply@email.com","Ankara", "1111111111"));
        USERS.add(new User("tugcesert", "noreply@email.com","Bursa", "1111111111"));


        SARKI_LIST.add(new Sarki("Neye Yarar'", sarkici1, album1, "2.43"));
        SARKI_LIST.add(new Sarki("Gün Gelir", sarkici1, album1,"3.13"));
        SARKI_LIST.add(new Sarki("Akasyalar Açarken", sarkici1, album1, "3.18"));
        SARKI_LIST.add(new Sarki("Aşk",  sarkici1, album1,"3.04"));

       /* System.out.println("Albüm -> " + album1);
        System.out.println("*******************");
        System.out.println("Şarkıcı -> " + sarkici1);
        System.out.println("------------------");
        System.out.println("Users -> " + USERS);*/
    }

    public static void findSong(){
        // will add codes
    }

    public static void findAlbum(){
        // will add codes
    }

    public static void findSinger(){
        // will add codes
    }

    public static void addToBasket(){
        // will add codes
    }

    public static void buy(){
        // will add codes
    }



}
