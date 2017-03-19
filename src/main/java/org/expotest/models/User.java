package org.expotest.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.util.*;
import javax.validation.constraints.NotNull;

/**
 * Created by Mazdarati on 11.03.2017.
 */
@Entity
@Table(name = "users")
public class User implements UserDetails {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "ADDED")
    private Date added;
    @NotNull
    @Column(name = "DISPLAY_NAME")
    private String displayName;
    @Column(name = "LOGIN")
    private String login;
    @Column(name = "EMAIL")
    private String email;
    @Column(name = "PHONE")
    private String phone;
    @NotNull
    @Column(name = "PASSWORD")
    private String password;
    @Column(name = "SALT")
    private String salt;
    @NotNull
    @Column(name = "ROLE")
    private String role;
    @Column(name = "POSITION")
    private String position;
    @Column(name = "COMPANY")
    private String company;
    @Column(name = "CITY_NAME")
    private String cityName;
    @Column(name = "CITY_COUNTRY")
    private String cityCountry;
    @Column(name = "AVATAR")
    private String avatar;
    @Column(name = "HAS_PREMIUM")
    private String hasPremium;
    @Column(name = "CART_ORD_NUM")
    private String cartOrdNum;
    @Column(name = "CART_EXPOSITION")
    private String cartExposition;
    @Column(name = "BALANCE")
    private String balance;
    @Column(name = "TOP_UPS_ORD_NUM")
    private String topUpsOrdNum;
    @Column(name = "LOCK")
    private boolean lock;
    @Column(name = "CART_OFFER")
    private String cartOffer;
    @Column(name = "CART_STATE")
    private String cartState;
    @Column(name = "CART_HISTORY")
    private String cartHistory;
    @Column(name = "TOP_UPS_SUM")
    private String topUpsSum;
    @Column(name = "TOP_UPS_ADDED")
    private String topUpsAdded;
    @Column(name = "TOP_UPS_PAID")
    private String topUpsPaid;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "audienceUser")
    private Set<Exposition> expositionAudModels;

    @Transient
    @JsonIgnore
    List<GrantedAuthority> roles = null;

    @PrePersist
    public void prePersist(){
        this.added = new Date();
    }

    public User() {
    }

    public User(long id, Date added, String displayName, String login, String email, String phone, String password, String salt, String role, String position, String company, String cityName, String cityCountry, String avatar, String hasPremium, String cartOrdNum, String cartExposition, String balance, String topUpsOrdNum, boolean lock, String cartOffer, String cartState, String cartHistory, String topUpsSum, String topUpsAdded, String topUpsPaid) {
        this.id = id;
        this.added = added;
        this.displayName = displayName;
        this.login = login;
        this.email = email;
        this.phone = phone;
        this.password = password;
        this.salt = salt;
        this.role = role;
        this.position = position;
        this.company = company;
        this.cityName = cityName;
        this.cityCountry = cityCountry;
        this.avatar = avatar;
        this.hasPremium = hasPremium;
        this.cartOrdNum = cartOrdNum;
        this.cartExposition = cartExposition;
        this.balance = balance;
        this.topUpsOrdNum = topUpsOrdNum;
        this.lock = lock;
        this.cartOffer = cartOffer;
        this.cartState = cartState;
        this.cartHistory = cartHistory;
        this.topUpsSum = topUpsSum;
        this.topUpsAdded = topUpsAdded;
        this.topUpsPaid = topUpsPaid;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCityCountry() {
        return cityCountry;
    }

    public void setCityCountry(String cityCountry) {
        this.cityCountry = cityCountry;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getHasPremium() {
        return hasPremium;
    }

    public void setHasPremium(String hasPremium) {
        this.hasPremium = hasPremium;
    }

    public String getCartOrdNum() {
        return cartOrdNum;
    }

    public void setCartOrdNum(String cartOrdNum) {
        this.cartOrdNum = cartOrdNum;
    }

    public String getCartExposition() {
        return cartExposition;
    }

    public void setCartExposition(String cartExposition) {
        this.cartExposition = cartExposition;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    public String getTopUpsOrdNum() {
        return topUpsOrdNum;
    }

    public void setTopUpsOrdNum(String topUpsOrdNum) {
        this.topUpsOrdNum = topUpsOrdNum;
    }

    public Date getAdded() {
        return added;
    }

    public void setAdded(Date added) {
        this.added = added;
    }

    public boolean isLock() {
        return lock;
    }

    public void setLock(boolean lock) {
        this.lock = lock;
    }

    public String getCartOffer() {
        return cartOffer;
    }

    public void setCartOffer(String cartOffer) {
        this.cartOffer = cartOffer;
    }

    public String getCartState() {
        return cartState;
    }

    public void setCartState(String cartState) {
        this.cartState = cartState;
    }

    public String getCartHistory() {
        return cartHistory;
    }

    public void setCartHistory(String cartHistory) {
        this.cartHistory = cartHistory;
    }

    public String getTopUpsSum() {
        return topUpsSum;
    }

    public void setTopUpsSum(String topUpsSum) {
        this.topUpsSum = topUpsSum;
    }

    public String getTopUpsAdded() {
        return topUpsAdded;
    }

    public void setTopUpsAdded(String topUpsAdded) {
        this.topUpsAdded = topUpsAdded;
    }

    public String getTopUpsPaid() {
        return topUpsPaid;
    }

    public void setTopUpsPaid(String topUpsPaid) {
        this.topUpsPaid = topUpsPaid;
    }

    public Set<Exposition> getExpositionAudModels() {
        return expositionAudModels;
    }

    public void setExpositionAudModels(Set<Exposition> expositionAudModels) {
        this.expositionAudModels = expositionAudModels;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        if(roles == null){
            roles = new ArrayList<GrantedAuthority>();
            roles.add(new SimpleGrantedAuthority(this.getRole()));
        }
        return roles;
    }

    @Override
    public String getUsername() {
        return this.login;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return this.isLock();
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return !this.isLock();
    }

    public void validation(){
        /* There is can validate with length and type data */
        if (this.getPassword() == null)
            throw new IllegalArgumentException("Password cannot be null");
        if (this.getRole() == null)
            throw new IllegalArgumentException("Role cannot be null");
        if (this.getDisplayName() == null)
            throw new IllegalArgumentException("DisplayName cannot be null");
    }
}
