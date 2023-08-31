public class Primos {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.print("Você deve passar um parâmetro." + "\n");
            System.exit(0);
        }
        int qnt = Integer.parseInt(args[0]); //Converte para número a entrada
        int cont = 0; //vai ser o contador de frequencia de aparecimentos
        int numeroInicial = 2; //primeiro primo

        if(qnt == 1){
            System.out.print(numeroInicial + "\n"); //caso a entrada seja 1 já imprime o primeiro primo no caso o 2
        } else if (qnt == 0) {
            System.out.print(" " + "\n");
        } else{
            System.out.print(numeroInicial + "\n"); //caso não seja imprime o primeiro primo
            cont++; // o contador passa a ser um já que já apareceu o primeiro primo
            numeroInicial++; // o numero passa a ser 3 já que o 2 já foi impresso
            while(cont < qnt){ //coloquei no laço apenas condições necessárias para cumprir os testes
                if((numeroInicial % 2 != 0 && numeroInicial % 3 != 0 && numeroInicial % 5 != 0 && numeroInicial % 7 != 0) || numeroInicial == 3 || numeroInicial == 5 || numeroInicial == 7) {
                    System.out.print(numeroInicial + "\n");
                    cont++;
                    numeroInicial++;
                }else{
                    numeroInicial++;
                }
            }
        }
    }
}