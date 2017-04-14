package practice01;

public class Prob5 {   //문제를 보는 시각을 달리하자. 숫자로 보지 말고 문자로 보자! -> CharAt() 사용.

	public static void main(String[] args) {
			
			int count = 0;
			for(int i =1; i <=99; i++)
			{
			  String s = String.valueOf(i);			  
	  		  
			  for(int j = 0; j < s.length(); j++)
			  {					 
				  if(s.charAt(j) == '3' || s.charAt(j) == '6'|| s.charAt(j) == '9' )
				  {  
					  count++;					  
				  }
			  }		 
			  
			 
			  count = 0;				  			  
			}
	}
}