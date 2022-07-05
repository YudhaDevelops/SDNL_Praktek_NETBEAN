
package Pertemuan5;

public class TreeNode {
    private char charData;
    TreeNode leftNode;
    TreeNode rightNode;
    TreeNode parent;

    
    public TreeNode(char charData){
        this.charData = charData;
    }
    
    public char getcharData(){
        return this.charData;
    }

    public void setCharData(char data){
        this.charData = data;
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

    
}
