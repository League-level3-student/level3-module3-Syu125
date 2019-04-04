package _00_Text_Funkifier;

public class MixedCapsString extends SpecialString{

	public MixedCapsString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
	String word = "";	
	//MixedCapsString Test
		
		/*int odd = 1;
		for(int i = 0; i < s.length(); i++) {
			if(odd == 1) {
				word+=s.toLowerCase().charAt(i);
				odd = 2;
			}else {
				word+=s.toUpperCase().charAt(i);
				odd = 1;
			}
		return word;
	}*/
for(int i = 0; i < s.length();i++) {
	if(s.toUpperCase().charAt(i) == 'T') {
		word+='*';
	}else {
		word+=s.charAt(i);
	}
}
return word;
}
}
