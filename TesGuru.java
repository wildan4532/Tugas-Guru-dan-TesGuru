import java.util.Scanner;

public class TesGuru {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Nama: ");
        String nama = in.nextLine();
        System.out.println("Mapel: ");
        String mapel = in.nextLine();
        System.out.println("Alamat: ");
        String alamat = in.nextLine();
        System.out.println("Id: ");
        int id = in.nextInt();

        //Membuat Objek
        Guru buPasha = new Guru();
        Guru pakMunif = new Guru();
        Guru buFeni = new Guru();
        Guru buAulia = new Guru();
        Guru pakDiaur = new Guru();

        System.out.println("---------------------");

        buPasha.id = 1;
        buPasha.nama = "Bu Pashatania";
        buPasha.mapel = "Produktif RPL";
        buPasha.alamat = "Malang";
        System.out.println("INI DATA BU PASHA");
        System.out.println("Id: "+buPasha.id);
        System.out.println("Nama: "+buPasha.nama);
        System.out.println("Mapel: "+buPasha.mapel);
        System.out.println("Alamat: "+buPasha.alamat);

        System.out.println("---------------------");

        pakMunif.id = 2;
        pakMunif.nama = "Pak Munif";
        pakMunif.mapel = "PAI";
        pakMunif.alamat = "Kediri";
        System.out.println("INI DATA PAK MUNIF");
        System.out.println("Id: "+pakMunif.id);
        System.out.println("Nama: "+pakMunif.nama);
        System.out.println("Mapel: "+pakMunif.mapel);
        System.out.println("Alamat: "+pakMunif.alamat);
        
        System.out.println("---------------------");

        buFeni.id = 3;
        buFeni.nama = "Bu Fenilya";
        buFeni.mapel = "Matematika";
        buFeni.alamat = "Malang";
        System.out.println("INI DATA BU FENILYA");
        System.out.println("id: "+buFeni.id);
        System.out.println("Nama: "+buFeni.nama);
        System.out.println("Mapel: "+buFeni.mapel);
        System.out.println("Alamat: "+buFeni.alamat);
        
        System.out.println("---------------------");

        buAulia.id =4;
        buAulia.nama = "Bu Aulia"; 
        buAulia.mapel = "Produktif RPL";
        buAulia.alamat = "Malang";
        System.out.println("INI DATA BU AULIA");
        System.out.println("Id: " + buAulia.id);
        System.out.println("Nama: "+buAulia.nama);
        System.out.println("Mapel: "+buAulia.mapel);
        System.out.println("Alamat: "+buAulia.alamat);

        System.out.println("---------------------");

        pakDiaur.id = 5;
        pakDiaur.nama = "Pak Diaur Aja";
        pakDiaur.mapel = "Olahraga/IPAS";
        pakDiaur.alamat = "Malang";
        System.out.println("INI DATA PAK DIAUR");
        System.out.println("id: " + pakDiaur.id);
        System.out.println("Nama: " + pakDiaur.nama);
        System.out.println("Mapel: " + pakDiaur.mapel);
        System.out.println("Alamat: " + pakDiaur.alamat);

        System.out.println("---------------------");



    }
}
