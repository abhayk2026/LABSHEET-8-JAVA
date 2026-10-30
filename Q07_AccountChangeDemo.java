/** Q07: Update the balance twice and observe property-change events. */
public class Q07_AccountChangeDemo {
    public static void main(String[] args) {
        AccountBean account = new AccountBean();
        account.addPropertyChangeListener(event -> {
            System.out.println("Event property: " + event.getPropertyName());
            System.out.println("Old balance: " + event.getOldValue());
            System.out.println("New balance: " + event.getNewValue());
        });
        account.setBalance(1000);
        account.setBalance(1200);
        System.out.println("Final balance: " + account.getBalance());
    }
}
