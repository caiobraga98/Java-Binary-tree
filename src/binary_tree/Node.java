
package binary_tree;


public class Node {
    int value;
    Node leftnode,rightnode,fatherNode;

    public Node() {
        //construtor para um nó pai
    }
     
    public Node(int value, Node fatherNode) {
        //construtor para um nó filho
        this.value = value;
        this.fatherNode = fatherNode;
    }

    public boolean hasLeftChld(){
        return leftnode != null;
    }
    public boolean hasRightChld(){
        return rightnode != null;
    }

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
}
