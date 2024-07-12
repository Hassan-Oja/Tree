public class Main {
    public static void main(String[] args) {
        tree t1 = new tree();
        t1.insertBST(10);
        t1.insertBST(20);
        t1.insertBST(30);
        t1.insertBST(40);
        t1.insertBST(50);
        t1.inorder();
        t1.search(30);
        System.out.println(t1.getmin());
        System.out.println(t1.sum());
        t1.root = t1.delete(t1.root,20);
        t1.inorder();
        t1.count();

    }
}