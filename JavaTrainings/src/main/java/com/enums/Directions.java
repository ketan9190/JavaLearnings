package com.enums;

public enum Directions {

	NORTH("north"), SOUTH, EAST, WEST {

		@Override
		String getDirection() {
			System.out.println("hi");
			return super.getDirection();
		}
	};
	static int i;
	String s;

	String getDirection() {
		return s;
	}

	private Directions() {
		// TODO Auto-generated constructor stub
	}

	private Directions(String direction) {
		this.s = direction;
	}
}
