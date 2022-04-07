import java.util.Scanner;  
public class activity2   
{  
public static void main(String[] args)   
{  
 
Scanner sc=new Scanner(System.in);  
 


//creates an array in the memory of length 5
String[] persons = new String[5];
int[] age = new int[5];

for(int i=0; i<persons.length; i++)  
{  
    System.out.println("Enter the name: ");  
    //reading array elements from the user  
    sc.nextLine();
    persons[i]=sc.nextLine();
    
    
    if(i<persons.length){
        
        System.out.println("Enter the age: ");  
        //reading array elements from the user   
        age[i]=sc.nextInt();
        

    }

    

}  

for (int i=0; i < persons.length; i+=1){
    System.out.println("My name is " + persons[i] + " and I'm " + age[i] + ". ");



}



} 
} 