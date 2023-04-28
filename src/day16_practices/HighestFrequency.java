package day16_practices;

public class HighestFrequency {

    public static void main(String[] args) {

        String str = "aaabbccccddeeee";

        String result = "";

        int max = 0;

        for (int i = 0; i < str.length(); i++){
            int freq = 0;
            for (int j = 0; j < str.length(); j ++) {
                if (str.charAt(i) == str.charAt(j)) {
                    freq++;
                }

            }
            if (!result.contains(""+str.charAt(i))){
                result += str.charAt(i) + freq;
            }
            if (max<freq){
                System.out.println(i);
}
        }
        System.out.println(result);
    }

}
