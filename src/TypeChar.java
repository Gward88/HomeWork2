import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TypeChar {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        char[] ch = s.toCharArray();
        for(Character cha : ch){
            System.out.println(cha);
        }
        reader.close();
    }

}
