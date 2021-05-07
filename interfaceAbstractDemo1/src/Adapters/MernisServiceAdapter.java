package Adapters;

import java.rmi.RemoteException;

import abstracts.CustomerCheckService;
import entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService{

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		
		KPSPublicSoap client = new KPSPublicSoapProxy();
		boolean result = false;
		try {
			result = client.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()), 
					customer.getFirstName().toUpperCase(),
					customer.getLastName().toUpperCase(), 
					customer.getDataOfBirth().getYear());
			
		}catch (NumberFormatException e) {
			e.printStackTrace();
			
		}catch(RemoteException e) {
			e.printStackTrace();
			
		}
		return result;
	}

}
