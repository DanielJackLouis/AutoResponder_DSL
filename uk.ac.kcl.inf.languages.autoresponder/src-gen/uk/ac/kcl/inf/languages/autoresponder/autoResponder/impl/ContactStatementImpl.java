/**
 * generated by Xtext 2.26.0
 */
package uk.ac.kcl.inf.languages.autoresponder.autoResponder.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uk.ac.kcl.inf.languages.autoresponder.autoResponder.AutoResponderPackage;
import uk.ac.kcl.inf.languages.autoresponder.autoResponder.ContactStatement;
import uk.ac.kcl.inf.languages.autoresponder.autoResponder.StringExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contact Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.languages.autoresponder.autoResponder.impl.ContactStatementImpl#getPhoneNumber <em>Phone Number</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContactStatementImpl extends StatementImpl implements ContactStatement
{
  /**
   * The cached value of the '{@link #getPhoneNumber() <em>Phone Number</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPhoneNumber()
   * @generated
   * @ordered
   */
  protected StringExpression phoneNumber;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ContactStatementImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return AutoResponderPackage.Literals.CONTACT_STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public StringExpression getPhoneNumber()
  {
    return phoneNumber;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPhoneNumber(StringExpression newPhoneNumber, NotificationChain msgs)
  {
    StringExpression oldPhoneNumber = phoneNumber;
    phoneNumber = newPhoneNumber;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AutoResponderPackage.CONTACT_STATEMENT__PHONE_NUMBER, oldPhoneNumber, newPhoneNumber);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setPhoneNumber(StringExpression newPhoneNumber)
  {
    if (newPhoneNumber != phoneNumber)
    {
      NotificationChain msgs = null;
      if (phoneNumber != null)
        msgs = ((InternalEObject)phoneNumber).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AutoResponderPackage.CONTACT_STATEMENT__PHONE_NUMBER, null, msgs);
      if (newPhoneNumber != null)
        msgs = ((InternalEObject)newPhoneNumber).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AutoResponderPackage.CONTACT_STATEMENT__PHONE_NUMBER, null, msgs);
      msgs = basicSetPhoneNumber(newPhoneNumber, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AutoResponderPackage.CONTACT_STATEMENT__PHONE_NUMBER, newPhoneNumber, newPhoneNumber));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case AutoResponderPackage.CONTACT_STATEMENT__PHONE_NUMBER:
        return basicSetPhoneNumber(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case AutoResponderPackage.CONTACT_STATEMENT__PHONE_NUMBER:
        return getPhoneNumber();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case AutoResponderPackage.CONTACT_STATEMENT__PHONE_NUMBER:
        setPhoneNumber((StringExpression)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case AutoResponderPackage.CONTACT_STATEMENT__PHONE_NUMBER:
        setPhoneNumber((StringExpression)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case AutoResponderPackage.CONTACT_STATEMENT__PHONE_NUMBER:
        return phoneNumber != null;
    }
    return super.eIsSet(featureID);
  }

} //ContactStatementImpl
