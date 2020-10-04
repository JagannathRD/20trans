package com.xworkz.factory;

public class TyreFactory {
	
	public static ITyreStore getTyre(String type){
		if(type.equalsIgnoreCase("apollo"))
			return new ApolloTyreImp();
		else if(type.equalsIgnoreCase("mrf"))
			return new MRFTyreImpl();
		else
			System.out.println("No tyre of this type found");
			return null;
	}

}
