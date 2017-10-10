package main.entities.Builders;

import main.entities.User;

public class UserBuilder {
    private Long userId = 0L;
    private String firstName = "first_name";
    private String lastName = "second_name";
    private String phoneNumber = "0123456789";
    private String email = "some@gmail.com";

    public UserBuilder buildUserId(Long userId){
        this.userId = userId;
        return this;
    }

    public UserBuilder buildFirstName(String firstName){
        this.firstName = firstName;
        return this;
    }

    public UserBuilder buildLastName(String LastName){
        this.lastName = lastName;
        return this;
    }

    public UserBuilder buildPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
        return this;
    }

    public UserBuilder buildEmail(String email){
        this.email = email;
        return this;
    }

    public User build(){
        User user = new User();
        user.setUserId(userId);
        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setPhoneNumber(phoneNumber);
        user.setEmail(email);
        return user;
    }
}
