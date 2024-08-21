public class Guru {
  //Object Class
  int id;
  String nama, mapel, alamat;
  

  //Constructor nama sama dgn nama Class
  public Guru() {
    id = 0;
    nama = "";
    mapel = "";
    alamat = "";
    
  }

  //Constructor Parameter
  public Guru (int id, String nama, String mapel, String alamat ) {
    this.id = id;
    this.nama = nama;
    this.mapel = mapel;
    this.alamat = alamat;
  }

  //Method
  public void print () {
    System.out.println("----------------------");
    System.out.println("Id: " + id);
    System.out.println("Nama: " + nama);
    System.out.println("Mapel :" + mapel);
    System.out.println("Alamat: " + alamat);
    System.out.println("-----------------------");
  }
}


