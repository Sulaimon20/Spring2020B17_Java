package OfficeHours._06_10_Abstract;

public class Users2 {

    public static void main(String[] args) {

        FacebookUser user = new FacebookUser("jbond5", "007", "James Bond");
        user.createPost("My first post");
        user.createPost("Today was good");
        user.createPost("Okay dinner time");

        System.out.println(user.getAllPosts());
       


    }
}