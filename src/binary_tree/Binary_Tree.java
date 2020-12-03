package binary_tree;

import java.awt.*;

import static java.lang.Integer.max;
import static javax.swing.Spring.height;

public class Binary_Tree {

    private Node raiz;

    public void addNodeLeft(int value, String cor, Node pai, Node filho) {
        if (pai.hasLeftChld() == true) {
            System.out.println("impossivel adcionar pois esse nó possui " + pai.getValue() + "como filho esquerdo.");
        } else {
            pai.setLeftnode(filho);
            filho.setFatherNode(pai);
            filho.setValue(value);
            filho.setCor("RED");
            recolor(filho);
        }

    }

    public void addNodeRight(int value, String cor, Node pai, Node filho) {
        if (pai.hasRightChld() == true) {
            System.out.println("impossivel adcionar pois esse nó possui " + pai.getValue() + "como filho direito.");
        } else {
            pai.setRightnode(filho);
            filho.setFatherNode(pai);
            filho.setValue(value);
            filho.setCor("RED");
            recolor(filho);
        }
    }

    public void addNodeFather(int value, Node no, String cor) {
        if (raiz == null) {
            raiz = no;
            raiz.setCor("BLACK");
            raiz.setValue(value);
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

        if (no == null) {
            return 0;
        }
        return 1 + max(alturaNo(no.leftnode), alturaNo(no.rightnode));

    }

    public int qtdNo(Node no) {

        if (no == null) {
            return 0;
        } else {
            if (no.hasLeftChld() != true && no.hasRightChld() != true) {
                return 1;
            } else {

                return 1 + qtdNo(no.leftnode) + qtdNo(no.rightnode);
            }
        }
    }

    public void removerNoFolha(Node no) {

        if (no.hasRightChld() == false && no.hasLeftChld() == false) {
            Node aux = no.getFatherNode();

            if (aux.getLeftnode() == no) {
                //no = null;

                aux.setLeftnode(null);
            }
            if (aux.getRightnode() == no) {
                //no = null;

                aux.setRightnode(null);
            }
        }
    }

    public void removerNo(Node no) {
        Node aux = no.getFatherNode();
        if (no.hasLeftChld() == true && no.hasRightChld() == false ||
                no.hasLeftChld() == false && no.hasRightChld() == true) {

            if (aux.getLeftnode() == no) {
                //no = null;
                Node filho = no.getLeftnode();

                aux.setLeftnode(filho);
                filho.setFatherNode(aux);
            }
            if (aux.getRightnode() == no) {
                //no = null;
                Node filho = no.getRightnode();

                aux.setRightnode(filho);
                filho.setFatherNode(aux);
            }
        }
    }

    public void preOrdem(Node no) {
        if (no != null) {
            System.out.print(no.getValue() + "," + no.getCor() + " - ");
            preOrdem(no.getLeftnode());
            preOrdem(no.getRightnode());
        }
    }

    public void posOrdem(Node no) {
        if (no != null) {

            posOrdem(no.getLeftnode());
            posOrdem(no.getRightnode());
            System.out.print(no.getValue() + "," + no.getCor() + " - ");
        }
    }

    public void inOrdem(Node no) {
        if (no != null) {

            inOrdem(no.getLeftnode());
            System.out.print(no.getValue() + "," + no.getCor() + " - ");
            inOrdem(no.getRightnode());
        }
    }

    public void inverterArvore(Node no) {

        System.out.println("\n Arvore Original ");
        preOrdem(no);
        Node aux = no.getRightnode();
        no.setRightnode(no.getLeftnode());
        no.setLeftnode(aux);
        System.out.println("\n Arvore invertida ");
        preOrdem(no);
    }

    public boolean ehSimilar(Node raizA, Node raizB) {

        if (raizA == null && raizB == null) {
            System.out.println("É similar");
            return true;
        } else if (raizA == null && raizB != null || raizA != null && raizB == null) {
            System.out.println("Não é similar");
            return false;
        }
        if (raizA.getValue() == raizB.getValue() && ehSimilar(raizA.getRightnode(), raizB.getRightnode()) == true
                && ehSimilar(raizA.getLeftnode(), raizB.getLeftnode()) == true) {
            System.out.println("É similar");
            return true;
        } else
            System.out.println("Não é similar");
        return false;
    }

/////Metodos AVL

    int height(Node N) {
        if (N == null)
            return 0;

        return N.getAltura();
    }

    int getBalance(Node N) {
        if (N == null)
            return 0;

        return height(N.leftnode) - height(N.rightnode);
    }


// Red Black

    public void addNode(int value, Node no, String cor) {

        if (raiz == null) {
            raiz = no;
            raiz.setCor("BLACK");
            raiz.setValue(value);
        } else {
            no.setValue(value);
            no.setCor("RED");
            Node pai = busca(no, raiz);

            if (pai.getValue() > no.getValue()){
                pai.setLeftnode(no);
                no.setFatherNode(pai);
                recolor(no);
            }else {
                pai.setRightnode(no);
                no.setFatherNode(pai);
                recolor(no);
            }
        }
    }

    public Node busca(Node no, Node pai) {

        if (no.getValue() > pai.getValue()) {
            if (pai.hasRightChld()) {
                pai = pai.getRightnode();
                busca(no, pai);
            }
//            else {
//                pai.setRightnode(no);
//                no.setFatherNode(pai);
//            }
        } else if (no.getValue() < pai.getValue()) {
            if (pai.hasLeftChld()) {
                pai = pai.getLeftnode();
                busca(no, pai);
            }
//            else {
//                pai.setLeftnode(no);
//                no.setFatherNode(pai);
//            }
        }
        return pai;
    }

    public void  excluir(Node no){
        busca(no, raiz);

    }


    public void recolor(Node no) {

        Node pai = no.getFatherNode();
        if (no.hasFather() == true && pai.hasFather() == true) {
            Node avo = pai.getFatherNode();
            Node tio;

            if (no.fatherNode == avo.leftnode) {
                tio = avo.rightnode;
            } else {
                tio = avo.leftnode;
            }
            if (tio.getCor() == "RED" && pai.getCor() != "BLACK") {
                tio.setCor("BLACK");
                pai.setCor("BLACK");
                avo.setCor("RED");
                recolor(avo);
            }
        }

    }

    public void rotate(Node no) {

        Node pai = no.getFatherNode();
        Node avo = pai.getFatherNode();
        Node tio;
        if (no.fatherNode == avo.leftnode) {
            tio = avo.rightnode;
        } else {
            tio = avo.leftnode;
        }

        if (tio.getCor() == "BLACK" && pai.getCor() != "BLACK") {

        }
    }
}
