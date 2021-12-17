package de.hybris.training.v2.controller;

import de.hybris.platform.commercewebservicescommons.dto.driverDetails.GetAllDriversDataListWSDTO;
import de.hybris.platform.webservicescommons.cache.CacheControl;
import de.hybris.platform.webservicescommons.cache.CacheControlDirective;
import de.hybris.platform.webservicescommons.swagger.ApiFieldsParam;
import de.hybris.training.facades.driverDetail.DriverDetailsFacade;
import de.hybris.training.queues.data.DriverDetailsDataList;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping(value = "/apparel-de")
@CacheControl(directive = CacheControlDirective.PUBLIC, maxAge = 360)
@Api(tags = "All Drivers")
public class GetAllDriversController extends BaseController{
    @Resource(name = "driverDetailsFacade")
    private DriverDetailsFacade driverDetailsFacade;
    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    @ApiOperation(nickname = "getAllDrivers", value = "Get all drivers.", notes = "Get all drivers with corresponding driver details in FULL mode.")
    public GetAllDriversDataListWSDTO getAllDrivers(@ApiFieldsParam @RequestParam(defaultValue = DEFAULT_FIELD_SET) final String fields)
    {
        final DriverDetailsDataList driverDetailsDataList = new DriverDetailsDataList();
        driverDetailsDataList.setDriverDetails(driverDetailsFacade.getAllDrivers());
        return getDataMapper().map(driverDetailsDataList, GetAllDriversDataListWSDTO.class, fields);
    }
}
