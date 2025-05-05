public class Aplicacao {
    
    public static void main(String[] args) {
        Pilha <Integer> pilha = new Pilha<>();

       
        pilha.empilhar(6);
        pilha.empilhar(9);
        pilha.empilhar(5); 
        pilha.empilhar(4);//
        
        //System.out.println(pilha.consultarTopo());
        
       

        pilha.subPilha(3);

        //System.out.println(pilha.consultarTopo());
    }


    
}
