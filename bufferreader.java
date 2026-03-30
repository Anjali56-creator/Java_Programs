// BufferedReader

import java.io.*;

public class bufferreader{
    public static void main(String[] args) throws IOException {
       // InputStreamReader isr = new InputStreamReader(System.in);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String name = br.readLine();

        System.out.println(name);
    }
}
