import java.util.Scanner;
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Vase ime:");
		
		String ime=input.nextLine();
		
		System.out.println("Vase prezime:");
		
		String prezime=input.nextLine();
		
		System.out.println("Datum rodjenja:");
		
		String datumrodjenja=input.nextLine();
		
		System.out.println("Pol:");
		
		String pol=input.nextLine();
		
		
		
		System.out.println("Podaci o licu");
		System.out.println("Ime i prezime: "+ime+" "+prezime);
		System.out.println("Rodjen :"+datumrodjenja+". godine");
		System.out.println("Pol: "+pol);
		
		input.close();

	}

}
