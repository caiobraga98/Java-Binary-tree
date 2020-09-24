package binary_tree;

public class Binary_Tree {

    private Node pai;

    public void addNodeLeft(int value,Node pai){
        Node aux;
        if(pai.hasLeftChld() == true){
            System.out.println("impossivel adcionar pois esse nó possui "+pai.getValue()+ "como filho esquerdo.");
        }else{
            aux = new Node(value,pai);
            pai.setLeftnode(aux);
            aux.setFatherNode(pai);
        }

    }
    public void addNodeRight(int value,Node pai){
        Node aux;
        if(pai.hasRightChld() == true){
            System.out.println("impossivel adcionar pois esse nó possui "+pai.getValue()+ "como filho direito.");
        }else{
            aux = new Node(value,pai);
            pai.setRightnode(aux);
            aux.setFatherNode(pai);
        }
    }

    public void addNodeFather(Node no){
        if (pai == null){
            pai = no;
            System.out.println("Nó inicial adcionado!");
        }
    }

    public void profundidadeNo(Node no){
//numero de ancestrais
    }
    public void alturaNo(Node no){
//numero de descendentes
    }
    public void grauNo(Node no){

    }
    public void qtdNo(){

    }

}
