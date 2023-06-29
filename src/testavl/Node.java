package testavl;

public class Node {
    private Object value; // valor do nodo
    private Node next;  // enlace, endereço para acessar o próximo item

    public Object getValue() { // retorna o valor do nodo
        return value;
    }

    public void setValue(Object value) { // para alterar o valor do nodo
        this.value = value;
    }

    public Node getNext() { // retorna o endereço do próximo item
        return next;
    }

    public void setNext(Node next) { // para alterar o endereço do nodo
        this.next = next;
    }
}

