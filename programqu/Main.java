package programqu;

import java.util.Scanner;

class Data{
	private String nama;
	private String nim;
	private String jurusan;

	public void setNama(String nama){ this.nama = nama; }
	public void setNim(String nim){ this.nim = nim; }
	public void setJurusan(String jurusan){ this.jurusan = jurusan; }

	public String getNama(){ return nama; }
	public String getNim(){ return nim; }
	public String getJurusan(){ return jurusan; }
}


public class Main{

	static Data data = new Data();

	public static void inputData(){
		
		Scanner in = new Scanner(System.in);

		System.out.println("    Pengisian Data   ");
		System.out.println("---------------------");
		System.out.print("Masukan Nama : ");
		String nama = in.nextLine();
		System.out.print("Masukan NIM  : ");
		String nim = in.nextLine();
		System.out.print("Masukan Jurusan : ");
		String jur = in.nextLine();

		data.setNama(nama);
		data.setNim(nim);
		data.setJurusan(jur);
	}

	public static void cetakData(){
		System.out.println("------------------------");
		System.out.println("    Data Mahasiswa 1    ");
		System.out.println("------------------------");
		System.out.println("Nama    : "+data.getNama());
		System.out.println("NIM     : "+data.getNim());
		System.out.println("Jurusan : "+data.getJurusan());
	}

	public static void main(String[] args){

		// Data data = new Data();

		// data.setNama("Fransis");
		// data.setNim("215410072");
		// data.setJurusan("Informatika");

		inputData();
		cetakData();
	}
}