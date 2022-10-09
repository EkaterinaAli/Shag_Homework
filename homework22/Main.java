package homework22;

import java.util.Scanner;

public class Main {
    public static boolean isDown (String str, int i){
        return 'a' <= str.charAt(i) && str.charAt(i) <= 'z';
    }
    public static boolean isRus (String str, int i){
        return 'а' <= str.charAt(i) && str.charAt(i) <= 'я';
    }
    public static int taskString15(String str){
        int l=0;
        for (int i =0; i <str.length(); i++){
            if (isDown(str, i))
                l++;
        }
        return l;
    }
    public static int taskString15r(String str){
        int r =0 ;
        for (int i =0; i <str.length(); i++){
            if (isRus(str, i))
                r++;
        }
        return r;
    }
    public static void main(String[] args) {
        System.out.println("Введите набор букв: ");
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

        //String15. Дана строка. Подсчитать общее количество содержащихся в ней
        //строчных латинских и русских букв.
        //System.out.println(taskString15(str));
        //System.out.println(taskString15r(str));

        //String16. Дана строка. Преобразовать в ней все прописные латинские буквы в
        //строчные.
        int offset = 'A' - 'a';
        StringBuilder buf = new StringBuilder(str);
        for (int i =0; i < buf.length(); i++){
            int c = buf.charAt(i) - offset;
            buf.setCharAt(i,(char)c);
        }
        System.out.println(buf);
    }
}
