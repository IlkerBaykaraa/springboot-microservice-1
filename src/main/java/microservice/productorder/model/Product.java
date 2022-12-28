package microservice.productorder.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "product")
@Data
public class Product {

	private Long id;
	private String name;
	private LocalDateTime createTime;
	private double price;
	
	public Product(Long id, String name, LocalDateTime createTime) {
		super();
		this.id = id;
		this.name = name;
		this.createTime = createTime;
	}
	
	public Product() {
		
	}
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getId() {
		return id;
	}
	
	@Column(name = "price",nullable = false)
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	@Column(name = "name", length = 100, nullable = false)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Column(name = "creat_time",nullable = false)
	public LocalDateTime getCreateTime() {
		return createTime;
	}
	public void setCreateTime(LocalDateTime createTime) {
		this.createTime = createTime;
	}
	
	
    

	
   
}
