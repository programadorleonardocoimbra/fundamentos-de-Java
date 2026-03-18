// Usados para combinar condições. EX: &&, ||, !

//Exercício:
    // Verifique se uma pessoa pode entrar em uma festa (idade ≥ 18 E tem convite):

public class OperadoresLogicos {
    public static void main(String[] args) {

        int idade = 17;
        boolean temConvite = true;

        if ( idade >= 18&& temConvite) {
            System.out.println("Entrada PERMITIDA!");
        } else {
            System.out.println("Entrada NEGADA! X");
        }



    }

    
}
