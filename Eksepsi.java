/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exceptionhandling;

/**
 *
 * @author ACER
 */
class Eksepsi
{
    static void tampil(String s)throws Exception
    {
        System.out.println("Tampil");
        if(s.equals("kayla"))
        {
            throw new MyException(s);
        }
        System.out.println("OK!");
    }
    public static void main(String[] args)throws Exception
    {
        try
        {
            tampil("ali");
            tampil("kayla");
        }
        catch(MyException ex)
        {
            System.out.println("Tangkap:"+ex);
        }
    }
}
