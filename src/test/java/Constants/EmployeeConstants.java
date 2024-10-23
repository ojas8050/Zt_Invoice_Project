package Constants;

import lombok.Getter;

import java.util.UUID;

public interface EmployeeConstants {

    @Getter
    public enum EmployeeOjasCredEnum {
        User("Suraj"),
        ID(generateRandomID()),
        Email(generateRandomEmail());

        private final String value;

        private EmployeeOjasCredEnum(String value) {
            this.value = value;
        }

//        // Generate a random username
//        private static String generateRandomUser() {
//            return "User" + UUID.randomUUID().toString().substring(0, 5);
//        }

        // Generate a random ID
        private static String generateRandomID() {
            return "ZT" + (10000 + (int) (Math.random() * 90000));
            // Generates a random 5-digit number
        }

        // Generate a random email
        private static String generateRandomEmail() {
            return "user" + UUID.randomUUID().toString().substring(0, 5) + "@gmail.com";
        }
    }
}
