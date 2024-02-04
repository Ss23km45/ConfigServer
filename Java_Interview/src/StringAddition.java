import java.util.ArrayList;
import java.util.List;

public class StringAddition {
	
	 static int leftOver = 0;
	 
	static StringBuilder abc = new StringBuilder();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Long time = System.currentTimeMillis();
		 String a="1234767474";
		 String b=  "67988586464536";
		 //        130274
	 int alen = a.length()-1;
	 int blen = b.length()-1;

		while(Math.max(alen,blen)>= 0){
			int ai = 0, bi=0;
			if(alen >= 0){
				String str = a.charAt(alen)+"";
				 ai = Integer.parseInt(str);
				 
			}
			
			if(blen >= 0){
				 bi = Integer.parseInt(b.charAt(blen)+"");
			}
			
			
			int sum = 0;
			if(leftOver==0){
				sum = ai + bi;
			}else{
				sum = ai + bi + leftOver;
			}
			
			sumAddList(sum);
			
			
			
			if(alen == 0){
				blen--;
				while(blen >=0){
					bi = Integer.parseInt(b.charAt(blen)+"");
					if(leftOver!=0){
						sumAddList(bi +leftOver );
					}else {
						sumAddList(bi);
					}
					
					blen--;
				}
			}else if(blen == 0){
				alen--;
				while(alen >=0){
					bi = Integer.parseInt(a.charAt(alen)+"");
					if(leftOver!=0){
						sumAddList(bi +leftOver );
					}else {
						sumAddList(bi);
					}
					alen--;
				}
			}
			
			alen--;
			blen--;
			
		}
		
	
	System.out.print(System.currentTimeMillis() - time + " Time took to run this program " + abc.reverse().toString());
	
}


static void sumAddList(int sum){
	 int i=0,j=0;
	
	if(sum >= 10){
			i = sum % 10;
			j = sum / 10;
			leftOver = j;
			abc.append(Integer.toString(i));
		}else{
			leftOver = sum/10;
			abc.append(Integer.toString(sum));
		}
	}
}