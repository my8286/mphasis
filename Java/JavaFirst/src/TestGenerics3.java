class MyGen<T>{  
T obj;  
void add(T obj){this.obj=obj;}  
T get(){return obj;}  
} 

class TestGenerics3{  
public static void main(String args[]){  
MyGen<String> m=new MyGen<>();  
m.add("hell");  
//m.add(1);//Compile time error  
System.out.println(m.get());  
}} 