import java.util.Scanner;  
public class activity1  
{  
public static void main(String[] args)   
{  
 
Scanner sc=new Scanner(System.in);  
 


//creates an array in the memory of length 5
String[] persons = new String[5];  
for(int i=0; i<persons.length; i++)  
{  
    System.out.println("Enter the name: ");  
    //reading array elements from the user   
    persons[i]=sc.nextLine();

      
} 

for (int i=0; i < persons.length; i+=1){
    System.out.println(persons[i]);



}




// System.out.println("Array elements are: ");  
// accessing array elements using the for loop  
//for (int i=0; i<persons.length; i++)   
//{  
//System.out.println(array[i]);  
//}  
}  
}  