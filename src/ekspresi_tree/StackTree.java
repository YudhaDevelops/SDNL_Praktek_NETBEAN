package ekspresi_tree;
public class StackTree {
    private ListTree StackList;

    public StackTree() {
        StackList = new ListTree();
    }
    
    public void Push(TreeNode node){
        StackList.insertAtFront(node);
    }
    
    public TreeNode Pop(){
        return StackList.removeFormFront();
    }
    
    public boolean isEmpty(){
        return StackList.isEmpty();
    }
    
    public void Print(){
        StackList.print();
    }
}
