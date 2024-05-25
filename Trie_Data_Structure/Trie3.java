

//program for longest word in all prefixes
public class Trie3 {
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

    public static String ans = "";
    public static void longestWord(Node root, StringBuilder curr) {
        for(int i=0; i<26; i++) {
            if(root.children[i] != null && root.children[i].eow == true) {
                curr.append((char)(i+'a'));
                if(curr.length() > ans.length()) {
                    ans = curr.toString();
                }
                longestWord(root.children[i], curr);
                curr.deleteCharAt(curr.length()-1);
            }
        }
    }

    
    public static void main(String[] args) {
        String words[] = {"a","banana","app","appl","ap","apply","apple"};
        for(int i=0;i<words.length;i++){
            insert(words[i]);
        }
    
        longestWord(root, new StringBuilder(""));
        System.out.println(ans);
    }
}
