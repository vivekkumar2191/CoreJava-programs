package com.java.immutableExamp;

public class TestImmutable {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustumImmutableExample csi=new CustumImmutableExample("Vivek",1001);
		System.out.println(csi.getName());
		System.out.println(csi.getId());
		//uncommenting
		//csi.id=1005;
		//csi.name="Vivekkumar";
	}

}
