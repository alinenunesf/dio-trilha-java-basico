public class ResultadoEscolar {
    public static void main(String[] args) {
        int nota = 4;
        System.out.println("Sua nota: " + nota);

        if (nota >= 9)
            System.out.println("Parabéns! Aprovado");

        else if (nota >= 7 && nota < 9)
            System.out.println("Aprovado");

        else if (nota >= 5 && nota < 7)
                System.out.println("Recuperação");    

        else
            System.out.println("Reprovado");

            

    }
}
