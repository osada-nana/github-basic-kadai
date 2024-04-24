package kadai_026;

public class JyankenExec_Chapter26 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Jyanken_Chapter26 janken = new Jyanken_Chapter26();
		
		String choice = janken.getMyChoice();
		String hand = janken.getRandom();
		
		janken.playGame(choice, hand);
	}

}
