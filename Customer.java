package bd.edu.diu.bank;

import java.util.Objects;

public class Customer {
	private int id;
	private String name;
	private String address;
	private String email;
	private String phone;
	
	public Customer() {
		System.out.println("form Constractor");
	
	}
	
	
	
	public Customer(int id, String name, String address, String email,
			String phone) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.email = email;
		this.phone = phone;
	}
	public Customer(Customer customer) {
		super();
		this.id = customer.id;
		this.name =customer. name;
		this.address = customer.address;
		this.email = customer.email;
		this.phone = customer.phone;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public void display() {
		System.out.println("ID        "+getId());
		System.out.println("Name      "+getName());
		System.out.println("Address   "+getAddress());
		System.out.println("Email     "+getEmail());
		System.out.println("Phone     "+getPhone());
	}



	@Override
	public int hashCode() {
		return Objects.hash(address, email, id, name, phone);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Customer)) {
			return false;
		}
		Customer other = (Customer) obj;
		return Objects.equals(address, other.address) && Objects.equals(email, other.email) && id == other.id
				&& Objects.equals(name, other.name) && Objects.equals(phone, other.phone);
	}



	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", address=" + address + ", email=" + email + ", phone="
				+ phone + "]";
	}
	
	

}
