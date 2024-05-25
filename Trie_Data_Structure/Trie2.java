

//program to count the number of unique substrings
public class Trie2 {
    static class Node{
        Node[] children;
        boolean eow;

        public Node(){
            children = new Node[26];
            for(int i=0;i<26;i++){
                children[i]=null; //we are giving null because we have created a Node class and it does not have any object so to avoid the error we initialize to zero
            }
        }
    }
    static Node root = new Node();

    public static void insert(String word){
        Node curr=root;
        for(int i=0;i<word.length();i++){
            int idx = word.charAt(i)-'a'; //gives index of a character

            if(curr.children[idx]==null){
                curr.children[idx] = new Node(); //if char doesn't exist create new Node
            }
            if(i==word.length()-1){
                curr.children[idx].eow = true; //update eow value by true
            }
            curr = curr.children[idx]; //child node becomes parent node(root)
        }
    }
    public static boolean Search(String key){
        Node curr= root;
        for(int i=0;i<key.length();i++){    //O(L) where L- length of key
            int idx = key.charAt(i)-'a';
            Node node = curr.children[idx];

            if(node==null){
                return false;
            }
            if(i==key.length()-1 && node.eow==false){
                return false;
            }

            curr=curr.children[idx];
        }
        return true;
    }


    public static int countNodes(Node root) {
        if(root == null) {
            return 0;
        }
        
        int count = 0;
        for(int i=0; i<26; i++) {
            if(root.children[i] != null) {
                count += countNodes(root.children[i]); //returns count of all subtree
            }
        }
        return count+1; //extra one for the self node
    }

    
    public static void main(String[] args) {

        String str = "ababa";
        for(int i=0;i<str.length();i++){
            String suffix = str.substring(i);
            // System.out.println(suffix); //prints all the suffixes
            insert(suffix);
        }

        System.out.println(countNodes(root));
    }
}
