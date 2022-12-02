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
public class data{
private final String nama;
private String alamat;
private String notelp;
private String email;
    public data (String temp) //CONSTRUCTOR
    {
        nama = temp;
    }
    
    public String getAlamat()  //ACCESSOR
    {
        return alamat;
    }
    public void setAlamat(String temp) //MUTATOR
    {
        alamat = temp;
    }
    
    public String getNotelp () //ACCESSOR
    {
        return notelp;
    }
    public void setNotelp (String temp) //MUTATOR
    {
        notelp = temp;
    }
    
    public String getEmail() //ACCESSOR
    {
        return email;
    }
    public void setEmail(String temp)  //MUTATOR
    {
        email = temp;
    }
    
    public void tampilkan() //CETAK
    {
        System.out.println("Nama : "+nama); //dari constructor
        System.out.println("Alamat : "+getAlamat());
        System.out.println("Nomor telp : "+getNotelp());
        System.out.println("Email : "+getEmail());
    }
}
