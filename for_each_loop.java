/*syntax
for (type var : array) 
{ 
    statements using var;
}  */

public class for_each_loop {
    public static void main(String[] args) {
        int ar[] = { 10, 50, 60, 80, 90 }; 
  
        for (int element : ar) 
            System.out.print(element + " "); 
    }
}
/*
    Limitations of for-each loop 
       decision-making

1. For-each loops are not appropriate when you want to modify the array
2. For-each loops do not keep track of index. So we can not obtain array index using For-Each loop 
3. For-each only iterates forward over the array in single steps
4. For-each cannot process two decision making statements at once
5. For-each also has some performance overhead over simple iteration:

 */