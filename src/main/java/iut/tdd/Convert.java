package iut.tdd;

public class Convert {
	
	public static String num2text(String input) {
		
		int length = input.length();
		
		switch (input) {
		case "0":
			return "zero";
		case "1":
			return "un";
		case "2":
			return "deux";
		case "3":
			return "trois";
		case "4":
			return "quatre";
		case "5":
			return "cinq";
		case "6":
			return "six";
		case "7":
			return "sept";
		case "8":
			return "huit";
		case "9":
			return "neuf";
		case "10":
			return "dix";
		case "11":
			return "onze";
		case "12":
			return "douze";
		case "13":
			return "treize";
		case "14":
			return "quatorze";
		case "15":
			return "quinze";
		case "16":
			return "seize";
		}

		return null;	
	}

	public static String text2num(String input) {
		return null;
	}
}