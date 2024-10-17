package Enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

public class EmployeeConstants {

    @Getter
    public enum EmployeeOjasCredEnum{
        User("Ojas"),
        ID("ZT00565"),
        Email("ojas123@gmail.com");

        private final String value;

        private EmployeeOjasCredEnum(String value) {
            this.value = value;
        }
    }
}
