public class Operadores {
    public static void main (String [] args){

    // Atribuiçao: simbolo de igualdade = 
        String nome = "Aline";
        int idade = 27;
        double peso = 63.5;
        char sexo = 'F';
        boolean doadorOrgao = true;
        Date dataNascimento = new Date ();

    // Artiméticos: realizar operações matemaricas
        double soma = 10.5 + 15.7;
        int subtracao = 113 - 25;
        int multiplicacao = 20 * 7;
        int divisao = 15 / 3;
        int modulo = 18 % 3;
        double resultado = (10 * 7) + (20 / 4);

    // Unários: incremento, decremento, inversao de valores
        int numero = 5;
		
    // Imprimindo o numero negativo
    System.out.println(- numero);
        
    // Incrementando numero em mais 1 numero, imprime 6
        numero ++;
     System.out.println(numero);
        
    // Ordem de precedencia conta aqui
     System.out.println(++ numero);

    // Decremento
     System.out.println (-- numero);
        
    // Inverter valor booleano
        boolean variavel = true;
        
     System.out.println("Inverteu " + !variavel);

    // Ternário: ?: (lembra o if)
        int a, b;
        a = 5;
        b = 6;
        
        String resultado = (a==b) ? "verdadeiro" : "false";

    System.out.println(resultado);

    // Relacionais: relaçao entre duas variaveis ou expressoes
    int numero1 = 1;
    int numero2 = 2;

        if(numero1 > numero2)
	System.out.print("Numero 1 maior que numero 2");

        if(numero1 < numero2)
	System.out.print("Numero 1 menor que numero 2");

        if(numero1 >= numero2)
	System.out.print("Numero 1 maior ou igual que numero 2");

        if(numero1 <= numero2)
	System.out.print("Numero 1 menor ou igual que numero 2");

        if(numero1 != numero2)
	System.out.print("Numero 1 é diferente de numero 2");
    
    // Equals: compara dois objetos ou textos.
        String nomeUm = "Aline";
        String nomeDois = new string ("Amanda");
    System.out.println(nomeUm.equals(nomedois));

    // Lógicos (e / ou)
        boolean condicao1=true;
        boolean condicao2=false;
    
    // Aqui estamos utilizando o operador lógico E para fazer a união de duas expressões. É como se estivesse escrito: 
    //"Se Condicao1 e Condicao2 forem verdadeiras, executar código"

        if(condicao1 && condicao2){
    System.out.print("Os dois valores precisam ser verdadeiros");
        }
    
    //Se condicao1 OU condicao2 for verdadeira, executar código.
        if(condicao1 || condicao2){
    System.out.print("Um dos valores precisa ser verdadeiro");
        }
    



        } 
}
