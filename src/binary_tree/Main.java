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
        Node nod8 = new Node();
        Node nod9 = new Node();

        teste.addNodeFather(8, nod1);
        teste.addNodeLeft(3, nod1, nod2);
        teste.addNodeRight(10, nod1, nod3);
        teste.addNodeLeft(1, nod2, nod4);
        teste.addNodeRight(6, nod2, nod5);
        //teste.addNodeLeft(5, nod3, nod6);
        //teste.addNodeLeft(6, nod3, nod7);

        teste.addNodeRight(14 , nod3, nod6);
        teste.addNodeLeft(4, nod5, nod7);
        teste.addNodeRight(7 , nod5, nod8);
        teste.addNodeLeft(13, nod6, nod9);


        System.out.println("Grau do nó: " + teste.grauNo(nod1));
        System.out.println("Profundidade: " + teste.profundidadeNo(nod1));
        System.out.println("Altura do nó: " + teste.alturaNo(nod1));
        System.out.println("Nivel do nó: " + teste.nivelNo(nod1));
        System.out.println("Quantidade de nós: " + teste.qtdNo(nod1));

        //teste.removerNoFolha(nod7);
        //teste.removerNo(nod3);
        //teste.removerNoDuo(nod3); numsei
        //System.out.println("Quantidade de nós: " + teste.qtdNo(nod1));

        System.out.println("\n Pre Ordem ");
        teste.preOrdem(nod1);
        System.out.println("\n Pos Ordem ");
        teste.posOrdem(nod1);
        System.out.println("\n Em Ordem ");
        teste.inOrdem(nod1);


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