package Pertemuan5;

import java.util.Stack;

public class Tree {

    TreeNode root;
    String dataPrint = "";
    TreeNode parent;

    public Tree() {
    }

    public Tree(TreeNode node) {
        this.root = node;
    }

    public void insert(char dataNode) {
        TreeNode newNode = new TreeNode(dataNode);
        if (root == null) {
            root = new TreeNode(dataNode);
//            System.out.println("Data root = " + root.getData());
        } else {
            TreeNode ptr = root;
            while (true) {
                if (newNode.getcharData() <= ptr.getcharData()) {
                    if (ptr.getLeftNode() == null) {
                        ptr.setLeftNode(newNode);
                        newNode.setParent(ptr);
//                        System.out.println("Data leftNode = " + ptr.getLeftNode().getData());
                        return;
                    } else {
                        ptr = ptr.getLeftNode();
                    }
                } else {
                    if (ptr.getRightNode() == null) {
                        ptr.setRightNode(newNode);
                        newNode.setParent(ptr);
//                        System.out.println("Data rightNode = " + ptr.getRightNode().getData());
                        return;
                    } else {
                        ptr = ptr.getRightNode();
                    }
                }
            }
        }
    }

    public TreeNode searching(int dataNode) {
        this.dataPrint = "";
        TreeNode pointer = root;

        while (pointer.getcharData() != dataNode) {
            if (dataNode <= pointer.getcharData()) {
                dataPrint += pointer.getcharData() + ", ";  //print
                pointer = pointer.getLeftNode();
            } else {
                dataPrint += pointer.getcharData() + ", ";
                pointer = pointer.getRightNode();
            }
            if (pointer == null) {
                dataPrint += "null";
                System.out.println("Data yang dicari : " + dataNode); //print
                System.out.println("Node Tidak Di Temukan!");         //print
                return null;
            }
        }
        dataPrint += pointer.getcharData();
        if (pointer.getcharData() == dataNode) {
            System.out.println("Data yang dicari : " + pointer.getcharData()); //print
            System.out.println("Node Ditemukan!");                         //print
        }
        return pointer;
    }

    public void preorderTraversal() {
        preOrderHelper(this.getRoot());
    }

    public void preOrderHelper(TreeNode localRoot) {
        if (localRoot != null) {
            System.out.print(localRoot.getcharData() + ", ");
            preOrderHelper(localRoot.getLeftNode());
            preOrderHelper(localRoot.getRightNode());
        }
    }

    public void inOrderTraversal() {
        inorderHelper(this.getRoot());
    }

    public void inorderHelper(TreeNode localRoot) {
        if (localRoot != null) {
            inorderHelper(localRoot.getLeftNode());
            System.out.print(localRoot.getcharData() + ", ");
            inorderHelper(localRoot.getRightNode());
        }
    }

    public void postOrderTraversal() {
        postOrderHelper(this.getRoot());
    }

    public void postOrderHelper(TreeNode localRoot) {
        String dataReturn = "";
        if (localRoot != null) {
            postOrderHelper(localRoot.getLeftNode());
            postOrderHelper(localRoot.getRightNode());
            System.out.print(localRoot.getcharData() + ", ");
        }
    }

    public String getDataPrint() {
        return dataPrint;
    }

    public TreeNode getRoot() {
        return root;
    }

    public void setRoot(TreeNode root) {
        this.root = root;
    }

    //pertemuan ke 4
    public void depth(int data) {
        TreeNode pointer = search(data);
        System.out.println(depth_Help(pointer));
    }

    private int depth_Help(TreeNode node) {
        int kanan = -1, kiri = -1, temp;
        if (node.getLeftNode() != null) {
            kiri = depth_Help(node.getLeftNode());
        }
        if (node.getRightNode() != null) {
            kanan = depth_Help(node.getRightNode());
        }
        if (kanan > kiri) {
            temp = kanan + 1;
        } else {
            temp = kiri + 1;
        }
        return temp;
    }

    public void descendant(int data) {
        TreeNode pointer = search(data);
        descendants(pointer, data);
    }

    public void descendants(TreeNode node, int data) {
        if (node != null) {
            if (node.getcharData() != data) {
                System.out.print(node.getcharData() + ", ");
            }
            descendants(node.getLeftNode(), data);
            descendants(node.getRightNode(), data);
        }
    }

    public void leaf() {
        getLeaf(this.getRoot());
    }

    private int getLeaf(TreeNode node) {
        if (node == null) {
            return 0;
        }
        if (node.getLeftNode() == null && node.getRightNode() == null) {
            System.out.print(node.getcharData() + " ");
            return 1;
        } else {
            return getLeaf(node.getLeftNode()) + getLeaf(node.getRightNode());
        }
    }

    public void height(int data) {
        getHeight(data);
    }

    private int getHeight(int data) {
        int temp = 0;
        TreeNode pointer = root;

        while (pointer.getcharData() != data) {
            if (data <= pointer.getcharData()) {
                pointer = pointer.getLeftNode();
                temp++;
            } else {
                pointer = pointer.getRightNode();
                temp++;
            }
            if (pointer == null) {
                return 0;
            }
        }
        System.out.println(temp);
        return temp;
    }

    public TreeNode search(int data) {
        dataPrint = " ";
        TreeNode pointer = root;
        if (pointer.getcharData() == data) {
            dataPrint += pointer.getcharData();
        } else {
            while (pointer.getcharData() != data) {
                if (data <= pointer.getcharData()) {
                    dataPrint += pointer.getcharData() + ", ";
                    pointer = pointer.getLeftNode();
                } else {
                    dataPrint += pointer.getcharData() + ", ";
                    pointer = pointer.getRightNode();
                }
                if (pointer == null) {
                    return null;
                } else if (pointer.getcharData() == data) {
                    dataPrint += pointer.getcharData();
                }
            }
        }

        return pointer;
    }

//    public void insertNode(int value) {
//        TreeNode temp = new TreeNode(value);
//        if (root == null) {
//            root = temp;
//        } else {
//            insertRekursif(root, value);
//        }
//    }
//    public void insertRekursif(TreeNode node, int data) {
//        TreeNode newNode = new TreeNode(data);
//        if (data < node.getData()) {
//            if (node.getLeftNode() != null) {
//                insertRekursif(node.getLeftNode(), data);
//            } else {
//                node.setLeftNode(newNode);
//            }
//        } else if (data > node.getData()) {
//            if (node.getRightNode() != null) {
//                insertRekursif(node.getRightNode(), data);
//            } else {
//                node.setRightNode(newNode);
//            }
//        }
//    }
    //pertemuan 5
    public boolean isLeaf(TreeNode data) {
        boolean cek = false;
        TreeNode ptr = data;
        if (ptr.getLeftNode() == null && ptr.getRightNode() == null) {
            cek = true;
        }
        return cek;
    }

    public boolean delete(char data) {
        boolean cek = false;
        TreeNode node = Search_Node(data);
        if (node != null) {
            if (!isLeaf(node)
                    && (node.getLeftNode() != null && node.getRightNode() != null)) {
                cek = delete_2_anak(node);
            } else if (!isLeaf(node)
                    && (node.getLeftNode() != null || node.getRightNode() != null)) {
                cek = delete_1_anak(node);
            } else {
                cek = delete_0_anak(node);
            }
        }
        return cek;
    }

    public boolean delete_1_anak(TreeNode data) {
        TreeNode parent = data.getParent();
        TreeNode temp = data;

        if (temp != root) {
            if (parent.getLeftNode() == temp) {
                if (temp.getLeftNode() != null) { //jika cabang kiri temp tidak null
                    parent.setLeftNode(temp.getLeftNode());
                    temp.getLeftNode().setParent(parent);
                } else {
                    parent.setLeftNode(temp.getRightNode());
                    temp.getRightNode().setParent(parent);
                }
                temp.setParent(null);
            } else {
                if (temp.getLeftNode() != null) { //jika cabang kanan temp tidak null
                    parent.setRightNode(temp.getLeftNode());
                    temp.getLeftNode().setParent(parent);
                } else {
                    parent.setRightNode(temp.getRightNode());
                    temp.getRightNode().setParent(parent);
                }
                temp.setParent(null);
            }
        } else {
            if (data.getRightNode() != null) {//cabang kanan ada ==> cabang kiri kosong
                TreeNode n = GetSuccessor(temp);
                if (n != null) {
                    root.setCharData(n.getcharData());
                } else { //temp = root
                    if (isLeaf(temp.getRightNode())) {
                        root.setCharData(temp.getRightNode().getcharData());
                        root.setRightNode(null);
                    } else {
                        root.setCharData(temp.getRightNode().getcharData());
                        root.setRightNode(temp.getRightNode().getRightNode());
                        temp.getRightNode().setParent(root);
                    }
                }
            } else {//cabang kiri ada ==> cabang kanan kosong
                TreeNode n = getPredeccessor(temp);
                if (n != null) {
                    root.setCharData(n.getcharData());
                } else { // temp = root
                    if (isLeaf(temp.getLeftNode())) {
                        root.setCharData(temp.getLeftNode().getcharData());
                        root.setLeftNode(null);
                    }else{
                        root.setCharData(temp.getLeftNode().getcharData());
                        root.setLeftNode(temp.getLeftNode().getLeftNode());
                        temp.getLeftNode().setParent(root);
                    }
                }
            }
        }
        return true;
    }

    public boolean delete_0_anak(TreeNode data) {
        TreeNode parent = data.getParent();
        if (parent.getLeftNode() == data) {
            parent.setLeftNode(null);
            data.setParent(null);
        } else {
            parent.setRightNode(null);
            data.setParent(null);
        }
        return true;
    }

    public TreeNode Search_Node(int data) {
        TreeNode pointer = root;
        while (pointer.getcharData() != data) {
            if (data <= pointer.getcharData()) {
                pointer = pointer.getLeftNode();
            } else {
                pointer = pointer.getRightNode();
            }
            if (pointer == null) {
                return null;
            }
        }
        return pointer;
    }

    //pertemua ke 6
    public boolean delete_2_anak(TreeNode node) {
        boolean cek = false;
        TreeNode parent = node.getParent();
        TreeNode temp = node;
        if (node != root) {
            if (parent.getRightNode() == temp) {
                if (temp.getRightNode() != null) {
                    parent.setRightNode(temp.getRightNode());                    // cabang kanan parent ambil cabang kanan temp
                    temp.getRightNode().setParent(parent);                      //cabang kanan temp ambil parent 
                    temp.getRightNode().setLeftNode(temp.getLeftNode());
                    temp.getLeftNode().setParent(temp.getRightNode());

                } else {
                    parent.setLeftNode(temp.getLeftNode());
                    temp.getLeftNode().setParent(parent);
                    temp.getLeftNode().setRightNode(temp.getRightNode());
                    temp.getRightNode().setParent(temp.getLeftNode());
                }
                temp.setParent(null);
                cek = true;
            } else if (parent.getLeftNode() == temp) {
                if (isLeaf(temp.getRightNode())) {
                    TreeNode GetSuccessor = GetSuccessor(temp);
                    temp.setCharData(GetSuccessor.getcharData());
                    temp.setRightNode(null);
                } else {
                    TreeNode GetSuccessor = GetSuccessor(temp);
                    temp.setCharData(GetSuccessor.getcharData());
                }
                cek = true;
            }
        } else {
            TreeNode getPredeccessor = getPredeccessor(temp);
            root.setCharData(getPredeccessor.getcharData());
            cek = true;
        }
        return cek;
    }

    public TreeNode GetSuccessor(TreeNode node) {
        TreeNode Current, Successor, SuccessorParent;
        Successor = node;
        SuccessorParent = node;
        Current = node.getRightNode();
        while (Current != null) {
            SuccessorParent = Successor;
            Successor = Current;
            Current = Current.getLeftNode();
        }

        if (Successor != node.getRightNode()) {
            SuccessorParent.setLeftNode(Successor.getRightNode());
            Successor.setRightNode(node.getRightNode());
        } else {
            Successor = null;
        }
        return Successor;
    }

    public TreeNode getPredeccessor(TreeNode node) {
        TreeNode Current, Predeccessor, PredeccessorParent;
        Predeccessor = node;
        PredeccessorParent = node;
        Current = node.getLeftNode();
        while (Current != null) {
            PredeccessorParent = Predeccessor;
            Predeccessor = Current;
            Current = Current.getRightNode();
        }
        if (Predeccessor != node.getLeftNode()) {
            PredeccessorParent.setRightNode(Predeccessor.getLeftNode());
            Predeccessor.setLeftNode(node.getLeftNode());
        } else {
            Predeccessor = null;
        }
        return Predeccessor;
    }

    //nyoba ekspresi tree
    public boolean isOperator(char ch) {
        if (ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '^') {
            return true;
        }
        return false;
    }

    public void insertExpresi(String data) {
        Stack<TreeNode> st = new Stack<TreeNode>();
        TreeNode t1, t2;
        TreeNode temp = new TreeNode('0');
        for (int i = 0; i < data.length(); i++) {
            if (!isOperator(data.charAt(i))) {
                temp = new TreeNode(data.charAt(i));
                st.push(temp);
            } else {
                temp = new TreeNode(data.charAt(i));

                t1 = st.pop();
                t2 = st.pop();

                temp.setLeftNode(t2);
                temp.setRightNode(t1);

                st.push(temp);
            }
        }
        temp = st.pop();
        inorder(temp);
    }

    public TreeNode expressiTree(String postfix) {
        Stack<TreeNode> st = new Stack<TreeNode>();
        TreeNode t1, t2, temp;

        for (int i = 0; i < postfix.length(); i++) {
            if (!isOperator(postfix.charAt(i))) {
                temp = new TreeNode(postfix.charAt(i));
                st.push(temp);
            } else {
                temp = new TreeNode(postfix.charAt(i));

                t1 = st.pop();
                t2 = st.pop();

                temp.setLeftNode(t2);
                temp.setRightNode(t1);

                st.push(temp);
            }

        }
        temp = st.pop();
        inorder(temp);
        return temp;
    }

    public static void inorder(TreeNode root) {
        if (root == null) {
            return;
        }

        inorder(root.leftNode);
        System.out.print(root.getcharData());
        inorder(root.rightNode);
    }

}
