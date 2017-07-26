package com.atguigu.domain;

public class Book {
    private Integer id;

    private String title;

    private Double price;

    private Integer amount;
    
    public Book() {
		super();
	}

    public Book(String title, Double price, Integer amount) {
		super();
		this.title = title;
		this.price = price;
		this.amount = amount;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }
}