package org.expotest.models;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by Mazdarati on 12.03.2017.
 */
@Entity
@Table(name = "offers")
public class Offer implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private long id;
    @Column(name = "ADDED")
    private Date added;
    @Column(name = "NAME")
    private String name;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "CREATOR_ID", nullable = false)
    private User creator;
    @Column(name = "PHOTO")
    private String photo;
    @Column(name = "DESCRIPTION")
    private String description;
    @Column(name = "ADDITIONAL_NAME")
    private String additionalName;
    @Column(name = "ADDITIONAL_DATA")
    private String additionalData;

    @PrePersist
    public void prePersist(){
        this.added = new Date();
    }

    public Offer() {
    }

    public Offer(long id, Date added, String name, User creator, String photo, String description, String additionalName, String additionalData) {
        this.id = id;
        this.added = added;
        this.name = name;
        this.creator = creator;
        this.photo = photo;
        this.description = description;
        this.additionalName = additionalName;
        this.additionalData = additionalData;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getAdded() {
        return added;
    }

    public void setAdded(Date added) {
        this.added = added;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User getCreator() {
        return creator;
    }

    public void setCreator(User creator) {
        this.creator = creator;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAdditionalName() {
        return additionalName;
    }

    public void setAdditionalName(String additionalName) {
        this.additionalName = additionalName;
    }

    public String getAdditionalData() {
        return additionalData;
    }

    public void setAdditionalData(String additionalData) {
        this.additionalData = additionalData;
    }

    public void validation(){
        /* There is can validate with length and type data */
        if (this.getName() == null)
            throw new IllegalArgumentException("Name cannot be null");
        if (this.getPhoto() == null)
            throw new IllegalArgumentException("Photo empty");
        if (this.getDescription() == null)
            throw new IllegalArgumentException("Description cannot be null");
    }
}
