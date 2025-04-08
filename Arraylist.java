import java.util.*;  
class Arraylist{  
public static void main(String args[])
{  
//Creating arraylist
ArrayList<String> names=new ArrayList<String>();

//Adding object in arraylist  
names.add("parvathy");
names.add("sree");  
names.add("lara");  
names.add("seena");  

//Accessing data
System.out.println("The 2nd person = "+names.get(1));

//update
names.set(1,"chuchu");
System.out.println("Updated List: " + names);

//removing element
names.remove(0);
System.out.println("After removing " + names);

//use of contain function
 System.out.println(names.contains("leena"));
 
 //size of array
  System.out.println("Size of array =" +names.size());

//Traversing list through Iterator  
Iterator itr=names.iterator();  
while(itr.hasNext()){  
System.out.println(itr.next());  
}

//sorting
names.sort(null);
System.out.println("After sorting =" + names);

//clear the list
names.clear();
System.out.println("After clearing =" + names);
}  
}
