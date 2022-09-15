package de.schulung.samples;

public class Calculator {

	public int add(int i, int j) {
		return i+j;
	}

	public double divide(int i, int j) {
		if(j == 0) {
			throw new IllegalArgumentException("j must not be 0");
		}
		return 1.0*i/j;
	}

}
