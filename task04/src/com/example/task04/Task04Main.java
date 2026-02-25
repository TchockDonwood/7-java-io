package com.example.task04;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Locale;
import java.util.Scanner;

public class Task04Main {
    public static void main(String[] args) throws IOException {
        // чтобы протестировать свое решение, вам нужно:
        // - направить файл input.test в стандартный ввод программы (в настройках запуска программы в IDE или в консоли)
        // - запустить программу
        // - проверить, что получилось 351.731900
        Scanner in = new Scanner(System.in);
        double sum = 0;
        while (in.hasNext()) {
            try {
                sum += Double.parseDouble(in.next());
            } catch (Exception e) {
            }
        }
        System.out.printf(Locale.US,"%.6f", sum);
    }

}
