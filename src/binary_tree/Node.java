
package binary_tree;


import java.awt.*;

public class Node {
    int value;
    int altura;
    String cor;
    Node leftnode,rightnode,fatherNode;

    public Node() {
        //construtor para um nó pai
    }
     
    public Node(int value, Node fatherNode) {
        //construtor para um nó filho
        this.value = value;
        this.fatherNode = fatherNode;
    }

    public Node(int value, int altura, Node leftnode, Node rightnode, Node fatherNode) {
        this.value = value;
        this.altura = altura;
        this.leftnode = leftnode;
        this.rightnode = rightnode;
        this.fatherNode = fatherNode;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public boolean hasFather() { return fatherNode != null; }
    public boolean hasLeftChld(){return leftnode != null; }
    public boolean hasRightChld(){return rightnode != null; }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getLeftnode() {
        return leftnode;
    }

    public void setLeftnode(Node leftnode) {
        this.leftnode = leftnode;
    }

    public Node getRightnode() {
        return rightnode;
    }

    public void setRightnode(Node rightnode) {
        this.rightnode = rightnode;
    }

    public Node getFatherNode() {
        return fatherNode;
    }

    public void setFatherNode(Node fatherNode) {
        this.fatherNode = fatherNode;
    }

    //metodos Black RED


    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}
