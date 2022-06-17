public class Switch {
	public static void main(String agrs[]) {
		String result = "";
		String day = "M";
		switch (day) {
			case "M":
			case "W":
			case "F": {
				result = "MWF";
				break;
			}
			case "T":
			case "TH":
			case "S": {
				result = "TTS";
				break;
			}
		}
		;
		System.out.println("Old switch result:");
		System.out.println(result);
	}
}