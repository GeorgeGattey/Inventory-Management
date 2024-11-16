package com.example.projectcode;

public class Main {
    public Main() {
        System.out.print("Recursive Test \n");
    }

    public void Recursive(int n) {
        if (n <= 0) {
            return;
        }
        System.out.print(n);
        Recursive(n - 1);
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.Recursive(6);
        System.out.println("\nDone!");
    }
}