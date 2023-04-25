import java.awt.*;
import javax.swing.*;

public class ChessBoard extends JFrame {
    private JPanel chessBoard;
    private JPanel[][] squares = new JPanel[8][8];

    public ChessBoard() {
        setTitle("Chess Board");
        setSize(600, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

        chessBoard = new JPanel(new GridLayout(8, 8));
        chessBoard.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                squares[i][j] = new JPanel(new BorderLayout());

                if ((i + j) % 2 == 0) {
                    squares[i][j].setBackground(Color.WHITE);
                } else {
                    squares[i][j].setBackground(Color.GRAY);
                }

                chessBoard.add(squares[i][j]);
            }
        }

        add(chessBoard);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ChessBoard();
    }
}
