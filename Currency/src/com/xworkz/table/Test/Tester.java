package com.xworkz.table.Test;

import com.xworkz.table.dao.CurrencyDAO;
import com.xworkz.table.dao.CurrencyDAOimpl;
import com.xworkz.table.dto.CurrencyDTO;

public class Tester {

	public static void main(String[] args) {
		CurrencyDTO currencyDTO=new CurrencyDTO();
		currencyDTO.setId(1);
		currencyDTO.setCurrencyName("Rupee");
		currencyDTO.setCountry("India");
		currencyDTO.setExchangeRateWRTUSDollar(73.68);
		
		currencyDTO.setId(2);
		currencyDTO.setCurrencyName("Pound");
		currencyDTO.setCountry("Uk");
		currencyDTO.setExchangeRateWRTUSDollar(1.29);
		
		CurrencyDAO currencyDAO= new CurrencyDAOimpl();
		currencyDAO.saveCurrency(currencyDTO);
	}

}
