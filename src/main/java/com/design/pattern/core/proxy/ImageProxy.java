package com.design.pattern.core.proxy;

/**
 * 
 * @author almed
 *
 */
public class ImageProxy implements Image {

	private ImageService imageService;
	private String imageName;

	public ImageProxy(String imageName) {
		this.imageName = imageName;
	}

	@Override
	public void display() {
		if(imageService ==null) {
			imageService = new ImageService(getImageName());
		}
		imageService.display();
	}

	public String getImageName() {
		return imageName;
	}

	public void setImageName(String imageName) {
		this.imageName = imageName;
	}

}
