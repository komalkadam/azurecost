package com.hitachivantara.multicloud.providercost.azure.azurecost.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import com.hitachivantara.multicloud.providercost.azure.service.AzureCostService;
//import com.hitachivantara.multicloud.providercost.common.dto.ApiRequestDto;
//import com.hitachivantara.multicloud.providercost.common.dto.ApiResponseDto;

@RestController
@RequestMapping
public class AzureProviderCostController {

	/*@Autowired
	private AzureCostService azureCostService;

	@PostMapping(value = "/getandsavetotalcost", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ApiResponseDto getAzureTotalCost(@RequestBody ApiRequestDto apiRequestDto) {
		return azureCostService.invokeAzureTotalCostService(apiRequestDto);
	}

	@PostMapping(value = "/getandsavespotinstcost", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ApiResponseDto getAzureSpotInstCost(@RequestBody ApiRequestDto apiRequestDto) {
		return azureCostService.invokeAzureSpotInstCostService(apiRequestDto);
	}

	@PostMapping(value = "/getandsaveondemandcost", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ApiResponseDto getAzureOnDemandCost(@RequestBody ApiRequestDto apiRequestDto) {
		return azureCostService.invokeAzureOnDemandCostService(apiRequestDto);
	}

	@PostMapping(value = "/getandsavericost", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ApiResponseDto getAzureReservationCost(@RequestBody ApiRequestDto apiRequestDto) {
		return azureCostService.invokeAzureRICostService(apiRequestDto);
	}

	@PostMapping(value = "/getandsaveforecastcost", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ApiResponseDto getAzureForecastCost(@RequestBody ApiRequestDto apiRequestDto) {
		return azureCostService.invokeAzureForecastCostService(apiRequestDto);
	}*/

}
