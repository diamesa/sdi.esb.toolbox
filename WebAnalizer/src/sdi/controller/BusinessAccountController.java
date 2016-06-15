package sdi.controller;


	import sdi.include.BusinessAccountRegistry;
	import sdi.model.BusinessAccountModel;


public class BusinessAccountController {
	

	public static boolean RegisterBusinessAccount(BusinessAccountRegistry ba){
		BusinessAccountModel modelo= new BusinessAccountModel();
		return modelo.RegisterBusinessAccount(ba);
		}


}


