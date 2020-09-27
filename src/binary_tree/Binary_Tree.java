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

    public int grauNo(Node no){
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

    public void alturaNo(Node no){
        //numero de descendentes
    }

    public void qtdNo(){

    }

}
