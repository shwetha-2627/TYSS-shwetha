package genericMethods;

public class A {
	public static void main(String... args) {
	String str="13@364fds4fjrh83dkjf32";
	char[] ch=str.toCharArray();
	int ar = 0;
	for (int i = 0; i < ch.length; i++) {
		if (Character.isDigit(ch[i])) {
			ar=ar+Integer.parseInt(ch[i]+"");
		}
	}
	
	System.out.println("sum:"+ar);
	}	
}
