/**
 * generated by Xtext 2.10.0
 */
package io.github.jhipster.jdl.jdl.util;

import io.github.jhipster.jdl.jdl.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see io.github.jhipster.jdl.jdl.JdlPackage
 * @generated
 */
public class JdlAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static JdlPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JdlAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = JdlPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected JdlSwitch<Adapter> modelSwitch =
    new JdlSwitch<Adapter>()
    {
      @Override
      public Adapter caseJdlDomainModel(JdlDomainModel object)
      {
        return createJdlDomainModelAdapter();
      }
      @Override
      public Adapter caseJdlFeature(JdlFeature object)
      {
        return createJdlFeatureAdapter();
      }
      @Override
      public Adapter caseJdlEntity(JdlEntity object)
      {
        return createJdlEntityAdapter();
      }
      @Override
      public Adapter caseJdlEntityField(JdlEntityField object)
      {
        return createJdlEntityFieldAdapter();
      }
      @Override
      public Adapter caseJdlFieldType(JdlFieldType object)
      {
        return createJdlFieldTypeAdapter();
      }
      @Override
      public Adapter caseJdlStringValidators(JdlStringValidators object)
      {
        return createJdlStringValidatorsAdapter();
      }
      @Override
      public Adapter caseJdlNumericValidators(JdlNumericValidators object)
      {
        return createJdlNumericValidatorsAdapter();
      }
      @Override
      public Adapter caseJdlBlobValidators(JdlBlobValidators object)
      {
        return createJdlBlobValidatorsAdapter();
      }
      @Override
      public Adapter caseJdlRequiredValidator(JdlRequiredValidator object)
      {
        return createJdlRequiredValidatorAdapter();
      }
      @Override
      public Adapter caseJdlMinLengthValidator(JdlMinLengthValidator object)
      {
        return createJdlMinLengthValidatorAdapter();
      }
      @Override
      public Adapter caseJdlMaxLengthValidator(JdlMaxLengthValidator object)
      {
        return createJdlMaxLengthValidatorAdapter();
      }
      @Override
      public Adapter caseJdlPatternValidator(JdlPatternValidator object)
      {
        return createJdlPatternValidatorAdapter();
      }
      @Override
      public Adapter caseJdlMinValidator(JdlMinValidator object)
      {
        return createJdlMinValidatorAdapter();
      }
      @Override
      public Adapter caseJdlMaxValidator(JdlMaxValidator object)
      {
        return createJdlMaxValidatorAdapter();
      }
      @Override
      public Adapter caseJdlMinBytesValidator(JdlMinBytesValidator object)
      {
        return createJdlMinBytesValidatorAdapter();
      }
      @Override
      public Adapter caseJdlMaxBytesValidator(JdlMaxBytesValidator object)
      {
        return createJdlMaxBytesValidatorAdapter();
      }
      @Override
      public Adapter caseJdlRelationships(JdlRelationships object)
      {
        return createJdlRelationshipsAdapter();
      }
      @Override
      public Adapter caseJdlRelationship(JdlRelationship object)
      {
        return createJdlRelationshipAdapter();
      }
      @Override
      public Adapter caseJdlRelationshipName(JdlRelationshipName object)
      {
        return createJdlRelationshipNameAdapter();
      }
      @Override
      public Adapter caseJdlEnumType(JdlEnumType object)
      {
        return createJdlEnumTypeAdapter();
      }
      @Override
      public Adapter caseJdlGenerationSetting(JdlGenerationSetting object)
      {
        return createJdlGenerationSettingAdapter();
      }
      @Override
      public Adapter caseJdlGenerationSettingType(JdlGenerationSettingType object)
      {
        return createJdlGenerationSettingTypeAdapter();
      }
      @Override
      public Adapter caseJdlEntityInclusion(JdlEntityInclusion object)
      {
        return createJdlEntityInclusionAdapter();
      }
      @Override
      public Adapter caseJdlEntityExclusion(JdlEntityExclusion object)
      {
        return createJdlEntityExclusionAdapter();
      }
      @Override
      public Adapter caseJdlWildcardPredicate(JdlWildcardPredicate object)
      {
        return createJdlWildcardPredicateAdapter();
      }
      @Override
      public Adapter caseJdlPaginateType(JdlPaginateType object)
      {
        return createJdlPaginateTypeAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link io.github.jhipster.jdl.jdl.JdlDomainModel <em>Domain Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.github.jhipster.jdl.jdl.JdlDomainModel
   * @generated
   */
  public Adapter createJdlDomainModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link io.github.jhipster.jdl.jdl.JdlFeature <em>Feature</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.github.jhipster.jdl.jdl.JdlFeature
   * @generated
   */
  public Adapter createJdlFeatureAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link io.github.jhipster.jdl.jdl.JdlEntity <em>Entity</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.github.jhipster.jdl.jdl.JdlEntity
   * @generated
   */
  public Adapter createJdlEntityAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link io.github.jhipster.jdl.jdl.JdlEntityField <em>Entity Field</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.github.jhipster.jdl.jdl.JdlEntityField
   * @generated
   */
  public Adapter createJdlEntityFieldAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link io.github.jhipster.jdl.jdl.JdlFieldType <em>Field Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.github.jhipster.jdl.jdl.JdlFieldType
   * @generated
   */
  public Adapter createJdlFieldTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link io.github.jhipster.jdl.jdl.JdlStringValidators <em>String Validators</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.github.jhipster.jdl.jdl.JdlStringValidators
   * @generated
   */
  public Adapter createJdlStringValidatorsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link io.github.jhipster.jdl.jdl.JdlNumericValidators <em>Numeric Validators</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.github.jhipster.jdl.jdl.JdlNumericValidators
   * @generated
   */
  public Adapter createJdlNumericValidatorsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link io.github.jhipster.jdl.jdl.JdlBlobValidators <em>Blob Validators</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.github.jhipster.jdl.jdl.JdlBlobValidators
   * @generated
   */
  public Adapter createJdlBlobValidatorsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link io.github.jhipster.jdl.jdl.JdlRequiredValidator <em>Required Validator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.github.jhipster.jdl.jdl.JdlRequiredValidator
   * @generated
   */
  public Adapter createJdlRequiredValidatorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link io.github.jhipster.jdl.jdl.JdlMinLengthValidator <em>Min Length Validator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.github.jhipster.jdl.jdl.JdlMinLengthValidator
   * @generated
   */
  public Adapter createJdlMinLengthValidatorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link io.github.jhipster.jdl.jdl.JdlMaxLengthValidator <em>Max Length Validator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.github.jhipster.jdl.jdl.JdlMaxLengthValidator
   * @generated
   */
  public Adapter createJdlMaxLengthValidatorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link io.github.jhipster.jdl.jdl.JdlPatternValidator <em>Pattern Validator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.github.jhipster.jdl.jdl.JdlPatternValidator
   * @generated
   */
  public Adapter createJdlPatternValidatorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link io.github.jhipster.jdl.jdl.JdlMinValidator <em>Min Validator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.github.jhipster.jdl.jdl.JdlMinValidator
   * @generated
   */
  public Adapter createJdlMinValidatorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link io.github.jhipster.jdl.jdl.JdlMaxValidator <em>Max Validator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.github.jhipster.jdl.jdl.JdlMaxValidator
   * @generated
   */
  public Adapter createJdlMaxValidatorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link io.github.jhipster.jdl.jdl.JdlMinBytesValidator <em>Min Bytes Validator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.github.jhipster.jdl.jdl.JdlMinBytesValidator
   * @generated
   */
  public Adapter createJdlMinBytesValidatorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link io.github.jhipster.jdl.jdl.JdlMaxBytesValidator <em>Max Bytes Validator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.github.jhipster.jdl.jdl.JdlMaxBytesValidator
   * @generated
   */
  public Adapter createJdlMaxBytesValidatorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link io.github.jhipster.jdl.jdl.JdlRelationships <em>Relationships</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.github.jhipster.jdl.jdl.JdlRelationships
   * @generated
   */
  public Adapter createJdlRelationshipsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link io.github.jhipster.jdl.jdl.JdlRelationship <em>Relationship</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.github.jhipster.jdl.jdl.JdlRelationship
   * @generated
   */
  public Adapter createJdlRelationshipAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link io.github.jhipster.jdl.jdl.JdlRelationshipName <em>Relationship Name</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.github.jhipster.jdl.jdl.JdlRelationshipName
   * @generated
   */
  public Adapter createJdlRelationshipNameAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link io.github.jhipster.jdl.jdl.JdlEnumType <em>Enum Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.github.jhipster.jdl.jdl.JdlEnumType
   * @generated
   */
  public Adapter createJdlEnumTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link io.github.jhipster.jdl.jdl.JdlGenerationSetting <em>Generation Setting</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.github.jhipster.jdl.jdl.JdlGenerationSetting
   * @generated
   */
  public Adapter createJdlGenerationSettingAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link io.github.jhipster.jdl.jdl.JdlGenerationSettingType <em>Generation Setting Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.github.jhipster.jdl.jdl.JdlGenerationSettingType
   * @generated
   */
  public Adapter createJdlGenerationSettingTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link io.github.jhipster.jdl.jdl.JdlEntityInclusion <em>Entity Inclusion</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.github.jhipster.jdl.jdl.JdlEntityInclusion
   * @generated
   */
  public Adapter createJdlEntityInclusionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link io.github.jhipster.jdl.jdl.JdlEntityExclusion <em>Entity Exclusion</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.github.jhipster.jdl.jdl.JdlEntityExclusion
   * @generated
   */
  public Adapter createJdlEntityExclusionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link io.github.jhipster.jdl.jdl.JdlWildcardPredicate <em>Wildcard Predicate</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.github.jhipster.jdl.jdl.JdlWildcardPredicate
   * @generated
   */
  public Adapter createJdlWildcardPredicateAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link io.github.jhipster.jdl.jdl.JdlPaginateType <em>Paginate Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.github.jhipster.jdl.jdl.JdlPaginateType
   * @generated
   */
  public Adapter createJdlPaginateTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //JdlAdapterFactory