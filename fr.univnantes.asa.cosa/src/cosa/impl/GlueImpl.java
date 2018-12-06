/**
 */
package cosa.impl;

import cosa.Connector;
import cosa.CosaPackage;
import cosa.Glue;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Glue</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class GlueImpl extends MinimalEObjectImpl.Container implements Glue {
	
	private Connector connector;
	
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GlueImpl() {
		super();
	}
	
	
	@Override
	public void glue() {
		this.connector.setCalledRole(this.connector.getCallerRole());
		this.connector.sendToConnector();
	}
	
	
	public Connector getConnector() {
		return connector;
	}


	public void setConnector(Connector connector) {
		this.connector = connector;
	}


//------------------------------------- NOT USED --------------------------------------------
	
	


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CosaPackage.Literals.GLUE;
	}

} //GlueImpl
