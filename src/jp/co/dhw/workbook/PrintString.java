package jp.co.dhw.workbook;

class PrintString {
	String str = "String";
	void printStr(){
		System.out.println(str);
	}
}

public class sample {
	public static void main(String[] args){
		PrintString pStr = new PrintString();
		String str = "•¶Žš—ñ";
		System.out.print(str);
		System.out.print(pStr.str);
		

	}

}
