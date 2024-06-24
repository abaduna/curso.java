package org.example.mensages;

import java.time.LocalDateTime;

public class mensajeSms  extends Mensaje{
    private String  phone;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "mensajeSms{" +
                "phone='" + phone + '\'' +
                '}';
    }
}
