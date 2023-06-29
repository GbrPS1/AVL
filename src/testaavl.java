import testavl.AVL;

public class testaavl {

    public static void main(String[] args) {
        

        System.out.println("exercicio 1: ***********************");
       AVL abb1 = new AVL();
    
        abb1.insereAVL(30);
        abb1.insereAVL(22);
        abb1.insereAVL(50);
       abb1.insereAVL(10);
       abb1.insereAVL(27);
       abb1.insereAVL(47);
       abb1.insereAVL(54);
      abb1.insereAVL(5);
       abb1.insereAVL(16);
       abb1.insereAVL(25);
      abb1.insereAVL(42);
      abb1.insereAVL(57);
       abb1.insereAVL(13);
       abb1.insereAVL(20);
       abb1.insereAVL(44);
       
        System.out.println("\npos ordem");
        abb1.posOrdem();
       
    
  
 
    }
  
}
