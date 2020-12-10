
import javax.swing.*;
import javax.swing.text.*;
import javax.swing.event.*;
import java.awt.*;

class SudokuPlayer extends JFrame {

    public SudokuPlayer(String start, String solution) {
        sudoku = new Sudoku(start);
        setSize(300, 350);
        setTitle("Sudoku");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel grid = new JPanel();
        grid.setLayout(new GridLayout(3, 3));
        add(grid, BorderLayout.CENTER);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                JPanel subgrid = new JPanel();
                subgrid.setLayout(new GridLayout(3, 3));
                for (int i2 = 0; i2 < 3; i2++) {
                    for (int j2 = 0; j2 < 3; j2++) {
                        char preset = sudoku.getSquare(i * 3 + i2, j * 3 + j2);
                        JTextField tf = new JTextField();
                        tf.setHorizontalAlignment(SwingConstants.CENTER);
                        if (preset != ' ') {
                            tf.setEditable(false);
                            tf.setText("" + preset);
                        } else {
                            GridListener listener = new GridListener(i * 3 + i2, j * 3 + j2);
                            tf.getDocument().addDocumentListener(listener);
                        }
                        subgrid.add(tf);
                    }
                }
                grid.add(subgrid);
            }
        }

        statusLabel = new JLabel("Welcome to Sudoku!");
        statusLabel.setHorizontalAlignment(SwingConstants.CENTER);
        add(statusLabel, BorderLayout.SOUTH);

    }

    private final Sudoku sudoku;
    private final JLabel statusLabel;

    class GridListener implements DocumentListener {

        private int row;
        private int col;

        public GridListener(int row, int col) {
            this.row = row;
            this.col = col;
        }

        public void changedUpdate(DocumentEvent e) {
            updateSudoku(e);
        }

        public void insertUpdate(DocumentEvent e) {
            updateSudoku(e);
        }

        public void removeUpdate(DocumentEvent e) {
            updateSudoku(e);
        }

        private void updateSudoku(DocumentEvent e) {
            Document document = e.getDocument();
            char val;
            if (document.getLength() == 0) {
                val = ' ';
            } else {
                try {
                    val = document.getText(0, 1).charAt(0);
                } catch (BadLocationException ex) {
                    // If I can't get character one, that means we are empty
                    val = ' ';
                }
            }

            sudoku.setSquare(row, col, val);
            if (sudoku.isSolved()) {
                statusLabel.setText("Congratulations!");
            } else if (sudoku.isValid()) {
                statusLabel.setText(" ");
            } else {
                statusLabel.setText("Invalid solution!");
            }
        }
    }

    public static void main(String[] args) {
        String solution = "";
        solution += "435269781\n";
        solution += "682571493\n";
        solution += "197834562\n";
        solution += "826195347\n";
        solution += "374682915\n";
        solution += "951743628\n";
        solution += "519326874\n";
        solution += "248957136\n";
        solution += "763418259\n";

        String start = "";
        start += " 8 2 7 1\n";
        start += " 6 2 8 1\n";
        start += " 4 7 42\n";
        start += " 2 73 1\n";
        start += " 9 7 31\n";
        start += " 5 617 1\n";
        start += " 6 7 21\n";
        start += "218 7 31\n";
        start += "62 6 73 1\n";
        SudokuPlayer player = new SudokuPlayer(start, solution);
        player.setVisible(true);

    }
}
