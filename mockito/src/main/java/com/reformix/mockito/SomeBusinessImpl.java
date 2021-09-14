package com.reformix.mockito;

public class SomeBusinessImpl {

	DataServices dataServices;
	
	

	public SomeBusinessImpl(DataServices dataServices) {
		super();
		this.dataServices = dataServices;
	}



	int findGreatestAmongAll() {

		int[] data = dataServices.retriveAllData();

		int greatest = Integer.MIN_VALUE;
		for (int i : data) {
			if (i > greatest) {
				greatest = i;
			
			}
		}
		return greatest;
	}

}

class DataServiceStub implements DataServices{

	@Override
	public int[] retriveAllData() {
		
		
		return new int[] {24,19,6};
	}
	
}
