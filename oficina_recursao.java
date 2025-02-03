import java.util.Scanner;

public class App {
    
     public static int somaPares(int limite){
        if(limite == 0){
            return 0;
        } else if(limite % 2 == 0){
            return limite + somaPares(limite - 1);
        } else {
        return 0 + somaPares(limite - 1);
        }
    }

    public static double somaElementos(double[] v, int i){
        if(i < 0){
            return 0;
        } else {
            return v[i] + somaElementos(v, i - 1);
        }

    }
    
    public static void main(String[] args) throws Exception {
        
      
        
        
        
        
        
        
        
      
        Scanner leitor = new Scanner(System.in);
        int op;

        

        
        do {                            
        System.out.println("Escolher uma opção!");
        System.out.println("1- Para somar todos os numeros pares até um limite ");
        System.out.println("2- Para somar todos os numeros double dentro de um array");
        System.out.println("3- Para verificar quantas vezes o número repete dentro de um array");
        System.out.println("4- Sair do programa");
        op = leitor.nextInt();
        
       
         switch (op) {
            case 1:
            
            System.out.println("Digite o limite de números pares");
            int limite = leitor.nextInt();
            System.out.println("Resultado: " + somaPares(limite));
                break;

            case 2:
            System.out.println("Opção 2 selecionada");
                break;

            case 3:
            System.out.println("Opção 3 selecionada");
                break;
            
            case 4:
            System.out.println("Saindo...");
            break;
         }
         }   
         while (op != 4);



        

    
}
}

