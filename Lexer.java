import java_cup.runtime.Scanner;
import java_cup.runtime.Symbol;
import java.io.Reader;

public class Lexer implements Scanner {
    private final Reader r;
    public Lexer(Reader r) { this.r = r; }

    public Symbol next_token() throws Exception {
        int c = r.read();
        switch (c) {
        case -1: case '\r': case '\n': case ' ': case '\t':
            return null;
        case 'M': case 'm':
            return new Symbol(sym.M);
        case 'D': case 'd':
            return new Symbol(sym.D);
        case 'C': case 'c':
            return new Symbol(sym.C);
        case 'L': case 'l':
            return new Symbol(sym.L);
        case 'X': case 'x':
            return new Symbol(sym.X);
        case 'V': case 'v':
            return new Symbol(sym.V);
        case 'I': case 'i':
            return new Symbol(sym.I);
        default:
            throw new RuntimeException("unrecognised character " + c);
        }
    }
}