package com.example.decoratorpattern.realworld;

import org.junit.jupiter.api.Test;
import org.springframework.util.FastByteArrayOutputStream;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

class LowerCaseInputStreamTest {

    @Test
    void read() {
        int c;
        try {
            InputStream in =
                    new LowerCaseInputStream(
                            new BufferedInputStream(
                                    new FileInputStream("src/test/resources/input" + ".txt")));
            ByteArrayOutputStream buf = new ByteArrayOutputStream();
            for (int result = in.read(); result != -1; result = in.read()) {
                buf.write((byte) result);
            }
            System.out.println(buf.toString(StandardCharsets.UTF_8.name()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
