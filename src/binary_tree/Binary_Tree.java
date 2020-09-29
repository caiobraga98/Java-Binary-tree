package binary_tree;

import static java.lang.Integer.max;

public class Binary_Tree {

    private Node pai;

    public void addNodeLeft(Node pai, Node filho) {
        Node aux;
        if (pai.hasLeftChld() == true) {
            System.out.println("impossivel adcionar pois esse nó possui " + pai.getValue() + "como filho esquerdo.");
        } else {
            pai.setLeftnode(filho);
            filho.setFatherNode(pai);
        }

    }

    public void addNodeRight(Node pai, Node filha) {
        Node aux;
        if (pai.hasRightChld() == true) {
            System.out.println("impossivel adcionar pois esse nó possui " + pai.getValue() + "como filho direito.");
        } else {
            pai.setRightnode(filha);
            filha.setFatherNode(pai);
        }
    }

    public void addNodeFather(Node no) {
        if (pai == null) {
            pai = no;
            System.out.println("Nó inicial adcionado!");
        }
    }

    public int profundidadeNo(Node no) {
//numero de ancestrais
        int deep = 0;
        Node aux = no;

        while (aux.hasFather() == true) {
            deep++;
            aux = aux.getFatherNode();
        }

        return deep;
    }

    public int grauNo(Node no) {
        int grau = 0;

        if (no.hasRightChld() == true) {
            grau++;
        }
        if (no.hasLeftChld() == true) {
            grau++;
        }
        return grau;

    }

    public int nivelNo(Node no) {
        int lvl = 1;
        Node aux = no;

        while (aux.hasFather() == true) {
            lvl++;
            aux = aux.getFatherNode();
        }

        return lvl;
    }

    public int alturaNo(Node no) {
        //numero de descendentes

//        int[] valor = new int[10];
//        int i = 0;
//        Node aux = new Node();
//        while (aux.value != no.value) {
//            aux = no;
//
//            if (aux.hasLeftChld() == true) {
//                valor[i] = aux.getLeftnode().value;
//                i++;
//                aux = aux.getLeftnode();
//            } else {
//                if (aux.hasRightChld() == true) {
//                    valor[i] = aux.getRightnode().value;
//                    i++;
//                    aux = aux.getRightnode();
//                } else {
//                    aux = aux.getFatherNode();
//                }
//            }
//        }

        if(no == null){
            return 0 ;
        }
        return  1 +  max(alturaNo(no.leftnode), alturaNo(no.rightnode));

    }


    int i;
    Node aux, aux2;

    public void qtdNo() {
        aux = pai;
        if (aux.hasRightChld() == true) {
            i++;
            aux = pai.getRightnode();
            qtdNo();
        } else if (aux.hasLeftChld() == true) {
            i++;
            aux = pai.getLeftnode();
            qtdNo();
        } else {
            System.out.println("a quantidade de nos é " + i);
        }

    }

}
