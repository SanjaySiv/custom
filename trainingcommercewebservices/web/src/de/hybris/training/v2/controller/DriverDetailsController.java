package de.hybris.training.v2.controller;

import de.hybris.platform.commercewebservicescommons.dto.dealerDetails.GetAllDealersDataListWSDTO;
import de.hybris.platform.commercewebservicescommons.dto.driverDetails.DriverDetailsDataListWSDTO;
import de.hybris.platform.commercewebservicescommons.dto.driverDetails.GetAllDriversDataListWSDTO;
import de.hybris.platform.webservicescommons.swagger.ApiBaseSiteIdParam;
import de.hybris.platform.webservicescommons.swagger.ApiFieldsParam;
import de.hybris.training.facades.dealerDetail.DealerDetailsFacade;
import de.hybris.training.facades.driverDetail.DriverDetailsFacade;
import de.hybris.training.queues.data.DealerDetailsDataList;
import de.hybris.training.queues.data.DriverDetailsDataList;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.Authorization;
import org.apache.log4j.Logger;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@Controller

@RequestMapping(value = "/{baseSiteId}")

@Api(tags="Driver Details")
public class DriverDetailsController extends BaseCommerceController{
    private static final Logger LOGGER=Logger.getLogger(DriverDetailsController.class);

    @Resource(name = "driverDetailsFacade")
    private DriverDetailsFacade driverDetailsFacade;
    @Resource(name = "dealerDetailsFacade")
    private DealerDetailsFacade dealerDetailsFacade;
    //@Secured("ROLE_TRUSTED_CLIENT")

    @RequestMapping(value = "/{driverName}",method = RequestMethod.GET)
    @ResponseBody
    @ApiOperation(nickname = "driverDetails",value = "Get a specific driver details",notes = "Returns a specific driver based on driver name",
    authorizations = {@Authorization(value = "oauth2_client_credentials")})
    @ApiBaseSiteIdParam
    public DriverDetailsDataListWSDTO getDriverDetails(@ApiParam(value = "driverName",required = true)
        @PathVariable final String driverName,
    @ApiParam(value = "Response Configuration. This is the lis of fields that should be returned in the response body", allowableValues = "BASIC,DEFAULT,FULL")
    @RequestParam(defaultValue = "DEFAULT_FIELD_SET")
    final String fields)
    {
        LOGGER.info("Details : "+driverName);
        final DriverDetailsDataList driverDetailsDataList=new DriverDetailsDataList();
        driverDetailsDataList.setDriverDetails(driverDetailsFacade.getDriverDetails(driverName));
        return getDataMapper().map(driverDetailsDataList,DriverDetailsDataListWSDTO.class,fields);
    }

    @RequestMapping(value="/allDrivers",method = RequestMethod.GET)
    @ResponseBody
    @ApiOperation(nickname = "getAllDrivers", value = "Get all drivers.", notes = "Get all drivers with corresponding driver details in FULL mode.")
    @ApiBaseSiteIdParam
    public GetAllDriversDataListWSDTO getAllDrivers(@ApiFieldsParam @RequestParam(defaultValue = DEFAULT_FIELD_SET) final String fields)
    {
        final DriverDetailsDataList driverDetailsDataList = new DriverDetailsDataList();
        driverDetailsDataList.setDriverDetails(driverDetailsFacade.getAllDrivers());
        return getDataMapper().map(driverDetailsDataList, GetAllDriversDataListWSDTO.class, fields);
    }

    @RequestMapping(value="/allDealers",method = RequestMethod.GET)
    @ResponseBody
    @ApiOperation(nickname = "getAllDealers", value = "Get all dealers.", notes = "Get all dealers with corresponding dealer details in FULL mode.")
    @ApiBaseSiteIdParam
    public GetAllDealersDataListWSDTO getAllDealers(@ApiFieldsParam @RequestParam(defaultValue = DEFAULT_FIELD_SET) final String fields){
        final DealerDetailsDataList dealerDetailsDataList=new DealerDetailsDataList();
        dealerDetailsDataList.setDealerDetails(dealerDetailsFacade.getAllDealers());
        return getDataMapper().map(dealerDetailsDataList,GetAllDealersDataListWSDTO.class,fields);
    }
}
