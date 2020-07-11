package com.design.pattern.core.facade;

public class ComputerFacade {
	
	private CPU cpu;
	private HardDrive hardDrive;
	private Memory memory;
	
	public ComputerFacade() {
		this.cpu = new CPU();
		this.hardDrive = new HardDrive();
		this.memory = new Memory();
	}
	
	public void processDataFromCPU() {
		cpu.processData();
	}
	
	public void readDataFromHDD() {
		hardDrive.readData();
	}
	
	public void loadFromMemory() {
		memory.load();
	}

}
