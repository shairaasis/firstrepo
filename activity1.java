import java.util.Scanner;  
public class activity1  {  
    public static void main(String[] args){  

        Scanner sc=new Scanner(System.in);  
        
        //creates person array in the memory of length 5
        String[] persons = new String[5];  

        System.out.println("Please enter upto five names.");
        System.out.println("-----------------------------");

        //for loop to ask user to input upto 5 names
        for(int index=0; index<persons.length; index++)  
        {  
            //reading array elements from the user
            System.out.println("Enter the name: ");     
            persons[index]=sc.nextLine();
        } 

        System.out.println("The names you entered are as follows.");
        System.out.println("-------------------------------------");

        //for loop to access the elements inside the person array and display them
        for (int index=0; index < persons.length; index+=1){
            System.out.println(persons[index]);
        }

        sc.close();
    }  
}  