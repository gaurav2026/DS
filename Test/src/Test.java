import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
	public static void main(String[] args) {
		String r = "^[a-z+_|0]+@(.+)$";
		
		String a = "g@@gmail.com";
		Pattern p = Pattern.compile(r);
		Matcher m = p.matcher(a);
		System.out.println(m.matches());
	}
}	
