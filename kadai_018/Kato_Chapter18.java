package kadai_018;

abstract public class Kato_Chapter18 {

	public String familyName; 
	public String givenName ;
	public String address ;
	
	public void commonlntroduce () {
		this.familyName = "加藤";
		this.address = "東京都中野区〇×";
				
		System.out.println("名前は" + familyName + givenName + "です");
		System.out.println("住所は" + address + "です");
	
	}
	
	abstract void  eachIntroduce ();
	public void execIntroduce () {
		commonlntroduce ();
		 eachIntroduce ();
		 System.out.println();
		
	}
	
		
		
	}


