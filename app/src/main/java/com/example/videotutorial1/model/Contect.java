package com.example.videotutorial1.model;

public class Contect {
    private String name;
    private String phoneNumber;
    private String device;
    private String email;
    private String ProfileImage;

    private Contect(String name,String phoneNumber,String device,String email,String ProfileImage){
        this.name=name;
        this.phoneNumber=phoneNumber;
        this.device=device;
        this.email=email;
        this.ProfileImage=ProfileImage;
    }


    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getDevice() {
        return device;
    }

    public String getEmail() {
        return email;
    }

    public String getProfileImage() {
        return ProfileImage;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setDevice(String device) {
        this.device = device;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setProfileImage(String profileImage) {
        ProfileImage = profileImage;
    }

    @Override
    public String toString() {
        return "Contect{" +
                "name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", device='" + device + '\'' +
                ", email='" + email + '\'' +
                ", ProfileImage='" + ProfileImage + '\'' +
                '}';
    }
}
