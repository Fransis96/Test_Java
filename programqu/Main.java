package programqu;

class data{
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

	public static void main(String[] args){
		
		System.out.println("Halo Dunia!");
	}
}