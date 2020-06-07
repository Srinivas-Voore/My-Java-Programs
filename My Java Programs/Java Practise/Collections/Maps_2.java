package Collections;
import java.util.*;  
class Maps_2
{  
 public static void main(String args[])
 {  
Map<Integer,String> map=new HashMap<Integer,String>();          
      map.put(1,"Srinivas");    
      map.put(3,"Kasi");    
      map.put(2,"siva");   
      map.entrySet()  
      .stream()  
      .sorted(Map.Entry.comparingByKey())  
      .forEach(System.out::println);  
 }  
}  