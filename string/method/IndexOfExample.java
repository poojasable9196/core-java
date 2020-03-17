class IndexOfExample {
	public static void main(String[] args) {
		String str = "Hello world";
		
		int index = str.indexOf("world");
		System.out.println(index);
		
		int index2 = str.indexOf(72);
		System.out.println(index2);
		
		int index3 = str.indexOf(72, 6);
		System.out.println(index3);
		
		int index4 = str.indexOf("world", 6);
		System.out.println(index4);
	}
}