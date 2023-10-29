package models;

public class Friend {
    private String fullName;
    private Gender gender;
    private int age;

    public Friend(String f, Gender g, int a) {
        fullName = f;
        gender = g;
        age = a;
    }

    public String getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }

    public Gender getGender() {
        return gender;
    }

    public String toString() {
        return "(Name: " + fullName + ", Gender: " + gender + ", Age: " + age + ")";
    }
}
