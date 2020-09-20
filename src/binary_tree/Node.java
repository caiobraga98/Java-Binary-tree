
package binary_tree;


public class Node {
    String name;
    Node leftnode,rightnode,fatherNode;

    public Node() {
        //construtor para um nó pai
    }
     
    public Node(String name, Node fatherNode) {
        //construtor para um nó filho
        this.name = name;
        this.fatherNode = fatherNode;
    }

    public boolean hasLeftChld(){
        if (leftnode != null){
            return true;
        }else{
            return false;
        }
    }
    public boolean hasRightChld(){
        if (rightnode != null){
            return true;
        }else{
            return false;
        }
    }
    
    
}
