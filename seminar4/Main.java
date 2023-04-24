package seminar4;

public class Main {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
         for (int i = 1; i <= 11; i++) {
         tree.add(i);
         }

        tree.add(13);
        tree.add(8);
        tree.add(17);
        tree.add(1);
        tree.add(11);
        tree.add(15);
        tree.add(25);
        tree.add(6);
        tree.add(22);
        tree.add(27);
        System.out.println(tree.find(17));
        System.out.println(tree.find(99));

         tree.printThreeUppermost();

    }
}