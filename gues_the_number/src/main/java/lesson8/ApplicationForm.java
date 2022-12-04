package lesson8;

import lesson8.listeners.Button.ButtonListener;
import lesson8.listeners.Button.ClearFieldButtonListener;
import lesson8.listeners.Button.СalculationsListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class ApplicationForm extends JFrame {
private JTextField inputFiled;

    public ApplicationForm(String title) {
        super(title);
        setBounds(1000,700,250,370);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setAlwaysOnTop(true);


        setJMenuBar(createMenu());

        setLayout(new BorderLayout());

       // add(new Button("Кнопка"), BorderLayout.WEST);
        add(createTopPanel(), BorderLayout.NORTH);
        
        add(createCenterPanel(), BorderLayout.CENTER);


        setVisible(true);
    }


    private JMenuBar createMenu() {
        JMenuBar menuBar = new JMenuBar();

        JMenu menuFile= new JMenu("File");
        menuFile.add(new JMenuItem("Clear"));
        menuFile.add(new JMenuItem("Exit"));
        menuBar.add(menuFile);

        menuBar.add(new JMenuItem("Help"));
        menuBar.add(new JMenuItem("About"));
        menuBar.add(new JMenuItem("Exit"));

        return menuBar;
    }
    private JPanel createCenterPanel() {
        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new BorderLayout());

        ActionListener buttonListener = new ButtonListener(inputFiled);

        centerPanel.add(createDigitsPanel(buttonListener),BorderLayout.CENTER);
        centerPanel.add(createOperatorsPanel(buttonListener),BorderLayout.WEST);
        return centerPanel;
    }

    private JPanel createTopPanel() {
        JPanel top = new JPanel();
        top.setLayout(new BorderLayout());
        inputFiled = new JTextField();
        inputFiled.setEditable(false);
        top.add(inputFiled);

        inputFiled.setFont(new Font("Arial", Font.PLAIN, 25));
        inputFiled.setMargin(new Insets(8, 0, 8, 0));
        inputFiled.setBackground(new Color(168, 225, 171,255));
        //inputFiled.setText("(1+2)");

        return top;
    }


    private JPanel createDigitsPanel(ActionListener buttonListener) {
        JPanel digitsPanel = new JPanel();

        digitsPanel.setLayout(new GridLayout(4, 3));

        for (int i = 0; i<10; i++) {
            String buttonTitle = (i == 9) ? "0" : String.valueOf(i+1);
            JButton btn = new JButton(buttonTitle);
            btn.addActionListener(buttonListener);
            digitsPanel.add(btn);
        }
        JButton calc = new JButton("=");
        digitsPanel.add(calc);
        calc.addActionListener(new СalculationsListener(inputFiled));
       // calc.setEnabled(false);

        JButton clear = new JButton("C");
        clear.addActionListener(new ClearFieldButtonListener(inputFiled));
        digitsPanel.add(clear);


        return digitsPanel;
    }
    private JPanel createOperatorsPanel(ActionListener buttonListener) {
      JPanel panel = new JPanel();
      panel.setLayout(new GridLayout(4, 1));

        JButton minus = new JButton("-");
        minus.addActionListener(buttonListener);
        panel.add(minus);

        JButton plus = new JButton("+");
        plus.addActionListener(buttonListener);
        panel.add(plus);

        JButton multiply = new JButton("x");
        multiply.addActionListener(buttonListener);
        panel.add(multiply);

        JButton devide = new JButton("/");
        devide.addActionListener(buttonListener);
        panel.add(devide);

        return panel;
    }
}
