package com.example.rodry.mvpdemo.Services;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * POJO Contact Model
 */
public class ContactModel implements Parcelable {

    private int ContactId;
    private String Name;
    private String Gender;
    private int Age;

    public ContactModel() {
    }

    public ContactModel(int contactId, String name, String gender, int age) {
        ContactId = contactId;
        Name = name;
        Gender = gender;
        Age = age;
    }

    private ContactModel(Parcel in) {
        ContactId = in.readInt();
        Name = in.readString();
        Gender = in.readString();
        Age = in.readInt();
    }

    public static final Creator<ContactModel> CREATOR = new Creator<ContactModel>() {
        @Override
        public ContactModel createFromParcel(Parcel in) {
            return new ContactModel(in);
        }

        @Override
        public ContactModel[] newArray(int size) {
            return new ContactModel[size];
        }
    };

    public int getContactId() {
        return ContactId;
    }

    public void setContactId(int contactId) {
        ContactId = contactId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(ContactId);
        dest.writeString(Name);
        dest.writeString(Gender);
        dest.writeInt(Age);
    }
}
