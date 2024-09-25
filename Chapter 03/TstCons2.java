class TstCons2{  
    int id;  
    String name;  
    //creating a parameterized constructor  
    TstCons2(int i,String n){  
    id = i;  
    name = n;  
    }  
    //method to display the values  
    void display(){System.out.println(id+" "+name);}  
   
    public static void main(String args[]){  
    //creating objects and passing values  
    TstCons2 s1 = new TstCons2(1,"A");  
    TstCons2 s2 = new TstCons2(2,"B");  
    //calling method to display the values of object  
    s1.display();  
    s2.display();  
   }  
}  

//A constructor which has a specific number of parameters is called a parameterized constructor.