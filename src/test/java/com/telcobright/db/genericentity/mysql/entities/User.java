package com.telcobright.db.genericentity.mysql.entities;

import java.time.LocalDateTime;
import java.math.BigDecimal;

public class User {
    private Long id;
    private String username; // VARCHAR(255)
    private String email; // VARCHAR(255)
    private String passwordHash; // CHAR(64)
    private String firstName; // VARCHAR(100)
    private String lastName; // VARCHAR(100)
    private Integer age; // INT
    private Boolean isActive; // BOOLEAN/TINYINT(1)
    private LocalDateTime createdAt; // DATETIME
    private LocalDateTime updatedAt; // DATETIME
    private LocalDateTime lastLoginAt; // DATETIME
    private String phoneNumber; // VARCHAR(20)
    private String address; // TEXT
    private BigDecimal creditBalance; // DECIMAL(19,4)
    private byte[] profileImage; // BLOB
    private String jsonData; // JSON (stored as TEXT)
    private Long referrerId; // BIGINT
    private Integer loginCount; // INT
    private Double rating; // DOUBLE
    private String status; // ENUM stored as VARCHAR
    
    public User() {}
    
    public User(Long id, String username, String email) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.createdAt = LocalDateTime.now();
        this.isActive = true;
        this.loginCount = 0;
    }
    
    // Full constructor for testing edge cases
    public User(Long id, String username, String email, String passwordHash, 
                String firstName, String lastName, Integer age, Boolean isActive,
                LocalDateTime createdAt, LocalDateTime updatedAt, LocalDateTime lastLoginAt,
                String phoneNumber, String address, BigDecimal creditBalance,
                byte[] profileImage, String jsonData, Long referrerId, 
                Integer loginCount, Double rating, String status) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.passwordHash = passwordHash;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.isActive = isActive;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.lastLoginAt = lastLoginAt;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.creditBalance = creditBalance;
        this.profileImage = profileImage;
        this.jsonData = jsonData;
        this.referrerId = referrerId;
        this.loginCount = loginCount;
        this.rating = rating;
        this.status = status;
    }
    
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    
    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }
    
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    
    public String getPasswordHash() { return passwordHash; }
    public void setPasswordHash(String passwordHash) { this.passwordHash = passwordHash; }
    
    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }
    
    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    
    public Integer getAge() { return age; }
    public void setAge(Integer age) { this.age = age; }
    
    public Boolean getIsActive() { return isActive; }
    public void setIsActive(Boolean isActive) { this.isActive = isActive; }
    
    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }
    
    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }
    
    public LocalDateTime getLastLoginAt() { return lastLoginAt; }
    public void setLastLoginAt(LocalDateTime lastLoginAt) { this.lastLoginAt = lastLoginAt; }
    
    public String getPhoneNumber() { return phoneNumber; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }
    
    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }
    
    public BigDecimal getCreditBalance() { return creditBalance; }
    public void setCreditBalance(BigDecimal creditBalance) { this.creditBalance = creditBalance; }
    
    public byte[] getProfileImage() { return profileImage; }
    public void setProfileImage(byte[] profileImage) { this.profileImage = profileImage; }
    
    public String getJsonData() { return jsonData; }
    public void setJsonData(String jsonData) { this.jsonData = jsonData; }
    
    public Long getReferrerId() { return referrerId; }
    public void setReferrerId(Long referrerId) { this.referrerId = referrerId; }
    
    public Integer getLoginCount() { return loginCount; }
    public void setLoginCount(Integer loginCount) { this.loginCount = loginCount; }
    
    public Double getRating() { return rating; }
    public void setRating(Double rating) { this.rating = rating; }
    
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}