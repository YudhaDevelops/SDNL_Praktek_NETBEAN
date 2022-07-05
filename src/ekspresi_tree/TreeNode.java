package ekspresi_tree;
public class TreeNode {
    private char Data;
    TreeNode leftNode;
    TreeNode rightNode;
    TreeNode parent;

    public TreeNode(char data){
        this.Data = data;
    }
    
    public char getData(){
        return this.Data;
    }
    
    public void setData(char data){
        this.Data = data;
    }

    public TreeNode getLeftNode() {
        return leftNode;
    }

    public TreeNode getRightNode(){
        return rightNode;
    }

    public void setLeftNode(TreeNode node){
        this.leftNode = node;
    }

    public void setRightNode(TreeNode node){
        this.rightNode = node;
    }

    public TreeNode getParent() {
        return parent;
    }

    public void setParent(TreeNode parent) {
        this.parent = parent;
    }
    
    public void insert(char masukData){
        if (masukData < Data) {
            if (leftNode == null) {
                leftNode = new TreeNode(masukData);
            }else{
                leftNode.insert(masukData);
            }
        }else if (masukData > Data) {
            if (rightNode == null) {
                rightNode = new TreeNode(masukData);
            }else{
                rightNode.insert(masukData);
            }
        }
    }
}
