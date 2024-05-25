import java.util.ArrayList;

public class BST {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data =data;
        }
    }
    public static Node insert(Node root,int val){
        if(root==null){
            root = new Node(val);
            return root;
        }
        if(root.data>val){
            //left subtree
            root.left = insert(root.left,val);
        }
        else{
            root.right = insert(root.right,val);
        }
        return root;
    }

    public static void inOrder(Node root){
        if(root==null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }

    public static boolean search(Node root,int key){
        //base case
        if(root==null){
            return false;
        }
        if(root.data>key){
            return search(root.left, key);
        }
        else if(root.data==key){
            return true;
        }
        else{
            return search(root.right, key);
        }
    } 
    public static Node delete(Node root,int val){
        //searching
        if(root.data>val){
            root.left=delete(root.left, val);
        }
        else if(root.data<val){
            root.right=delete(root.right, val);
        }
        else{ //root.data==val
            //case 1 - no child
            if(root.left==null && root.right==null){ //no child so null
                return null; //deletes parent node
            }

            //case 2 - one child
            if(root.left==null){ //right child exists
                return root.right;
            }
            else if(root.right==null){ //left child exists
                return root.left;
            }

            //case 3
            Node IS = inOrderSuccessor(root.right);     
            root.data = IS.data;
            root.right = delete(root.right, IS.data);
        }
        return root;
    }
    
    public static Node inOrderSuccessor(Node root){
        while(root.left!=null){
            root=root.left;
        }
        return root;
    }

    public static void printinRange(Node root,int X,int Y){
        if(root==null){
            return;
        }
        if(root.data>=X && root.data<=Y){
            printinRange(root.left, X, Y);
            System.out.print(root.data+" ");
            printinRange(root.right, X, Y);
        }
        else if(root.data>=Y){
            printinRange(root.left, X, Y);
        }
        else{
            printinRange(root.right, X, Y);
        }

    }
    public static void printPath(ArrayList<Integer> path){
        for(int i=0;i<path.size();i++){
            System.out.print(path.get(i)+"->");
        }
        System.out.println();
    }
    public static void printRoot2leaf(Node root,ArrayList<Integer> path){
        if(root==null){
            return;
        }
        path.add(root.data); //adding elements to ArrayList

        //leaf
        if(root.left==null && root.right==null){
            printPath(path);
        }
        else{  //non-leaf
            printRoot2leaf(root.left, path);
            printRoot2leaf(root.right,path);
        }

        path.remove(path.size()-1); //deleting elements from ArrayList
    }
    public static void main(String[] args) {
        int values[] = {5,1,3,4,2,7};
        Node root=null;

        for(int i=0;i<values.length;i++){
            root = insert(root, values[i]);
        }
        inOrder(root);  //gives inorder traversal
        System.out.println(); 
        //searching
        if(search(root, 1)){
            System.out.println("found");
        }else{
            System.out.println("not found");
        }

        delete(root, 4); //4 will be deleted
        inOrder(root);
        System.out.println();
        
        printinRange(root, 1, 4);
        System.out.println();

        printRoot2leaf(root, new ArrayList<>());
    }

}
