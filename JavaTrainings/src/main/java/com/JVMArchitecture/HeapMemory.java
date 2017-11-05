package com.JVMArchitecture;

public class HeapMemory {

public static void main(String[] args) {
	double mb = 1024*1024;
	Runtime r = Runtime.getRuntime();
	System.out.println("Total memory is jvm initial memory : "+r.totalMemory()/mb );
	System.out.println("free memory :" + r.freeMemory()/mb);
	System.out.println("max memory : " + r.maxMemory()/mb);
}
}
