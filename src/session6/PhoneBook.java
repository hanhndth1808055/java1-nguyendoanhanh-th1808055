package session6;

import java.util.ArrayList;
import java.util.Collections;
import java.lang.Comparable;

public class PhoneBook extends Phone {
    public ArrayList<PhoneNumber> PhoneList;

    public PhoneBook() {
        this.PhoneList = new ArrayList<>();
    }

    public void insertPhone(String name, String phone) {
//       int y = 0;
        for (PhoneNumber ph : PhoneList) {
            if (ph.getName().equals(name)) {
                if (ph.getPhone().equals(phone)) {
                    System.out.println("Phone number exists.");
                } else {
//                 ph.setPhone(ph.getName() + " : " + phone);
                    String x = ph.getPhone();
                    x += " : " + phone;
                    ph.setPhone(x);
                    System.out.println("Added one more number.");
                }
//                y++;
                return;
            }
        }
//        if(y == 0){ --add here-- }
        PhoneNumber px = new PhoneNumber(name, phone);
        PhoneList.add(px);
        //        if (PhoneList.size() == 0 || !checkPhone(name)) {
//            PhoneNumber p = new PhoneNumber();
//            p.name = name;
//            p.phone = phone;
//            this.PhoneList.add(p);
//        } else {
//            for (int i = 0; i < PhoneList.size(); i++) {
//                if (PhoneList.get(i).name.equals(name) && PhoneList.get(i).phone.equals(phone)) {
//                    break;
//                } else if (PhoneList.get(i).name.equals(name) && !PhoneList.get(i).phone.equals(phone)) {
//                    PhoneList.get(i).phone += " : " + phone;
//                }
//            }
//        }
    }

    public void removePhone(String name) {
//        for (int i = 0; i < PhoneList.size(); i++) {
//            if (PhoneList.get(i).name.equals(name)) {
//                PhoneList.remove(i);
//                return;
//            }
//        }
        for (PhoneNumber ph : PhoneList) {
            if (ph.getName().equals(name)) {
                PhoneList.remove(ph);
            }
        }
    }

    public void updatePhone(String name, String newphone) {
        for (int i = 0; i < PhoneList.size(); i++) {
            if (PhoneList.get(i).name.equals(name)) {
                PhoneList.get(i).phone = newphone;
            }
        }
    }

    public void searchPhone(String name) {
        for (int i = 0; i < PhoneList.size(); i++) {
            if (PhoneList.get(i).name.equals(name)) {
                System.out.println("Name: " + name);
                System.out.println("Phone number: " + PhoneList.get(i).phone);
            }
        }
    }

    public void sort() {
        // Collections.sort - Bubble sort
//
//        Collections.sort();

        String temp;
        String temp2;
        for (int i = 0; i < PhoneList.size(); i++) {
            for (int j = i + 1; j < PhoneList.size(); j++)
                if (PhoneList.get(i).name.compareTo(PhoneList.get(j).name) > 0) {
                    temp = PhoneList.get(i).name;
                    PhoneList.get(i).name = PhoneList.get(j).name;
                    PhoneList.get(j).name = temp;
                    temp2 = PhoneList.get(i).phone;
                    PhoneList.get(i).phone = PhoneList.get(j).phone;
                    PhoneList.get(j).phone = temp2;
                }
        }
        for (PhoneNumber ph : PhoneList) {
            System.out.println("Name: " + ph.name);
            System.out.println("Phone number: " + ph.phone);
        }
    }

    public void printPhone() {
        System.out.println("---Phone Book---");
        for (PhoneNumber ph : PhoneList) {
            System.out.println("Name: " + ph.name);
            System.out.println("Phone number: " + ph.phone);
        }
        System.out.println("------");
    }

//    public boolean checkPhone(String name) {
//        for (int i = 0; i < PhoneList.size(); i++) {
//            if (PhoneList.get(i).name.equals(name)) {
//                return true;
//            }
//        }
//        return false;
//    }
}
