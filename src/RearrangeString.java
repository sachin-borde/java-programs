public class RearrangeString {
    public static void main(String args[]) {

        RearrangeString.rearrangeMethod1();
        RearrangeString.rearrangeMethod2();

    }

    public static void rearrangeMethod1() {
        String input = "name2 is3 my1 swanand4";
        String[] words = input.split(" ");
        String[] output = new String[words.length];

        for (int i = 0; i < words.length; i++) {
            String word = words[i].substring(0, words[i].length() - 1);
            int num = Integer.parseInt(words[i].substring(words[i].length() - 1));

            output[num - 1] = word;
        }
        for (String string : output) {
            System.out.print(string + " ");
        }
    }

    public static void rearrangeMethod2() {
        String input = "name2 is3 my1 swanand4";
        String[] words = input.split(" ");
        String output = "";
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {
                String word = words[j];
                if (Integer.valueOf(word.substring(word.length() - 1)) == i + 1) {
                    output = output + " " + word.substring(0, word.length() - 1);
                    break;
                }
            }
        }
        System.out.println(output.trim());
    }
}