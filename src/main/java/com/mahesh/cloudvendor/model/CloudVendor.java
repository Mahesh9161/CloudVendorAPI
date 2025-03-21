package com.mahesh.cloudvendor.model;
import jakarta.persistence.*;

@Entity
@Table(name="cloudvendor_info")
public class CloudVendor {

	@Id
	private String vendorid;
	private String vname;
	private String vaddress;
	private String vstate;
	
	
	public String getVstate() {
		return vstate;
	}
	public void setVstate(String vstate) {
		this.vstate = vstate;
	}
	public CloudVendor() {
		super();
	}
	public CloudVendor(String vendorid, String vname, String vaddress) {
		super();
		this.vendorid = vendorid;
		this.vname = vname;
		this.vaddress = vaddress;
	}
	public String getVendorid() {
		return vendorid;
	}
	public void setVendorid(String vendorid) {
		this.vendorid = vendorid;
	}
	public String getVname() {
		return vname;
	}
	public void setVname(String vname) {
		this.vname = vname;
	}
	public String getVaddress() {
		return vaddress;
	}
	public void setVaddress(String vaddress) {
		this.vaddress = vaddress;
	}
	
}
	