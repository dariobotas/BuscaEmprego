package org.mobwell.academy.buscaemprego.model;

/**
 * Created by dario on 04-02-2015.
 */
public class JobPosition {
    private String position, locality, date, description, photo, contact;

    public JobPosition(String position, String locality, String date, String description, String photo, String contact) {
        this.position = position;
        this.locality = locality;
        this.date = date;
        this.description = description;
        this.photo = photo;
        this.contact = contact;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getLocality() {
        return locality;
    }

    public void setLocality(String locality) {
        this.locality = locality;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }
}
