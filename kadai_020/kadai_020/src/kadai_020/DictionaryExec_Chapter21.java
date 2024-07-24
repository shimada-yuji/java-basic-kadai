package kadai_020;

public class DictionaryExec_Chapter21 {
	public static void main(String[] args) {
		Dictionary_Chapter20 dictionary=new Dictionary_Chapter20() ;
		String[] tanngo= {"apple","banana","grape","orange"};
		dictionary.jisyo();
		for(int i=0;i<=tanngo.length;i++) {
			System.out.println(tanngo[i]);
		}
	
    }

}
