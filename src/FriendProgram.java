import container.FriendContainer;
import models.Friend;
import models.Gender;

import java.util.Scanner;

public class FriendProgram {
    private Scanner scan ;
    private String command;
    private FriendContainer container;

    public FriendProgram() {
        scan = new Scanner(System.in);
        container = new FriendContainer();
        initialize();
    }

    private void initialize() {
        System.out.println();
        System.out.println("Welcome to our Friend App");
        System.out.println("This app will enable you to keep track of your friends");
        System.out.println("The app is easy to use and enjoy!");
        System.out.println("........Follow the commands below to use the app........");
        System.out.println("To add a friend, press a");
        System.out.println("To see all your friends, press l");
        System.out.println("To see all your male or female friends, press f");
        System.out.println("To quit the application, press q");
        command = scan.next();
        if(command.equalsIgnoreCase("a")){
            readyToAddFriendFunc();
        }else if(command.equalsIgnoreCase("l")){
            listAllFriends();
        } else if(command.equalsIgnoreCase("f")) {
            listAllFriendBasedOnGender();
        } else if(command.equalsIgnoreCase("q")){

        }
    }

    private void listAllFriends() {
        container.printCurrentFriends();
    }

    private void listAllFriendBasedOnGender() {
        System.out.println("Enter the gender, male or female");
        String response = scan.next();
        container.printCurrentFriends(Gender.valueOf(response.toUpperCase()));
    }

    public boolean isContinue() {
        return !command.equalsIgnoreCase("q");
    }

    private void readyToAddFriendFunc() {
       System.out.print("Enter your friend name ");
       String name = scan.next();
       System.out.print("Enter gender ");
       Gender g =  Gender.valueOf(scan.next().toUpperCase());
        System.out.print("Enter age ");
       int a = Integer.parseInt(scan.next());
       container.addFriend(new Friend(name, g, a));
        System.out.println(name +" added successfully");
        initialize();
    }
}
