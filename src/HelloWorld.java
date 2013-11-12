import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created with IntelliJ IDEA.
 * User: Anthony
 * Date: 8/11/13
 * Time: 4:42 PM
 * To change this template use File | Settings | File Templates.
 * My first Java class I created recently
 */
public class HelloWorld {
    public static void main(String[] argv) throws IOException {
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("What's your name? ");
        System.out.flush();
        String s = buff.readLine();
        System.out.printf("Hello, %s!", s);
    }

}
