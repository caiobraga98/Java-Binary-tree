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

        teste.addNodeFather(nod1);
        teste.addNodeLeft(nod1, nod2);
        teste.addNodeRight(nod1, nod3);
        //teste.addNodeRight(nod3, nod4);

        teste.alturaNo(nod1);

        //teste.addNodeLeft(1, nod);
        //teste.addNodeRight(2, nod);

        //    System.out.println(teste.grauNo(nod1));
        //    System.out.print(teste.profundidadeNo(nod1));
        System.out.print(teste.alturaNo(nod1));

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