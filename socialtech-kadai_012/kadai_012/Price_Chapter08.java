package text.section_05;

public class Price_Chapter08 {
	public static void main(String[] args) {
		int userAge = 30;
		int serviceCost = ;
		
		serviceCost = switch(userAge) {
		case 10 -> 1000;
		case 20 -> 2000;
		case 30 -> 3000;
		default -> 500;
		};
		
		switch(userAge) {
		case 10 -> System.out.println("10代の料金は1000円です");
		case 20 -> System.out.println("20代の料金は2000円です");
		case 30 -> System.out.println("30代の料金は3000円です");
		case 40 -> System.out.println("40代の料金は3000円です");
		case 50 -> System.out.println("50代の料金は4000円です");
		case 60 -> System.out.println("60代の料金は4000円です");
		case 70 -> System.out.println("70代の料金は4000円です");
		case 80 -> System.out.println("80代の料金は5000円です");
		default -> System.out.println("500円です");
		}
	}

}
