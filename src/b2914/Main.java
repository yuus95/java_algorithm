package b2914;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        solution();
    }

    public static void solution() {
        Scanner sc = new Scanner(System.in);
        String inp = sc.nextLine();
        int count = 0;
        for (int i = 0; i < inp.length(); i++) {
            if (inp.charAt(i) == 'c') {
                if (i + 1 < inp.length()) {
                    if (inp.charAt(i + 1) == '=' || inp.charAt(i + 1) == '-') {
                        i++;
                    }
                }
            } else if (inp.charAt(i) == 'd') {
                if (i + 1 < inp.length()) {
                    if (inp.charAt(i + 1) == 'z') {
                        if ( i + 2 < inp.length() && inp.charAt(i + 2) == '=') {
                            i=i+2;

                        }
                    }
                    else if (inp.charAt(i + 1) == '-') {
                        i++;
                    }
                }
            } else if (inp.charAt(i) == 'l') {
                if (i + 1< inp.length()) {
                    if (inp.charAt(i + 1) == 'j') {
                        i++;
                    }
                }
            } else if (inp.charAt(i) == 'n') {
                if (i + 1 < inp.length()) {
                    if (inp.charAt(i + 1) == 'j') {
                        i++;
                    }
                }
            } else if (inp.charAt(i) == 's') {
                if (i + 1< inp.length()) {
                    if (inp.charAt(i + 1) == '=') {
                        i++;
                    }
                }
            } else if (inp.charAt(i) == 'z') {
                if (i + 1< inp.length()) {
                    if (inp.charAt(i + 1) == '=') {
                        i++;
                    }
                }
            }
            count++;
        }
        System.out.println(count);
    }
}