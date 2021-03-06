package com.example.card.model;

import java.util.Date;

/**
 * Created by racoon on 2017/5/11.
 */
public class CardDetailModel4Wechat {
    private Integer id;
    private String cardNo;
    private String password;
    private Integer status;
    private Integer type;
    private String typeName;
    private Integer agentId;
    private String agentName;
    private Integer customerId;
    private String customerName;
    private Date activeTime;
    private Date usedTime;
    private Integer policyId;
    private String holder;
    private String recognizee;
    private Date policyStartTime;
    private Date policyEndTime;
    private Date policyCreateTime;
    private Integer policyExportStatus;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public Integer getAgentId() {
        return agentId;
    }

    public void setAgentId(Integer agentId) {
        this.agentId = agentId;
    }

    public String getAgentName() {
        return agentName;
    }

    public void setAgentName(String agentName) {
        this.agentName = agentName;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Date getActiveTime() {
        return activeTime;
    }

    public void setActiveTime(Date activeTime) {
        this.activeTime = activeTime;
    }

    public Date getUsedTime() {
        return usedTime;
    }

    public void setUsedTime(Date usedTime) {
        this.usedTime = usedTime;
    }

    public Integer getPolicyId() {
        return policyId;
    }

    public void setPolicyId(Integer policyId) {
        this.policyId = policyId;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public String getRecognizee() {
        return recognizee;
    }

    public void setRecognizee(String recognizee) {
        this.recognizee = recognizee;
    }

    public Date getPolicyStartTime() {
        return policyStartTime;
    }

    public void setPolicyStartTime(Date policyStartTime) {
        this.policyStartTime = policyStartTime;
    }

    public Date getPolicyEndTime() {
        return policyEndTime;
    }

    public void setPolicyEndTime(Date policyEndTime) {
        this.policyEndTime = policyEndTime;
    }

    public Date getPolicyCreateTime() {
        return policyCreateTime;
    }

    public void setPolicyCreateTime(Date policyCreateTime) {
        this.policyCreateTime = policyCreateTime;
    }

    public Integer getPolicyExportStatus() {
        return policyExportStatus;
    }

    public void setPolicyExportStatus(Integer policyExportStatus) {
        this.policyExportStatus = policyExportStatus;
    }
}
