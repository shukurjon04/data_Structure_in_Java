package filelar.Accountlar.gson.genetate;

import com.google.gson.annotations.SerializedName;
import filelar.Accountlar.gson.genetate.Adress;
import filelar.Accountlar.gson.genetate.Company;

public class User{

	@SerializedName("website")
	private String website;

	@SerializedName("phone")
	private String phone;

	@SerializedName("name")
	private String name;

	@SerializedName("adress")
	private Adress adress;

	@SerializedName("company")
	private Company company;

	@SerializedName("id")
	private Integer id;

	@SerializedName("email")
	private String email;

	@SerializedName("username")
	private String username;

	public User(String name, Integer id) {
		this.name = name;
		this.id = id;
	}

	public void setWebsite(String website){
		this.website = website;
	}

	public String getWebsite(){
		return website;
	}

	public void setPhone(String phone){
		this.phone = phone;
	}

	public String getPhone(){
		return phone;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setAdress(Adress adress){
		this.adress = adress;
	}

	public Adress getAdress(){
		return adress;
	}

	public void setCompany(Company company){
		this.company = company;
	}

	public Company getCompany(){
		return company;
	}

	public void setId(Integer id){
		this.id = id;
	}

	public Integer getId(){
		return id;
	}

	public void setEmail(String email){
		this.email = email;
	}

	public String getEmail(){
		return email;
	}

	public void setUsername(String username){
		this.username = username;
	}

	public String getUsername(){
		return username;
	}

	@Override
 	public String toString(){
		return 
			"User{" + 
			"website = '" + website + '\'' + 
			",phone = '" + phone + '\'' + 
			",name = '" + name + '\'' + 
			",adress = '" + adress + '\'' + 
			",company = '" + company + '\'' + 
			",id = '" + id + '\'' + 
			",email = '" + email + '\'' + 
			",username = '" + username + '\'' + 
			"}";
		}


}