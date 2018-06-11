package com.test.automation.selenium.businesscomponents;

public class MerchantDBQueries {
	
public static String queryMerchantTable(String MIDVal){
		
		String queryMerchantTableQ ="select edgepay_merchant_mid , edgepay_merchant_name ,"
			+ " edgepay_merchant_dba , edgepay_merchant_city , edgepay_merchant_postal_code , edgepay_merchant_phone ,	edgepay_merchant_email,"
			+ " edgepay_merchant_address ,"
			+ "edgepay_merchant_fms ,"
			+ " edgepay_merchant_payment_type_visa ,"
			+ "  edgepay_merchant_payment_type_mc ,"
			+ " edgepay_merchant_payment_type_amex ,"
			+ " edgepay_merchant_payment_type_discover ,"
			+ " edgepay_merchant_payment_type_ach ,"
			+ " edgepay_merchant_payment_type_jcb ,"
			+ " edgepay_merchant_payment_type_diners ,"
			+ " edgepay_merchant_multipass_transaction_key ,"
			+ " edgepay_merchant_multipass_lane_id,"
			+ " edgepay_merchant_terminal_capacity,"
			+ " edgepay_merchant_term_operating_env,"
			+ " edgepay_merchant_card_holder_auth_method,"
			+ " edgepay_merchant_term_auth_capacity,"
			+ " edgepay_merchant_term_output_capacity,"
			+ " edgepay_merchant_max_pin_length,"
			+ " edgepay_merchant_federal_tax_id,"
			+ " edgepay_merchant_collect_service_fee,"
			+ " edgepay_merchant_csf_presentments,"
			+ " edgepay_merchant_csf_amount_state,"
			+ " edgepay_merchant_csf_settle_delay,"
			+ " edgepay_merchant_csf_fee_split,"
			+ " edgepay_merchant_acct_type,"
			+ " edgepay_merchant_settle_delay,"
			+ " edgepay_merchant_settle_hold,"
			+ " edgepay_merchant_compdd,"
			+ " edgepay_merchant_settlement_limit,"
			+ " edgepay_merchant_max_presentments,"
			+ " edgepay_merchant_presentment1_delays_method"
			+ " from edgepay_gateway_db.edgepay_merchant where edgepay_merchant_mid = "+MIDVal;
	
	return queryMerchantTableQ;
				
	}

public static String queryFeeTable(String MIDVal){
	
	String queryFeeTableString =" select edgepay_merchant_billing_gateway_fee,"
			+ " edgepay_merchant_billing_processing_ctr_fee,"
			+ " edgepay_merchant_billing_transaction_fee,"
			+ " edgepay_merchant_billing_token_fee,"
			+ " edgepay_merchant_billing_gateway_fee,"
			+ " edgepay_merchant_billing_rpm_customer_fee,"
			+ " edgepay_merchant_billing_rpm_trans_fee,"
			+ " edgepay_merchant_billing_act_updater_fee,"
			+ " edgepay_merchant_billing_ach_origination_fee,"
			+ " edgepay_merchant_billing_ach_verification_fee,"
			+ " edgepay_merchant_billing_ach_return_fee,"
			+ " edgepay_merchant_billing_collection_service_fee"
 			+ " from "
			+ " edgepay_gateway_db.edgepay_merchant_billing_fee ,"
			+ " edgepay_gateway_db.edgepay_merchant_billing_fee_mapping,"
			+ " edgepay_gateway_db.edgepay_merchant"
			+ " where"
			+ " edgepay_gateway_db.edgepay_merchant_billing_fee.edgepay_merchant_billing_fee_id =" 
			+ " edgepay_gateway_db.edgepay_merchant_billing_fee_mapping.edgepay_merchant_billing_fee_id and"
			+ " edgepay_gateway_db.edgepay_merchant_billing_fee_mapping.edgepay_merchant_id ="
			+ " edgepay_gateway_db.edgepay_merchant.edgepay_merchant_id and"
			+ " edgepay_gateway_db.edgepay_merchant.edgepay_merchant_id = ("
			+ " select edgepay_merchant_id from edgepay_gateway_db.edgepay_merchant" 
			+ " where edgepay_merchant_mid = "+MIDVal+")";
	
	return queryFeeTableString;
	
	}

// Query from MCC Table
public static String queryMCCTable(String MIDVal){
	
	String queryMCCTableString =" select edgepay_gateway_db.edgepay_mcc.edgepay_mcc_id,"
			+ "edgepay_gateway_db.edgepay_mcc.edgepay_mcc "
			+ "from "
			+ "edgepay_gateway_db.edgepay_mcc , "
			+ "edgepay_gateway_db.edgepay_merchant_mcc_mapping, "
			+ "edgepay_gateway_db.edgepay_merchant "
			+ "where "
			+ "edgepay_gateway_db.edgepay_mcc.edgepay_mcc_id = " 
			+ "edgepay_gateway_db.edgepay_merchant_mcc_mapping.edgepay_mcc_id and "
			+ "edgepay_gateway_db.edgepay_merchant_mcc_mapping.edgepay_merchant_id = "
			+ "edgepay_gateway_db.edgepay_merchant.edgepay_merchant_id and "
			+ "edgepay_gateway_db.edgepay_merchant.edgepay_merchant_id = ( "
			+ "select edgepay_merchant_id from edgepay_gateway_db.edgepay_merchant " 
			+ "where edgepay_merchant_mid = "+MIDVal+")";
	
	return queryMCCTableString;
}


// Query String corresponding terminal_id and multipass_device_id val
public static String queryTermMultiId(String MIDVal){
	
	String queryTermMultiIdString = "select edgepay_terminal_id, edgepay_merchant_multipass_device_id from "
			+ "edgepay_gateway_db.edgepay_merchant_terminal "
			+ "where "
			+ "edgepay_gateway_db.edgepay_merchant_terminal.edgepay_merchant_id in "
			+ "(select edgepay_merchant_id from edgepay_gateway_db.edgepay_merchant "
			+ "where edgepay_merchant_mid = "+MIDVal+")";
	
	return queryTermMultiIdString;
	
}


// Query String to Identify Location (State)
public static String queryLocationStateVal(String MIDVal){
	
	String queryLocStateString = " select  edgepay_gateway_db.edgepay_location.edgepay_location_name  " 
		+ " from  "
		+ "edgepay_gateway_db.edgepay_location, " 
		+ "edgepay_gateway_db.edgepay_merchant_location_mapping, "
		+ "edgepay_gateway_db.edgepay_merchant "
		+ "where "
		+ "edgepay_gateway_db.edgepay_location.edgepay_location_id = "  
		+ "edgepay_gateway_db.edgepay_merchant_location_mapping.edgepay_location_id and "
		+ "edgepay_gateway_db.edgepay_merchant_location_mapping.edgepay_merchant_id =  "
		+ "edgepay_gateway_db.edgepay_merchant.edgepay_merchant_id and "
		+ "edgepay_gateway_db.edgepay_merchant.edgepay_merchant_mid =  "+MIDVal;

	return queryLocStateString;
}

// Query String to Identify Location (Country)
public static String queryLocationCountryVal(String MIDVal){
	
	String queryLocCountryString = " select a1.edgepay_location_name "
		+ "from "
		+ "edgepay_gateway_db.edgepay_location a1 "
		+ "where "
		+ "a1.edgepay_location_id = " 
		+ "(select b1.edgepay_location_ref_id "
		+ "from  "
		+ "edgepay_gateway_db.edgepay_location b1, "
		+ "edgepay_gateway_db.edgepay_merchant_location_mapping b2, "
		+ "edgepay_gateway_db.edgepay_merchant b3 "
		+ "where "
		+ "b1.edgepay_location_id = b2.edgepay_location_id and "
		+ "b2.edgepay_merchant_id = b3.edgepay_merchant_id and "
		+ "b3.edgepay_merchant_mid =  "+MIDVal+")";
	
	return queryLocCountryString;
	
}

// Query String to retrieve ODFI VALUE
public static String queryODFIVal(String MIDVal){
	
	String queryODFIVal = " select edgepay_gateway_db.edgepay_odfi.edgepay_odfi_code "
		+ "from "
		+ "edgepay_gateway_db.edgepay_odfi, "
		+ "edgepay_gateway_db.edgepay_merchant "
		+ "where  "
		+ "edgepay_gateway_db.edgepay_odfi.edgepay_odfi_id = edgepay_gateway_db.edgepay_merchant.edgepay_odfi_id and "
		+ "edgepay_gateway_db.edgepay_merchant.edgepay_merchant_mid = "+MIDVal;

	return queryODFIVal;

}


	// Query from merchant table
	public String queryMerchantTable1(String MIDVal){
	
		String queryMerchantTableQ =	"select edgepay_merchant_mid , edgepay_merchant_name ,"
			+ " edgepay_merchant_dba , edgepay_merchant_city , edgepay_merchant_postal_code , edgepay_merchant_phone ,	edgepay_merchant_email,"
			+ " edgepay_merchant_address ,"
			+ "edgepay_merchant_fms ,"
			+ " edgepay_merchant_payment_type_visa ,"
			+ "  edgepay_merchant_payment_type_mc ,"
			+ " edgepay_merchant_payment_type_amex ,"
			+ " edgepay_merchant_payment_type_discover ,"
			+ " edgepay_merchant_payment_type_ach ,"
			+ " edgepay_merchant_payment_type_jcb ,"
			+ " edgepay_merchant_payment_type_diners ,"
			+ " edgepay_merchant_multipass_transaction_key ,"
			+ " edgepay_merchant_multipass_lane_id,"
			+ " edgepay_merchant_terminal_capacity,"
			+ " edgepay_merchant_term_operating_env,"
			+ " edgepay_merchant_card_holder_auth_method,"
			+ " edgepay_merchant_term_auth_capacity,"
			+ " edgepay_merchant_term_output_capacity,"
			+ " edgepay_merchant_max_pin_length,"
			+ " edgepay_merchant_federal_tax_id,"
			+ " edgepay_merchant_collect_service_fee,"
			+ " edgepay_merchant_csf_presentments,"
			+ " edgepay_merchant_csf_amount_state,"
			+ " edgepay_merchant_csf_settle_delay,"
			+ " edgepay_merchant_csf_fee_split,"
			+ " edgepay_merchant_acct_type,"
			+ " edgepay_merchant_settle_delay,"
			+ " edgepay_merchant_settle_hold,"
			+ " edgepay_merchant_compdd,"
			+ " edgepay_merchant_settlement_limit,"
			+ " edgepay_merchant_max_presentments,"
			+ " edgepay_merchant_presentment1_delays_method,"
			+ " from edgepay_gateway_db.edgepay_merchant where edgepay_merchant_mid = "+MIDVal;
	
	return queryMerchantTableQ;
				
	}
	// Query String corresponding Fee ::
	String queryFeeTable =	" 	select edgepay_merchant_billing_gateway_fee,"
			+ "edgepay_merchant_billing_processing_ctr_fee,"
			+ "edgepay_merchant_billing_transaction_fee,"
			+ "edgepay_merchant_billing_token_fee,"
			+ "edgepay_merchant_billing_gateway_fee,"
			+ "edgepay_merchant_billing_rpm_customer_fee,"
			+ "edgepay_merchant_billing_rpm_trans_fee,"
			+ "edgepay_merchant_billing_act_updater_fee,"
			+ "edgepay_merchant_billing_ach_origination_fee,"
			+ "edgepay_merchant_billing_ach_verification_fee,"
			+ "edgepay_merchant_billing_ach_return_fee,"
			+ "edgepay_merchant_billing_collection_service_fee"
			+ "from "
			+ "edgepay_gateway_db.edgepay_merchant_billing_fee ,"
			+ "edgepay_gateway_db.edgepay_merchant_billing_fee_mapping,"
			+ "edgepay_gateway_db.edgepay_merchant"
			+ "where"
			+ "edgepay_gateway_db.edgepay_merchant_billing_fee.edgepay_merchant_billing_fee_id =" 
			+ "edgepay_gateway_db.edgepay_merchant_billing_fee_mapping.edgepay_merchant_billing_fee_id and"
			+ "edgepay_gateway_db.edgepay_merchant_billing_fee_mapping.edgepay_merchant_id ="
			+ "edgepay_gateway_db.edgepay_merchant.edgepay_merchant_id and"
			+ "edgepay_gateway_db.edgepay_merchant.edgepay_merchant_id = ("
			+ "select edgepay_merchant_id from edgepay_gateway_db.edgepay_merchant" 
			+ "where edgepay_merchant_mid = ";

	// Query String corresponding MCC
	String queryMCCTable = " select edgepay_gateway_db.edgepay_mcc.edgepay_mcc_id,"
			+ "edgepay_gateway_db.edgepay_mcc.edgepay_mcc "
			+ "from "
			+ "edgepay_gateway_db.edgepay_mcc , "
			+ "edgepay_gateway_db.edgepay_merchant_mcc_mapping, "
			+ "edgepay_gateway_db.edgepay_merchant "
			+ "where "
			+ "edgepay_gateway_db.edgepay_mcc.edgepay_mcc_id = " 
			+ "edgepay_gateway_db.edgepay_merchant_mcc_mapping.edgepay_mcc_id and "
			+ "edgepay_gateway_db.edgepay_merchant_mcc_mapping.edgepay_merchant_id = "
			+ "edgepay_gateway_db.edgepay_merchant.edgepay_merchant_id and "
			+ "edgepay_gateway_db.edgepay_merchant.edgepay_merchant_id = ( "
			+ "select edgepay_merchant_id from edgepay_gateway_db.edgepay_merchant " 
			+ "where edgepay_merchant_mid = ";

	// Query String corresponding terminal_id and multipass_device_id val
	String queryTermMultiId = "select edgepay_terminal_id, edgepay_merchant_multipass_device_id from "
			+ "edgepay_gateway_db.edgepay_merchant_terminal"
			+ "where "
			+ "edgepay_gateway_db.edgepay_merchant_terminal.edgepay_merchant_id in "
			+ "(select edgepay_merchant_id from edgepay_gateway_db.edgepay_merchant "
			+ "where edgepay_merchant_mid = ";

	// Query String to Identify Location (State)
	String queryLocState = " select  edgepay_gateway_db.edgepay_location.edgepay_location_name  " 
			+ " from  "
			+ "edgepay_gateway_db.edgepay_location, " 
			+ "edgepay_gateway_db.edgepay_merchant_location_mapping, "
			+ "edgepay_gateway_db.edgepay_merchant "
			+ "where "
			+ "edgepay_gateway_db.edgepay_location.edgepay_location_id = "  
			+ "edgepay_gateway_db.edgepay_merchant_location_mapping.edgepay_location_id and "
			+ "edgepay_gateway_db.edgepay_merchant_location_mapping.edgepay_merchant_id =  "
			+ "edgepay_gateway_db.edgepay_merchant.edgepay_merchant_id and "
			+ "edgepay_gateway_db.edgepay_merchant.edgepay_merchant_mid =  ";

	// Query String to Identify Location (Country)
	String queryLocCountry = "select a1.edgepay_location_name "
			+ "from "
			+ "edgepay_gateway_db.edgepay_location a1 "
			+ "where "
			+ "a1.edgepay_location_id = " 
			+ "(select b1.edgepay_location_ref_id "
			+ "from  "
			+ "edgepay_gateway_db.edgepay_location b1, "
			+ "edgepay_gateway_db.edgepay_merchant_location_mapping b2, "
			+ "edgepay_gateway_db.edgepay_merchant b3 "
			+ "where "
			+ "b1.edgepay_location_id = b2.edgepay_location_id and "
			+ "b2.edgepay_merchant_id = b3.edgepay_merchant_id and "
			+ "b3.edgepay_merchant_mid =  ";


	// Query String to retrieve ODFI VALUE
	String queryODFIVal = " select edgepay_gateway_db.edgepay_odfi.edgepay_odfi_code "
			+ "from "
			+ "edgepay_gateway_db.edgepay_odfi, "
			+ "edgepay_gateway_db.edgepay_merchant "
			+ "where  "
			+ "edgepay_gateway_db.edgepay_odfi.edgepay_odfi_id = edgepay_gateway_db.edgepay_merchant.edgepay_odfi_id and "
			+ "edgepay_gateway_db.edgepay_merchant.edgepay_merchant_mid = ";


	}
