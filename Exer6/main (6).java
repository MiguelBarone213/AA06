package AAF;

import javax.swing.*;

public class main {

    public static void main(String[] args) {
        while (true) {
            String input = JOptionPane.showInputDialog("Digite o número de horas trabalhadas (N):");
            
            if (input == null) {
                break;
            }

            int N = Integer.parseInt(input);
            int D = 0;
            int E = 0;

            if (N > 50) {
                int horasExcedentes = N - 50;
                E = horasExcedentes * 20;
                D = (50 * 10) + E;
            } else {
                E = 0;
                D = N * 10;
            }

            JOptionPane.showMessageDialog(null, "Salário Total: R$ " + D);
            JOptionPane.showMessageDialog(null, "Salário Excedente: R$ " + E);

            String resposta = JOptionPane.showInputDialog("Deseja encerrar o programa? (Digite 'S' para sim)");
            
            if ("S".equalsIgnoreCase(resposta)) {
                break;
            }
        }
    }
}