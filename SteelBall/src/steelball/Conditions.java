package steelball;

public class Conditions {

    public String registeredUsername;
    public String registeredPassword;
    public String registeredPhone;

    //Check username
    public boolean checkUserName(String username) {
        return username.contains("_") && username.length() >= 5;
    }

    //Check password
    public boolean checkPasswordComplexity(String password) {
        if (password.length() <= 8) return false;

        //Initial values
        boolean hasUppercase = false;
        boolean hasNumber = false;
        boolean hasSpecialChar = false;

        for (char c : password.toCharArray()) { 
            if (Character.isUpperCase(c)) hasUppercase = true; //Split these for better readability
            if (Character.isDigit(c)) hasNumber = true;
            if (!Character.isLetterOrDigit(c)) hasSpecialChar = true;
        }
        return hasUppercase && hasNumber && hasSpecialChar;
    }

    //Check cellphone number
    public boolean checkCellPhoneNumber(String phone) {
        //Assisted by ChatGPT (GPT-5) [Large language model]. https://chat.openai.com/chat for the below ONLY!!!!
        return phone.matches("\\+27\\d{9}");
    }

    //Register user
    public String registerUser(String username, String password, String phone) {
        if (!checkUserName(username)) {
            return "Username must be 5 charaters or longer and should have an underscore '_'!!";
        } else if (!checkPasswordComplexity(password)) {
            return "Password not strong enough!!";
        } else if (!checkCellPhoneNumber(phone)) {
            return "You need to include '+27'... for some reason";
        } else {
            this.registeredUsername = username;
            this.registeredPassword = password;
            this.registeredPhone = phone;
            return "User has been registered successfully.";
        }
    }

    //Login user
    public boolean loginUser(String username, String password) {
        return username.equals(this.registeredUsername)
                && password.equals(this.registeredPassword);
    }

    //Return login status
    public String returnLoginStatus(boolean loginResult) {
        if (loginResult) {
            return "Welcome " + this.registeredUsername + ", it is great to see you again!!";
        } else {
            return "Username or password incorrect, please try again.";
        }
    }
}