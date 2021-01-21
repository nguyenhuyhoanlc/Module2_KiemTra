package controller;

import model.PhoneBook;

import java.util.ArrayList;
import java.util.List;

public class ManagerPhoneBook {
    List<PhoneBook> phoneBookList = new ArrayList<>();

    public void addNew(PhoneBook phoneBook){
        phoneBookList.add(phoneBook);
    }

    public void edit(int numberPhone, PhoneBook phoneBook){
        for (int i = 0; i < phoneBookList.size(); i++) {
            if (numberPhone == phoneBookList.get(i).getNumberPhone()){
                phoneBookList.set(i, phoneBook);
                return;
            }
        }
        System.out.println("Không tìm được danh bạ với số điện thoại trên");
    }

    public void delete(int numberPhone){
        for (int i = 0; i < phoneBookList.size(); i++) {
            if ( numberPhone == phoneBookList.get(i).getNumberPhone()){
                phoneBookList.remove(i);
            }
        }
        System.out.println("Không tìm được danh bạ với số điện thoại trên");
    }

    public void showAll(){
        for (int i = 0; i < phoneBookList.size(); i++) {
            System.out.println("Số điện thoại :" + phoneBookList.get(i).getNumberPhone());
            System.out.println("Nhóm của danh bạ :" + phoneBookList.get(i).getGroup());
            System.out.println("Họ tên :" + phoneBookList.get(i).getName());
            System.out.println("Giới tính :" + phoneBookList.get(i).getGender());
            System.out.println("Địa chỉ :" + phoneBookList.get(i).getAddress());
            return;
        }
        System.out.println("----- Danh bạ trống -----");
    }

    public void searchName(String name){
        for (int i = 0; i < phoneBookList.size(); i++) {
            if (name.equals(phoneBookList.get(i).getName())){
                System.out.println(phoneBookList.get(i));
                return;
            }
        }
        System.out.println("----- Không tìm thấy danh bạ cần tìm kiếm -----");

    } public void searchNumberPhone (int numberPhone){
        for (int i = 0; i < phoneBookList.size(); i++) {
            if (numberPhone == phoneBookList.get(i).getNumberPhone()){
                System.out.println(phoneBookList.get(i));
                return;
            }
        }
        System.out.println("----- Không tìm thấy danh bạ cần tìm kiếm -----");
    }




}
