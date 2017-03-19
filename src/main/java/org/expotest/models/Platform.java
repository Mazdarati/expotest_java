package org.expotest.models;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by Mazdarati on 12.03.2017.
 */
@Entity
@Table(name = "platforms")
public class Platform implements Serializable {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "ADDED")
    private Date added;
    @Column(name = "NAME")
    private String name;
    @Column(name = "URL")
    private String url;
    @Column(name = "CART_EXPOSITION_ID")
    private long cartExpositionId;
    @Column(name = "CART_STATE")
    private int cartState;
    @Column(name = "CART_HISTORY")
    private Date cartHistory = new Date();
    @Column(name = "CART_HISTORY_STATE")
    private int cartHistoryState;

    @PrePersist
    public void prePersist(){
        this.added = new Date();
    }

    public Platform() {
    }

    public Platform(long id, Date added, String name, String url, long cartExpositionId, int cartState, Date cartHistory, int cartHistoryState) {
        this.id = id;
        this.added = added;
        this.name = name;
        this.url = url;
        this.cartExpositionId = cartExpositionId;
        this.cartState = cartState;
        this.cartHistory = cartHistory;
        this.cartHistoryState = cartHistoryState;
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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public long getCartExpositionId() {
        return cartExpositionId;
    }

    public void setCartExpositionId(long cartExpositionId) {
        this.cartExpositionId = cartExpositionId;
    }

    public int getCartState() {
        return cartState;
    }

    public void setCartState(int cartState) {
        this.cartState = cartState;
    }

    public Date getCartHistory() {
        return cartHistory;
    }

    public void setCartHistory(Date cartHistory) {
        this.cartHistory = cartHistory;
    }

    public int getCartHistoryState() {
        return cartHistoryState;
    }

    public void setCartHistoryState(int cartHistoryState) {
        this.cartHistoryState = cartHistoryState;
    }
}
