package container;

import models.Friend;
import models.Gender;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;


public class FriendContainer implements Iterable<Friend> {
    private Friend[] friends;
    private final Friend[] EMPTY_lIST = {};
    private int size;

    public FriendContainer() {
        friends = EMPTY_lIST;
    }

    public void addFriend(Friend f) {
        if(size == friends.length || friends == EMPTY_lIST) {
            friends = grow();
        }
        friends[size++] = f;
    }

    private Friend[] getFriendsByGender(Gender gender) {
        Friend[] genderArray = new Friend[size];
        int counter = 0;
        for(Friend f : friends) {
            if(Objects.nonNull(f) && f.getGender() == gender) {
                genderArray[counter++] = f;
            }
        }

        return Arrays.copyOf(genderArray, counter);
    }

    public void printCurrentFriends(){
        System.out.println("..................................");
        for(Friend m : this) {
            if(Objects.nonNull(m))
                System.out.println(m);
        }
        System.out.println("..................................");
    }

    public void printCurrentFriends(Gender g){
        System.out.println("..................................");
        for(Friend m : getFriendsByGender(g)) {
            if(Objects.nonNull(m))
                System.out.println(m);
        }
        System.out.println("..................................");
    }

    private Friend[] grow() {
        int originalLength = friends.length;
        if(originalLength == 0) {
            friends = new Friend[10];
        }else {
            int newLength = originalLength + 10;
            friends = Arrays.copyOf(friends, newLength);
        }
        return friends;
    }

    public Iterator<Friend> iterator() {

        return new FriendContainerIterator();
    }

    private class FriendContainerIterator implements Iterator<Friend> {
        private int position;

        @Override
        public boolean hasNext() {
            return position < size;
        }

        @Override
        public Friend next() {
            return friends[position++];
        }
    }

}
