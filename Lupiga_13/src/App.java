class Student {
	
	String ime;
	String prezime;
	String brojindeksa;
	int godine;
	
	void student () {
		System.out.println("IME I PREZIME STUDENTA: "+ime+" "+prezime);
		System.out.println("GODINA: "+godine);
		System.out.println("BROJ INDEKSA: "+brojindeksa);
	}
	
}


public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student student1=new Student();
		Student student2=new Student();
		
		student1.ime="Marko";
		student1.prezime="Markovic";
		student1.brojindeksa="4589/16";
		student1.godine=25;
		
		student2.ime="Peetar";
		student2.prezime="Petrovic";
		student2.brojindeksa="568/15";
	    student2.godine=26;
	    
	    System.out.println("STUDENT: "+student1.ime+" "+student1.prezime+" BROJ INDEKSA: "+student1.brojindeksa+" GODINA: "+student1.godine);
	    System.out.println("STUDENT: "+student2.ime+" "+student2.prezime+" BROJ INDEKSA: "+student2.brojindeksa+" GDOINA: "+student2.godine);
		
	    student1.student();
	    student2.student();
	
	}

}
