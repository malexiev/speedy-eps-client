# Change Log #

---


## Release 2.7.0 ##
  * New property "servingDays" property available in ResultSite
  * New property "test" available in ParamOptionsBeforePayment

## Release 2.6.0 ##
  * New property "parcels" available in ParamCalcaluation
  * New property "returnCityCenterIfNoAddress" added in ParamAddressSearch
  * New properties "servingOfficeId", "coordX", "coordY", "coordType" are added in class ResultSite
  * New type ResultWorkingTime is introduced to specify office working time
  * New properties "maxParcelDimensions", "maxParcelWeight" and "workingTimeSchedule" are added in class ResultOfficeEx
  * New method getPickingDeliveryInfo() is available.

## Release 2.5.0 ##

  * New field foreignParcelNumber added in ParamParcel and ParamParcelInfo
  * New structure ParamReturnServiceRequest is introduced to order return service requests
  * New structure ParamReturnShipmentRequest is introduced to order return shipment requests
  * New structure ParamFilterCountry is introduced to search and filter countries
  * New structure ResultCountry is introduced for country search request responses
  * New structure ResultState is introduced for state search request responses
  * New fields "siteName", "postCode", "countryId", "stateId", "frnAddressLine1", "frnAddressLine2" are added in structure ParamAddress
  * New fields "senderCountryId", "senderPostCode", "receiverCountryId", "receiverPostCode" are added in structure ParamCalculation
  * New fields "countryId" and "searchString" are added in structure ParamFilterSite
  * New fields "retShipmentRequest" of type ParamReturnShipmentRequest and "retServicesRequest" of type List of ParamReturnServiceRequest is added in structure ParamPicking
  * New fields "countryId", "stateId", "frnAddressLine1" and "frnAddressLine2" are added in structure ResultAddress
  * New fields "countryId", "stateId", "frnAddressLine1" and "frnAddressLine2" are added in structure ResultAddressEx
  * New fields "discPcntRetShipment", "discountRetShipment", "specialDelivery" are added in structure ResultAmounts
  * New field  "countryId" is added in structure ResultSite
  * New argument "language" is added in method listServices
  * New arguments "senderCountryId", "senderPostCode", "receiverCountryId", "receiverPostCode", "language" are added in method listServicesForSites
  * New arguments "senderCountryId", "senderPostCode", "receiverCountryId", "receiverPostCode" are added in method getWeightInterval
  * New argument "countryId" is added for method getAddressNomenclature
  * Method listSites is deprecated in favor of listSitesEx()
  * New arguments "senderCountryId" and "senderPostCode" are added in method getAllowedDaysForTaking
  * New method listCountries is introduced to search for supported countries
  * New method listCountriesEx is introduced to search for supported countries using filter
  * New method listStates is introduced to search for supported country states
  * New method getStateById is introduced to get country state by id
  * New method validatePostCode is introduced to verify post code is valid for country

## Release 2.4.0 ##
  * Methods listOfficesEx, listBlocks, listCommonObjects have "language" parameter added

## Release 2.3.0 ##
  * New method ["getAdditionalUserParams()"](https://www.speedy.bg/eps/docs/#ahn-m-getAdditionalUserParams) is available
  * New fields payerTypePackings, payerRefPackingsId added in ["ParamPicking"](https://www.speedy.bg/eps/docs/#ahn-t-ParamPicking) and ["ParamCalculation"](https://www.speedy.bg/eps/docs/#ahn-t-ParamCalculation)
  * New structure ["ParamPackings"](https://www.speedy.bg/eps/docs/#ahn-t-ParamPackings) added and new field packings added in ["ParamPicking"](https://www.speedy.bg/eps/docs/#ahn-t-ParamPicking). The field and the structure are for internal use only at the moment
  * Flag retThirdPartyPayer added in ["ParamPicking"](https://www.speedy.bg/eps/docs/#ahn-t-ParamPicking)
  * New structure ["ParamOptionsBeforePayment"](https://www.speedy.bg/eps/docs/#ahn-t-ParamOptionsBeforePayment) added to specify options before payment and field optionsBeforePayment added in ["ParamPicking"](https://www.speedy.bg/eps/docs/#ahn-t-ParamPicking)
  * Add size and weight properties in ["ParamParcelInfo"](https://www.speedy.bg/eps/docs/#ahn-t-ParamParcelInfo)
  * Methods ["listSites()"](https://www.speedy.bg/eps/docs/#ahn-m-listSites), ["listSitesEx()"](https://www.speedy.bg/eps/docs/#ahn-m-listSitesEx), ["listAllSites()"](https://www.speedy.bg/eps/docs/#ahn-m-listAllSites), ["listQuarters()"](https://www.speedy.bg/eps/docs/#ahn-m-listQuarters), ["listStreets()"](https://www.speedy.bg/eps/docs/#ahn-m-listStreets), ["listQuarterTypes()"](https://www.speedy.bg/eps/docs/#ahn-m-listQuarterTypes), ["listStreetTypes ()"](https://www.speedy.bg/eps/docs/#ahn-m-listStreetTypes) have language parameter
  * New methods ["serializeAddress()"](https://www.speedy.bg/eps/docs/#ahn-m-serializeAddress), ["deserializeAddress()"](https://www.speedy.bg/eps/docs/#ahn-m-deserializeAddress), ["makeAddressString()"](https://www.speedy.bg/eps/docs/#ahn-m-makeAddressString) are available and structure ["ParamAddress"](https://www.speedy.bg/eps/docs/#ahn-t-ParamAddress) extended with serializedAddress field

## Release 2.2.0 ##
  * New method ["listContractClients()"](https://www.speedy.bg/eps/docs/#ahn-m-listContractClients) is available
  * New method ["validateAddress"](https://www.speedy.bg/eps/docs/#ahn-m-validateAddress) is available
  * New method ["listOfficesEx"](https://www.speedy.bg/eps/docs/#ahn-m-listOfficesEx) is available
  * JQuery based Speedy address form demo is included in php examples


## Release 2.1.0 ##
  * New method ["listSpecialDeliveryRequirements()"](https://www.speedy.bg/eps/docs/#ahn-m-listSpecialDeliveryRequirements) is available
  * New property email is added in [ParamClientData](https://www.speedy.bg/eps/docs/#ahn-t-ParamClientData) class


## Release 2.0.0 ##
  * Major re-factoring, package renamed and moved to google code.
