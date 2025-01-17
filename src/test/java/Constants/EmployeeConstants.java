package Constants;

import lombok.Getter;

import java.util.UUID;

public interface EmployeeConstants {

    @Getter
    public enum EmployeeOjasCredEnum {
        User("banu"),
        ID(generateRandomID()),
        Email(generateRandomEmail());

        private final String value;

        private EmployeeOjasCredEnum(String value) {
            this.value = value;
        }

        private static String generateRandomID() {
            return "ZT" + (10000 + (int) (Math.random() * 90000));
        }

        private static String generateRandomEmail() {
            return "user" + UUID.randomUUID().toString().substring(0, 5) + "@gmail.com";
        }
    }
}
