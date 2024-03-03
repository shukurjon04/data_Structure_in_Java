package filelar.Accountlar.gson.genetate;

import com.google.gson.annotations.SerializedName;

public class Adress{

	@SerializedName("zipcode")
	private String zipcode;

	@SerializedName("geo")
	private Geo geo;

	@SerializedName("suite")
	private String suite;

	@SerializedName("city")
	private String city;

	@SerializedName("Street")
	private String street;

	public void setZipcode(String zipcode){
		this.zipcode = zipcode;
	}

	public String getZipcode(){
		return zipcode;
	}

	public void setGeo(Geo geo){
		this.geo = geo;
	}

	public Geo getGeo(){
		return geo;
	}

	public void setSuite(String suite){
		this.suite = suite;
	}

	public String getSuite(){
		return suite;
	}

	public void setCity(String city){
		this.city = city;
	}

	public String getCity(){
		return city;
	}

	public void setStreet(String street){
		this.street = street;
	}

	public String getStreet(){
		return street;
	}

	@Override
 	public String toString(){
		return 
			"Adress{" + 
			"zipcode = '" + zipcode + '\'' + 
			",geo = '" + geo + '\'' + 
			",suite = '" + suite + '\'' + 
			",city = '" + city + '\'' + 
			",street = '" + street + '\'' + 
			"}";
		}
}