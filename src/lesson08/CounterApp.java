package lesson08;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class CounterApp extends JFrame {
    private int value;
    private int stepValue = 1;

    public CounterApp(int initialValue) {
        setBounds(500, 500, 300, 120);
        setTitle("Complex Counter");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Font font = new Font("Arial", Font.BOLD, 32);

        JLabel counterValueView = new JLabel();
        counterValueView.setFont(font);
        counterValueView.setHorizontalAlignment(SwingConstants.CENTER);
        add(counterValueView, BorderLayout.CENTER);

        value = initialValue;
        counterValueView.setText(String.valueOf(value));

        JButton decrementButton = new JButton("<");
        decrementButton.setFont(font);
        add(decrementButton, BorderLayout.WEST);

        JButton incrementButton = new JButton(">");
        incrementButton.setFont(font);
        add(incrementButton, BorderLayout.EAST);

        JButton resetButton = new JButton("Сброс");
        incrementButton.setFont(font);
        add(resetButton, BorderLayout.SOUTH);

        JSpinner stepCounter = new JSpinner();
        stepCounter.setValue(stepValue);
        add(stepCounter, BorderLayout.NORTH);

        decrementButton.addActionListener(actionEvent -> {
            value -= stepValue;
            counterValueView.setText(String.valueOf(value));
        });

        incrementButton.addActionListener(actionEvent -> {
            value += stepValue;
            counterValueView.setText(String.valueOf(value));
        });

        resetButton.addActionListener(actionEvent -> {
            value = 0;
            counterValueView.setText(String.valueOf(value));
        });

        stepCounter.addChangeListener(changeEvent -> stepValue = (int) stepCounter.getValue());

        setVisible(true);
    }

    public static void main(String[] args) {
        new CounterApp(0);
    }
}


