package com.blit.entity;

import java.io.Serializable;

import jakarta.persistence.*;

@Entity
public class Brands implements Serializable{
		  @Id
		    @GeneratedValue(strategy = GenerationType.AUTO)
		private Long id;
		 private String designerName,itemType, color, size;
		 private int  price;
		 @ManyToOne(fetch =FetchType.LAZY,cascade = CascadeType.ALL)
		 @JoinColumn(name = "runway")
		 private Runway runway;
		 
		 public Brands( String designerName, String color,String itemType, String size, int price) {
		        this.designerName = designerName;
		        this.itemType = itemType;
		        this.color = color;
		        this.size = size;
		        this.price = price;
		    }
		 
		 

		    public Brands() {
			super();
		}



			public Runway getRunway() {
		        return runway;
		    }

		    public void Runway(Runway runway) {
		        this.runway = runway;
		    }
		//setters and getters 

		    public Long getId() {
		        return id;
		    }

		    public void setId(Long id) {
		        this.id = id;
		    }
		   
		    public String getdesignerName() {
		        return designerName;
		    }

		    public void setBrandName(String designerName) {
		        this.designerName = designerName;
		    }

		    public String getColor() {
		        return color;
		    }
		    public void setColor(String color) {
		        this.color = color;
		    }

		    public String getitemType() {
		        return itemType;
		    }

			public void setitemType(String itemType) {
		        this.itemType = itemType;
		    }

		    public String getsize() {
		        return size;
		    }

		    public void setitemNumber(String size) {
		        this.size = size;
		    }

		    public int getPrice() {
		        return price;
		    }

		    public void setPrice(int price) {
		        this.price = price;
		    }
}