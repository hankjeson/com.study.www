package com.zjj.JDBC.service;

import com.zjj.JDBC.dao.DaoImpl;
import lombok.Data;

@Data
public class ServiceImpl implements Service{
     private DaoImpl daoImplservice;
	public void addStu() {
		// TODO Auto-generated method stub
		try {
			daoImplservice.add();
			System.out.println(10/0);
			daoImplservice.add();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void delStu() {
		// TODO Auto-generated method stub
		
		try {
			daoImplservice.del();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void updateStu() {
		// TODO Auto-generated method stub
		try {
			daoImplservice.update();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void selectStu() {
		// TODO Auto-generated method stub
	     try {
			daoImplservice.select();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
