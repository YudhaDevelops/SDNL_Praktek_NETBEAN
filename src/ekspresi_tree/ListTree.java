package ekspresi_tree;
public class ListTree {
    private ListTreeNode firstNode;
    private ListTreeNode lastNode;
    private String name;

    public ListTree() {
        this("list");
    }

    public ListTree(String name) {
        this.name = name;
        firstNode = lastNode = null;
    }
    
    public boolean isEmpty(){
        if (firstNode == null){
            return true;
        }else{
            return false;
        }
    }
    
    public void insertAtFront(TreeNode nodeBaru){
        if (isEmpty()) {
            firstNode = lastNode = new ListTreeNode(nodeBaru);
//            firstNode = new ListTreeNode(insertItem);
//            lastNode = new ListTreeNode(insertItem);
        }else{
            firstNode = new ListTreeNode(nodeBaru, firstNode);
        }
    }
    
    public void insertAtBack(TreeNode insertItem){
        if (isEmpty()) {
            firstNode = lastNode = new ListTreeNode(insertItem);
//            firstNode = new ListTreeNode(insertItem);
//            lastNode = new ListTreeNode(insertItem);
        }else{
            lastNode = lastNode.nextNode = new ListTreeNode(insertItem);
        }
    }
    
    public TreeNode removeFormFront(){
        if (isEmpty()) {
            return null;
        }
        
        TreeNode hapusItem = firstNode.data;
        if (firstNode == lastNode) {
            firstNode = lastNode = null;
        }else{
            firstNode = firstNode.nextNode;
        }
        return hapusItem;
    }
    
    public TreeNode removeFormBack(){
        if (isEmpty()) {
            return null;
        }
        
        TreeNode hapusItem = lastNode.data;
        if (firstNode == lastNode) {
            firstNode = lastNode = null;
        }else{
            ListTreeNode temp = firstNode;
            while(temp.nextNode != lastNode){
                temp = temp.nextNode;
            }
            lastNode = temp;
            temp.nextNode = null;
        }
        return hapusItem;
    }
    
    public void print (){
        if (isEmpty()) {
            System.out.println("Empty " + name);
            return;
        }
        
        System.out.println("The " + name + "is : ");
        ListTreeNode temp = firstNode;
        
        while(temp != null){
            System.out.println(temp.data.toString() + " ");
            temp = temp.nextNode;
        }
        System.out.println("\n");
    }
}
