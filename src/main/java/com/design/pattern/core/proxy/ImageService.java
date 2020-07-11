package com.design.pattern.core.proxy;

/**
 * 
 * @author almed
 *
 */
public class ImageService implements Image {

	private String imageName;
	
	public ImageService(String imageName) {
		super();
		this.imageName = imageName;
	}

	@Override
	public void display() {
		System.out.println("Displaying image " + getImageName() + "...");
	}

	public void removeImage(String name) {
		System.out.println("Removing image " + name + "...");
	}

	public void addImage(String name) {
		System.out.println("Adding image " + name + "...");
	}
	
	public String getImageName() {
		return imageName;
	}

	public void setImageName(String imageName) {
		this.imageName = imageName;
	}

}
