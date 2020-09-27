package binary_tree;

public class Main {


    public static void main(String[] args) {
        // TODO code application logic here
        Binary_Tree teste = new Binary_Tree();
        Node nod = new Node();
        teste.addNodeFather(nod);
        teste.addNodeLeft(1, nod);
        teste.addNodeRight(2, nod);

        teste.grauNo(nod);

        Node lef = nod.leftnode;
        teste.addNodeRight(3, lef);

            teste.profundidadeNo(lef);
            System.out.println(teste.profundidadeNo(lef.getRightnode()));

//            teste.addNodeLeft(4, lef);
//            System.out.println(teste.grauNo(nod));
//        System.out.println(nod.getValue());
//        System.out.println(nod.leftnode.getValue());
//        System.out.println(nod.rightnode.getValue());
//        System.out.println(lef.rightnode.getValue());
//        System.out.println(lef.leftnode.getValue());
    }
}