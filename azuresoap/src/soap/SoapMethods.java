package soap;


import java.io.Serializable;

public class SoapMethods implements Serializable{
	
	private static final long serialVersionUID = -5577579081118070434L;
	

    private double[] wind = {74, 235};
	
	private double[] forecast = {21.0, 25.4, 19.8, 17.2, 21.3, 22.3, 24.6};
	private double temp = 23.3;
	
	public double[] getWind() {
		return wind;
	}
	public void setWind(double[] wind) {
		this.wind = wind;
	}
	public double[] getForecast() {
		return forecast;
	}

	public void setForecast(double[] forecast) {
		this.forecast = forecast;
	}

	public double getTemp() {
		return temp;
	}

	public void setTemp(double temp) {
		this.temp = temp;
	}
	

}
