
public class Main {

	public static void main(String[] args) {
		char grade = 'A';
		
		switch(grade) {
		case'A':
			System.out.println("Mükemmel Geçtiniz!");
			break;
		case 'B':
			System.out.println("İyi Geçtiniz");
			break;
		case 'C':
			System.out.println("Geçtiniz");
			break;
		case 'F':
			System.out.println("Kaldınız");
			break;
		default:
			System.out.println("Geçersiz Not");
			
		}

	}

}
