public class linked_list {
    Node head;
    private int size;
    linked_list(){
        this.size=0;
    }
    class Node{
        String data;
        Node next;

        Node(String data){
            this.data=data;
            this.next=null;
            size++;
        }
    }
    
    //add - first
    public void addNext(String data){
        Node newNode = new Node(data); //creating a new node 
        if(head==null){     //corner case
            head=newNode;
            return;
        }
     
        newNode.next = head;
        head = newNode;
    }

    //add - last
    public void addLast(String data){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
            return;
        }
        
        Node currNode = head;
        while(currNode.next!=null){
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    //delete -first
    public void deleteFirst(){
        if(head == null){
            System.out.println("The list is empty");
            return;
        }
        size--;
        head = head.next; //2nd node will become head and the first node will be deleted
    }

    //delete- second
    public void deleteLast(){   
        if(head == null){
            System.out.println("The list is empty");
            return;
        }
        size--;
        if(head.next == null){ //if there is only one node
            head= null;
            return;
        }
        Node secondLast = head;
        Node lastNode = head.next;
        while(lastNode.next!=null){
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }
    //print
    public void printList(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        Node currNode = head;
        while(currNode!=null){
            System.out.print(currNode.data + "->");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }
    //size
    public int getSize(){
        return size;
    }
    //be careful we get infinte loops if we skip return statements or miss something here
    public static void main(String[] args) {
        linked_list list = new linked_list();
        list.addNext("a");
        list.addNext("is");
        list.printList();

        list.addLast("list");
        list.printList();

        list.addNext("This");
        list.printList();

        list.deleteFirst();
        list.printList();

        list.deleteLast();
        list.printList();

        int a = list.getSize();
        System.out.println(a);

        list.printList();
    }
}
