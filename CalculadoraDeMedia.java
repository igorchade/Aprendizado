import javax.swing.JOptionPane;

public class CalculadoraDeMedia {
        public static void main(String[] args) {
        Float np1, np2, pim, media;
        String np1Aux, np2Aux, pimAux, nome, matricula;

        nome=JOptionPane.showInputDialog("Insira o nome do aluno.");
        matricula=JOptionPane.showInputDialog("Insira a matrícula do aluno.");
        np1Aux=JOptionPane.showInputDialog("Insira a nota da NP1 do aluno.");
        np2Aux=JOptionPane.showInputDialog("Insira a nota da NP2 do aluno.");
        pimAux=JOptionPane.showInputDialog("Insira a nota do PIM do aluno.");
        np1 = Float.parseFloat(np1Aux);
        np2 = Float.parseFloat(np2Aux);
        pim = Float.parseFloat(pimAux);

        media = (((np1 * 4)+(np2 * 4))+(pim * 2)) / 10;

        if (media >= 4.75) {
            JOptionPane.showMessageDialog(null, "A media do aluno é: "+media+ " e o aluno está APROVADO.");
        } else {
            JOptionPane.showMessageDialog(null, "A media do aluno é: "+media+ " e o aluno está REPROVADO.");
        }
    }
}