package de.hybris.training.v2.controller;

import de.hybris.platform.commercewebservicescommons.dto.dealerDetails.GetAllDealersDataListWSDTO;
import de.hybris.platform.webservicescommons.cache.CacheControl;
import de.hybris.platform.webservicescommons.cache.CacheControlDirective;
import de.hybris.platform.webservicescommons.swagger.ApiFieldsParam;
import de.hybris.training.facades.dealerDetail.DealerDetailsFacade;
import de.hybris.training.queues.data.DealerDetailsDataList;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping(value="/apparel-uk")
@CacheControl(directive = CacheControlDirective.PUBLIC, maxAge = 360)
@Api(tags = "All Dealers")
public class GetAllDealersController extends BaseController{
    @Resource(name = "dealerDetailsFacade")
    DealerDetailsFacade dealerDetailsFacade;
    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    @ApiOperation(nickname = "getAllDealers", value = "Get all dealers.", notes = "Get all dealers with corresponding dealer details in FULL mode.")
    public GetAllDealersDataListWSDTO getAllDealers(@ApiFieldsParam @RequestParam(defaultValue = DEFAULT_FIELD_SET) final String fields){
        final DealerDetailsDataList dealerDetailsDataList=new DealerDetailsDataList();
        dealerDetailsDataList.setDealerDetails(dealerDetailsFacade.getAllDealers());
        return getDataMapper().map(dealerDetailsDataList,GetAllDealersDataListWSDTO.class,fields);
    }
}
