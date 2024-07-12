package syntaxbase;

public class Prime_Chapter11 {
	public static void main(String[] args) {
		boolean[] num = new boolean[101];
		        
		        // 配列をtrueで初期化
		        for (int i = 0; i < num.length; i++) {
		            num[i] = true;
		        }

		        // 素数かどうかの判定
		        for (int j = 2; j < num.length; j++) {
		            for (int r = 2; r < j; r++) {
		                if (j % r == 0) {
		                    num[j] = false;
		                }
		            }
		        }

		        // 素数の出力
		        for (int k = 2; k < num.length; k++) {
		            if (num[k]==true) {
		                System.out.println(k);
		            }
		        }
		    }
		}