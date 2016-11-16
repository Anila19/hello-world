package Strings.Interviews;

public class AddHello {

	public static void main(String[] args){
		String name = "anila";
		helloNmae(name);
	}
	public static String helloNmae(String name){
		StringBuffer sb = new StringBuffer(name);
		name = "hello "+sb+"!";
		System.out.println(name);
		return name;
	}
}
