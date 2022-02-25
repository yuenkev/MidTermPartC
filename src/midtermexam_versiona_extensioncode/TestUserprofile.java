/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexam_versiona_extensioncode;

import java.util.*;

/**
 *
 * @author ktyue
 */
public class TestUserprofile {
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        //Prompt for entering user's name
        System.out.print("Please enter your name: ");
        String name = sc.nextLine();
        
        //Displaying the genre list.
        System.out.println("\nList of Genres:\nComedy\nDrama\nAction\n"
                + "Mystery\n");
        
        //Prompting for user's favourite genre 
        System.out.print("Please pick a genre: ");
        String genre = sc.nextLine();
        
        //Creating the UserProfile object
        UserProfile user1 = new UserProfile(name, genre);
        
        //Finalization Message
        System.out.println("\nThank you for creating your user profile! :3 "
                + "\nHave a nice day!");
    }
}
