package LanQianBei16th.LqTest.Demo07;

import java.util.Scanner;

/**
 * 不完整的算式
 * @author QIA
 * @create 2025-04-08-16:59
 */
public class Main67 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] parts = input.split("=");
        String left = parts[0];
        String right = parts[1];

        if (right.equals("?")) {
            handleMissingC(left);
        } else {
            long C = Long.parseLong(right);
            handleLeftMissing(left, C);
        }
    }

    private static void handleMissingC(String left) {
        for (int i = 0; i < left.length(); i++) {
            char c = left.charAt(i);
            if (c == '+' || c == '-' || c == '*' || c == '/') {
                String aStr = left.substring(0, i);
                String bStr = left.substring(i + 1);
                if (isNumber(aStr) && isNumber(bStr)) {
                    long A = Long.parseLong(aStr);
                    long B = Long.parseLong(bStr);
                    long result = calculate(A, B, c);
                    System.out.println(result);
                    return;
                }
            }
        }
    }

    private static void handleLeftMissing(String left, long C) {
        String[] splitByQuestion = left.split("\\?");
        if (splitByQuestion.length == 2) {
            String aStr = splitByQuestion[0];
            String bStr = splitByQuestion[1];
            if (aStr.length() > 0 && bStr.length() > 0 && isNumber(aStr) && isNumber(bStr)) {
                long A = Long.parseLong(aStr);
                long B = Long.parseLong(bStr);
                for (char op : new char[]{'+', '-', '*', '/'}) {
                    if (op == '/' && B == 0) continue;
                    long res = calculate(A, B, op);
                    if (res == C) {
                        if (isValidOp(A, B, op, res)) {
                            System.out.println(op);
                            return;
                        }
                    }
                }
            }
        }

        for (int i = 0; i < left.length(); i++) {
            char c = left.charAt(i);
            if (c == '+' || c == '-' || c == '*' || c == '/') {
                String aStr = left.substring(0, i);
                String op = String.valueOf(c);
                String bStr = left.substring(i + 1);
                boolean aIsQuestion = aStr.equals("?");
                boolean bIsQuestion = bStr.equals("?");
                if (aIsQuestion ^ bIsQuestion) {
                    String otherPart = aIsQuestion ? bStr : aStr;
                    if (isNumber(otherPart)) {
                        long otherValue = Long.parseLong(otherPart);
                        if (aIsQuestion) {
                            handleMissingA(C, op.charAt(0), otherValue);
                        } else {
                            handleMissingB(C, op.charAt(0), otherValue);
                        }
                    }
                }
            }
        }
    }

    private static void handleMissingA(long C, char op, long B) {
        switch (op) {
            case '+':
                long A = C - B;
                if (A >= 0 && isValidNumber(A)) {
                    System.out.println(A);
                    return;
                }
                break;
            case '-':
                A = C + B;
                if (A >= 0 && isValidNumber(A)) {
                    System.out.println(A);
                    return;
                }
                break;
            case '*':
                if (B == 0) {
                    if (C == 0) {
                        System.out.println(0);
                        return;
                    }
                } else {
                    if (C % B == 0) {
                        A = C / B;
                        if (A >= 0 && isValidNumber(A)) {
                            System.out.println(A);
                            return;
                        }
                    }
                }
                break;
            case '/':
                if (B != 0) {
                    A = C * B;
                    if (A >= 0 && isValidNumber(A)) {
                        if (A / B == C) {
                            System.out.println(A);
                            return;
                        }
                    }
                }
                break;
        }
    }

    private static void handleMissingB(long C, char op, long A) {
        switch (op) {
            case '+':
                long B = C - A;
                if (B >= 0 && isValidNumber(B)) {
                    System.out.println(B);
                    return;
                }
                break;
            case '-':
                B = A - C;
                if (B >= 0 && isValidNumber(B)) {
                    System.out.println(B);
                    return;
                }
                break;
            case '*':
                if (A == 0) {
                    if (C == 0) {
                        System.out.println(0);
                        return;
                    }
                } else {
                    if (C % A == 0) {
                        B = C / A;
                        if (B >= 0 && isValidNumber(B)) {
                            System.out.println(B);
                            return;
                        }
                    }
                }
                break;
            case '/':
                if (C == 0) {
                    if (A == 0) {
                        return;
                    }
                    B = 0;
                    if (isValidNumber(B)) {
                        System.out.println(B);
                        return;
                    }
                } else {
                    if (A % C == 0) {
                        B = A / C;
                        if (B > 0 && isValidNumber(B)) {
                            if (A / B == C) {
                                System.out.println(B);
                                return;
                            }
                        }
                    }
                }
                break;
        }
    }

    private static long calculate(long a, long b, char op) {
        switch (op) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                if (b == 0) return Long.MIN_VALUE;
                return a / b;
            default:
                return Long.MIN_VALUE;
        }
    }

    private static boolean isNumber(String s) {
        if (s.isEmpty()) return false;
        if (s.charAt(0) == '0' && s.length() > 1) return false;
        for (char c : s.toCharArray()) {
            if (!Character.isDigit(c)) return false;
        }
        return true;
    }

    private static boolean isValidNumber(long x) {
        if (x == 0) return true;
        String s = String.valueOf(x);
        return s.charAt(0) != '0';
    }

    private static boolean isValidOp(long a, long b, char op, long res) {
        if (op == '/') {
            return a == res * b;
        }
        return true;
    }
}
