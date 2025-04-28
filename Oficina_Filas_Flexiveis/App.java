









public class App {
      public static void main(String[] args) {
        
      Fila<Integer> fila = new Fila();
      fila.enfileirar(3);
      fila.enfileirar(4);
      fila.enfileirar(1);
      fila.enfileirar(5);
      
      fila.desenfileirar();
      fila.desenfileirar();
      fila.imprimir();
      
      
      Fila<Pedido> pedidosCadastrados = new Fila<>();
      
      for(Celula i = pedidosCadastrados.frente.getProximo(); i!= null; i = i.getProximo() ){
            
            pedidosCadastrados.enfileirar(null);
            pedidosCadastrados.imprimir();
            

      }
         
       
       
      }    


}
