package com.example.soapspringbootcxf.endpoint;

import de.codecentric.namespace.weatherservice.WeatherException;
import de.codecentric.namespace.weatherservice.WeatherService;
import de.codecentric.namespace.weatherservice.general.ForecastRequest;
import de.codecentric.namespace.weatherservice.general.ForecastReturn;
import de.codecentric.namespace.weatherservice.general.WeatherInformationReturn;
import de.codecentric.namespace.weatherservice.general.WeatherReturn;

public class WeatherServiceEndpoint implements WeatherService {

	@Override
	public WeatherInformationReturn getWeatherInformation(String zip) throws WeatherException {
		WeatherInformationReturn weatherInformationReturn = new WeatherInformationReturn();
		weatherInformationReturn.setResponseText("Hello");
		weatherInformationReturn.setSuccess(true);
		return weatherInformationReturn;
	}

	@Override
	public ForecastReturn getCityForecastByZIP(ForecastRequest forecastRequest) throws WeatherException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public WeatherReturn getCityWeatherByZIP(ForecastRequest forecastRequest) throws WeatherException {
		// TODO Auto-generated method stub
		return null;
	}

}
