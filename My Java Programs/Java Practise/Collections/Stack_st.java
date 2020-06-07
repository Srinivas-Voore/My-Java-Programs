package Collections;
import java.util.*;  
public class Stack_st
{  
public static void main(String args[])
{  
Stack<Integer> st=new Stack<Integer>();  
st.push(1);  
st.push(2);  
st.push(3);  
st.push(4);  
st.pop();
Iterator<Integer> itr=st.iterator();  
while(itr.hasNext()){  
System.out.println(itr.next());  
}  
}  
}  