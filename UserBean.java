/** Q05: Write-only JavaBean property, no getPassword method. */
public class UserBean {
    private String password;
    public UserBean() { }
    public void setPassword(String password) {
        if (password == null || password.length() < 6) {
            throw new IllegalArgumentException("Minimum 6 characters required");
        }
        this.password = password;
    }
    public boolean checkPassword(String attempt) {
        return password != null && password.equals(attempt);
    }
    public static void main(String[] args) {
        UserBean user = new UserBean();
        user.setPassword("secure123");
        System.out.println("Password matches? " + user.checkPassword("secure123"));
        // The password property cannot be read via a getter.
    }
}
