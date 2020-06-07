package Collections;
import java.util.*;  
class Maps_1
{  
 public static void main(String args[])
 {  
  Map<Integer,String> map=new HashMap<Integer,String>();  
  
  map.put(100,"Amit");  
  map.put(143,"Vijay");  
  map.put(215,"Rahul");  
  map.put(87, "Ajay");
  
  for(Map.Entry m:map.entrySet()){  
   System.out.println(m.getKey()+" "+m.getValue());  
  }  
 }  
}  