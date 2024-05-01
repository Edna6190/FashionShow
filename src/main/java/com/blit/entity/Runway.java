package com.blit.entity;

import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
@Entity
@Table(name="Runway_tb")
@JsonIgnoreProperties({"hibernateLazyInitializer",
"handler"})
public class Runway {
	
	    @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private Long RunwayId;
	    private String firstName, lastName;
	    private int age, height;
	    @OneToMany(mappedBy = "runway",cascade = CascadeType.ALL)
	    @JsonIgnore
	    private List<Brands> Brands;
	    
	    
	    

		public Runway(Long runwayId, String firstName, String lastName, int age, int height,
				List<Brands> brands) {
			super();
			RunwayId = runwayId;
			this.firstName = firstName;
			this.lastName = lastName;
			this.age = age;
			this.height = height;
			Brands = brands;
		}
		public Runway() {
			super();
		}
		@Override
		public String toString() {
			return "Runway [RunwayId=" + RunwayId + ", firstName=" + firstName + ", lastName=" + lastName + ", age="
					+ age + ", height=" + height + ", Brands=" + Brands + "]";
		}
		@Override
		public int hashCode() {
			return Objects.hash(Brands, RunwayId, age, firstName, height, lastName);
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Runway other = (Runway) obj;
			return Objects.equals(Brands, other.Brands) && Objects.equals(RunwayId, other.RunwayId) && age == other.age
					&& Objects.equals(firstName, other.firstName) && height == other.height
					&& Objects.equals(lastName, other.lastName);
		}

	    
	    
	  

}
