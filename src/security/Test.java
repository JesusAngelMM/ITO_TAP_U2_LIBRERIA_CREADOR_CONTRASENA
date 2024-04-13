
package security;

public class Test {
        public static void main(String[] args) {
            String password1 = SecurePasswordGenerator.SecurePasswordGenerator(2, false, false);
            String password2 = SecurePasswordGenerator.SecurePasswordGenerator(8, false, true);
            String password3 = SecurePasswordGenerator.SecurePasswordGenerator(16, true, false);
            String password4 = SecurePasswordGenerator.SecurePasswordGenerator(32, true, true);
            String password5 = SecurePasswordGenerator.SecurePasswordGenerator(64, true, true);
            
            System.out.println(password1);
            System.out.println(password2);
            System.out.println(password3);
            System.out.println(password4);
            System.out.println(password5);
    }
}
