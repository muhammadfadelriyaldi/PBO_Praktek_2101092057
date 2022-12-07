/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fadel021222;

/**
 *
 * @author Muhammad Fadel R
 */
public class utama
{
    public static void main(String[]args)
    {
        data a = new data("Fadel");
        data b = new data("Muhammad Fadel Riyaldi ");
        a.setAlamat("Lolong");
        a.setNotelp("082171181130");
        a.setEmail("muhammadfadhelriyaldi@gmail.com");
        a.tampilkan();
        b.setAlamat("belanti");
        b.setNotelp("082171181130");
        b.setEmail("muhammadfadhelriyaldi@gmail.com");
        b.tampilkan();
    }
}