package ru.mirea.labs.lab11;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class GameQueque {
    public static void main(String[] args) {
        Queue<Integer> player1Deck = new ArrayDeque<>();
        Queue<Integer> player2Deck = new ArrayDeque<>();

        Scanner reader = new Scanner(System.in);

        for (char c : reader.next().toCharArray()) player1Deck.add(Integer.parseInt(c + ""));
        for (char c : reader.next().toCharArray()) player2Deck.add(Integer.parseInt(c + ""));

        System.out.println(player1Deck);
        System.out.println(player2Deck);

        int stage = 0;
        while (!player1Deck.isEmpty() && !player2Deck.isEmpty()) {
            int player1Card = player1Deck.poll();
            int player2Card = player2Deck.poll();

            //System.out.println(player1Card+" "+player2Card);

            if (player1Card == 0 && player2Card == 9) {
                player1Deck.add(player1Card);
                player1Deck.add(player2Card);
            } else if (player1Card == 9 && player2Card == 0) {
                player2Deck.add(player1Card);
                player2Deck.add(player2Card);
            } else if (player1Card > player2Card) {
                player1Deck.add(player1Card);
                player1Deck.add(player2Card);
            } else {
                player2Deck.add(player1Card);
                player2Deck.add(player2Card);
            }

            stage++;
        }

        if (player1Deck.isEmpty()) {
            System.out.println("Player 2 win!");
        } else {
            System.out.println("Player 1 win!");
        }
        System.out.println("Stage: " + stage);
    }
}
