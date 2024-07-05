import javax.swing.*;
import java.sql.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Jframe frame = new JFrame("Mi calculadora");
        frame.setContentPanel(new form1().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,200);
        frame.pack();
        frame.setVisible(true);
    }
}