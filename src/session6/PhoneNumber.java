package session6;

import java.util.ArrayList;

public class PhoneNumber implements Comparable<PhoneNumber>{
    public String name;
    public String phone;

    public PhoneNumber(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public PhoneNumber() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public int compareTo(PhoneNumber o){
        return this.getName().compareTo(o.getName());
    }
}
