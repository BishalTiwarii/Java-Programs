package javaBean;

import java.io.Serializable;

public class JavaBean implements Serializable  //implements serializable
{
	private String text;
	private int number;
	//no argument constructor
	public JavaBean()
	{
		
	}
	//getter and setter methods
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
  
}
