package binary_tree;

public class Binary_Tree {

    private Node upfather;

    public void addNodeLeft(int value,Node pai){
        Node aux;
        if(pai.hasLeftChld() == true){
            System.out.println("impossivel remover pois esse nó possui "+pai.getValue()+ "como filhe esquerdo.");
        }else{
            aux = new Node(value,pai);
        }

    }
    public void addnoderight(int value,Node pai){
        Node aux;
        if(pai.hasRightChld() == true){
            System.out.println("impossivel remover pois esse nó possui "+pai.getValue()+ "como filhe direito.");
        }else{
            aux = new Node(value,pai);
        }
    }

    public void addNodeFather(Node no){
        if (upfather == null){
            upfather = no;
            System.out.println("Nó inicial adcionado!");
        }
    }


}
