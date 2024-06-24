package org.example.mensages;

public class MnesajeEmail extends  Mensaje{
    private String email;
    private String to;
    private String asunt;

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getAsunt() {
        return asunt;
    }

    public void setAsunt(String asunt) {
        this.asunt = asunt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "MnesajeEmail{" +
                "asunt='" + asunt + '\'' +
                ", email='" + email + '\'' +
                ", to='" + to + '\'' +
                '}';
    }
}
