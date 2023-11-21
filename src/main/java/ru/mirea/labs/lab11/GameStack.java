package ru.mirea.labs.lab11;

import java.util.*;

public class GameStack {
    public static void main(String[] args) {
        Stack<Integer> player1Deck = new Stack<>();
        Stack<Integer> player2Deck = new Stack<>();

        Scanner reader = new Scanner(System.in);

        char[] first = reader.next().toCharArray();
        char[] second = reader.next().toCharArray();
        for (char c : first) player1Deck.add(0, Integer.parseInt(c + ""));
        for (char c : second) player2Deck.add(0, Integer.parseInt(c + ""));

        System.out.println(player1Deck);
        System.out.println(player2Deck);

        int stage = 0;
        while (!player1Deck.isEmpty() && !player2Deck.isEmpty()) {
            int player1Card = player1Deck.pop();
            int player2Card = player2Deck.pop();

            //System.out.println(player1Card+" "+player2Card);

            if (player1Card == 0 && player2Card == 9) {
                player1Deck.add(0, player1Card);
                player1Deck.add(0, player2Card);
            } else if (player1Card == 9 && player2Card == 0) {
                player2Deck.add(0, player1Card);
                player2Deck.add(0, player2Card);
            } else if (player1Card > player2Card) {
                player1Deck.add(0, player1Card);
                player1Deck.add(0, player2Card);
            } else {
                player2Deck.add(0, player1Card);
                player2Deck.add(0, player2Card);
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

    private static char[] reverse(char[] array) {
        for(int i = 0; i < array.length / 2; i++) {
            char temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
        return array;
    }
}
