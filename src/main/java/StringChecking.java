public class StringChecking {
    //Bai 1.1
    public static int CountUpperCase() {
        String str = "You Only Live Once. But if You do it right. once is Enough";
        str = str.trim();
        int caps = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i)))
                caps++;
        }
        System.out.println(caps);
       // return str;
        return caps;
    }
    //Bai 1.2
    public static String UpperAll(String str) {
        str = str.trim();
        str = str.replaceAll("\\s+", " ");
        String[] array = str.split(" ");
        StringBuilder output = new StringBuilder();

        for (int i = 0; i < array.length; i++) {
            String temp = String.valueOf(array[i].charAt(0));
            output.append(temp.toUpperCase() + array[i].substring(1));
            output.append(' ');
        }
        System.out.println(output);
        return output.toString().trim();
    }

    //Bai 1.3
    public static String UpperAfterPoint(String str) {
        str = str.trim();
        str = str.replaceAll("\\s+", " ");
        String[] array = str.split(" ");
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            if (String.valueOf(array[i]).equals(".")) {
                String temp = String.valueOf(array[i + 2].charAt(0));
                output.append(temp.toUpperCase() + array[i].substring(1));
                output.append(' ');
            }
        }
        System.out.println(output);
        return output.toString().trim();
    }
}

