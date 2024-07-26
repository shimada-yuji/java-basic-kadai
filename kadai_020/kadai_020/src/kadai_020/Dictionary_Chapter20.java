package kadai_020;
import java.util.HashMap;

public class Dictionary_Chapter20 {
	public  void jisyo(String[] search) {
		
		
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
		
		for (String searchValue:search) {
			if(jisyo.get(searchValue)==null) {
				System.out.println(searchValue+"は辞書に存在しません");
			}else {
				System.out.println(searchValue+"の意味は"+jisyo.get(searchValue));	
			}
		}
		
	}
}

