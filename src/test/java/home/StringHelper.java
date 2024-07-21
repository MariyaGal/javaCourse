package home;

import org.junit.jupiter.api.BeforeEach;

public class StringHelper {
    public static String string;

    public StringHelper(String string) {
        StringHelper.string = string;
    }


    static int getWordsCount() {
        String[] words = string.toLowerCase().replaceAll("\\d+", "").split("\\s+");
        return words.length;

    }

    static String cut() {
        if (string.length() > 100) {
            return STR."\{string.substring(0, 96)}...";
        } else {
            return string;
        }
    }


     static String find(int index, String str) {

         if (string.indexOf(str, index) != -1) {// Метод find ищет подстроку str в этой строке, начиная с индекса index, и возвращает подстроку, начинающуюся с позиции вхождения str
            return string.substring(string.indexOf(str, index));
        }else {
            return string;
        }
    }




    static int getFirstNumber() {
        String[] words  = string.split("\\s+");// Метод split возвращает массив строк, разделенных символом символа разделителя
        for (String word : words)  {
                if  (word.matches("\\d+"))  {
                return Integer.parseInt(word);// Возвращает первое число в строке
             }
        }
        throw new RuntimeException("Невозможно найти число в строке");
    }





}
