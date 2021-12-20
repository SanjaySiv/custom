/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 20-Dec-2021, 4:31:51 PM                     ---
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
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.TypeManager;
import de.hybris.platform.util.Utilities;
import de.hybris.training.core.constants.TrainingCoreConstants;
import de.hybris.training.core.jalo.VehicleDrivers;
import de.hybris.training.core.jalo.VehicleList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Generated class for type {@link de.hybris.training.core.jalo.VehicleDealers VehicleDealers}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedVehicleDealers extends GenericItem
{
	/** Qualifier of the <code>VehicleDealers.id</code> attribute **/
	public static final String ID = "id";
	/** Qualifier of the <code>VehicleDealers.dealerName</code> attribute **/
	public static final String DEALERNAME = "dealerName";
	/** Qualifier of the <code>VehicleDealers.dealerAddress</code> attribute **/
	public static final String DEALERADDRESS = "dealerAddress";
	/** Qualifier of the <code>VehicleDealers.driver</code> attribute **/
	public static final String DRIVER = "driver";
	/** Relation ordering override parameter constants for VehicleDrivers2VehicleDealers from ((trainingcore))*/
	protected static String VEHICLEDRIVERS2VEHICLEDEALERS_SRC_ORDERED = "relation.VehicleDrivers2VehicleDealers.source.ordered";
	protected static String VEHICLEDRIVERS2VEHICLEDEALERS_TGT_ORDERED = "relation.VehicleDrivers2VehicleDealers.target.ordered";
	/** Relation disable markmodifed parameter constants for VehicleDrivers2VehicleDealers from ((trainingcore))*/
	protected static String VEHICLEDRIVERS2VEHICLEDEALERS_MARKMODIFIED = "relation.VehicleDrivers2VehicleDealers.markmodified";
	/** Qualifier of the <code>VehicleDealers.vehicle</code> attribute **/
	public static final String VEHICLE = "vehicle";
	/** Relation ordering override parameter constants for VehicleList2VehicleDealers from ((trainingcore))*/
	protected static String VEHICLELIST2VEHICLEDEALERS_SRC_ORDERED = "relation.VehicleList2VehicleDealers.source.ordered";
	protected static String VEHICLELIST2VEHICLEDEALERS_TGT_ORDERED = "relation.VehicleList2VehicleDealers.target.ordered";
	/** Relation disable markmodifed parameter constants for VehicleList2VehicleDealers from ((trainingcore))*/
	protected static String VEHICLELIST2VEHICLEDEALERS_MARKMODIFIED = "relation.VehicleList2VehicleDealers.markmodified";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(ID, AttributeMode.INITIAL);
		tmp.put(DEALERNAME, AttributeMode.INITIAL);
		tmp.put(DEALERADDRESS, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VehicleDealers.dealerAddress</code> attribute.
	 * @return the dealerAddress - Dealer address
	 */
	public String getDealerAddress(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedVehicleDealers.getDealerAddress requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, DEALERADDRESS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VehicleDealers.dealerAddress</code> attribute.
	 * @return the dealerAddress - Dealer address
	 */
	public String getDealerAddress()
	{
		return getDealerAddress( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VehicleDealers.dealerAddress</code> attribute. 
	 * @return the localized dealerAddress - Dealer address
	 */
	public Map<Language,String> getAllDealerAddress(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,DEALERADDRESS,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VehicleDealers.dealerAddress</code> attribute. 
	 * @return the localized dealerAddress - Dealer address
	 */
	public Map<Language,String> getAllDealerAddress()
	{
		return getAllDealerAddress( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VehicleDealers.dealerAddress</code> attribute. 
	 * @param value the dealerAddress - Dealer address
	 */
	public void setDealerAddress(final SessionContext ctx, final String value)
	{
		if ( ctx == null) 
		{
			throw new JaloInvalidParameterException( "ctx is null", 0 );
		}
		if( ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedVehicleDealers.setDealerAddress requires a session language", 0 );
		}
		setLocalizedProperty(ctx, DEALERADDRESS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VehicleDealers.dealerAddress</code> attribute. 
	 * @param value the dealerAddress - Dealer address
	 */
	public void setDealerAddress(final String value)
	{
		setDealerAddress( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VehicleDealers.dealerAddress</code> attribute. 
	 * @param value the dealerAddress - Dealer address
	 */
	public void setAllDealerAddress(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,DEALERADDRESS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VehicleDealers.dealerAddress</code> attribute. 
	 * @param value the dealerAddress - Dealer address
	 */
	public void setAllDealerAddress(final Map<Language,String> value)
	{
		setAllDealerAddress( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VehicleDealers.dealerName</code> attribute.
	 * @return the dealerName - Dealer name
	 */
	public String getDealerName(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedVehicleDealers.getDealerName requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, DEALERNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VehicleDealers.dealerName</code> attribute.
	 * @return the dealerName - Dealer name
	 */
	public String getDealerName()
	{
		return getDealerName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VehicleDealers.dealerName</code> attribute. 
	 * @return the localized dealerName - Dealer name
	 */
	public Map<Language,String> getAllDealerName(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,DEALERNAME,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VehicleDealers.dealerName</code> attribute. 
	 * @return the localized dealerName - Dealer name
	 */
	public Map<Language,String> getAllDealerName()
	{
		return getAllDealerName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VehicleDealers.dealerName</code> attribute. 
	 * @param value the dealerName - Dealer name
	 */
	public void setDealerName(final SessionContext ctx, final String value)
	{
		if ( ctx == null) 
		{
			throw new JaloInvalidParameterException( "ctx is null", 0 );
		}
		if( ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedVehicleDealers.setDealerName requires a session language", 0 );
		}
		setLocalizedProperty(ctx, DEALERNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VehicleDealers.dealerName</code> attribute. 
	 * @param value the dealerName - Dealer name
	 */
	public void setDealerName(final String value)
	{
		setDealerName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VehicleDealers.dealerName</code> attribute. 
	 * @param value the dealerName - Dealer name
	 */
	public void setAllDealerName(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,DEALERNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VehicleDealers.dealerName</code> attribute. 
	 * @param value the dealerName - Dealer name
	 */
	public void setAllDealerName(final Map<Language,String> value)
	{
		setAllDealerName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VehicleDealers.driver</code> attribute.
	 * @return the driver - Driver
	 */
	public Set<VehicleDrivers> getDriver(final SessionContext ctx)
	{
		final List<VehicleDrivers> items = getLinkedItems( 
			ctx,
			false,
			TrainingCoreConstants.Relations.VEHICLEDRIVERS2VEHICLEDEALERS,
			"VehicleDrivers",
			null,
			false,
			false
		);
		return new LinkedHashSet<VehicleDrivers>(items);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VehicleDealers.driver</code> attribute.
	 * @return the driver - Driver
	 */
	public Set<VehicleDrivers> getDriver()
	{
		return getDriver( getSession().getSessionContext() );
	}
	
	public long getDriverCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			false,
			TrainingCoreConstants.Relations.VEHICLEDRIVERS2VEHICLEDEALERS,
			"VehicleDrivers",
			null
		);
	}
	
	public long getDriverCount()
	{
		return getDriverCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VehicleDealers.driver</code> attribute. 
	 * @param value the driver - Driver
	 */
	public void setDriver(final SessionContext ctx, final Set<VehicleDrivers> value)
	{
		setLinkedItems( 
			ctx,
			false,
			TrainingCoreConstants.Relations.VEHICLEDRIVERS2VEHICLEDEALERS,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(VEHICLEDRIVERS2VEHICLEDEALERS_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VehicleDealers.driver</code> attribute. 
	 * @param value the driver - Driver
	 */
	public void setDriver(final Set<VehicleDrivers> value)
	{
		setDriver( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to driver. 
	 * @param value the item to add to driver - Driver
	 */
	public void addToDriver(final SessionContext ctx, final VehicleDrivers value)
	{
		addLinkedItems( 
			ctx,
			false,
			TrainingCoreConstants.Relations.VEHICLEDRIVERS2VEHICLEDEALERS,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(VEHICLEDRIVERS2VEHICLEDEALERS_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to driver. 
	 * @param value the item to add to driver - Driver
	 */
	public void addToDriver(final VehicleDrivers value)
	{
		addToDriver( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from driver. 
	 * @param value the item to remove from driver - Driver
	 */
	public void removeFromDriver(final SessionContext ctx, final VehicleDrivers value)
	{
		removeLinkedItems( 
			ctx,
			false,
			TrainingCoreConstants.Relations.VEHICLEDRIVERS2VEHICLEDEALERS,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(VEHICLEDRIVERS2VEHICLEDEALERS_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from driver. 
	 * @param value the item to remove from driver - Driver
	 */
	public void removeFromDriver(final VehicleDrivers value)
	{
		removeFromDriver( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VehicleDealers.id</code> attribute.
	 * @return the id - Dealer unique id
	 */
	public String getId(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VehicleDealers.id</code> attribute.
	 * @return the id - Dealer unique id
	 */
	public String getId()
	{
		return getId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VehicleDealers.id</code> attribute. 
	 * @param value the id - Dealer unique id
	 */
	public void setId(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VehicleDealers.id</code> attribute. 
	 * @param value the id - Dealer unique id
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
		ComposedType relationSecondEnd0 = TypeManager.getInstance().getComposedType("VehicleDrivers");
		if(relationSecondEnd0.isAssignableFrom(referencedItem.getComposedType()))
		{
			return Utilities.getMarkModifiedOverride(VEHICLEDRIVERS2VEHICLEDEALERS_MARKMODIFIED);
		}
		ComposedType relationSecondEnd1 = TypeManager.getInstance().getComposedType("VehicleList");
		if(relationSecondEnd1.isAssignableFrom(referencedItem.getComposedType()))
		{
			return Utilities.getMarkModifiedOverride(VEHICLELIST2VEHICLEDEALERS_MARKMODIFIED);
		}
		return true;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VehicleDealers.vehicle</code> attribute.
	 * @return the vehicle - Vehicle
	 */
	public Set<VehicleList> getVehicle(final SessionContext ctx)
	{
		final List<VehicleList> items = getLinkedItems( 
			ctx,
			false,
			TrainingCoreConstants.Relations.VEHICLELIST2VEHICLEDEALERS,
			"VehicleList",
			null,
			false,
			false
		);
		return new LinkedHashSet<VehicleList>(items);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VehicleDealers.vehicle</code> attribute.
	 * @return the vehicle - Vehicle
	 */
	public Set<VehicleList> getVehicle()
	{
		return getVehicle( getSession().getSessionContext() );
	}
	
	public long getVehicleCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			false,
			TrainingCoreConstants.Relations.VEHICLELIST2VEHICLEDEALERS,
			"VehicleList",
			null
		);
	}
	
	public long getVehicleCount()
	{
		return getVehicleCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VehicleDealers.vehicle</code> attribute. 
	 * @param value the vehicle - Vehicle
	 */
	public void setVehicle(final SessionContext ctx, final Set<VehicleList> value)
	{
		setLinkedItems( 
			ctx,
			false,
			TrainingCoreConstants.Relations.VEHICLELIST2VEHICLEDEALERS,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(VEHICLELIST2VEHICLEDEALERS_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VehicleDealers.vehicle</code> attribute. 
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
		addLinkedItems( 
			ctx,
			false,
			TrainingCoreConstants.Relations.VEHICLELIST2VEHICLEDEALERS,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(VEHICLELIST2VEHICLEDEALERS_MARKMODIFIED)
		);
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
		removeLinkedItems( 
			ctx,
			false,
			TrainingCoreConstants.Relations.VEHICLELIST2VEHICLEDEALERS,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(VEHICLELIST2VEHICLEDEALERS_MARKMODIFIED)
		);
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
