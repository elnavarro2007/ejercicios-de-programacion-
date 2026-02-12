package EJ1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Registro {

    String id;
    String first_name;
    String last_name;
    String latitude;
    String longitude;
    String country;
    String ip_adress;
    String last_login;

    public Registro() {
    }

    public Registro(String id, String first_name, String last_name, String latitude, String longitude, String country, String ip_adress, String last_login) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.latitude = latitude;
        this.longitude = longitude;
        this.country = country;
        this.ip_adress = ip_adress;
        this.last_login = last_login;
    }
}

