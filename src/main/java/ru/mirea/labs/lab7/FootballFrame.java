package ru.mirea.labs.lab7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FootballFrame extends JFrame {
    private static JButton btn_AC_Milan;
    private static JButton btn_Real_Madrid;
    private static JLabel label_result;
    private static JLabel label_scorer;
    private static JLabel label_winner;
    private static int counter_AC_Milan = 0;
    private static int counter_Real_Madrid = 0;

    public static void buildPanelContent(Container pane) {
        pane.setLayout(new GridBagLayout());
        var constraint = new GridBagConstraints();
        var tahoma = new Font("Tahoma", Font.PLAIN, 20);

        //Левая кнопка "AC Milan"
        btn_AC_Milan = new JButton("  AC Milan  ");
        btn_AC_Milan.setFont(tahoma);
        constraint.fill = GridBagConstraints.BOTH;
        constraint.weightx = 0;
        constraint.weighty = 0;
        constraint.gridwidth = 1;
        constraint.gridheight = 0;
        constraint.gridx = 0;
        constraint.gridy = 0;
        pane.add(btn_AC_Milan, constraint);
        btn_AC_Milan.setActionCommand("Last Scorer: AC Milan");

        //Правая кнопка "Real Madrid"
        btn_Real_Madrid = new JButton("Real Madrid");
        btn_Real_Madrid.setFont(tahoma);
        constraint.fill = GridBagConstraints.BOTH;
        constraint.weightx = 0;
        constraint.weighty = 0;
        constraint.gridwidth = 1;
        constraint.gridheight = 0;
        constraint.gridx = 2;
        constraint.gridy = 0;
        pane.add(btn_Real_Madrid, constraint);
        btn_Real_Madrid.setActionCommand("Last Scorer: Real Madrid");

        //Победитель
        label_winner = new JLabel("Winner: DRAW");
        label_winner.setFont(tahoma);
        label_winner.setHorizontalAlignment(label_winner.CENTER);
        constraint.fill = GridBagConstraints.HORIZONTAL;
        constraint.weightx = 1;
        constraint.weighty = 1;
        constraint.gridwidth = 3;
        constraint.gridheight = 1;
        constraint.gridx = 0;
        constraint.gridy = 0;
        pane.add(label_winner, constraint);

        //Результат
        label_result = new JLabel("Result: 0 X 0");
        label_result.setFont(tahoma);
        label_result.setHorizontalAlignment(label_result.CENTER);
        constraint.fill = GridBagConstraints.BOTH;
        constraint.weightx = 1;
        constraint.weighty = 1;
        constraint.gridwidth = 1;
        constraint.gridheight = 1;
        constraint.gridx = 1;
        constraint.gridy = 1;
        pane.add(label_result, constraint);


        //Последний победивший
        label_scorer = new JLabel("Last Scorer: N/A");
        label_scorer.setFont(tahoma);
        label_scorer.setHorizontalAlignment(label_scorer.CENTER);
        constraint.fill = GridBagConstraints.BOTH;
        constraint.weightx = 1;
        constraint.weighty = 1;
        constraint.gridwidth = 1;
        constraint.gridheight = 1;
        constraint.gridx = 1;
        constraint.gridy = 2;
        pane.add(label_scorer, constraint);

        ActionListener actionListener = new ClickActionListener();
        btn_AC_Milan.addActionListener(actionListener);
        btn_Real_Madrid.addActionListener(actionListener);
    }

    private static void ShowGUI() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        buildPanelContent(frame.getContentPane());

        frame.pack();
        frame.setSize(480, 360);
        frame.setResizable(true);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(FootballFrame::ShowGUI);
    }

    public static class ClickActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            label_scorer.setText(e.getActionCommand());
            if (e.getSource() == btn_AC_Milan) {
                label_result.setText("Result: " + ++counter_AC_Milan + " X " + counter_Real_Madrid);
            } else if (e.getSource() == btn_Real_Madrid) {
                label_result.setText("Result: " + counter_AC_Milan + " X " + ++counter_Real_Madrid);
            }
            if (counter_AC_Milan > counter_Real_Madrid) {
                label_winner.setText("Winner: AC Milan");
            } else if (counter_AC_Milan < counter_Real_Madrid) {
                label_winner.setText("Winner: Real Madrid");
            } else {
                label_winner.setText("Winner: DRAW");
            }
        }

    }
}
