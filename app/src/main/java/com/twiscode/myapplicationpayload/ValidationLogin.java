package com.twiscode.myapplicationpayload;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Satya Dwi Anggiawan on 14/02/19.
 */
public abstract class ValidationLogin {
    static boolean validationEmail(CharSequence email) {
        return email != null && !email.toString().isEmpty() && android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches();
    }

    static boolean validationPassword(CharSequence password) {
        Pattern pattern;
        Matcher matcher;

        final String PASSWORD_PATTERN = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{4,}$";

        pattern = Pattern.compile(PASSWORD_PATTERN);
        matcher = pattern.matcher(password);

        return matcher.matches();
    }
}
