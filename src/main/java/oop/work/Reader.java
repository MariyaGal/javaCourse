package oop.work;
/*
Библиотека. Определить класс Reader, хранящий такую информацию о пользователе библиотеки: ФИО, номер читательского билета, факультет, дата рождения, телефон. Методы takeBook(), returnBook().Разработать программу, в которой создается массив объектов данного класса. Перегрузить методы takeBook(), returnBook(): takeBook, который будет принимать количество взятых книг. Выводит на консоль сообщение "Петров В. В. взял 3 книги". takeBook, который будет принимать переменное количество названий книг. Выводит на консоль сообщение "Петров В. В. взял книги: Приключения, Словарь, Энциклопедия". takeBook, который будет принимать переменное количество объектов класса Book (создать новый класс, содержащий имя и автора книги). Выводит на консоль сообщение "Петров В. В. взял книги: Приключения, Словарь, Энциклопедия".
 */
import java.util.Date;

public class Reader {
    private  String fio;
    private int ticketNumber;
    private String faculty;
    private Date dateofBirth;
    private String phoneNumber;
    public  Reader (String fio){
        this.fio =  fio;
    }
//    metods
    public void  takeBook(){
        System.out.println(convertFio()+ " взял книгу.");

    }
    public void takeBook(int number) {
        System.out.println(
                String.format("%s взял %s %s",
                        convertFio(),
                        number,
                        getBookForm(number))
        );
    }
    public void takeBook(String[] books) {
        System.out.println(convertFio() +" взял книги: "+unionBooks(books));
    }
    public void takeBook(Book[] books) {
        String[] bookTitles=new String[books.length];
        for (int i=0; i<books.length; i++){
            bookTitles[i]=books[i].title;
        }
        System.out.println(convertFio()+" взял книги: "+unionBooks(bookTitles));
    }
// гальцова мария сергеевна -> гальцова м.с.
    private String convertFio() {
        String[] partsofName=fio.split(" ");
        return String.format("%s %s %s",
                partsofName[0],
                Character.toUpperCase(partsofName[1].toCharArray()[0]),
                Character.toUpperCase(partsofName[2].toCharArray()[0]));
    }
/*
        1-книгу
    2,3,4 -книги
    5-20 - книг

 */

    private String getBookForm(int number){
        int last=number %10;
        int prev=(number/10)%10;
        if (prev==1){
            return  "книг";
        }
        switch (last){
            case 1: return "книгу";
            case 2:
            case 3:
            case 4: return "книги";
            default: return "книг";
        }


    }
    private  String unionBooks(String[] books){
        StringBuilder result = new StringBuilder();
        for (int i=0; i<books.length; i++){
            result.append(books[i]);
            if (i !=books.length-1){ // сделано чтобы в конце строки не добавился лишний ", "
                result.append(", ");
            }
        }
        return  result.toString();
    }
    // get set
    public String getFio() {
        return fio;
    }

    public int getTicketNumber() {
        return ticketNumber;
    }

    public String getFaculty() {
        return faculty;
    }

    public Date getDateofBirth() {
        return dateofBirth;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }


    public void setFio(String fio) {
        this.fio = fio;
    }

    public void setTicketNumber(int ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public void setDateofBirth(Date dateofBirth) {
        this.dateofBirth = dateofBirth;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
