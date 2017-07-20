package main;


public class DeskripsiPesan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String kode = ".--.--...-..-.--...-..--.-.---.-.-.---..--.---.-.-.--.-.....-......---.-...--..-.-.---..-..--...-..--..-.-.---..--.--....-.---..-..--.--.-.---.-.-..-......--....-.--..-...--....-.--.--...--....-.--.-.....-......--.-.--.--..-.-.--.--.-.--....-.--.--...--....-.---..--.--....-.--.---...-.--....-......--.-.--.--..-.-.--.-.-..---.-.-.--.--.-.---.-.-.--..-...--....-.--.---...-......--...-..--..-.-.---..-..--..--..--.-..-.--.-.--.--.-..-.---..-...-......--..-...--....-.--.---...-......--.-.--.--..-.-.---..--.--.----.--.--.-.--...-..--.----.--.---..--..---.--....-.--.---...-....-..-....-..-....----.--.-";
        String suffix = kode.substring(kode.length()-8,kode.length());//mengambil suffix(delapan bit terakhir)
        String suffix2 = suffix.replace('-', '0');//mengubah karakter '-' menjadi 0
        suffix2 = suffix2.replace('.', '1');//mengubah karakter '.' menjadi 1

        int angka_acak = Integer.parseInt(suffix2, 2);//mengubah suffix dari binner menjadi desimal

        String pesan = kode.substring(angka_acak,kode.length()-8);//mengambil pesan (membuang prefix dan suffix)
        String pesan2 = pesan.replace('.', '0');//mengubah karakter '.' menjadi 0
        pesan2 = pesan2.replace('-', '1');//mengubah karakter '-' menjadi 1

        String new_pesan = "";
        //membuat perulangan untuk menerjemahkan pesan
        for(int counter = 0;counter<pesan2.length()/8;counter++){
            String bit = pesan2.substring(8*counter, 8*(counter+1));//mengambil setiap delapan digit dari pesan
            int decimal = Integer.parseInt(bit, 2);//mengubah setiap delapan digit pesan dari biner menjadi desimal
            new_pesan +=(char)decimal;//mengubah desimal menjadi char, lalu menampilkannya
        }
        
		System.out.println(new_pesan);
	}

}
