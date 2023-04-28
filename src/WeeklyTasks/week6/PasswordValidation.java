package WeeklyTasks.week6;

public class PasswordValidation {
    public static void main(String[] args) {
        System.out.println(passwordIsValid("Strong%"));

    }
    public static boolean passwordIsValid(String password){

        boolean length = password.length() >= 6 && !password.contains(" ");//return true
        boolean hasUpperCase = false;//default
        boolean hasLowerCase = false;
        boolean hasDigit = false;
        boolean hasSpecialChars = false;
//create charArray from string
        char[] arr = password.toCharArray();
        for (char each: arr) {// to access every each character
            if(Character.isUpperCase(each)){
                hasUpperCase = true;//reassign
            }
            if(Character.isLowerCase(each)){
                hasLowerCase = true;
            }
            if(Character.isDigit(each)){
                hasDigit = true;
            }
            if(!Character.isLetterOrDigit(each)){
                hasSpecialChars = true;
            }
        }
        return  length && hasUpperCase && hasLowerCase && hasDigit && hasSpecialChars;

    }
}

//String -- Password Validation Task
//1. Write a return method that can verify if a password is valid or not. requirements:
//1. Password MUST be at least have 6 characters and should not contain space
//2. PassWord should at least contain one upper case letter
//3. PassWord should at least contain one lowercase letter
//4. Password should at least contain one special characters
//5. Password should at least contain a digit
//if all requirements above are met, the method returns true, otherwise returns false