/*
 * Weather API
 *  # Introduction  WeatherAPI.com provides access to weather and geo data via a JSON/XML restful API. It allows developers to create desktop, web and mobile applications using this data very easy.      We provide following data through our API:      - Real-time weather  - 14 day weather forecast  - Astronomy  - Time zone  - Location data  - Search or Autocomplete API  - NEW: Historical weather  - NEW: Future Weather (Upto 300 days ahead)  - Weather Alerts  - Air Quality Data    # Getting Started     You need to [signup](https://www.weatherapi.com/signup.aspx) and then you can find your API key under [your account](https://www.weatherapi.com/login.aspx), and start using API right away!      We have [code libraries](https://www.weatherapi.com/docs/code-libraries.aspx) for different programming languages like PHP, .net, JAVA, etc.  If you find any features missing or have any suggestions, please [contact us](https://www.weatherapi.com/contact.aspx).      # Authentication     API access to the data is protected by an API key. If at anytime, you find the API key has become vulnerable, please regenerate the key using Regenerate button next to the API key.  Authentication to the WeatherAPI.com API is provided by passing your API key as request parameter through an API .        ##  key parameter   key=YOUR_API_KEY 
 *
 * OpenAPI spec version: 1.0.0-oas3
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package smart.ix.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.math.BigDecimal;


@Data
public class Current {
  @JsonProperty("last_updated_epoch")
  private Integer lastUpdatedEpoch = null;

  @JsonProperty("last_updated")
  private String lastUpdated = null;

  @JsonProperty("temp_c")
  private BigDecimal tempC = null;

  @JsonProperty("temp_f")
  private BigDecimal tempF = null;

  @JsonProperty("is_day")
  private Integer isDay = null;

  @JsonProperty("condition")
  private CurrentCondition condition = null;

  @JsonProperty("wind_mph")
  private BigDecimal windMph = null;

  @JsonProperty("wind_kph")
  private BigDecimal windKph = null;

  @JsonProperty("wind_degree")
  private Integer windDegree = null;

  @JsonProperty("wind_dir")
  private String windDir = null;

  @JsonProperty("pressure_mb")
  private Integer pressureMb = null;

  @JsonProperty("pressure_in")
  private BigDecimal pressureIn = null;

  @JsonProperty("precip_mm")
  private Integer precipMm = null;

  @JsonProperty("precip_in")
  private Integer precipIn = null;

  @JsonProperty("humidity")
  private Integer humidity = null;

  @JsonProperty("cloud")
  private Integer cloud = null;

  @JsonProperty("feelslike_c")
  private Integer feelslikeC = null;

  @JsonProperty("feelslike_f")
  private BigDecimal feelslikeF = null;

  @JsonProperty("vis_km")
  private Integer visKm = null;

  @JsonProperty("vis_miles")
  private Integer visMiles = null;

  @JsonProperty("uv")
  private Integer uv = null;

  @JsonProperty("gust_mph")
  private BigDecimal gustMph = null;

  @JsonProperty("gust_kph")
  private BigDecimal gustKph = null;

  @JsonProperty("air_quality")
  private CurrentAirQuality airQuality = null;
}
