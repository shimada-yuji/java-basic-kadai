package kadai_017;

abstract public class Kato_Chapter17 {
	
	public String familyName="加藤";
	public String givenName="";
	public String address="住所は東京都中野区〇×";
	
	public void commonIntroduce() { 
		System.out.println("名前は"+this.familyName+this.givenName+"です");
		System.out.println("住所は"+this.address+"です");
	}
	abstract public void eachIntroduce() ;
	public void execIntroduce() {
		this.commonIntroduce();
		this.eachIntroduce();
		
	}

}
	
