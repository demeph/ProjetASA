package fr.univnantes.asa.cosadsl.codegen;

import fr.univnantes.asa.cosa.Component;
import fr.univnantes.asa.cosa.CompositeConfiguration;
import fr.univnantes.asa.cosa.Connector;
import fr.univnantes.asa.cosa.Port;
import fr.univnantes.asa.cosa.ProvidedPort;
import fr.univnantes.asa.cosa.ProvidedService;
import fr.univnantes.asa.cosa.RequiredPort;
import fr.univnantes.asa.cosa.RequiredService;
import fr.univnantes.asa.cosa.Service;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class CosaDSLCodeGenerator {
  public static String generateCode(final CompositeConfiguration cc) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public class <<cc.name>> {");
    _builder.newLine();
    {
      EList<Component> _components = cc.getComponents();
      for(final Component c : _components) {
        {
          if ((c instanceof Component)) {
            _builder.append("\t");
            String _generateCode = CosaDSLCodeGenerator.generateCode(((Component) c));
            _builder.append(_generateCode, "\t");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    {
      EList<Connector> _connectors = cc.getConnectors();
      for(final Connector c_1 : _connectors) {
        {
          if ((c_1 instanceof Connector)) {
            _builder.append("\t");
            String _generateCode_1 = CosaDSLCodeGenerator.generateCode(((Connector) c_1));
            _builder.append(_generateCode_1, "\t");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder.append("}\t\t\t");
    _builder.newLine();
    return _builder.toString();
  }
  
  public static String generateCode(final Component c) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public class ");
    String _name = c.getName();
    _builder.append(_name);
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    {
      EList<Port> _ports = c.getPorts();
      for(final Port port : _ports) {
        {
          if ((port instanceof RequiredPort)) {
            _builder.append("\t");
            String _generateCode = CosaDSLCodeGenerator.generateCode(((RequiredPort) port));
            _builder.append(_generateCode, "\t");
            _builder.newLineIfNotEmpty();
          } else {
            if ((port instanceof ProvidedPort)) {
              _builder.append("\t");
              String _generateCode_1 = CosaDSLCodeGenerator.generateCode(((ProvidedPort) port));
              _builder.append(_generateCode_1, "\t");
              _builder.newLineIfNotEmpty();
            }
          }
        }
      }
    }
    {
      EList<Service> _services = c.getServices();
      for(final Service service : _services) {
        {
          if ((service instanceof RequiredService)) {
            _builder.append("\t");
            String _generateCode_2 = CosaDSLCodeGenerator.generateCode(((RequiredService) service));
            _builder.append(_generateCode_2, "\t");
            _builder.newLineIfNotEmpty();
          } else {
            if ((service instanceof ProvidedService)) {
              _builder.append("\t");
              String _generateCode_3 = CosaDSLCodeGenerator.generateCode(((ProvidedService) service));
              _builder.append(_generateCode_3, "\t");
              _builder.newLineIfNotEmpty();
            }
          }
        }
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }
  
  public static String generateCode(final Connector rp) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\t\t\t");
    _builder.newLine();
    return _builder.toString();
  }
  
  public static String generateCode(final Port pp) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\t\t\t");
    _builder.newLine();
    return _builder.toString();
  }
  
  public static String generateCode(final Service rs) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\t\t\t");
    _builder.newLine();
    return _builder.toString();
  }
}
