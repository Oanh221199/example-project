package com.company;

import java.util.LinkedList;

public class LinkedListDemo {

    public static void main(String[] args) {
        // Tạo một LinkedList để lưu trữ các bài hát trong playlist
        LinkedList<String> playlist = new LinkedList<String>();

        // Thêm bài hát vào playlist
        playlist.add("Song 1");
        playlist.add("Song 2");
        playlist.add("Song 3");

        // In ra playlist
        System.out.println("Playlist ban đầu: ");
        printPlaylist(playlist);

        // Thêm bài hát vào đầu playlist (ví dụ: bài hát yêu thích)
        playlist.addFirst("Song Love");

        // Thêm bài hát vào cuối playlist (ví dụ: bài hát mới phát hành)
        playlist.addLast("Song New");

        // In ra playlist sau khi thêm bài hát
        System.out.println("\nPlaylist sau khi thêm bài hát ở đầu và cuối: ");
        printPlaylist(playlist);

        // Xóa bài hát đầu tiên (ví dụ: bài hát đã nghe quá nhiều lần)
        playlist.removeFirst();

        // Xóa bài hát cuối cùng (ví dụ: bài hát vừa thêm vào không thích)
        playlist.removeLast();

        // In ra playlist sau khi xóa bài hát
        System.out.println("\nPlaylist sau khi xóa bài hát đầu và cuối: ");
        printPlaylist(playlist);

        // Duyệt qua playlist và in ra từng bài hát
        System.out.println("\nDuyệt qua playlist:");
        for (String song : playlist) {
            System.out.println(song);
        }
    }

    // Phương thức để in ra playlist
    public static void printPlaylist(LinkedList<String> playlist) {
        for (String song : playlist) {
            System.out.println(song);
        }
    }

}
