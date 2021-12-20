/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 20-Dec-2021, 4:31:51 PM                     ---
 * ----------------------------------------------------------------
 *  
 * Copyright (c) 2021 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.training.core.jalo;

import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloInvalidParameterException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.C2LManager;
import de.hybris.platform.jalo.c2l.Language;
import de.hybris.platform.jalo.product.Product;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.TypeManager;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import de.hybris.platform.util.Utilities;
import de.hybris.training.core.constants.TrainingCoreConstants;
import de.hybris.training.core.jalo.VehicleDealers;
import de.hybris.training.core.jalo.VehicleDrivers;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Generated class for type {@link de.hybris.training.core.jalo.VehicleList VehicleList}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedVehicleList extends Product
{
	/** Qualifier of the <code>VehicleList.id</code> attribute **/
	public static final String ID = "id";
	/** Qualifier of the <code>VehicleList.vehicleRegistrationNumber</code> attribute **/
	public static final String VEHICLEREGISTRATIONNUMBER = "vehicleRegistrationNumber";
	/** Qualifier of the <code>VehicleList.vehicleDescription</code> attribute **/
	public static final String VEHICLEDESCRIPTION = "vehicleDescription";
	/** Qualifier of the <code>VehicleList.vehicleReview</code> attribute **/
	public static final String VEHICLEREVIEW = "vehicleReview";
	/** Qualifier of the <code>VehicleList.dealer</code> attribute **/
	public static final String DEALER = "dealer";
	/** Relation ordering override parameter constants for VehicleList2VehicleDealers from ((trainingcore))*/
	protected static String VEHICLELIST2VEHICLEDEALERS_SRC_ORDERED = "relation.VehicleList2VehicleDealers.source.ordered";
	protected static String VEHICLELIST2VEHICLEDEALERS_TGT_ORDERED = "relation.VehicleList2VehicleDealers.target.ordered";
	/** Relation disable markmodifed parameter constants for VehicleList2VehicleDealers from ((trainingcore))*/
	protected static String VEHICLELIST2VEHICLEDEALERS_MARKMODIFIED = "relation.VehicleList2VehicleDealers.markmodified";
	/** Qualifier of the <code>VehicleList.driver</code> attribute **/
	public static final String DRIVER = "driver";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n DRIVER's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedVehicleList> DRIVERHANDLER = new BidirectionalOneToManyHandler<GeneratedVehicleList>(
	TrainingCoreConstants.TC.VEHICLELIST,
	false,
	"driver",
	null,
	false,
	true,
	CollectionType.SET
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(Product.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(ID, AttributeMode.INITIAL);
		tmp.put(VEHICLEREGISTRATIONNUMBER, AttributeMode.INITIAL);
		tmp.put(VEHICLEDESCRIPTION, AttributeMode.INITIAL);
		tmp.put(VEHICLEREVIEW, AttributeMode.INITIAL);
		tmp.put(DRIVER, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		DRIVERHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VehicleList.dealer</code> attribute.
	 * @return the dealer - Dealer
	 */
	public Set<VehicleDealers> getDealer(final SessionContext ctx)
	{
		final List<VehicleDealers> items = getLinkedItems( 
			ctx,
			true,
			TrainingCoreConstants.Relations.VEHICLELIST2VEHICLEDEALERS,
			"VehicleDealers",
			null,
			false,
			false
		);
		return new LinkedHashSet<VehicleDealers>(items);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VehicleList.dealer</code> attribute.
	 * @return the dealer - Dealer
	 */
	public Set<VehicleDealers> getDealer()
	{
		return getDealer( getSession().getSessionContext() );
	}
	
	public long getDealerCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			true,
			TrainingCoreConstants.Relations.VEHICLELIST2VEHICLEDEALERS,
			"VehicleDealers",
			null
		);
	}
	
	public long getDealerCount()
	{
		return getDealerCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VehicleList.dealer</code> attribute. 
	 * @param value the dealer - Dealer
	 */
	public void setDealer(final SessionContext ctx, final Set<VehicleDealers> value)
	{
		setLinkedItems( 
			ctx,
			true,
			TrainingCoreConstants.Relations.VEHICLELIST2VEHICLEDEALERS,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(VEHICLELIST2VEHICLEDEALERS_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VehicleList.dealer</code> attribute. 
	 * @param value the dealer - Dealer
	 */
	public void setDealer(final Set<VehicleDealers> value)
	{
		setDealer( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to dealer. 
	 * @param value the item to add to dealer - Dealer
	 */
	public void addToDealer(final SessionContext ctx, final VehicleDealers value)
	{
		addLinkedItems( 
			ctx,
			true,
			TrainingCoreConstants.Relations.VEHICLELIST2VEHICLEDEALERS,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(VEHICLELIST2VEHICLEDEALERS_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to dealer. 
	 * @param value the item to add to dealer - Dealer
	 */
	public void addToDealer(final VehicleDealers value)
	{
		addToDealer( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from dealer. 
	 * @param value the item to remove from dealer - Dealer
	 */
	public void removeFromDealer(final SessionContext ctx, final VehicleDealers value)
	{
		removeLinkedItems( 
			ctx,
			true,
			TrainingCoreConstants.Relations.VEHICLELIST2VEHICLEDEALERS,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(VEHICLELIST2VEHICLEDEALERS_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from dealer. 
	 * @param value the item to remove from dealer - Dealer
	 */
	public void removeFromDealer(final VehicleDealers value)
	{
		removeFromDealer( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VehicleList.driver</code> attribute.
	 * @return the driver - Driver
	 */
	public VehicleDrivers getDriver(final SessionContext ctx)
	{
		return (VehicleDrivers)getProperty( ctx, DRIVER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VehicleList.driver</code> attribute.
	 * @return the driver - Driver
	 */
	public VehicleDrivers getDriver()
	{
		return getDriver( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VehicleList.driver</code> attribute. 
	 * @param value the driver - Driver
	 */
	public void setDriver(final SessionContext ctx, final VehicleDrivers value)
	{
		DRIVERHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VehicleList.driver</code> attribute. 
	 * @param value the driver - Driver
	 */
	public void setDriver(final VehicleDrivers value)
	{
		setDriver( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VehicleList.id</code> attribute.
	 * @return the id - Vehicle ID
	 */
	public String getId(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VehicleList.id</code> attribute.
	 * @return the id - Vehicle ID
	 */
	public String getId()
	{
		return getId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VehicleList.id</code> attribute. 
	 * @param value the id - Vehicle ID
	 */
	public void setId(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VehicleList.id</code> attribute. 
	 * @param value the id - Vehicle ID
	 */
	public void setId(final String value)
	{
		setId( getSession().getSessionContext(), value );
	}
	
	/**
	 * @deprecated since 2011, use {@link Utilities#getMarkModifiedOverride(de.hybris.platform.jalo.type.RelationType)
	 */
	@Override
	@Deprecated(since = "2105", forRemoval = true)
	public boolean isMarkModifiedDisabled(final Item referencedItem)
	{
		ComposedType relationSecondEnd0 = TypeManager.getInstance().getComposedType("VehicleDealers");
		if(relationSecondEnd0.isAssignableFrom(referencedItem.getComposedType()))
		{
			return Utilities.getMarkModifiedOverride(VEHICLELIST2VEHICLEDEALERS_MARKMODIFIED);
		}
		return true;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VehicleList.vehicleDescription</code> attribute.
	 * @return the vehicleDescription - vehicle description
	 */
	public String getVehicleDescription(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedVehicleList.getVehicleDescription requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, VEHICLEDESCRIPTION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VehicleList.vehicleDescription</code> attribute.
	 * @return the vehicleDescription - vehicle description
	 */
	public String getVehicleDescription()
	{
		return getVehicleDescription( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VehicleList.vehicleDescription</code> attribute. 
	 * @return the localized vehicleDescription - vehicle description
	 */
	public Map<Language,String> getAllVehicleDescription(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,VEHICLEDESCRIPTION,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VehicleList.vehicleDescription</code> attribute. 
	 * @return the localized vehicleDescription - vehicle description
	 */
	public Map<Language,String> getAllVehicleDescription()
	{
		return getAllVehicleDescription( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VehicleList.vehicleDescription</code> attribute. 
	 * @param value the vehicleDescription - vehicle description
	 */
	public void setVehicleDescription(final SessionContext ctx, final String value)
	{
		if ( ctx == null) 
		{
			throw new JaloInvalidParameterException( "ctx is null", 0 );
		}
		if( ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedVehicleList.setVehicleDescription requires a session language", 0 );
		}
		setLocalizedProperty(ctx, VEHICLEDESCRIPTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VehicleList.vehicleDescription</code> attribute. 
	 * @param value the vehicleDescription - vehicle description
	 */
	public void setVehicleDescription(final String value)
	{
		setVehicleDescription( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VehicleList.vehicleDescription</code> attribute. 
	 * @param value the vehicleDescription - vehicle description
	 */
	public void setAllVehicleDescription(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,VEHICLEDESCRIPTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VehicleList.vehicleDescription</code> attribute. 
	 * @param value the vehicleDescription - vehicle description
	 */
	public void setAllVehicleDescription(final Map<Language,String> value)
	{
		setAllVehicleDescription( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VehicleList.vehicleRegistrationNumber</code> attribute.
	 * @return the vehicleRegistrationNumber - Registration number of vehicle
	 */
	public String getVehicleRegistrationNumber(final SessionContext ctx)
	{
		return (String)getProperty( ctx, VEHICLEREGISTRATIONNUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VehicleList.vehicleRegistrationNumber</code> attribute.
	 * @return the vehicleRegistrationNumber - Registration number of vehicle
	 */
	public String getVehicleRegistrationNumber()
	{
		return getVehicleRegistrationNumber( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VehicleList.vehicleRegistrationNumber</code> attribute. 
	 * @param value the vehicleRegistrationNumber - Registration number of vehicle
	 */
	public void setVehicleRegistrationNumber(final SessionContext ctx, final String value)
	{
		setProperty(ctx, VEHICLEREGISTRATIONNUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VehicleList.vehicleRegistrationNumber</code> attribute. 
	 * @param value the vehicleRegistrationNumber - Registration number of vehicle
	 */
	public void setVehicleRegistrationNumber(final String value)
	{
		setVehicleRegistrationNumber( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VehicleList.vehicleReview</code> attribute.
	 * @return the vehicleReview - vehicle review
	 */
	public String getVehicleReview(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedVehicleList.getVehicleReview requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, VEHICLEREVIEW);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VehicleList.vehicleReview</code> attribute.
	 * @return the vehicleReview - vehicle review
	 */
	public String getVehicleReview()
	{
		return getVehicleReview( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VehicleList.vehicleReview</code> attribute. 
	 * @return the localized vehicleReview - vehicle review
	 */
	public Map<Language,String> getAllVehicleReview(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,VEHICLEREVIEW,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VehicleList.vehicleReview</code> attribute. 
	 * @return the localized vehicleReview - vehicle review
	 */
	public Map<Language,String> getAllVehicleReview()
	{
		return getAllVehicleReview( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VehicleList.vehicleReview</code> attribute. 
	 * @param value the vehicleReview - vehicle review
	 */
	public void setVehicleReview(final SessionContext ctx, final String value)
	{
		if ( ctx == null) 
		{
			throw new JaloInvalidParameterException( "ctx is null", 0 );
		}
		if( ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedVehicleList.setVehicleReview requires a session language", 0 );
		}
		setLocalizedProperty(ctx, VEHICLEREVIEW,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VehicleList.vehicleReview</code> attribute. 
	 * @param value the vehicleReview - vehicle review
	 */
	public void setVehicleReview(final String value)
	{
		setVehicleReview( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VehicleList.vehicleReview</code> attribute. 
	 * @param value the vehicleReview - vehicle review
	 */
	public void setAllVehicleReview(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,VEHICLEREVIEW,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VehicleList.vehicleReview</code> attribute. 
	 * @param value the vehicleReview - vehicle review
	 */
	public void setAllVehicleReview(final Map<Language,String> value)
	{
		setAllVehicleReview( getSession().getSessionContext(), value );
	}
	
}
