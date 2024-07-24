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
		
		if(jisyo.containsKey("apple")) {
			System.out.println("appleの意味は"+jisyo.get("apple"));
		}else if(jisyo.containsKey("peach")) {
			System.out.println("peachの意味は"+jisyo.get("peach"));
		}else if(jisyo.containsKey("banana")) {
			System.out.println("bananaの意味は"+jisyo.get("banana"));
		}else if(jisyo.containsKey("lemon")) {
			System.out.println("lemonの意味は"+jisyo.get("lemon"));
		}else if(jisyo.containsKey("pear")) {
			System.out.println("pearの意味は"+jisyo.get("pear"));
		}else if(jisyo.containsKey("kiwi")) {
			System.out.println("kiwiの意味は"+jisyo.get("kiwi"));
		}else if(jisyo.containsKey("strawbery")) {
			System.out.println("strawberyの意味は"+jisyo.get("strawbery"));
		}else if(jisyo.containsKey("grape")) {
			System.out.println("grapeの意味は"+jisyo.get("grape"));
		}else if(jisyo.containsKey("muscat")) {
			System.out.println("muscatの意味は"+jisyo.get("muscat"));
		}else if(jisyo.containsKey("cherry")) {
			System.out.println("cherryの意味は"+jisyo.get("cherry"));
		}
		
		if(jisyo.get("orange")==null) {
			System.out.println("orangeは辞書に存在しません");
		}else {
			System.out.println("orangeの意味は"+jisyo.get("orange"));
		}
		
	}
	

}
