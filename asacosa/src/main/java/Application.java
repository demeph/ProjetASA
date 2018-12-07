import cosaM1.impl.*;
import cosaM1.interfaces.*;

public class Application {
    public static void main(String []args){



        Client client = new ClientImpl();

        Server server = new ServerImpl();

        ServerDetail serverDetail = new ServerDetailImpl();

        ClearanceRequest clearanceRequest = new ClearanceRequestImpl(serverDetail);

        SecurityQuery securityQuery = new SecurityQueryImpl(serverDetail);

        SQLQuery sqlQuery = new SQLQueryImpl(serverDetail);

        serverDetail.attach(clearanceRequest);
        serverDetail.attach(securityQuery);
        serverDetail.attach(sqlQuery);

        SimpleCS cs = new SimpleCSImpl(client, server, serverDetail);

        RPC rpc = new RPCImpl(cs);



        cs.attach(rpc);

        client.sendRequest("Yollo client");
    }
}
