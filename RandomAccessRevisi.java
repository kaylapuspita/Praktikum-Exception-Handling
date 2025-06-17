/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exceptionhandling;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 *
 * @author ACER
 */
public class RandomAccessRevisi {
    public static void main(String[] args) {
        String bookList[]={"Satu","Dua","Tiga"};
        int yearList[]={1920,1230,1940};
        try
        {
            RandomAccessFile books = new RandomAccessFile
        ("books.txt","rw");
            for(int i=0;i<3;i++)
            {
                books.writeUTF(bookList[i]);
                books.writeInt(yearList[i]);
            }
            books.seek(0);
            System.out.println(books.readUTF()+" "+books.readInt());
            System.out.println(books.readUTF()+ " "+books.readInt());
            books.close();
        }
        catch(IOException e)
        {
            System.out.println("Indeks melebihi batas");
        }
        System.out.println("test");
    }
}
