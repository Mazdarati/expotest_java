package org.expotest.models;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by Mazdarati on 12.03.2017.
 */
@Entity
@Table(name = "tags")
public class Tag implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private long id;
    @Column(name = "ADDED")
    private Date added;
    @Column(name = "NAME")
    private String name;
    @Column(name = "TYPE")
    private int type;
    @Column(name = "TAGS")
    private String tags;

    @PrePersist
    public void prePersist(){
        this.added = new Date();
    }

    public Tag() {
    }

    public Tag(long id, Date added, String name, int type, String tags) {
        this.id = id;
        this.added = added;
        this.name = name;
        this.type = type;
        this.tags = tags;
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

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }
}
