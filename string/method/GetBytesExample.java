class GetBytesExample {
	public static void main(String[] args) {
		String str = "Hello, I'm using GitHub";
		byte[] bytes = str.getBytes();
		for(int i=0; i<bytes.length; i++) {
			System.out.println(bytes[i]);
		}
	}
}