package _00_Text_Funkifier;

import java.util.ArrayList;

public class BackwardsString extends SpecialString {

	public BackwardsString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		String word = "";
		for(int i = s.length()-1; i >=0;i--) {
		word += s.charAt(i);
		}
System.out.println(word);
		return word;
	}

}
