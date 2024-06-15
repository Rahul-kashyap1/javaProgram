package test;

import java.util.concurrent.CountDownLatch;

public class ThisConcept {


	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("Object is destroyed");
	}
	
	public static void main(String[] args) {

		ThisConcept aConcept;
		
		for(int i=0;i<100000000000000l;i++)
		{
			aConcept=new ThisConcept();
		}
		
	}
}
