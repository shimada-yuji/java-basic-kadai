package kadai_024;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter24 {
	
	public String getMyChoice() {
		System.out.println("自分のじゃんけんの手を入力しましょう");
		System.out.println("グーはrockのrを入力しましょう");
		System.out.println("チョキはscissorsのsを入力しましょう");
		System.out.println("パーはpaperのpを入力しましょう");
		Scanner scanner=new Scanner(System.in);
		String input=scanner.nextLine();
		System.out.println(input);
		scanner.close();
		if(input.equals("r")) {
			return input;
		}else if(input.equals("s")){
			return input;
		}else if(input.equals("p")){
			return input;
		}else {
			System.out.println(input+"はエラーです");
			return input;
		}
	}
	public String getRandom() {
		String[] aite= {"グー","チョキ","パー"};
		String value = aite[(int)Math.floor(Math.random()*3)];
		return value;
	}
	public void playGame(String myHand) {
		HashMap<String,String> jyanken=new HashMap<String,String>();
		jyanken.put("r","グー");
		jyanken.put("s","チョキ");
		jyanken.put("p","パー");
		String myHand2=jyanken.get(myHand);
		String yourHand=getRandom();
		System.out.println("自分の手は"+myHand2+",対戦相手の手は"+getRandom());
		if(myHand2.equals(yourHand)) {
			System.out.println("あいこです");
		}else if(myHand2.equals("グー")&&(yourHand.equals("チョキ"))) {
			System.out.println("自分の勝ちです");
		}else if(myHand2.equals("グー")&&(yourHand.equals("パー"))) {
			System.out.println("自分の負けです");
		}else if(myHand2.equals("チョキ")&&(yourHand.equals("パー"))) {
			System.out.println("自分の勝ちです");
		}else if(myHand2.equals("チョキ")&&(yourHand.equals("グー"))) {
			System.out.println("自分の負けです");
		}else if(myHand2.equals("パー")&&(yourHand.equals("グー"))) {
			System.out.println("自分の勝ちです");
		}else if(myHand2.equals("パー")&&(yourHand.equals("チョキ"))) {
			System.out.println("自分の負けです");
		}
	}
}
