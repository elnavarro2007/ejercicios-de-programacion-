package Ej1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Registro {

    private String id;
    private String first_name;
    private String last_name;
    private String latitude;
    private String longitude;
    private String domain;
    private String email;
    private String country;
    private String ip_address;
    private LocalDateTime last_login;

    private static final DateTimeFormatter FORMATO = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    //
    //Constructores

    public Registro() {
    }

    public Registro(String[] datos) {
        this.first_name = datos[1];
        this.last_name = datos[2];
        this.email = datos[6];
        this.country = datos[7];
        this.last_login = LocalDateTime.parse(datos[9], FORMATO);
    }

    // Getter y setter


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
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

    public String getIp_address() {
        return ip_address;
    }

    public void setIp_address(String ip_address) {
        this.ip_address = ip_address;
    }

    public LocalDateTime getLast_login() {
        return last_login;
    }

    public void setLast_login(LocalDateTime last_login) {
        this.last_login = last_login;
    }

    @Override
    public String toString() {
        return String.format("%-10s %-10s | %-2s | %-25s | %s", first_name, last_name, country, email, last_login.format(FORMATO));
    }
}
