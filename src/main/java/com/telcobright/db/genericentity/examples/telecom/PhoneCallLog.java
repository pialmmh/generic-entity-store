package com.telcobright.db.genericentity.examples.telecom;

import java.time.LocalDateTime;

/**
 * Example entity for phone call logs
 */
public class PhoneCallLog {
    private Long id;
    private String callerNumber;
    private String receiverNumber;
    private LocalDateTime callTime;
    private Integer duration; // in seconds
    private String callType; // incoming/outgoing/missed
    
    public PhoneCallLog() {}
    
    public PhoneCallLog(Long id, String callerNumber, String receiverNumber, 
                        LocalDateTime callTime, Integer duration) {
        this.id = id;
        this.callerNumber = callerNumber;
        this.receiverNumber = receiverNumber;
        this.callTime = callTime;
        this.duration = duration;
    }
    
    // Getters and setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    
    public String getCallerNumber() { return callerNumber; }
    public void setCallerNumber(String callerNumber) { this.callerNumber = callerNumber; }
    
    public String getReceiverNumber() { return receiverNumber; }
    public void setReceiverNumber(String receiverNumber) { this.receiverNumber = receiverNumber; }
    
    public LocalDateTime getCallTime() { return callTime; }
    public void setCallTime(LocalDateTime callTime) { this.callTime = callTime; }
    
    public Integer getDuration() { return duration; }
    public void setDuration(Integer duration) { this.duration = duration; }
    
    public String getCallType() { return callType; }
    public void setCallType(String callType) { this.callType = callType; }
}