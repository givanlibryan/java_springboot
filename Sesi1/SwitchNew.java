public class SwitchNew {
    public static void main(String[] args) {
        String day = "M";
        String result = switch (day) {
            case "M", "W", "F" -> "MWF";
            case "T", "TH", "S" -> "TTS";
            default -> {
                if (day.isEmpty())
                    result = "Please insert a valid day.";
                else
                    result = "Looks 1ike a Sunday.";
                throw new IllegalStateException("Invalid day: " + result);
            }
        };
        System.out.println(result);
    }
}