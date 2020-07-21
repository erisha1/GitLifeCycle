

public class CharacterCount {
	
	public static void frequencyChar(String str)
	{
		
		int i=0;
		int j=0;
		int[] count = new int[str.length()];  
		int length = str.length();
		for(i=0;i<=length;i++)
			for(j=i+1;j<length;j++)
			{
			if(str.charAt(i)==str.charAt(j))
			{
				count[i]++;
				
			}
			
			}
		   for(i = 0; i <count.length; i++) {  
	            if(str.charAt(i)!= ' ' && str.charAt(i) != '0')  
	                System.out.println(str.charAt(i) + "-" + count[i]);  
		
			}
	}

	public static void main(String[] args) {
		String word = "selenium";
		
		frequencyChar(word);
	}

}
