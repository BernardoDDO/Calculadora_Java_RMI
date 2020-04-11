package servico;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.time.LocalDate;

public interface ICalculadora {
	int PORTA = 1099;
	String NOME = "Serviço de Calculadora";
	String URI =  "127.0.0.1";
	
	public abstract String getSum() 
			throws RemoteException;

	public abstract String getSub() 
			throws RemoteException;
	
	public abstract String getMultiplication() 
			throws RemoteException;
	
	public abstract String getDivision()
			throws RemoteException;
	

}
