public class Rima {
    public static boolean verificarRima(String str1, String str2) {
        if (str1.length() >= 2 && str2.length() >= 2) {
            char ultimos1 = str1.charAt(str1.length() - 1);
            char ultimos2 = str1.charAt(str1.length() - 2);
            char primeiros1 = str2.charAt(0);
            char primeiros2 = str2.charAt(1);
            return ultimos1 == primeiros1 && ultimos2 == primeiros2;
        }
        else {
            return false;
        }
    }
}
