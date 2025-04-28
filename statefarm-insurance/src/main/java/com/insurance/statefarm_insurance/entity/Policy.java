package com.insurance.statefarm_insurance.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;

//lombok dependencies
//@Data // generates getters, setters, toString, equals, and hashCode
//@NoArgsConstructor
//@AllArgsConstructor
//@Builder // optional: allows you to use builder pattern
@Entity
@Table(name = "policy")
public class Policy {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Policy name must not be blank")
    @Size(min = 3, max = 100, message = "Policy name must be between 3 and 100 characters")
    private String policyName;

    @NotNull(message = "Premium must not be null")
    @DecimalMin(value = "100.0", message = "Premium must be at least 100.0")
    private Double premium;

    @NotNull(message = "Duration must not be null")
    @Min(value = 1, message = "Duration must be at least 1 year")
    @Max(value = 60, message = "Duration must not exceed 60 years")
    private Integer duration;

    @NotNull(message = "Coverage amount must not be null")
    @DecimalMin(value = "1000.0", message = "Coverage amount must be at least 1000.0")
    private Double coverageAmount;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public Policy() {
    }

    public Policy(Long id, String policyName, Double premium, Integer duration, Double coverageAmount, User user) {
        this.id = id;
        this.policyName = policyName;
        this.premium = premium;
        this.duration = duration;
        this.coverageAmount = coverageAmount;
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPolicyName() {
        return policyName;
    }

    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }

    public Double getPremium() {
        return premium;
    }

    public void setPremium(Double premium) {
        this.premium = premium;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public Double getCoverageAmount() {
        return coverageAmount;
    }

    public void setCoverageAmount(Double coverageAmount) {
        this.coverageAmount = coverageAmount;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Policy{" +
                "id=" + id +
                ", policyName='" + policyName + '\'' +
                ", premium=" + premium +
                ", duration=" + duration +
                ", coverageAmount=" + coverageAmount +
                ", user=" + user +
                '}';
    }
}
