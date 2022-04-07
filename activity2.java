import java.util.Scanner;  
public class activity2{  
    public static void main(String[] args)   
    {  
        Scanner sc=new Scanner(System.in);  
        //creates arrays person and age in the memory of length 5
        String[] persons = new String[5];
        int[] age = new int[5];

        System.out.println("Please enter upto five names with their ages.");
        System.out.println("---------------------------------------------");
        
        //for loop to ask user to input upto 5 names with their age
        for(int index=0; index<persons.length; index++)  
        {  
            // Reading user input and store it in arrays person and age
            System.out.println("Enter the name: ");   
            persons[index]=sc.nextLine();
            System.out.println("Enter the age: ");    
            age[index]=sc.nextInt();
            sc.nextLine();
        }  

        System.out.println("The names you entered and their ages are as follows.");
        System.out.println("----------------------------------------------------");

        //for loop to access the elements inside the arrays persons and age then display them
        for (int index=0; index < persons.length; index+=1){
            System.out.println("Name: " + persons[index] +  "           Age: " + age[index]);
        }

        sc.close();
    } 
} 