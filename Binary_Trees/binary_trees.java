
import java.util.*;

public class binary_trees {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static class Binarytree{
        static int idx=-1;
        public static Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            
            return newNode;
        }
    }
    public static void preorder(Node root){
            if(root==null){
                return;
            }
            System.out.print(root.data+" ");
            preorder(root.left);
            preorder(root.right);
            
        }
    public static void inorder(Node root){
            if(root==null){
                return;
            }
            preorder(root.left);
            System.out.print(root.data+" ");
            preorder(root.right);
        }
        public static void postOrder(Node root){
            if(root==null){
                return;
            }
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data+" ");
            
        }
        public static void levelOrder(Node root){
            if(root == null) {
                return;
            }
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);
            while(!q.isEmpty()) {
                Node curr = q.remove();
                if(curr == null) {
                    System.out.println();
                    //queue empty
                    if(q.isEmpty()) {
                        break;
                    } else {
                        q.add(null);
                    }
                } else {
                    System.out.print(curr.data+" ");
                    if(curr.left != null) {
                        q.add(curr.left);
                    }
                    if(curr.right != null) {
                        q.add(curr.right);
                    }
                }
            } 
        }
        public static int countOfNodes(Node root){
            if(root==null){
                return 0;
            }
            int leftNodes = countOfNodes(root.left);
            int rightNodes = countOfNodes(root.right);

            return rightNodes+leftNodes+1;
        }
        public static int sumOfNodes(Node root){
            if(root==null){
                return 0;
            }
            int leftSum = sumOfNodes(root.left);
            int rightSum = sumOfNodes(root.right);

            return rightSum + leftSum + root.data;
        }
        public static int height(Node root){
            if(root==null){
                return 0;
            }
            int leftHeight = height(root.left);
            int rightHeight = height(root.right);

            return Math.max(rightHeight,leftHeight)+1;
        }
        public static int diameter(Node root){
            if(root==null){
                return 0;
            }
            int diam1 = diameter(root.left); //calculating diameter takes O(n)
            int diam2 = diameter(root.right);
            int diam3 = height(root.left) + height(root.right)+1; //calculating height takes O(n) time so total O(n^2) time complexity

            return Math.max(diam3, Math.max(diam1, diam2));
        }

        static class TreeInfo{
            int ht; //ht-height
            int dia;
            TreeInfo(int ht,int dia){
                this.ht=ht;
                this.dia=dia;
            }
        }

        public static TreeInfo diameter2(Node root){
            if(root==null){
                return new TreeInfo(0, 0);
            }
            TreeInfo left = diameter2(root.left);
            TreeInfo right = diameter2(root.right);

            int myHeight = Math.max(left.ht,right.ht)+1;

            int diam1 = left.dia;
            int diam2 = right.dia;
            int diam3 = left.ht + right.ht +1;

            int myDiam = Math.max(Math.max(diam1,diam2),diam3);

            TreeInfo myInfo = new TreeInfo(myHeight, myDiam); //creating object
            return myInfo;  
        }

    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Binarytree tree = new Binarytree();
        Node root = tree.buildTree(nodes);
        System.out.println(root.data); //prints the root data i.e 1
        preorder(root); //prints preorder traversal
        System.out.println();
        inorder(root);
        System.out.println();
        postOrder(root);
        System.out.println();
        levelOrder(root);
        System.out.println();
        System.out.println(countOfNodes(root));
        System.out.println(sumOfNodes(root));
        System.out.println(height(root));
        System.out.println(diameter(root));
        System.out.println(diameter2(root).dia);
    }    
}
