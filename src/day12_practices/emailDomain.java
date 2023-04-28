package day12_practices;

public class emailDomain {

    public static void main(String[] args) {

        emailDomain("danie@yahoo.com");

    }

    public static void emailDomain(String email){

        String domain = email.substring(email.indexOf("@") + 1, email.lastIndexOf("."));
        System.out.println(domain);


    }


}
