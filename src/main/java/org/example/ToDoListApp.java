package org.example;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
public class ToDoListApp {

    // deklarasi variabel global
    static String fileName;
    static ArrayList<String> todoLists;
    static boolean isEditing = false;
    static Scanner input;

    public static void main(String[] args) {

    }


    static void showMenu() {
        System.out.println("=== TODO LIST APP ===");
        System.out.println("[1] Lihat Todo List");
        System.out.println("[2] Tambah Todo List");
        System.out.println("[3] Edit Todo List");
        System.out.println("[4] Hapus Todo List");
        System.out.println("[0] Keluar");
        System.out.println("---------------------");
        System.out.print("Pilih menu> ");

        String selectedMenu = input.nextLine();

        if (selectedMenu.equals("1")) {
            showTodoList();
        } else if (selectedMenu.equals("2")) {
            addTodoList();
        } else if (selectedMenu.equals("3")) {
            editTodoList();
        } else if (selectedMenu.equals("4")) {
            deleteTodoList();
        } else if (selectedMenu.equals("0")) {
            System.exit(0);
        } else {
            System.out.println("Kamu salah pilih menu!");
            backToMenu();
        }
    }

    static void backToMenu() {
    }

    static void readTodoList() {
    }

    static void showTodoList() {
    }

    static void addTodoList() {
    }

    static void editTodoList() {
    }

    static void deleteTodoList() {
    }

}
