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
		String str = "������";
		System.out.print(str);
		System.out.print(pStr.str);
		

	}

}
