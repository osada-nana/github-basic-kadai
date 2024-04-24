package kadai_026;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter26 {

	
	
	public String getMyChoice() {
	System.out.println("自分のじゃんけんの手を入力しましょう");
	System.out.println("グーはrockのrを入力しましょう");
	System.out.println("チョキはscissorsのsを入力しましょう");
	System.out.println("パーはpaperのpを入力しましょう");
	
	
	while(true) {
	Scanner scanner = new Scanner (System.in);
	String choice =  scanner.next();
	if(choice.equals("r") ||choice.equals ("s") || choice.equals("p")) {
		scanner.close();
		return choice;
	} else {
		System.out.println("正しい値ではありません");
	}
	}
		
	}
	
	
	public String getRandom() {
		String[] hand = {"r","s","p"};
		int i =(int)Math.floor (Math.random()*3);
		return hand [i];
		
	}
	
	
	
	
	public void playGame(String choice,String hand) {
		HashMap<String,String> play = new HashMap<String,String>();
		
		play.put("r","グー");
		play.put("s","チョキ");
		play.put("p","パー");
		
		System.out.println("自分の手は" + play.get(choice)+ ",対戦相手の手は" + play.get(hand));
		
		if(choice.equals(hand)) {
			System.out.println("あいこです");
		} else if (choice.equals("r") && hand.equals("s") || choice.equals("s") && hand.equals("p") || choice.equals("p") && hand.equals("r") ) {
			System.out.println("自分の勝ちです");
		} else {
			System.out.println("自分の");
		}
	}
	
		 
	
}
