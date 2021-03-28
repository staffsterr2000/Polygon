package project1;

import java.io.*;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws IOException {
        Date start = new Date();
        while (true) {
            String current;
            System.out.print(current = (new Date().getTime() - start.getTime()) + " ms.");
            for (int i = 0; i < current.length(); i++) {
                System.out.write('\b');
            }
        }

    }
}
