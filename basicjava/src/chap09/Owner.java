package chap09;

public class Owner {
	private String name;
	private String cellPhone;
	
	public Owner(){
	}
	public Owner(String name, String cellPhone){
		this.name = name;
		this.cellPhone = cellPhone;
	}
	public boolean equals(Object obj){
		boolean state = false;
		//System.out.println("1");
		if(obj!=null & obj instanceof Owner){
			Owner ownobj =(Owner)obj;
			if(this.name.equals(ownobj.name)){
				state = true;
			}
		}
		return state;
	}
	public String toString(){
		return "이름은"+this.name+"이고, 핸드폰 번호는 "+this.cellPhone+"입니다.";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCellPhone() {
		return cellPhone;
	}
	public void setCellPhone(String cellPhone) {
		this.cellPhone = cellPhone;
	}
}
