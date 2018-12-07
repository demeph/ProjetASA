package cosaM1.interfaces;

import cosa.interfaces.Component;
import cosaM1.impl.ServerDetailImpl;

public interface DataBase extends Component {

    void setServerDetail(ServerDetail serverDetail);

    void login();

    String getQuery() ;

    void setQuery(String query);
}
