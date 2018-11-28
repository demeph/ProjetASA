package simpleCS.impl;

import simpleCS.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Service
		Send_Request sendReq = new Send_RequestImpl();
		Send_Request_In sendReqIn = new Send_Request_InImpl(); 
		Send_Request_Out sendReqOut = new Send_Request_OutImpl();
		Client cl = new ClientImpl(); 
		
		cl.setSend_request_in(sendReqIn);
		cl.setSend_request_out(sendReqOut);
		cl.setSend_request(sendReq);
		 
		RPC rpc = new RPCImpl();
		
		
		Serveur s = new ServeurImpl();
		

		Simple_CS scs = new Simple_CSImpl();
		scs.setClient(cl);
		scs.setServeur(s);
		
		
	}

}
