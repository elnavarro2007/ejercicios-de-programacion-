package Ev2.UD11;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Registro {

    private String firstName;
    private String lastName;
    private String email;
    private String country;
    private LocalDateTime lastLogin;

    private static final DateTimeFormatter FORMATO = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    public Registro(String[] datos) {
        this.firstName = datos[1];
        this.lastName = datos[2];
        this.email = datos[6];
        this.country = datos[7];
        this.lastLogin = LocalDateTime.parse(datos[9], FORMATO);
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public LocalDateTime getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(LocalDateTime lastLogin) {
        this.lastLogin = lastLogin;
    }

    @Override
    public String toString() {
        return "Registro{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", country='" + country + '\'' +
                ", lastLogin=" + lastLogin +
                '}';
    }
}
