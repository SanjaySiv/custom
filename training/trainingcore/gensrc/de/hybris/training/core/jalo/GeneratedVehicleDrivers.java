/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 16-Dec-2021, 11:48:03 AM                    ---
 * ----------------------------------------------------------------
 *  
 * Copyright (c) 2021 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.training.core.jalo;

import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloInvalidParameterException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.C2LManager;
import de.hybris.platform.jalo.c2l.Language;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.TypeManager;
import de.hybris.platform.util.OneToManyHandler;
import de.hybris.platform.util.Utilities;
import de.hybris.training.core.constants.TrainingCoreConstants;
import de.hybris.training.core.jalo.VehicleDealers;
import de.hybris.training.core.jalo.VehicleList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Generated class for type {@link de.hybris.training.core.jalo.VehicleDrivers VehicleDrivers}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedVehicleDrivers extends GenericItem
{
	/** Qualifier of the <code>VehicleDrivers.id</code> attribute **/
	public static final String ID = "id";
	/** Qualifier of the <code>VehicleDrivers.driverName</code> attribute **/
	public static final String DRIVERNAME = "driverName";
	/** Qualifier of the <code>VehicleDrivers.driverExperience</code> attribute **/
	public static final String DRIVEREXPERIENCE = "driverExperience";
	/** Qualifier of the <code>VehicleDrivers.dealer</code> attribute **/
	public static final String DEALER = "dealer";
	/** Relation ordering override parameter constants for VehicleDrivers2VehicleDealers from ((trainingcore))*/
	protected static String VEHICLEDRIVERS2VEHICLEDEALERS_SRC_ORDERED = "relation.VehicleDrivers2VehicleDealers.source.ordered";
	protected static String VEHICLEDRIVERS2VEHICLEDEALERS_TGT_ORDERED = "relation.VehicleDrivers2VehicleDealers.target.ordered";
	/** Relation disable markmodifed parameter constants for VehicleDrivers2VehicleDealers from ((trainingcore))*/
	protected static String VEHICLEDRIVERS2VEHICLEDEALERS_MARKMODIFIED = "relation.VehicleDrivers2VehicleDealers.markmodified";
	/** Qualifier of the <code>VehicleDrivers.vehicle</code> attribute **/
	public static final String VEHICLE = "vehicle";
	/**
	* {@link OneToManyHandler} for handling 1:n VEHICLE's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<VehicleList> VEHICLEHANDLER = new OneToManyHandler<VehicleList>(
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
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(ID, AttributeMode.INITIAL);
		tmp.put(DRIVERNAME, AttributeMode.INITIAL);
		tmp.put(DRIVEREXPERIENCE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VehicleDrivers.dealer</code> attribute.
	 * @return the dealer - Dealer
	 */
	public Set<VehicleDealers> getDealer(final SessionContext ctx)
	{
		final List<VehicleDealers> items = getLinkedItems( 
			ctx,
			true,
			TrainingCoreConstants.Relations.VEHICLEDRIVERS2VEHICLEDEALERS,
			"VehicleDealers",
			null,
			false,
			false
		);
		return new LinkedHashSet<VehicleDealers>(items);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VehicleDrivers.dealer</code> attribute.
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
			TrainingCoreConstants.Relations.VEHICLEDRIVERS2VEHICLEDEALERS,
			"VehicleDealers",
			null
		);
	}
	
	public long getDealerCount()
	{
		return getDealerCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VehicleDrivers.dealer</code> attribute. 
	 * @param value the dealer - Dealer
	 */
	public void setDealer(final SessionContext ctx, final Set<VehicleDealers> value)
	{
		setLinkedItems( 
			ctx,
			true,
			TrainingCoreConstants.Relations.VEHICLEDRIVERS2VEHICLEDEALERS,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(VEHICLEDRIVERS2VEHICLEDEALERS_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VehicleDrivers.dealer</code> attribute. 
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
			TrainingCoreConstants.Relations.VEHICLEDRIVERS2VEHICLEDEALERS,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(VEHICLEDRIVERS2VEHICLEDEALERS_MARKMODIFIED)
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
			TrainingCoreConstants.Relations.VEHICLEDRIVERS2VEHICLEDEALERS,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(VEHICLEDRIVERS2VEHICLEDEALERS_MARKMODIFIED)
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
	 * <i>Generated method</i> - Getter of the <code>VehicleDrivers.driverExperience</code> attribute.
	 * @return the driverExperience - Driver Experience
	 */
	public Integer getDriverExperience(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, DRIVEREXPERIENCE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VehicleDrivers.driverExperience</code> attribute.
	 * @return the driverExperience - Driver Experience
	 */
	public Integer getDriverExperience()
	{
		return getDriverExperience( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VehicleDrivers.driverExperience</code> attribute. 
	 * @return the driverExperience - Driver Experience
	 */
	public int getDriverExperienceAsPrimitive(final SessionContext ctx)
	{
		Integer value = getDriverExperience( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VehicleDrivers.driverExperience</code> attribute. 
	 * @return the driverExperience - Driver Experience
	 */
	public int getDriverExperienceAsPrimitive()
	{
		return getDriverExperienceAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VehicleDrivers.driverExperience</code> attribute. 
	 * @param value the driverExperience - Driver Experience
	 */
	public void setDriverExperience(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, DRIVEREXPERIENCE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VehicleDrivers.driverExperience</code> attribute. 
	 * @param value the driverExperience - Driver Experience
	 */
	public void setDriverExperience(final Integer value)
	{
		setDriverExperience( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VehicleDrivers.driverExperience</code> attribute. 
	 * @param value the driverExperience - Driver Experience
	 */
	public void setDriverExperience(final SessionContext ctx, final int value)
	{
		setDriverExperience( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VehicleDrivers.driverExperience</code> attribute. 
	 * @param value the driverExperience - Driver Experience
	 */
	public void setDriverExperience(final int value)
	{
		setDriverExperience( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VehicleDrivers.driverName</code> attribute.
	 * @return the driverName - Driver name
	 */
	public String getDriverName(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedVehicleDrivers.getDriverName requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, DRIVERNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VehicleDrivers.driverName</code> attribute.
	 * @return the driverName - Driver name
	 */
	public String getDriverName()
	{
		return getDriverName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VehicleDrivers.driverName</code> attribute. 
	 * @return the localized driverName - Driver name
	 */
	public Map<Language,String> getAllDriverName(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,DRIVERNAME,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VehicleDrivers.driverName</code> attribute. 
	 * @return the localized driverName - Driver name
	 */
	public Map<Language,String> getAllDriverName()
	{
		return getAllDriverName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VehicleDrivers.driverName</code> attribute. 
	 * @param value the driverName - Driver name
	 */
	public void setDriverName(final SessionContext ctx, final String value)
	{
		if ( ctx == null) 
		{
			throw new JaloInvalidParameterException( "ctx is null", 0 );
		}
		if( ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedVehicleDrivers.setDriverName requires a session language", 0 );
		}
		setLocalizedProperty(ctx, DRIVERNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VehicleDrivers.driverName</code> attribute. 
	 * @param value the driverName - Driver name
	 */
	public void setDriverName(final String value)
	{
		setDriverName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VehicleDrivers.driverName</code> attribute. 
	 * @param value the driverName - Driver name
	 */
	public void setAllDriverName(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,DRIVERNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VehicleDrivers.driverName</code> attribute. 
	 * @param value the driverName - Driver name
	 */
	public void setAllDriverName(final Map<Language,String> value)
	{
		setAllDriverName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VehicleDrivers.id</code> attribute.
	 * @return the id - Driver unique id
	 */
	public String getId(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VehicleDrivers.id</code> attribute.
	 * @return the id - Driver unique id
	 */
	public String getId()
	{
		return getId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VehicleDrivers.id</code> attribute. 
	 * @param value the id - Driver unique id
	 */
	public void setId(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VehicleDrivers.id</code> attribute. 
	 * @param value the id - Driver unique id
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
			return Utilities.getMarkModifiedOverride(VEHICLEDRIVERS2VEHICLEDEALERS_MARKMODIFIED);
		}
		return true;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VehicleDrivers.vehicle</code> attribute.
	 * @return the vehicle - Vehicle
	 */
	public Set<VehicleList> getVehicle(final SessionContext ctx)
	{
		return (Set<VehicleList>)VEHICLEHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VehicleDrivers.vehicle</code> attribute.
	 * @return the vehicle - Vehicle
	 */
	public Set<VehicleList> getVehicle()
	{
		return getVehicle( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VehicleDrivers.vehicle</code> attribute. 
	 * @param value the vehicle - Vehicle
	 */
	public void setVehicle(final SessionContext ctx, final Set<VehicleList> value)
	{
		VEHICLEHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VehicleDrivers.vehicle</code> attribute. 
	 * @param value the vehicle - Vehicle
	 */
	public void setVehicle(final Set<VehicleList> value)
	{
		setVehicle( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to vehicle. 
	 * @param value the item to add to vehicle - Vehicle
	 */
	public void addToVehicle(final SessionContext ctx, final VehicleList value)
	{
		VEHICLEHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to vehicle. 
	 * @param value the item to add to vehicle - Vehicle
	 */
	public void addToVehicle(final VehicleList value)
	{
		addToVehicle( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from vehicle. 
	 * @param value the item to remove from vehicle - Vehicle
	 */
	public void removeFromVehicle(final SessionContext ctx, final VehicleList value)
	{
		VEHICLEHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from vehicle. 
	 * @param value the item to remove from vehicle - Vehicle
	 */
	public void removeFromVehicle(final VehicleList value)
	{
		removeFromVehicle( getSession().getSessionContext(), value );
	}
	
}
