package com.example.task02;

import java.io.*;
import java.nio.file.Path;
import java.util.Scanner;

public class Task02Main {
    public static void main(String[] args) throws IOException {
        // чтобы протестировать свое решение, вам нужно:
        // - направить файл input.test в стандартный ввод программы (в настройках запуска программы в IDE или в консоли)
        // - направить стандартный вывод программы в файл output.test
        // - запустить программу
        // - и сравнить получившийся файл output.test с expected.test
        int a = System.in.read();
        while (a != -1) {
            int b = System.in.read();
            if (!(a == 13 & b == 10)) {
                System.out.write(a);
            }
            a = b;
        }
        System.out.flush();
    }
}
