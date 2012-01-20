import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;

public class Main {
    public static void main(String [] args) throws Exception {
        Reader r = new BufferedReader(new InputStreamReader(System.in));
        parser p = new parser(new Lexer(r));
        while (true) {
            int result = (Integer)p.parse().value;
            System.out.println(result);
            r.mark(1);
            if (r.read() == -1) return;
            r.reset();
        }
    }
}