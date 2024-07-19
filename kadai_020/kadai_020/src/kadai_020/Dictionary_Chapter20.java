package kadai_020;
import java.util.HashMap;

public class Dictionary_Chapter20 {
	public  void jisyo() {
		
		
		HashMap<String,String> jisyo=new HashMap<String,String>();
		jisyo.put("apple","りんご");
		jisyo.put("peach","桃");
		jisyo.put("banana","バナナ");
		jisyo.put("lemon","レモン");
		jisyo.put("pear","梨");
		jisyo.put("kiwi","キウィ");
		jisyo.put("strawberry","いちご");
		jisyo.put("grape","ぶどう");
		jisyo.put("muscat","マスカット");
		jisyo.put("cherry","さくらんぼ");
		jisyo.put("orange", null);
		System.out.println("appleの意味は"+jisyo.get("apple"));
		System.out.println("bananaの意味は"+jisyo.get("banana"));
		System.out.println("grapeの意味は"+jisyo.get("grape"));
		if(jisyo.get("orange")==null) {
			System.out.println("orangeは辞書に存在しません");
		}else {
			System.out.println("orangeの意味は"+jisyo.get("orange"));
		}
		
	}
	

}
