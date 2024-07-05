import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.sql.*;
import java.util.Scanner;


public class form1 {
    public Object mainPanel;
    public JButton button1;
    public JPanel panel1;
    public Label nombreTxt;

    public form1() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String url = "jdbc:mysql://localhost:3306/estudiantes";
                String user = "root";
                String password = "**";

                try (Connection connection = DriverManager.getConnection(url, user, password)) {
                    System.out.println("Conectando a la base de datos");
                    String query = "select * from estudiante";
                    Statement statement = connection.createStatement();
                    ResultSet resultSet = statement.executeQuery(query);
                    while(resultSet.next()){
                        System.out.println(resultSet.getString("nombre"));
                        nombreTxt.setText(resultSet.getString("nombre"));
                    }
                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }

            }
        });
    }
}