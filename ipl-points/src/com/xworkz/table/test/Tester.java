package com.xworkz.table.test;

import com.xworkz.table.doa.IplPointsDAO;
import com.xworkz.table.dto.IplPointsDTO;

public class Tester {

	public static void main(String[] args) {
		IplPointsDTO dto=new IplPointsDTO();
		dto.setIplId(1);
		dto.setIplTeamName("RCB");
		dto.setCity("Bangalore");
		dto.setPoints(12);
		dto.setNoOfMatches(9);
		
		IplPointsDAO dao= new IplPointsDAO();
		dao.saveIplPoints(dto);

	}

}
