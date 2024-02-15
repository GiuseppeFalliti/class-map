import javax.swing.*;
import java.awt.*;

public class Mappa extends JFrame {
    private Container cp;
    private JPanel mainPanel;
    private int studNum = 1;

    public Mappa() {
        setTitle("Mappa della classe");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        cp = getContentPane();
        mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(7, 5, 15, 20));
        mainPanel.setPreferredSize(new Dimension(800, 400));

        for (int i = 0; i < 35; i++) {
            JLabel studente;
            if (i == 1 || i==2 || i==3 || i==4) {
                studente = new JLabel();

            } else {
                studente = new JLabel("Studente " + studNum);
                studente.setBorder(BorderFactory.createLineBorder(Color.BLACK));
                studNum++;
            }
            
            mainPanel.add(studente);
        }

        cp.add(mainPanel);
        pack();
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Mappa schoolMap = new Mappa();
            schoolMap.setVisible(true);
        });
    }
}
