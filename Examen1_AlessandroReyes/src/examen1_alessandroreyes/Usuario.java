package examen1_alessandroreyes;

import java.util.ArrayList;
import java.util.Date;

public class Usuario {
    private String n_usuario;
    private String contraseña;
    private Date naci;
    private int num_tel;
    private String email;
    private String gen_fav;
    private ArrayList<Libro> lista= new ArrayList();

    public Usuario() {
    }

    public Usuario(String n_usuario, String contraseña) {
        this.n_usuario = n_usuario;
        this.contraseña = contraseña;
    }
    
    public Usuario(String n_usuario, String contraseña, Date naci, int num_tel, String email, String gen_fav) {
        this.n_usuario = n_usuario;
        this.contraseña = contraseña;
        this.naci = naci;
        this.num_tel = num_tel;
        this.email = email;
        this.gen_fav = gen_fav;
    }

    public String getN_usuario() {
        return n_usuario;
    }

    public void setN_usuario(String n_usuario) {
        this.n_usuario = n_usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public Date getNaci() {
        return naci;
    }

    public void setNaci(Date naci) {
        this.naci = naci;
    }

    public int getNum_tel() {
        return num_tel;
    }

    public void setNum_tel(int num_tel) {
        this.num_tel = num_tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGen_fav() {
        return gen_fav;
    }

    public void setGen_fav(String gen_fav) {
        this.gen_fav = gen_fav;
    }

    public ArrayList<Libro> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Libro> lista) {
        this.lista = lista;
    }
    
}
