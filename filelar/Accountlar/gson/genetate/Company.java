package filelar.Accountlar.gson.genetate;

import com.google.gson.annotations.SerializedName;

public class Company{

	@SerializedName("bs")
	private String bs;

	@SerializedName("name")
	private String name;

	@SerializedName("catchphras")
	private String catchphras;

	public void setBs(String bs){
		this.bs = bs;
	}

	public String getBs(){
		return bs;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setCatchphras(String catchphras){
		this.catchphras = catchphras;
	}

	public String getCatchphras(){
		return catchphras;
	}

	@Override
 	public String toString(){
		return 
			"Company{" + 
			"bs = '" + bs + '\'' + 
			",name = '" + name + '\'' + 
			",catchphras = '" + catchphras + '\'' + 
			"}";
		}
}