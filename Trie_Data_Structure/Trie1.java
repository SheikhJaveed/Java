
public class Trie1 {
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

    public static boolean wordBreak(String key){
        if(key.length()==0){
            return true;
        }
        for(int i=1; i<=key.length(); i++) {
            String firstPart = key.substring(0, i);
            String secPart = key.substring(i);
            if(Search(firstPart) && wordBreak(secPart)) {
                    return true;
                }
        }
        return false;
    }

    public static boolean startsWith(String prefix) {
        Node curr = root;
        for(int i=0; i<prefix.length(); i++) {
            int idx = prefix.charAt(i)-'a';
            if(curr.children[idx] == null) {
                return false;
            }
            curr = curr.children[idx];
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
        String words[]={"the","a","there","their","any"};

        for(int i=0;i<words.length;i++){
            insert(words[i]);
        }
        System.out.println(Search("their"));
        System.out.println(Search("thor"));
        System.out.println(Search("an"));

        String words1[]={"i","like","sam","samsung","mobile"};
        String key = "ilikesamsung";
        for(int i=0;i<words1.length;i++){
            insert(words1[i]);
        }

        System.out.println(wordBreak(key));

        String words2[]={"apple","app","mango","man","woman"};
        String prefix = "app"; //for app-true, for moon-false, for man-true..

        for(int i=0;i<words2.length;i++){
            insert(words2[i]);
        }

        System.out.println(startsWith(prefix));

        String str = "ababa";
        for(int i=0;i<str.length();i++){
            String suffix = str.substring(i);
            // System.out.println(suffix); //prints all the suffixes
            insert(suffix);
        }

        System.out.println(countNodes(root));
    }
}
