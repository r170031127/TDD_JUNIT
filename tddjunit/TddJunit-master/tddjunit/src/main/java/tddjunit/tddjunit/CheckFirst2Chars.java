package tddjunit.tddjunit;

public class CheckFirst2Chars {

	public String checkFirst(String string) {
		int n=string.length();
		String str="";
		if(n==0)
		{
			str="";
		}
		else if(n==1)
		{
			if(string.charAt(0)!='A')
			{
				str=str+string.charAt(0);
			}
		}
		else
		{
			if(string.charAt(0)!='A')
			{
				str=str+string.charAt(0);
			}
			if(string.charAt(1)!='A')
			{
				str=str+string.charAt(1);
			}
			str=str+string.substring(2,n);
		}
		return str;
	}

}
