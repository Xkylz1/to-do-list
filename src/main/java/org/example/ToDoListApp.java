package org.example;

import java.io.File;
import java.io.FileNotFoundException;
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
//        showMenu();
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
        System.out.println("");
        System.out.print("Tekan [Enter] untuk kembali..");
        input.nextLine();
//        clearScreen();
    }

    static void readTodoList() {
        try {
            File file = new File(fileName);
            Scanner fileReader = new Scanner(file);

            // load isi file ke dalam array todoLists
            todoLists.clear();
            while (fileReader.hasNextLine()) {
                String data = fileReader.nextLine();
                todoLists.add(data);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Error karena: " + e.getMessage());
        }
    }

    static void showTodoList() {
        readTodoList();
        if (todoLists.size() > 0) {
            System.out.println("TODO LIST:");
            int index = 0;
            for (String data : todoLists) {
                System.out.println(String.format("[%d] %s", index, data));
                index++;
            }
        } else {
            System.out.println("Tidak ada data!");
        }

        if (!isEditing) {
            backToMenu();
        }
    }

    static void addTodoList() {
        System.out.println("Apa yang ingin kamu kerjakan?");
        System.out.print("Jawab: ");
        String newTodoList = input.nextLine();

        try {
            // tulis file
            FileWriter fileWriter = new FileWriter(fileName, true);
            fileWriter.append(String.format("%s%n", newTodoList));
            fileWriter.close();
            System.out.println("Berhasil ditambahkan!");
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan karena: " + e.getMessage());
        }

        backToMenu();
    }

    static void editTodoList() {
    }

    static void deleteTodoList() {
    }

}
