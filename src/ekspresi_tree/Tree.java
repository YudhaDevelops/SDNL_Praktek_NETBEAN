package ekspresi_tree;
public class Tree {
    TreeNode root;
    String dataPrint = "";
    TreeNode parent;

    public Tree() {
        root = null;
    }

    public Tree(TreeNode node) {
        this.root = node;
    }

    public TreeNode getRoot() {
        return root;
    }

    public void setRoot(TreeNode root) {
        this.root = root;
    }

    //panggil pre-fix in-fix post-fix
    public void prefix() {
        prefixHelper(this.getRoot());
    }

    public void prefixHelper(TreeNode localRoot) {
        if (localRoot != null) {
            System.out.print(localRoot.getData()+ " ");
            prefixHelper(localRoot.getLeftNode());
            prefixHelper(localRoot.getRightNode());
        }
    }

    public void infix() {
        infixHelper(this.getRoot());
    }

    public void infixHelper(TreeNode localRoot) {
        if (localRoot != null) {
            infixHelper(localRoot.getLeftNode());
            System.out.print(localRoot.getData() + " ");
            infixHelper(localRoot.getRightNode());
        }
    }

    public void postfix() {
        postfixHelper(this.getRoot());
    }

    public void postfixHelper(TreeNode localRoot) {
        if (localRoot != null) {
            postfixHelper(localRoot.getLeftNode());
            postfixHelper(localRoot.getRightNode());
            System.out.print(localRoot.getData() + " ");
        }
    }
    
}
