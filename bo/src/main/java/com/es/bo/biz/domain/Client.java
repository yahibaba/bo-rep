package com.es.bo.biz.domain;

import org.springframework.data.annotation.Id;

public class Client {

    @Id
    private String id;
    private String clientId;
    private Address address;

    public Client() {}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

	public String getClientId() {
		return clientId;
	}

	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

    

}