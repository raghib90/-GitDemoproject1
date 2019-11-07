package TestCase;

public class DuplicatLetter {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "rayyyyghittiib";
		int count = 0;
		char[] dup = str.toCharArray();
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j < str.length(); j++) {
             if(dup[i]==dup[j])
             {
            	// System.out.println(dup[j]);
            	// count++;
            	// System.out.println(count);
             }
        	// System.out.println(count);

			}
		}
   	// System.out.println(count);
for(int c:dup)
{
	switch(c)
	{
	case 'a':
	case 'e':
	case 'i':
	case 'o':
	case 'u':
		count++;
		break;
	}
	
}
System.out.println("the number of vowe is "+count);
	}

}


