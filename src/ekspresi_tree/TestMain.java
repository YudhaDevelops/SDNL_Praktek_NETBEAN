package ekspresi_tree;
public class TestMain {
    public static void main(String[] args) {
        //Expression Tree
        Tree tree = new Tree();
        Tree phn = new Tree();
        String s1 = "F%-C/+A^BD";
        String s2 = "F%-C/+A^BD";
 
        char notasi1[] = new char[s1.length()];
        s1.getChars(0, s1.length(), notasi1, 0);
        
        Infix infix1 = new Infix(notasi1);
        tree.setRoot(infix1.BuatPohon());
        
        System.out.println("Data S1 : " + s1);
        System.out.print("Infix :");
        tree.infix();
        System.out.print("\nPrefix :");
        tree.prefix();
        System.out.print("\nPostfix :");
        tree.postfix();
        System.out.println("");
        
        char notasi2[] = new char[s2.length()];
        s2.getChars(0, s2.length(), notasi2, 0);
        Infix infix2 = new Infix(notasi2);
        phn.setRoot(infix2.BuatPohon());
        
        System.out.println("\nData S2 : " + s2);
        System.out.print("Infix :");
        phn.infix();
        System.out.print("\nPrefix :");
        phn.prefix();
        System.out.print("\nPostfix :");
        phn.postfix();
        System.out.println("");
        
        
        
        
        
        
//        Tree tree = new Tree();
//        Tree phn = new Tree();
//
//        int [] a = {42, 21, 38, 27, 71, 82, 55, 63, 6, 2, 40, 12};
        //42, 21, 38, 27, 71, 82, 55, 63, 6, 2, 40 dan 12.
//        int [] a = {20, 30, 10, 5, 3, 16, 19, 45, 25, 2};
//        for (int i= 0; i < a.length ; i++){
//            tree.insert(a[i]);
//        }

//        for (int i= 0; i < a.length ; i++){
//            phn.insertNode(a[i]);
//        }

//        phn.insertNode(42);
//        phn.insertNode(21);
//        phn.insertNode(38);
//        phn.insertNode(27);
//        phn.insertNode(71);
//        phn.insertNode(82);
//        phn.insertNode(55);
//        phn.insertNode(63);
//        phn.insertNode(6);
//        phn.insertNode(2);
//        phn.insertNode(40);
//        phn.insertNode(12);


//        System.out.println();
//        System.out.println("Search");
//        tree.search(12);
//        System.out.println("Data Yang Di Lewati : " + tree.getDataPrint());
//        System.out.println();
//
//        tree1.search(-2);
//        System.out.println("Data Yang Di Lewati : " + tree1.getDataPrint());
//        System.out.println();
//
//        tree1.search(27);
//        System.out.println("Data Yang Di Lewati : " + tree1.getDataPrint());
//        System.out.println();
//
//        tree1.search(2);
//        System.out.println("Data Yang Di Lewati : " + tree1.getDataPrint());
//        System.out.println();
//
//        tree1.search(63);
//        System.out.println("Data Yang Di Lewati : " + tree1.getDataPrint());
//        System.out.println();
//        System.out.println("");
//        System.out.println("Tree Tidak Rekursif");
//        System.out.print("Pre Order : ");
//        tree.preorderTraversal();
//        System.out.println("");
//        System.out.print("In Order :");
//        tree.inOrderTraversal();
//        System.out.println("");
//        System.out.print("Post Order :");
//        tree.postOrderTraversal();
//        System.out.println();
//
//        System.out.println("");
//        System.out.println("Tree Rekursif");
//        System.out.print("Pre Order : ");
//        phn.preorderTraversal();
//        System.out.println("");
//        System.out.print("In Order :");
//        phn.inOrderTraversal();
//        System.out.println("");
//        System.out.print("Post Order :");
//        phn.postOrderTraversal();
//        System.out.println();
//        System.out.println("");
//
//        System.out.println("");
//        System.out.print("Data Depth 71 : " );
//        tree.depth(71);
//        System.out.print("Data Depth 27 : ");
//        tree.depth(27);
//
//        System.out.println("");
//        System.out.print("Data Height 40 : ");
//        tree.height(40);
//        System.out.print("Data Height 27 : ");
//        tree.height(27);
//
//        System.out.println("");
//        System.out.print("Data Leaf : ");
//        tree.leaf();
//
//        System.out.println("");
//        System.out.print("Data Descendant 38 : ");
//        tree.descendant(38);
//        System.out.println();
//        System.out.print("Data Descendant 21 : ");
//        tree.descendant(21);
        
        // 12, 27, 6 dan 55
        
//        System.out.print("Sebelum Hapus 12 : ");
//        tree.inOrderTraversal();
//        System.out.println("");
//        System.out.println("Delete 12");
//        tree.delete(12);
//        System.out.print("Setelah Hapus 12 : ");
//        tree.inOrderTraversal();
//        
//        System.out.println("");
//        System.out.println("");
//        System.out.print("Sebelum Hapus 27 : ");
//        tree.inOrderTraversal();
//        System.out.println("");
//        System.out.println("Delete 27");
//        tree.delete(27);
//        System.out.print("Setelah Hapus 27 : ");
//        tree.inOrderTraversal();
//        
//        System.out.println("");
//        System.out.println("");
//        System.out.print("Sebelum Hapus 6 : ");
//        tree.inOrderTraversal();
//        System.out.println("");
//        System.out.println("Delete 6");
//        tree.delete(6);
//        System.out.print("Setelah Hapus 6 : ");
//        tree.inOrderTraversal();
//        
//        System.out.println("");
//        System.out.println("");
//        System.out.print("Sebelum Hapus 55 : ");
//        tree.inOrderTraversal();
//        System.out.println("");
//        System.out.println("Delete 55");
//        tree.delete(55);
//        System.out.print("Setelah Hapus 55 : ");
//        tree.inOrderTraversal();
//        System.out.println("");
//        26, 71, 38, 42
        
//hapus 2 anak
//        System.out.println("");
//        System.out.println("");
//        System.out.print("Sebelum Hapus 2 : ");
//        tree.inOrderTraversal();
//        System.out.println("");
//        System.out.println("Delete 2");
//        tree.delete(2);
//        System.out.print("Setelah Hapus 2 : ");
//        tree.inOrderTraversal();
//        System.out.println("");
//        
//        System.out.println("");
//        System.out.println("");
//        System.out.print("Sebelum Hapus 6 : ");
//        tree.inOrderTraversal();
//        System.out.println("");
//        System.out.println("Delete 6");
//        tree.delete(6);
//        System.out.print("Setelah Hapus 6 : ");
//        tree.inOrderTraversal();
//        System.out.println("");
//        
//        System.out.println("");
//        System.out.println("");
//        System.out.print("Sebelum Hapus 21 : ");
//        tree.inOrderTraversal();
//        System.out.println("");
//        System.out.println("Delete 21");
//        tree.delete(21);
//        System.out.print("Setelah Hapus 21 : ");
//        tree.inOrderTraversal();
//        System.out.println("");
//        
//        System.out.println("");
//        System.out.println("");
//        System.out.print("Sebelum Hapus 42 : ");
//        tree.inOrderTraversal();
//        System.out.println("");
//        System.out.println("Delete 42");
//        tree.delete(42);
//        System.out.print("Setelah Hapus 42 : ");
//        tree.inOrderTraversal();
//        System.out.println("");
    }
    
}
