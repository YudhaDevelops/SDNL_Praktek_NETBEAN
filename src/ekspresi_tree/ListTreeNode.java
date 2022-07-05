package ekspresi_tree;

public class ListTreeNode {
    TreeNode data;
    ListTreeNode nextNode;

    public ListTreeNode(TreeNode treeNode) {
        this(treeNode, null);
    }

    public ListTreeNode(TreeNode nodeBaru, ListTreeNode NodeLama) {
        this.data = nodeBaru;
        this.nextNode = NodeLama;
    }
    
    public TreeNode getData() {
        return data;
    }

    public ListTreeNode getNextNode() {
        return nextNode;
    }
}
