package Problems.Chapter20_Annotations.a_BasicSyntax;

import java.util.List;

/**
 * @author SashaKhyzhun on 9/3/17.
 * Page 852.
 */
public class PasswordUtils {

    @UseCase(id = 47, description = "Password must contain at least one numeric")
    public boolean validatePassword(String password) {
        return password.matches("\\w*\\d\\w*");
    }

    @UseCase(id = 48)
    public String encryptPassword(String password) {
        return new StringBuilder(password).reverse().toString();
    }

    @UseCase(id = 49, description = "New Password can't equal previously used ones")
    public boolean checkForNewPassword(List<String> prevPass, String password) {
        return !prevPass.contains(password);
    }

}
