package binarysearchtree;
public class BinarySearchTree {
    class BSTNode{
    BSTNode left,right;
    int data;
    
    BSTNode(){
        left=null;
        right=null;
        data=0;
    }
    BSTNode(int n){
        left=null;
        right=null;
        data=n;
    }
}
    BSTNode root;
    BinarySearchTree(){
        root=null;
    }
    public void insert(int data){
        root=insert(root,data);
    }
    private BSTNode insert(BSTNode node,int data){
        if(node==null){
            node=new BSTNode(data);
        }
        else{
            if(data<=node.data)
                node.left=insert(node.left,data);
            else
                node.right=insert(node.right,data);
        }
        return node;
    }
    
    public void deleteK(int key){
        root=deleteR(root,key);
    }
    BSTNode deleteR(BSTNode root,int k){
        if(root==null)return root;
        else if(k<root.data)
            root.left=deleteR(root.left,k);
        else if(k>root.data)
            root.right=deleteR(root.right,k);
        else{
            if(root.left==null)
                return root.right;
            else if(root.right==null)
                return root.left;
            root.data=minvalue(root.right);
            root.right=deleteR(root.right,root.data);
        }
        return root;
    }
    int minvalue(BSTNode root){
        int min=root.data;
        while(root.left!=null){
            min=root.left.data;
            root=root.left;
        }
        return min;
    }
    
    void inorder(){
        inorder(root);
    }
    void inorder(BSTNode root){
        if(root!=null){
            inorder(root.left);
            System.out.print(root.data+",");
            inorder(root.right);
        }
    }
    public static void main(String[] args) {
        BinarySearchTree tree=new BinarySearchTree();
        tree.insert(50); 
        tree.insert(30); 
        tree.insert(20); 
        tree.insert(40); 
        tree.insert(70); 
        tree.insert(60); 
        tree.insert(80); 
        System.out.println("Tree:");
        tree.inorder();
        System.out.println("Delete 20"); 
        tree.deleteK(20); 
        System.out.println("New Tree:"); 
        tree.inorder(); 
  
        System.out.println("Delete 30"); 
        tree.deleteK(30); 
        System.out.println("New Tree:"); 
        tree.inorder(); 
  
        System.out.println("Delete 50"); 
        tree.deleteK(50); 
        System.out.println("New Tree:"); 
        tree.inorder(); 
    }
    
}
