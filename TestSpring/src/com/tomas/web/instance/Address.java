package com.tomas.web.instance;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.Serializable;

public class Address implements Serializable{
	String eastdis;
	String northdis;
	String higher;
	int temperature;
	
	public Address(){
		// TODO Auto-generated constructor stub
	}
	public Address(String jsonStr){
		// TODO Auto-generated constructor stub
		Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").create();
		Address addr =gson.fromJson(jsonStr, Address.class);
		this.setEastdis(addr.getEastdis());
		this.setNorthdis(addr.getNorthdis());
		this.setHigher(addr.getHigher());
		this.setTemperature(addr.getTemperature());
	}
	
	public String getEastdis() {
		return eastdis;
	}

	public void setEastdis(String eastdis) {
		this.eastdis = eastdis;
	}

	public String getNorthdis() {
		return northdis;
	}



	public void setNorthdis(String northdis) {
		this.northdis = northdis;
	}



	public String getHigher() {
		return higher;
	}



	public void setHigher(String higher) {
		this.higher = higher;
	}



	public int getTemperature() {
		return temperature;
	}



	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}



	@Override
	public String toString() {
		return "Address [eastdis=" + eastdis + ", northdis=" + northdis
				+ ", higher=" + higher + ", temperature=" + temperature + "]";
	}
}
