package dec_18;

import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfCharacters {

	static void frequencyOfCharacters() {
		String str = "saiprasanna dupati";
		str.chars().mapToObj(c ->(char)c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).forEach((character,count)->{System.out.println("frequeny : "+character+" " +"count : "+count);});;
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
frequencyOfCharacters();
	}

}
