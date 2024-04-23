package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {

	public void dictionary(String[] fluit) {
		// TODO 自動生成されたメソッド・スタブ
		HashMap<String,String> dictionary = new HashMap<String,String>();

		dictionary.put("apple","りんご");
		dictionary.put("peach","桃");
		dictionary.put("banana","バナナ");
		dictionary.put("lemon","レモン");
		dictionary.put("pear","梨");
		dictionary.put("kiwi","キウイ");
		dictionary.put("strawberry","いちご");
		dictionary.put("grape","ぶどう");
		dictionary.put("muscat","マスカット");
		dictionary.put("cherry","さくらんぼ");

	for (int i =0; i< fluit.length; i++) {
		if(null == dictionary.get(fluit[i])){
			System.out.println(fluit[i] + "は辞書に存在しません");
			
		} else {
			System.out.println(fluit[i] + "の意味は" + dictionary.get(fluit[i]));  
		}
		
	}
	
	} 

}
