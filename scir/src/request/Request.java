package request;

import java.time.LocalDate;

public class Request {
	
	private int idRequest;
	private LocalDate date;
	
	
	public Request(int idRequest, LocalDate date) {
		this.idRequest = idRequest;
		this.date = date;
	}


	public int getIdRequest() {
		return idRequest;
	}


	public void setIdRequest(int idRequest) {
		this.idRequest = idRequest;
	}


	public LocalDate getDate() {
		return date;
	}


	public void setDate(LocalDate date) {
		this.date = date;
	}
	
	
	
	
	

}
