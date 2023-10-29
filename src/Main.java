import container.FriendContainer;
import models.Friend;
import models.Gender;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
       FriendContainer container = new FriendContainer();
       container.addFriend(new Friend("A", Gender.MALE, 35));
       container.addFriend(new Friend("B", Gender.MALE, 30));
       container.addFriend(new Friend("C", Gender.FEMALE, 25));
       container.addFriend(new Friend("D", Gender.MALE, 34));
       container.addFriend(new Friend("E", Gender.FEMALE, 29));
       container.addFriend(new Friend("F", Gender.MALE, 41));
       container.addFriend(new Friend("G", Gender.MALE, 39));
       container.addFriend(new Friend("H", Gender.MALE, 20));
       container.addFriend(new Friend("I", Gender.MALE, 19));
       container.addFriend(new Friend("J", Gender.MALE, 23));
       container.addFriend(new Friend("FK", Gender.FEMALE, 15));
       container.addFriend(new Friend("L", Gender.MALE, 18));
       container.addFriend(new Friend("FM", Gender.MALE, 20));

       for(Friend m : container.getFriendsByGender(Gender.MALE)){
           System.out.println(m);
       }
        System.out.println("................................................");
        for(Friend m : container.getFriendsByGender(Gender.FEMALE)){
            System.out.println(m);
        }
        System.out.println("................................................");

        for(Friend m : container){
            System.out.println(m);
        }
    }
}
