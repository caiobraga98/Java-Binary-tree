package binary_tree;

import javax.swing.*;
import java.awt.*;

public class Main {

// https://medium.com/@luksrn/red-black-tree-estrutura-de-dados-4e13dda71280

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

        teste.addNode(50, nod1, "RED");
        teste.addNode(40, nod2, "RED");
        teste.addNode(60, nod3, "RED");
        teste.addNode(45, nod4, "BLACK");
        teste.addNode(65, nod5, "BLACK");
        teste.addNode(39, nod6, "BLACK");
        teste.addNode(59, nod7, "BLACK");

        System.out.println("\n Pre Ordem ");
        teste.preOrdem(nod1);

//        teste.addNodeFather(8, nod1, "black");           // F
//
//        teste.addNodeLeft(3, "RED", nod1, nod2);       // B
//        teste.addNodeRight(10, "RED", nod1, nod3);     // G
//
//        teste.addNodeLeft(1, "BLACK", nod2, nod4);       // A
//        teste.addNodeRight(6, "BLACK", nod2, nod5);      // D
//        teste.addNodeRight(14, "BLACK", nod3, nod6);    // I
//
//        teste.addNodeLeft(4, Color.BLACK, nod5, nod7);       // C
//        teste.addNodeRight(7, Color.BLACK, nod5, nod8);     // E
//        teste.addNodeLeft(13, Color.BLACK, nod6, nod9);      // H


        //System.out.println("Grau do nó: " + teste.grauNo(nod1));
        //System.out.println("Profundidade: " + teste.profundidadeNo(nod1));
        //System.out.println("Altura do nó: " + teste.alturaNo(nod1));
        //System.out.println("Nivel do nó: " + teste.nivelNo(nod1));

//        Node nod11 = new Node();
//        Node nod12 = new Node();
//        Node nod13 = new Node();
//        teste.addNodeFather(10, nod11);
//        teste.addNodeLeft(5, nod11, nod12);
//        teste.addNodeRight(15, nod11, nod13);
//
//        Node nod14 = new Node();
//        Node nod15 = new Node();
//        Node nod16 = new Node();
//        teste.addNodeFather(10, nod14);
//        teste.addNodeLeft(5, nod14, nod15);
//        teste.addNodeRight(15, nod14, nod16);
//
//        teste.ehSimilar(nod11, nod14);

//        System.out.println("\n Pre Ordem ");
//        teste.preOrdem(nod1);
//        System.out.println("Quantidade de nós: " + teste.qtdNo(nod1));
//        teste.removerNoFolha(nod7);
//        System.out.println("\n Pre Ordem ");
//        teste.preOrdem(nod1);
//        System.out.println("Quantidade de nós: " + teste.qtdNo(nod1));
//        teste.removerNo(nod3);
//        System.out.println("\n Pre Ordem ");
//        teste.preOrdem(nod1);
//        System.out.println("Quantidade de nós: " + teste.qtdNo(nod1));

//        System.out.println("\n Pre Ordem ");
//        teste.preOrdem(nod1);
//        System.out.println("\n Pos Ordem ");
//        teste.posOrdem(nod1);
//        System.out.println("\n Em Ordem ");
//        teste.inOrdem(nod1);
//
//        teste.inverterArvore(nod1);


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