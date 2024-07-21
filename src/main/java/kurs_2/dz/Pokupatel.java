package kurs_2.dz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Pokupatel {
    private static String lastname;
    private static String firstname;
    private static String middlename;
    private static String address;
    private static int nomer_carts;
    private int nomer_banks;

    public static String getLastname() {
        return lastname;
    }

    public static String getFirstname() {
        return firstname;
    }


    public static String getMiddlename() {
        return middlename;
    }


    public static String getAddress() {
        return address;
    }


    public static int getNomer_carts() {
        return nomer_carts;
    }


    public int getNomer_banks() {
        return nomer_banks;
    }

    public Pokupatel(String lastname, String firstname, String middlename, String address, int nomer_carts, int nomer_banks) {
        Pokupatel.lastname = lastname;
        Pokupatel.firstname = firstname;
        Pokupatel.middlename = middlename;
        Pokupatel.address = address;
        Pokupatel.nomer_carts = nomer_carts;
        this.nomer_banks = nomer_banks;
    }

    public static void main(String[] args) {
        List<Pokupatel> spisok = new ArrayList<>();
        spisok.add(new Pokupatel("Иванов", "Петр", "Петрович", "г. Москва, ул. Ленина, д. 1", 546879012, 123456789));
        spisok.add(new Pokupatel("Сидоров", "Иван", "Иванович", "г. Санкт-Петербург, пр. Революции, д. 2", 167890123, 987654321));
        spisok.add(new Pokupatel("Смирнов", "Алексей", "Алексеевич", "г. Новосибирск, ул. Мира, д. 3", 243210987, 123456789));
        spisok.add(new Pokupatel("Кузнецов", "Василий", "Васильевич", "г. Екатеринбург, ул. Победы, д. 4", 312345678, 987654321));
        spisok.add(new Pokupatel("Петров", "Николай", "Евгеньевич", "г. Владивосток, ул. Морская, д. 5", 498765432, 123456789));

//        System.out.println(spisok);


        for (int i = 0; i < spisok.size(); i++) {
            if (getMiddlename().equals("Евгеньевич")) {
                System.out.println(getFirstname());
            }

            if (getNomer_carts() / 1000000 == 5) {
                System.out.println(getAddress());
            }

        }
        System.out.println(findLongestSurname(spisok));
    }

    private static String findLongestSurname(List<Pokupatel> spisok) {
        String longestLastName = "";
        for (Pokupatel pokupatel : spisok) {
            if (pokupatel.getLastname().length() > longestLastName.length()) {
                longestLastName = pokupatel.getLastname();
            }
        }
        return longestLastName;
    }

}
