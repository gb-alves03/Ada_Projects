package calcularSalario;

import java.util.Scanner;

public class CalculoSalario {
    double[] salarioBruto = new double[5];
    double descontoInss;
    double impostoRenda;
    double descontos;
    double[] salarioLiquido = new double[salarioBruto.length];

    Scanner input = new Scanner(System.in);
    public void calcularSalario() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Informe o salário bruto do " + (i + 1) + "º funcionário: ");
            salarioBruto[i] = Double.parseDouble(input.nextLine());

            if (salarioBruto[i] <= 1903.98 && salarioBruto[i] <= 1212.00) {
                descontoInss = 0.075;
                impostoRenda = 0;
            } else if ((salarioBruto[i] >= 1212.01 && salarioBruto[i] <= 2427.35) && (salarioBruto[i] >= 1903.99 && salarioBruto[i] <= 2826.65)) {
                descontoInss = 0.09;
                impostoRenda = 0.075;
            } else if ((salarioBruto[i] >= 2427.36 && salarioBruto[i] <= 3641.03) && (salarioBruto[i] >= 2826.66 && salarioBruto[i] <= 3751.05)) {
                descontoInss = 0.12;
                impostoRenda = 0.15;
            } else if ((salarioBruto[i] >= 3641.04 && salarioBruto[i] <= 7087.22) && (salarioBruto[i] >= 3751.06 && salarioBruto[i] <= 4664.68)) {
                descontoInss = 0.14;
                impostoRenda = 0.2250;
            } else if (salarioBruto[i] > 4664.68 && salarioBruto[i] <= 7087.22) {
                descontoInss = 0.14;
                impostoRenda = 0.2750;
            } else {
                impostoRenda = 0.2750;
            }

            descontos = descontoInss + impostoRenda;
            salarioLiquido[i] = salarioBruto[i] - (salarioBruto[i] * descontos);

            System.out.println("Salário Bruto: R$ " + salarioBruto[i]);
            System.out.println("Desconto INSS: " + (descontoInss * 100) + "%");
            System.out.println("Desconto Imposto de Renda: " + (impostoRenda * 100) + "%");
            System.out.println("Salário Líquido: R$ " + Math.round(salarioLiquido[i] * 100.0) / 100.0);
        }
        input.close();
    }
}
