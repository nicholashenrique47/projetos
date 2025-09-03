
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;



public class ConversorDeTemperaturaGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Conversor De Temperatura");
        frame.setSize(700,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);

        JLabel escolhaLabel = new JLabel("Escolha A Conversão");
        escolhaLabel.setBounds(50, 20, 200, 25);
        frame.add(escolhaLabel);



        String [] opcoes = {"Celcius Para Fahrenheit" , "Fahrenheit Para Celcius"};

        JComboBox<String> comboBox = new JComboBox<>(opcoes);
        comboBox.setBounds(250, 20, 180, 25);
        frame.add(comboBox);

        JLabel escolhatemp = new JLabel("Temperatura:");
        escolhatemp.setBounds(50, 60, 200, 25);
        frame.add(escolhatemp);

        JTextField digitemp = new JTextField();
        digitemp.setBounds(250, 60, 180, 25);
        frame.add(digitemp);

        JButton botaoconverter = new JButton("Converter");
        botaoconverter.setBounds(250, 100, 120, 30);
        botaoconverter.setForeground(Color.blue);
        botaoconverter.setBackground(Color.GREEN);
        frame.add(botaoconverter);

        JLabel labelresultado = new JLabel("Resultado:");
        labelresultado.setBounds(50, 150, 400, 25);
        frame.add(labelresultado);


        botaoconverter.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
        String escolha = (String) comboBox.getSelectedItem();
        try {
            double Temperatura = Double.parseDouble(digitemp.getText());
            double resultado;

            if (escolha.equals("Celcius Para Fahrenheit")) {
                resultado = (Temperatura * 9 / 5) + 32;
                String formatado = String.format("%.2f", resultado);
                labelresultado.setText ("O Resultado Da Conversão Foi: " + resultado + " °F");
                labelresultado.setForeground(Color.green);
            } else if (escolha.equals("Fahrenheit Para Celcius")) {
                resultado  = (Temperatura - 32) * 5 / 9;
                String formatado = String.format("%.2f", resultado);
                labelresultado.setText("O Resultado Da Conversão Foi: " + formatado + " °C");
                labelresultado.setForeground(Color.green);
            }
        } catch (NumberFormatException ex) {
            labelresultado.setText("Erro!! Digite Um Número Válido.");
            labelresultado.setForeground(Color.red);
        }
    }
});
            
            
            }
            
        
        






    } 
