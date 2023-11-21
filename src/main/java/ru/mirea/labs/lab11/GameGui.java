package ru.mirea.labs.lab11;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayDeque;
import java.util.Deque;

public class GameGui {
    private final JFrame frame;
    private final JLabel player1Label;
    private final JLabel player2Label;
    private final JTextArea logTextArea;

    private final Deque<Integer> player1Deck;
    private final Deque<Integer> player2Deck;

    public GameGui() {
        frame = new JFrame("Игра \"Пьяница\"");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new BorderLayout());

        player1Label = new JLabel("Карты игрока 1: ");
        player2Label = new JLabel("Карты игрока 2: ");

        JButton playButton = new JButton("Играть");
        playButton.addActionListener(e -> new Thread(this::playGame).start());

        logTextArea = new JTextArea();
        logTextArea.setSize(150, 300);

        frame.add(player1Label, BorderLayout.NORTH);
        frame.add(player2Label, BorderLayout.SOUTH);
        frame.add(playButton, BorderLayout.CENTER);
        frame.add(new JScrollPane(logTextArea), BorderLayout.EAST);

        player1Deck = new ArrayDeque<>();
        player2Deck = new ArrayDeque<>();

        inputDecks();

        updateDeckInfo();

        frame.setVisible(true);
    }

    private void inputDecks() {
        String inputPlayer1 = JOptionPane.showInputDialog(frame, "Введите карты игрока 1 (через пробел):");
        String inputPlayer2 = JOptionPane.showInputDialog(frame, "Введите карты игрока 2 (через пробел):");

        String[] player1Cards = inputPlayer1.split(" ");
        String[] player2Cards = inputPlayer2.split(" ");

        for (String card : player1Cards) {
            player1Deck.add(Integer.parseInt(card));
        }

        for (String card : player2Cards) {
            player2Deck.add(Integer.parseInt(card));
        }
    }

    private void updateDeckInfo() {
        player1Label.setText("Карты игрока 1: " + player1Deck.toString());
        player2Label.setText("Карты игрока 2: " + player2Deck.toString());
    }

    private void playGame() {
        int count = 0;
        while (!player1Deck.isEmpty() && !player2Deck.isEmpty()) {
            int player1Card = player1Deck.poll();
            int player2Card = player2Deck.poll();

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

            updateDeckInfo();
            logTextArea.append("Игрок 1: " + player1Card + ", Игрок 2: " + player2Card + "\n");

            count++;
            if (player1Deck.isEmpty()) {
                logTextArea.append("Игрок 2 выиграл! Ход: " + count);
            } else if (player2Deck.isEmpty()) {
                logTextArea.append("Игрок 1 выиграл! Ход: " + count);
            }

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(GameGui::new);
    }
}
