package ekspresi_tree;

public class Infix {
    char temp [];
    KonstantaInfix karakterInfix = new KonstantaInfix();
    StackTree operator;
    StackTree operand;

    public Infix(char temp[]) {
        this.temp = temp;
    }
    
    public int valensi(char dataMasuk){
        if (dataMasuk == '^') {
            return 3;
        }else if(dataMasuk == '*' || dataMasuk == '/'){
            return 2;
        }else if(dataMasuk == '+' || dataMasuk == '-'){
            return 1;
        }else if (dataMasuk == '(') {
            return 0;
        }
        else{
            return -1;
        }
    }
    
    public TreeNode gabung(){
        TreeNode phn = operator.Pop();
        phn.rightNode = operand.Pop();
        phn.leftNode = operand.Pop();
        return phn;
    }
    
    public TreeNode BuatPohon(){
        char karakter;
        TreeNode treeKarakter;
        TreeNode cek;
        operator = new StackTree();
        operand = new StackTree();
        
        for (int i = 0; i < temp.length; i++) {
            karakter = temp[i];
            this.karakterInfix.setData(karakter);
            if (karakter != ' ') {
                treeKarakter = new TreeNode(karakter);
                if (karakter  == '(') {
                    operator.Push(treeKarakter);
                }else if (karakter == ')') {
                    cek = operator.Pop();
                    operator.Push(cek);
                    
                    while(cek.getData() != '('){
                        operand.Push(gabung());
                        cek = operator.Pop();
                        operator.Push(cek);
                    }
                    
                    operator.Pop();
                }else if (karakterInfix.isOperator()) {
                    cek = operator.Pop();
                    operator.Push(cek);
                    
                    while((cek != null) && (valensi(karakter) <= valensi(cek.getData()))){
                       operand.Push(gabung());
                       cek = operator.Pop();
                       operator.Push(cek);
                    }
                    operator.Push(treeKarakter);
                }else if (karakterInfix.isOperand()) {
                    operand.Push(treeKarakter);
                }else{
                    return null;
                }
            }
        }
        
        cek = operator.Pop();
        operator.Push(cek);
        
        while(cek != null){
            operand.Push(gabung());
            cek = operator.Pop();
            operator.Push(cek);
        }
        
        cek = operand.Pop();
        operator = null;
        operand = null;
        return cek;
    }
}
