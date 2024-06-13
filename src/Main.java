import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String filepath="slowa.txt";
        ArrayList<String> slowa=Download(filepath);
        System.out.println(Zad1(slowa));
        System.out.println(Zad2(slowa));
    }
    public static ArrayList<String> Download(String filepath) {
        ArrayList<String> Wynik = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(filepath);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;

            while ((line = bufferedReader.readLine()) != null) {
                Wynik.add(line);
            }
            bufferedReader.close();
            return Wynik;

        } catch (IOException e) {

            e.printStackTrace();
        }
        return null;
    }
public static int Zad1(ArrayList<String>slowa){
        int count=0;
        for(String i:slowa){
            int zeros=0;
            int ones=0;
            char [] chars=i.toCharArray();
            for(char j:chars){
                if(j=='0'){
                    zeros++;
                }
                else {
                    ones++;
                }
            }
            if(zeros>ones){
                count++;
            }
        }
        return count;
}
public static int Zad2(ArrayList<String>slowa){
        int count=0;
        for(String i:slowa){
            boolean drugi_blok=false;
            boolean poprawne_slowo=false;
            char[]chars=i.toCharArray();
            if(chars[0]=='0'){
                for(char j:chars){
                    if(j=='0'){
                       if(!drugi_blok) {continue;}
                       else {
                           poprawne_slowo=false;
                           break;
                       }
                    }
                    else{
                        drugi_blok=true;
                        poprawne_slowo=true;
                    }
                }
                if(poprawne_slowo){
                    count++;
                }
            }

        }
        return count;
}
public static ArrayList<String>Zad3(ArrayList<String>
}