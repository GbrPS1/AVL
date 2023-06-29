package testavl;

import javax.swing.JOptionPane;

public class Pilha1 {

    public static void main(String[] args) {
        new Pilha1();
    }

    public Pilha1() {
        Pilha pilha = new Pilha();
        Object[] n = new Object[4];
        
        String[] n2 = new String[4];

        for (int i = 0; i < n.length; i++) {
            n[i] = JOptionPane.showInputDialog(null, "Informe o nome do trabalhador: ", "Trabalhadores", JOptionPane.INFORMATION_MESSAGE);
            pilha.push(n[i].toString());
        }
        if (pilha.isEmpty()) {
            System.out.println("A pilha está vazia");
        }

        JOptionPane.showMessageDialog(null, "Trabalhadores armazemados: " + pilha.toString(), "Trabalhadores", JOptionPane.INFORMATION_MESSAGE);

        if (!pilha.isEmpty()) {
            System.out.println("A pilha não está vazia\n");
        }

        System.out.println("O valor no topo da pilha é " + pilha.top());
        System.out.println("O conteúdo da pila é " + pilha.toString() + "\n");
        int i = 1;
        
        while (!pilha.isEmpty()) {
            System.out.println(i + "º removido: " + pilha.top());
           

            JOptionPane.showMessageDialog(null, "Trabalhador removido " + pilha.pop().toString(), "INFORMATIVO", JOptionPane.INFORMATION_MESSAGE);
            i++;
            

        }
        
    
        bubbleSort_v04(n2);
        System.out.println("Vetor ordenado:");
        
        visualizar(n2);
    }

    public boolean bubbleSort_v04(String vetor[]) {
        if (vetor == null) {
            return false;
        }

        for (int i = 0; i < vetor.length - 1; i++) {
            int trocas = 0;
            for (int j = 0; j < vetor.length - 1 - i; j++) {

                if (vetor[j].compareTo(vetor[j + 1]) > 0) {
                    String tmp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = tmp;
                    trocas++;
                }
            }
            if (trocas == 0) {
                break;
            }
        }
        return true;

    }

    public void visualizar(String vetor[]) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + "   ");
        }
    }
}
