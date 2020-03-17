class GetCharsExample {
	
	public static void main(String[] args) {
		String str = "Hello, How are you?";
		char[] chars = new char[20];
		str.getChars(7, str.length(), chars, 0);
		
		for(int i=0; i<chars.length; i++) {
			System.out.print(chars[i]);
		}
	}
	
}