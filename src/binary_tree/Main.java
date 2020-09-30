package binary_tree;

import javax.swing.*;

public class Main {


    public static void main(String[] args) {
        // TODO code application logic here
        Binary_Tree teste = new Binary_Tree();
        Node nod1 = new Node();
        Node nod2 = new Node();
        Node nod3 = new Node();
        Node nod4 = new Node();
        Node nod5 = new Node();
        Node nod6 = new Node();
        Node nod7 = new Node();

        teste.addNodeFather(nod1);
        teste.addNodeLeft(nod1, nod2);
        teste.addNodeRight(nod1, nod3);
        teste.addNodeLeft(nod2, nod4);
        teste.addNodeRight(nod2, nod5);
        teste.addNodeLeft(nod3, nod6);
        teste.addNodeRight(nod3, nod7);


        System.out.println("Grau do nó: " + teste.grauNo(nod2));
        System.out.println("Profundidade: " + teste.profundidadeNo(nod2));
        System.out.println("Altura do nó: " + teste.alturaNo(nod2));
        System.out.println("Nivel do nó: " + teste.nivelNo(nod2));
        System.out.println("Quantidade de nós: " + teste.qtdNo(nod2));



        // teste.nivelNo(nod);
        // Node lef = nod.leftnode;
        //teste.addNodeRight(3, lef);

        //   teste.profundidadeNo(lef);
        //  System.out.println("profundidade: \t" + teste.profundidadeNo(lef));

//            teste.addNodeLeft(4, lef);
        //  System.out.println("grau do nó: \t" + teste.grauNo(lef));
        //   System.out.println("nivel do nó: \t" + teste.nivelNo(lef));
//        System.out.println(nod.getValue());
//        System.out.println(nod.leftnode.getValue());
//        System.out.println(nod.rightnode.getValue());
//        System.out.println(lef.rightnode.getValue());
//        System.out.println(lef.leftnode.getValue());
    }
}