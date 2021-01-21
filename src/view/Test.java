package view;
import controller.ManagerPhoneBook;
import model.PhoneBook;

import java.util.Scanner;

public class Test {
    static Scanner sc = new Scanner(System.in);
    static Scanner sc1 = new Scanner(System.in);
    static ManagerPhoneBook managerPhoneBook = new ManagerPhoneBook();
    static int choose =0;

    public static void main(String[] args) {
        do {
            menu1();
            choose = Integer.parseInt(sc1.nextLine());
            switch (choose){
                case 1:
                    managerPhoneBook.showAll();
                    break;
                case 2:
                    PhoneBook phoneBook = getPhoneBook();
                    managerPhoneBook.addNew(phoneBook);
                    break;
                case 3:
                    System.out.println("Nhập số điện thoại cần sửa :");
                    int phoneNumber1 = sc.nextInt();
                    managerPhoneBook.edit(phoneNumber1,getPhoneBook());
                    break;
                case 4:
                    System.out.println("Nhập số điện thoại bạn muốn xoá:");
                    int phoneNumber2 = sc.nextInt();
                    managerPhoneBook.delete(phoneNumber2);
                    break;
                case 5:
                    do {
                        menu2();
                        choose = Integer.parseInt(sc1.nextLine());
                        switch (choose){
                            case 1:
                                System.out.println("Nhập số điện thoại tìm kiếm");
                                int phoneNumber3 = sc.nextInt();
                                managerPhoneBook.searchNumberPhone(phoneNumber3);
                                break;
                            case 2:
                                System.out.println("Nhập tên cần tìm kiếm");
                                String name1 = sc1.nextLine();
                                managerPhoneBook.searchName(name1);
                                break;
                        }
                    }while (choose !=3);
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
            }
        }while (choose !=0);

    }

    private static void menu2() {
        System.out.println(" Mời bạn lựa chọn tìm kiếm theo :");
        System.out.println(" 1. Tìm kiếm theo số điện thoại ");
        System.out.println(" 2. Tìm kiếm theo tên");
        System.out.println(" 3. Trở lại");
    }

    private static void menu1(){
        System.out.println("---- CHƯƠNG TRÌNH QUẢN LÝ DANH BẠ ----");
        System.out.println(" Chọn chức năng theo số ( để tiếp tục) :");
        System.out.println("1. Xem danh sách");
        System.out.println("2. Thêm mới");
        System.out.println("3. Cập nhập");
        System.out.println("4. Xoá");
        System.out.println("5. Tìm kiếm");
        System.out.println("6. Đọc file");
        System.out.println("7. Ghi file");
        System.out.println("8. Thoát");
        System.out.println(" Chọn chức năng :");
    }


    private static PhoneBook getPhoneBook() {
        System.out.println("Nhập số điện thoại :");
        int phoneNumber = sc.nextInt();
        System.out.println("Nhập nhóm của danh bạ");
        String group = sc1.nextLine();
        System.out.println("Nhập họ tên");
        String name = sc1.nextLine();
        System.out.println("Nhập giới tính");
        String gender = sc1.nextLine();
        System.out.println("Nhập địa chỉ");
        String address = sc1.nextLine();
        System.out.println("Nhập ngày tháng năm sinh");
        String dateOfBirthDays = sc1.nextLine();
        System.out.println("Nhập email");
        String email = sc1.nextLine();
        PhoneBook phoneBook = new PhoneBook(phoneNumber,group,name,gender,address,dateOfBirthDays,email);
        return phoneBook;
    }
}
