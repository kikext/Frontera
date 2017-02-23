package com.company;

/**
 * Created by 25374183p on 17/02/2017.
 */
public class persona {
    public String name;
    public String dni;


//----------- constructor -----------
    public persona(String name, String dni) {
        this.name = name;
        this.dni = dni;
    }

    //---------- setters -----------------------
    public void setName(String name) {
        this.name = name;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    //--------- getters -------------------------
    public String getName() {
        return name;
    }

    public String getDni() {
        return dni;
    }

}
