package org.expotest.models;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by Mazdarati on 12.03.2017.
 */
@Entity
@Table(name = "exposition")
public class Exposition implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private long id;
    @Column(name = "ADDED")
    private Date added;
    @Column(name = "FORMAT")
    private int format;
    @Column(name = "FORMAT_STR")
    private String formatStr;
    @Column(name = "DISPLAY_NAME")
    private String displayName;
    @Column(name = "LOCATION_NAME")
    private String locationName;
    @Column(name = "WEBSITE")
    private String website;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "CREATOR_USER_ID", nullable = false)
    private User creatorUser;
    @Column(name = "CREATOR_INFO")
    private String creatorInfo;
    @Column(name = "PRICE")
    private double price;
    @Column(name = "PHOTO")
    private String photo;
    @Column(name = "START_DATE")
    private Date startDate;
    @Column(name = "END_DATE")
    private Date endDate;
    @Column(name = "PRESENTATION")
    private String presentation;
    @Column(name = "DESCRIPTION")
    private String description;
    @Column(name = "ADDITIONALS")
    private String additionals;
    @Column(name = "OFFERS")
    private String offers;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "AUDIENCE_USER_ID", nullable = false)
    private User audienceUser;
    @Column(name = "AUDIENCE_NAME")
    private String audienceName;
    @Column(name = "AUDIENCE_POSITION")
    private String audiencePosition;
    @Column(name = "AUDIENCE_COMPANY")
    private String audienceCompany;
    @Column(name = "AUDIENCE_PHONE")
    private String audiencePhone;
    @Column(name = "AUDIENCE_CITY")
    private String audienceCity;
    @Column(name = "AUDIENCE_EMAIL")
    private String audienceEmail;
    @Column(name = "AUDIENCE_FEEDBACK")
    private String audienceFeedback;
    @Column(name = "EXPECTED_AUDIENCE")
    private int expectedAudience;
    @Column(name = "PARTICIPANTS_NUMBER")
    private int participantsNumber;
    @Column(name = "MIN_FEEDBACK")
    private int minFeedback;
    @Column(name = "TEST_FLIGHT_REQUEST")
    private boolean testFlightRequest;
    @Column(name = "AUDIENCE_CHECK_TARGET")
    private long audienceCheckTarget;
    @Column(name = "AUDIENCE_CHECK_RESULT")
    private boolean audienceCheckResult;
    @Column(name = "THEMES")
    private String themes;
    @Column(name = "ABOUT_AUDITORY")
    private String aboutAuditory;

    @PrePersist
    public void prePersist(){
        this.added = new Date();
    }

    public Exposition() {
    }

    public Exposition(long id, Date added, int format, String formatStr, String displayName, String locationName, String website, User creatorUser, String creatorInfo, double price, String photo, Date startDate, Date endDate, String presentation, String description, String additionals, String offers, User audienceUser, String audienceName, String audiencePosition, String audienceCompany, String audiencePhone, String audienceCity, String audienceEmail, String audienceFeedback, int expectedAudience, int participantsNumber, int minFeedback, boolean testFlightRequest, long audienceCheckTarget, boolean audienceCheckResult, String themes, String aboutAuditory) {
        this.id = id;
        this.added = added;
        this.format = format;
        this.formatStr = formatStr;
        this.displayName = displayName;
        this.locationName = locationName;
        this.website = website;
        this.creatorUser = creatorUser;
        this.creatorInfo = creatorInfo;
        this.price = price;
        this.photo = photo;
        this.startDate = startDate;
        this.endDate = endDate;
        this.presentation = presentation;
        this.description = description;
        this.additionals = additionals;
        this.offers = offers;
        this.audienceUser = audienceUser;
        this.audienceName = audienceName;
        this.audiencePosition = audiencePosition;
        this.audienceCompany = audienceCompany;
        this.audiencePhone = audiencePhone;
        this.audienceCity = audienceCity;
        this.audienceEmail = audienceEmail;
        this.audienceFeedback = audienceFeedback;
        this.expectedAudience = expectedAudience;
        this.participantsNumber = participantsNumber;
        this.minFeedback = minFeedback;
        this.testFlightRequest = testFlightRequest;
        this.audienceCheckTarget = audienceCheckTarget;
        this.audienceCheckResult = audienceCheckResult;
        this.themes = themes;
        this.aboutAuditory = aboutAuditory;
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

    public int getFormat() {
        return format;
    }

    public void setFormat(int format) {
        this.format = format;
    }

    public String getFormatStr() {
        return formatStr;
    }

    public void setFormatStr(String formatStr) {
        this.formatStr = formatStr;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public User getCreatorUser() {
        return creatorUser;
    }

    public void setCreatorUser(User creatorUser) {
        this.creatorUser = creatorUser;
    }

    public String getCreatorInfo() {
        return creatorInfo;
    }

    public void setCreatorInfo(String creatorInfo) {
        this.creatorInfo = creatorInfo;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getPresentation() {
        return presentation;
    }

    public void setPresentation(String presentation) {
        this.presentation = presentation;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAdditionals() {
        return additionals;
    }

    public void setAdditionals(String additionals) {
        this.additionals = additionals;
    }

    public String getOffers() {
        return offers;
    }

    public void setOffers(String offers) {
        this.offers = offers;
    }

    public User getAudienceUser() {
        return audienceUser;
    }

    public void setAudienceUser(User audienceUser) {
        this.audienceUser = audienceUser;
    }

    public String getAudienceName() {
        return audienceName;
    }

    public void setAudienceName(String audienceName) {
        this.audienceName = audienceName;
    }

    public String getAudiencePosition() {
        return audiencePosition;
    }

    public void setAudiencePosition(String audiencePosition) {
        this.audiencePosition = audiencePosition;
    }

    public String getAudienceCompany() {
        return audienceCompany;
    }

    public void setAudienceCompany(String audienceCompany) {
        this.audienceCompany = audienceCompany;
    }

    public String getAudiencePhone() {
        return audiencePhone;
    }

    public void setAudiencePhone(String audiencePhone) {
        this.audiencePhone = audiencePhone;
    }

    public String getAudienceCity() {
        return audienceCity;
    }

    public void setAudienceCity(String audienceCity) {
        this.audienceCity = audienceCity;
    }

    public String getAudienceEmail() {
        return audienceEmail;
    }

    public void setAudienceEmail(String audienceEmail) {
        this.audienceEmail = audienceEmail;
    }

    public String getAudienceFeedback() {
        return audienceFeedback;
    }

    public void setAudienceFeedback(String audienceFeedback) {
        this.audienceFeedback = audienceFeedback;
    }

    public int getExpectedAudience() {
        return expectedAudience;
    }

    public void setExpectedAudience(int expectedAudience) {
        this.expectedAudience = expectedAudience;
    }

    public int getParticipantsNumber() {
        return participantsNumber;
    }

    public void setParticipantsNumber(int participantsNumber) {
        this.participantsNumber = participantsNumber;
    }

    public int getMinFeedback() {
        return minFeedback;
    }

    public void setMinFeedback(int minFeedback) {
        this.minFeedback = minFeedback;
    }

    public boolean isTestFlightRequest() {
        return testFlightRequest;
    }

    public void setTestFlightRequest(boolean testFlightRequest) {
        this.testFlightRequest = testFlightRequest;
    }

    public long getAudienceCheckTarget() {
        return audienceCheckTarget;
    }

    public void setAudienceCheckTarget(long audienceCheckTarget) {
        this.audienceCheckTarget = audienceCheckTarget;
    }

    public boolean isAudienceCheckResult() {
        return audienceCheckResult;
    }

    public void setAudienceCheckResult(boolean audienceCheckResult) {
        this.audienceCheckResult = audienceCheckResult;
    }

    public String getThemes() {
        return themes;
    }

    public void setThemes(String themes) {
        this.themes = themes;
    }

    public String getAboutAuditory() {
        return aboutAuditory;
    }

    public void setAboutAuditory(String aboutAuditory) {
        this.aboutAuditory = aboutAuditory;
    }

    public void validation() {

    }
}
