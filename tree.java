public class tree {
    Node root;

    public tree() {
        root = null;
    }

    public void insertBST(int data) {
        root = insertBST(root, data);
    }

    private Node insertBST(Node p, int data) {
        Node newnode = new Node(data);
        if (p == null) {
            p = newnode;
            return p;
            /*hna be2oly an operator > cannot be applied to "Node","int"* msh el mafrood p.data da int?*/
        } else if (data < p.data) {
            p.left = insertBST(p.left, data);
        } else {
            p.right = insertBST(p.right, data);
        }
        return p;
    }

    public Node search(double x) {
        return find(root, x);
    }

    private Node find(Node p, double x) {
        if (p == null) {
            return null;
        } else if (p.data == x) {
            return p;
        } else if (p.data > x) {
            return find(p.left, x);
        } else {
            return find(p.right, x);
        }

    }

    public void inorder() {
        printinorder(root);
    }

    private void printinorder(Node p) {
        if (p != null) {
            printinorder(p.left);
            System.out.print(p.data + "\t");
            printinorder(p.right);
        }
    }

    public void preorder() {
        printpreorder(root);
    }

    private void printpreorder(Node p) {
        if (p != null) {
            System.out.println(p.data + "\t");
            printpreorder(p.left);
            printpreorder(p.right);
        }
    }

    public void postorder() {
        printpostorder(root);
    }

    private void printpostorder(Node p) {
        if (p != null) {
            printpostorder(p.left);
            printpostorder(p.right);
            System.out.println(p.data + "\t");
        }
    }

    public double sum() {
        return sum(root);
    }

    private double sum(Node p) {
        if (p == null) {
            return 0;
        } else {
            return p.data + sum(p.left) + sum(p.right);
        }
    }

    public Node getMax() {
        return max(root);
    }

    private Node max(Node p) {
        if (p == null) {
            return null;
        } else if (p.right == null) {
            return p;
        } else {
            return max(p.right);
        }
    }

    public Node getmin() {
        return min(root);
    }

    private Node min(Node p) {
        if (p == null) {
            return null;
        } else if (p.left == null) {
            return p;
        } else {
            return max(p.left);
        }
    }

    public int count() {
        return size(root);
    }

    private int size(Node p) {
        if (p == null) {
            return 0;
        } else {
//            System.out.println("check");
            int x = 1 + size(p.left) + size(p.right);
            return x;
        }
    }

    public Node delete(Node p, int key) {
        if (p == null) {
            return null;
        } else if (p.data > key) {
            p.left = delete(p.left, key);
//           return p;
        } else if (p.data < key) {
            p.right = delete(p.right, key);
//            return p;
        }
        return p;
    }

    public int depth(int x) {
        return finddepth(root, x);
    }

    private int finddepth(Node p, int x) {
        if (p == null) {
            return -1;
        }
        if (p.data == x) {
            return 0;
        }
        int leftdepth = finddepth(p.left, x);
        if (leftdepth >= 0) {
            return leftdepth + 1;
        }
        int rightdepth = finddepth(p.right, x);
        if (rightdepth >= 0) {
            return rightdepth + 1;
        }
        return -1;
    }


    public void insertL(int data) {
        root = insertL(root, data);
    }

    private Node insertL(Node p, int data) {
        Node newnode = new Node(data);
        if (p == null) {
            p = newnode;
        } else if (p.left == null) {
            p.left = newnode;
        } else {
            p.left = insertL(p.left, data);
        }
        return p;
    }

    public void insertR(int data) {
        root = insertR(root, data);
    }

    private Node insertR(Node p, int data) {
        Node newnode = new Node(data);
        if (p == null) {
            p = newnode;
        } else if (p.right == null) {
            p.right = newnode;
        } else {
            p.right = insertR(p.right, data);
        }
        return root;
    }
}
