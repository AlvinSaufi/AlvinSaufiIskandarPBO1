import Koneksi.Database;
import Model.Dosen;
import Model.Mahasiswa;
import Model.MataKuliah;

public class Main{
    public static void main(String [] args){
        System.out.println("Ini Program Main");
        Database.hubungkan();
        Dosen.tampilanInfo();
        Mahasiswa.tampilanInfo();
        MataKuliah.tampilanInfo();
    }
}