/**
 * generated by Xtext 2.10.0
 */
package io.github.jhipster.jdl.jdl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.github.jhipster.jdl.jdl.JdlRelationship#getFromEntity <em>From Entity</em>}</li>
 *   <li>{@link io.github.jhipster.jdl.jdl.JdlRelationship#getFromName <em>From Name</em>}</li>
 *   <li>{@link io.github.jhipster.jdl.jdl.JdlRelationship#getToEntity <em>To Entity</em>}</li>
 *   <li>{@link io.github.jhipster.jdl.jdl.JdlRelationship#getToName <em>To Name</em>}</li>
 * </ul>
 *
 * @see io.github.jhipster.jdl.jdl.JdlPackage#getJdlRelationship()
 * @model
 * @generated
 */
public interface JdlRelationship extends EObject
{
  /**
   * Returns the value of the '<em><b>From Entity</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>From Entity</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>From Entity</em>' reference.
   * @see #setFromEntity(JdlEntity)
   * @see io.github.jhipster.jdl.jdl.JdlPackage#getJdlRelationship_FromEntity()
   * @model
   * @generated
   */
  JdlEntity getFromEntity();

  /**
   * Sets the value of the '{@link io.github.jhipster.jdl.jdl.JdlRelationship#getFromEntity <em>From Entity</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>From Entity</em>' reference.
   * @see #getFromEntity()
   * @generated
   */
  void setFromEntity(JdlEntity value);

  /**
   * Returns the value of the '<em><b>From Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>From Name</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>From Name</em>' containment reference.
   * @see #setFromName(JdlRelationshipName)
   * @see io.github.jhipster.jdl.jdl.JdlPackage#getJdlRelationship_FromName()
   * @model containment="true"
   * @generated
   */
  JdlRelationshipName getFromName();

  /**
   * Sets the value of the '{@link io.github.jhipster.jdl.jdl.JdlRelationship#getFromName <em>From Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>From Name</em>' containment reference.
   * @see #getFromName()
   * @generated
   */
  void setFromName(JdlRelationshipName value);

  /**
   * Returns the value of the '<em><b>To Entity</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>To Entity</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>To Entity</em>' reference.
   * @see #setToEntity(JdlEntity)
   * @see io.github.jhipster.jdl.jdl.JdlPackage#getJdlRelationship_ToEntity()
   * @model
   * @generated
   */
  JdlEntity getToEntity();

  /**
   * Sets the value of the '{@link io.github.jhipster.jdl.jdl.JdlRelationship#getToEntity <em>To Entity</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>To Entity</em>' reference.
   * @see #getToEntity()
   * @generated
   */
  void setToEntity(JdlEntity value);

  /**
   * Returns the value of the '<em><b>To Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>To Name</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>To Name</em>' containment reference.
   * @see #setToName(JdlRelationshipName)
   * @see io.github.jhipster.jdl.jdl.JdlPackage#getJdlRelationship_ToName()
   * @model containment="true"
   * @generated
   */
  JdlRelationshipName getToName();

  /**
   * Sets the value of the '{@link io.github.jhipster.jdl.jdl.JdlRelationship#getToName <em>To Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>To Name</em>' containment reference.
   * @see #getToName()
   * @generated
   */
  void setToName(JdlRelationshipName value);

} // JdlRelationship