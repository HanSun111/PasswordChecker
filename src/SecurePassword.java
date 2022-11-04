public class SecurePassword
{
    // instance variable
    private String password;

    // constructor
    public SecurePassword(String password)
    {
        this.password = password;
    }

    public void setPassword(String newPassword)
    {
        password = newPassword;
    }

    /* Returns true if password:
       - Is at least 8 characters long
       - Contains at least one uppercase letter
       - Contains at least one lowercase letter
       - Contains at least one numeric digit
       - Contains at least one of these "special symbols":  ! @ # $ % ^ & * ?
       Must satisfy ALL FIVE categories for password to be "secure"
       Return false if any of the above security requirements are not fulfilled.
    */


    public boolean isSecure()
    {
        if(isLongEnough() && containsUppercase() && containsLowercase() && containsDigit() && containsSpecialSymbol() ){
            return true;
        }
        else return false;
        /* to be implemented */
        // You should first write the six private "helper"
        // methods below and use them as needed in this method’s implementation
    }

    /* Returns a String that contains information about the security status of the
       current password.

       If isSecure() is true, this method returns "Password is secure"
       If isSecure() is false, this methods should return a single String that informs the
       user of which security requirements are not currently being met.

       For example, the password 3WrT6tH does not meet length or special symbol
       requirements, so this method should return the following String (using a line
       break \n):

       "The password must be at least 8 characters
        The password must contain a special symbol: ! @ # $ % ^ & * ?"
    */
    public String status()
    {
        String status = "";
        if (isSecure()){
            System.out.println("Tis secure");
        if(!isLongEnough()){
            status += "too short bruv \n";
        }
        if(!containsDigit()){
                status += "no number no bueno \n";
            }
        if(!containsLowercase()){
                status += "GOTTA HAVE SOME LOWER \n";
            }
        if(!containsUppercase()){
                status += "gotta have uppercase \n";
            }
        if(!containsSpecialSymbol()){
                status += "gotta add a symbol \n";
            }

        }
        return status;
    }


    // PRIVATE HELPER METHODS (marked "private" rather than "public")

    /* Returns true if the password’s length meets the minimum requirement of 8 characters
       and false otherwise.
     */
    private boolean isLongEnough()
    {
        if(password.length() >= 8){
            return true;
        } else
            return false;
    }

    /* Returns true if the password has at least one uppercase letter and false otherwise.
     */
    private boolean containsUppercase()
    {

        /* this one is completed for you as a hint for how to do the others! */
        String upperCaseLetters = "QWERTYUIOPASDFGHJKLZXCVBNM";
        return checkString(upperCaseLetters);
    }

    /* Returns true if the password has at least one lowercase letter and false otherwise.
     */
    private boolean containsLowercase()
    {
        String lowerCase = "qwertyuiopasdfghjklzxcvbnm";
        return checkString(lowerCase);
    }

    /* Returns true if the password has at least one digit and false otherwise.
     */
    private boolean containsDigit()
    {
        String num = "1234567890";
        return checkString(num);
    }

    /* Returns true if the password has at least one of these special symbols:
       ! @ # $ % ^ & * ?    and false otherwise.
     */
    private boolean containsSpecialSymbol()
    {
        String nani = "!@#$%^&*?";
        return checkString(nani);
    }

    /* Checks a given character string to see if password contains at least one
       character from that string.

       For example, if characterString is "ABCDEFGH", and password == "jbHFmfA"
       this method will find two occurrences (F and A) and return true, since two
       is at least one
     */
    private boolean checkString(String characterString) {
        String stuff = "";
        for (int x = 0; x <= characterString.length(); x++) {
            if (password.contains(String.valueOf(characterString.charAt(x)))) {
                return true;
            }
        }
        return false;
    }
}
