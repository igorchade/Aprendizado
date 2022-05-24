public class ExercicioDiaUtil {
    public static void main(String[] args) {
        byte dia = 7;
        String diaDaSemana = "nenhum";

        switch (dia) {
            case 1:
                diaDaSemana = "Domingo";
                break;
            case 2:
                diaDaSemana = "Segunda";
                break;
            case 3:
                diaDaSemana = "Terça";
                break;
            case 4:
                diaDaSemana = "Quarta";
                break;
            case 5:
                diaDaSemana = "Quinta";
                break;
            case 6:
                diaDaSemana = "Sexta";
                break;
            case 7:
                diaDaSemana = "Sábado";
                break;
        }

        System.out.println(diaDaSemana);

        switch (diaDaSemana) {
            case "Domingo":
                System.out.println("Final de semana");
                break;
            case "Sábado":
                System.out.println("Final de semana");
                break;
            default:
                System.out.println("Dia útil");
                break;
        }
    }
}
