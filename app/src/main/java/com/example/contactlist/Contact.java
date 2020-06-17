package com.example.contactlist;

import android.os.Parcel;
import android.os.Parcelable;

public class Contact implements Parcelable {

    String name;
    String number;
    String email;
    String profileImage;
    public Contact(){

    }

    public Contact(String name, String number, String email, String profileImage) {
        this.name = name;
        this.number = number;
        this.email = email;
        this.profileImage = profileImage;
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    public String getEmail() {
        return email;
    }

    public String getProfileImage() {
        return profileImage;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setProfileImage(String profileImage) {
        this.profileImage = profileImage;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {

    }

    public String getPhonenumber() {
        return number;
    }

}