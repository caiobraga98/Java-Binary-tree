package binary_tree;

import java.awt.*;

import static java.lang.Integer.max;
import static javax.swing.Spring.height;

public class Binary_Tree {

    private Node pai;
    private Node raiz;

    public void addNodeLeft(int value, Color cor, Node pai, Node filho) {
        Node aux;
        Node tio;
        if (pai.hasLeftChld() == true) {
            System.out.println("impossivel adcionar pois esse nó possui " + pai.getValue() + "como filho esquerdo.");
        } else {
                pai.setLeftnode(filho);
                filho.setFatherNode(pai);
                filho.setValue(value);
                filho.setCor(Color.RED);
                recolor(filho);
        }

    }

    public void addNodeRight(int value, Color cor, Node pai, Node filha) {
        Node aux;
        if (pai.hasRightChld() == true) {
            System.out.println("impossivel adcionar pois esse nó possui " + pai.getValue() + "como filho direito.");
        } else {
            pai.setRightnode(filha);
            filha.setFatherNode(pai);
            filha.setValue(value);
            filha.setCor(Color.RED);
            recolor(filha);
        }
    }

    public void addNodeFather(int value, Node no, Color cor) {
        if (pai == null) {
            pai = no;
            raiz = pai;
            cor = Color.BLACK;
            pai.setValue(value);
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
            System.out.print(no.getValue() + " - ");
            preOrdem(no.getLeftnode());
            preOrdem(no.getRightnode());
        }
    }

    public void posOrdem(Node no) {
        if (no != null) {

            posOrdem(no.getLeftnode());
            posOrdem(no.getRightnode());
            System.out.print(no.getValue() + " - ");
        }
    }

    public void inOrdem(Node no) {
        if (no != null) {

            inOrdem(no.getLeftnode());
            System.out.print(no.getValue() + " - ");
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


    public void recolor(Node no) {
        Node pai = no.getFatherNode();
        Node avo = pai.getFatherNode();
        Node tio;

        if (no.fatherNode == avo.leftnode) {
            tio = avo.rightnode;
        } else {
            tio = avo.leftnode;
        }
        if (tio.getCor() == Color.RED && pai.getCor() != Color.BLACK) {
            tio.setCor(Color.BLACK);
            pai.setCor(Color.BLACK);
            avo.setCor(Color.RED);
            recolor(avo);
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

        if (tio.getCor() == Color.BLACK && pai.getCor() != Color.BLACK){

        }
    }
}
