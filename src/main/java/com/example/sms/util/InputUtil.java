package com.example.sms.util;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * Console input helper providing validated reads and simple error messages.
 * Centralizes input handling to keep the main application logic clean.
 */
public final class InputUtil {
    private static final Scanner SCANNER = new Scanner(System.in);
    private static final Pattern EMAIL_PATTERN = Pattern.compile("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$");

    private InputUtil() {}

    /**
     * Reads an integer within [min, max], re-prompting on errors.
     */
    public static int readInt(String prompt, int min, int max) {
        while (true) {
            System.out.print(prompt);
            String line = SCANNER.nextLine().trim();
            try {
                int value = Integer.parseInt(line);
                if (value < min || value > max) {
                    System.out.println("Invalid number. Expected between " + min + " and " + max + ".");
                    continue;
                }
                return value;
            } catch (NumberFormatException e) {
                System.out.println("Invalid number. Try again.");
            }
        }
    }

    /**
     * Reads a non-empty string, trimming whitespace.
     */
    public static String readNonEmptyString(String prompt) {
        while (true) {
            System.out.print(prompt);
            String line = SCANNER.nextLine().trim();
            if (line.isEmpty()) {
                System.out.println("Value cannot be empty.");
                continue;
            }
            return line;
        }
    }

    /**
     * Reads an email string that matches a basic regex pattern.
     */
    public static String readEmail(String prompt) {
        while (true) {
            System.out.print(prompt);
            String email = SCANNER.nextLine().trim();
            if (!EMAIL_PATTERN.matcher(email).matches()) {
                System.out.println("Invalid email format.");
                continue;
            }
            return email;
        }
    }
}
