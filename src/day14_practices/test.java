package day14_practices;

public class test {

    public static void main(String[] args) {



            String str = "A7B1C1";

            int sum = 0;

            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if(ch >= '0' && ch <= '9'){
                    sum += ch - 48;
                }
            }

            System.out.println("sum = " + sum);

        }

    }
