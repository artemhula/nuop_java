//Задані два рядки. Скласти третій рядок символів, які зустрічаються в
//першому і в другому рядках тільки по одному разу
public class LAB1 {
    public static void main(String[] args) {
        String firstString = "абвгд";
        String secondString = "гдлвпи";

        StringBuilder resultString = new StringBuilder();

        for (char ch : firstString.toCharArray()) {
            if (count(firstString, ch) == 1 && count(secondString, ch) == 1) {
                resultString.append(ch);
            }
        }

        System.out.println("Третій рядок: " + resultString.toString());
    }

    public static int count(String str, char ch) {
        int count = 0;
        for (char c : str.toCharArray()) {
            if (c == ch) {
                count++;
            }
        }
        return count;
    }
}
