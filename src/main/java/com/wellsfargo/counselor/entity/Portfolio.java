package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

@Entity
public class Portfolio {
    @Id
    @GeneratedValue()
    private Long portfolioId;   // primary Key

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "clientId")   // Foregin key
    private Client client;

    @Column(nullable = false)
    private String portfolioName;

    @Column(nullable = false)
    private double totalValue;

    protected Portfolio() {

    }
    public Portfolio(Client client, String portfolioName , double totalValue) {
        this.client = client;
        this.portfolioName = portfolioName;
        this.totalValue = totalValue;
    }
    public Client getClient() {
        return client;
    }
    public void setClient(Client client) {
        this.client = client;
    }
    public long getPortfolioId() {
        return portfolioId;
    }
    public String getPortfolioName() {
        return portfolioName;
    }
    public void setPortfolioName(String portfolioName) {
        this.portfolioName = portfolioName;
    }
    public double getTotalValue() {
        return totalValue;
    }
    public void setTotalValue(double totalValue) {
        this.totalValue = totalValue;
    }
}
