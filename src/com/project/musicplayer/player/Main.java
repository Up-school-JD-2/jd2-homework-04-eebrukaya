package com.project.musicplayer.player;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Service.createAlbum();
        int choice = 0;

        do {
            System.out.println("###################");
            System.out.println("1- Albüm ara");
            System.out.println("2- Şarkı ara");
            System.out.println("3- Şarkıcı ara");
            System.out.println("4- Sepete ürün ekle");
            System.out.println("###################");
            choice = sc.nextInt();
            switch (choice) {
                case 1 -> {
                    // add code
                    Service.findAlbum();
                }
                case 2 -> {
                    // add code
                     Service.findSinger();
                }
                case 3 -> {
                    // add code
                    Service.findSong();
                }
                case 4 -> {
                    Service.addToBasket();
                }
                case -1 -> {
                }
                default -> System.out.println("Hatalı seçim yaptınız, çıkış için -1");
            }
        } while (choice > -1);
        System.out.println("Bizi tercih ettiğiniz için teşekkürler.");
    }
}

