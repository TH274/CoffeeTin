package utils;

import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class TextIO {
    private static Scanner sc = new Scanner(System.in);
    private static PrintWriter pw;
    private static boolean writeFile = false;
    public final static char EOF = (char) 0xFFFF;

    public static void writeFile(String fileName) {
        try {
            if (pw != null) pw.close();
            pw = new PrintWriter(new FileWriter(fileName));
            writeFile = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void writeStandardOutput() {
        if (pw != null) {
            pw.close();
            pw = null;
        }
        writeFile = false;
    }

    public static void put(Object x) {
        if (writeFile) {
            pw.print(x);
        } else {
            System.out.print(x);
        }
    }

    public static void putln(Object x) {
        if (writeFile) {
            pw.println(x);
        } else {
            System.out.println(x);
        }
    }

    public static void putln() {
        if (writeFile) {
            pw.println();
        } else {
            System.out.println();
        }
    }

    public static void putf(String format, Object... items) {
        if (writeFile) {
            pw.printf(format, items);
        } else {
            System.out.printf(format, items);
        }
    }

    public static char getlnChar() {
        return getln().charAt(0);
    }

    public static int getlnInt() {
        int x = getInt();
        sc.nextLine();
        return x;
    }

    public static String getlnString() {
        return getln();
    }

    public static String getln() {
        return sc.nextLine();
    }

    public static byte getByte() {
        return sc.nextByte();
    }

    public static short getShort() {
        return sc.nextShort();
    }

    public static int getInt() {
        return sc.nextInt();
    }

    public static long getLong() {
        return sc.nextLong();
    }

    public static char getChar() {
        // skip whitespaces
        char c = readChar();
        while (Character.isWhitespace(c)) {
            c = readChar();
        }
        return c;
    }

    public static String getlnWord() {
        String x = getWord();
        sc.nextLine();
        return x;
    }

    public static String getWord() {
        return sc.next();
    }

    public static char getAnyChar() {
        return readChar();
    }

    private static char readChar() {
        try {
            return (char) System.in.read();
        } catch (IOException e) {
            throw new IllegalArgumentException("Attempt to read past EOF in std input");
        }
    }

    public static boolean eoln() {
        try {
            return (System.in.available() == 1);
        } catch (IOException e) {
            return true;
        }
    }

    public static void readFile(String string) {
    }

    public static double getDouble() {
        return 0;
    }

    public static void readStream(InputStream ins) {
    }
}
