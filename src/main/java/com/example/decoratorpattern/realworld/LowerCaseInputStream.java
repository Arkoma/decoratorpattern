package com.example.decoratorpattern.realworld;

import java.io.FileNotFoundException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class LowerCaseInputStream  extends FilterInputStream {
    public LowerCaseInputStream(InputStream in) throws FileNotFoundException {
        super(in);
    }

    public int read() throws IOException {
        int c = in.read();
        int endOfInput = -1;
        return (c == endOfInput ? c : Character.toLowerCase((char) c));
    }

    public int read(byte[] b, int offset, int len) throws IOException {
        int result = in.read(b, offset, len);
        for (int i = offset; i < offset + result; i++) {
            b[i] = (byte) Character.toLowerCase((char) b[i]);
        }
        return result;
    }
}
