
public class Email {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "111@111fu.dg.com";
		if (isValidEmail(str)) {
			System.out.println("Email is valid");
		} else {
			System.out.println("Email is invalid");
		}
	}

	public static boolean isValidEmail(String str) {
		String s = "^(\\w+[-|\\.]?)+\\w@(\\w+(-\\w+)?\\.)+\\w{2,}$";
		if (str.matches(s)) {
			return true;
		} else {
			return false;
		}
	}
}
