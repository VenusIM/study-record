package ch02.item09.try_finally;

import java.io.*;

public class Reader {
    public BufferedReader init(String path) throws FileNotFoundException {
        BufferedReader bufferedReader = null;
        bufferedReader = new BufferedReader(new FileReader(path));

        return bufferedReader;
    }
}
