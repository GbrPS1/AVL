package testavl;

// A classe Pilha implementa uma pilha dinâmica encadeada 

class Pilha implements TAD_Pilha { 

        private Node topo = null;
	
        public Pilha() {      
            topo = null;
        }        
        
        public boolean isEmpty() { //verifica se a pilha está vazia
            return (topo == null);
            // ou também:
            //    if(topo == null) return true; else return false;
        }
                
        public Node push(Object x ) {
            try {  
                    if(x == null) return null; //não permitimos novo objeto nulo
                    Node novo = new Node(); //alocamos memória para um novo nodo
                    novo.setValue(x); // atribuímos valor para o novo nó                   
                    novo.setNext(topo); // no caso de pilha vazia (topo == null) também funciona   
                    topo = novo;
                    return novo;
            } catch(Exception ex) {
                    return null;  // memória insuficiente
            }            
        }

        public Object pop() {
            if (topo == null) return null; // se a pilha estiver vazia retornamos null
            Object valor = topo.getValue();
            Node temp = topo;  // isto é opcional
            topo = topo.getNext(); // avançar o topo para o próximo da pilha
            temp = null;  // isto é opcional
            return valor;  // retornamos o valor do elemento que estava no topo
        }

        public Object top() { // retornamos o valor no topo, sem eliminá-lo
            if(topo == null) return null; else return topo.getValue();
            // ou:  if(isEmpty()) return null; else return topo.getValue();
        }
        
        public String toString() { 
            //Este método retorna os itens guardados na pilha, com a convenção p: [ a, b, c, topo ]
            if( !isEmpty() ) {
              String resp = "";
              Node aux = topo;
              while(aux!=null) {            
                resp = aux.getValue().toString() + resp;
                aux = aux.getNext();
                if(aux != null)resp = ", " + resp;
              }
              return ( "p: [ " + resp + " ]"  );
            }
            else return (  "p: [ ]"  );           
        }
        
        public String toString_v02() { 
            /*
                Este método retorna os itens guardados na pilha, com a convenção 
                p: [ 
                    a
                    b
                    c
                    topo
                ]
            
                Mais apropiado para retornar objetos em diferentes linhas, com \n
            */
            if( !isEmpty() ) {
              String resp = "";
              Node aux = topo;
              while(aux!=null) {            
                resp = aux.getValue().toString() + "\n" + resp;
                aux = aux.getNext();
              }
              return ("p: [\n" + resp + " ]");
            }
            else return (  "p: [ ]"  );           
        }        
        
}

