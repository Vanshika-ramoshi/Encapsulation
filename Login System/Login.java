public class Login {

    private String email;
    private String password;

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public boolean validateEmail() {
        return email.contains("@") && email.endsWith(".com");
    }

    public boolean validatePassword() {
        return password.length() >= 8;
    }

    public void login() {

        if (validateEmail() && validatePassword()) {
            System.out.println("Login Successful");
        } else {
            System.out.println("Login Failed");
        }
    }
}
