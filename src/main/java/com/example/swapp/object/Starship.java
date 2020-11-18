
package com.example.swapp.object;

import com.fasterxml.jackson.annotation.*;

import java.net.URI;
import java.util.*;


/**
 * Starship
 * <p>
 * A Starship
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "passengers",
    "pilots",
    "name",
    "hyperdrive_rating",
    "url",
    "cargo_capacity",
    "edited",
    "consumables",
    "max_atmosphering_speed",
    "crew",
    "length",
    "MGLT",
    "starship_class",
    "created",
    "films",
    "model",
    "cost_in_credits",
    "manufacturer"
})
public class Starship {

    /**
     * The number of non-essential people this starship can transport.
     * (Required)
     * 
     */
    @JsonProperty("passengers")
    @JsonPropertyDescription("The number of non-essential people this starship can transport.")
    private String passengers;
    /**
     * An array of People URL Resources that this starship has been piloted by.
     * (Required)
     * 
     */
    @JsonProperty("pilots")
    @JsonPropertyDescription("An array of People URL Resources that this starship has been piloted by.")
    private List<Object> pilots = new ArrayList<Object>();
    /**
     * The name of this starship. The common name, such as Death Star.
     * (Required)
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("The name of this starship. The common name, such as Death Star.")
    private String name;
    /**
     * The class of this starships hyperdrive.
     * (Required)
     * 
     */
    @JsonProperty("hyperdrive_rating")
    @JsonPropertyDescription("The class of this starships hyperdrive.")
    private String hyperdriveRating;
    /**
     * The hypermedia URL of this resource.
     * (Required)
     * 
     */
    @JsonProperty("url")
    @JsonPropertyDescription("The hypermedia URL of this resource.")
    private URI url;
    /**
     * The maximum number of kilograms that this starship can transport.
     * (Required)
     * 
     */
    @JsonProperty("cargo_capacity")
    @JsonPropertyDescription("The maximum number of kilograms that this starship can transport.")
    private String cargoCapacity;
    /**
     * the ISO 8601 date format of the time that this resource was edited.
     * (Required)
     * 
     */
    @JsonProperty("edited")
    @JsonPropertyDescription("the ISO 8601 date format of the time that this resource was edited.")
    private Date edited;
    /**
     * The maximum length of time that this starship can provide consumables for its entire crew without having to resupply.
     * (Required)
     * 
     */
    @JsonProperty("consumables")
    @JsonPropertyDescription("The maximum length of time that this starship can provide consumables for its entire crew without having to resupply.")
    private String consumables;
    /**
     * The maximum speed of this starship in atmosphere. n/a if this starship is incapable of atmosphering flight.
     * (Required)
     * 
     */
    @JsonProperty("max_atmosphering_speed")
    @JsonPropertyDescription("The maximum speed of this starship in atmosphere. n/a if this starship is incapable of atmosphering flight.")
    private String maxAtmospheringSpeed;
    /**
     * The number of personnel needed to run or pilot this starship.
     * (Required)
     * 
     */
    @JsonProperty("crew")
    @JsonPropertyDescription("The number of personnel needed to run or pilot this starship.")
    private String crew;
    /**
     * The length of this starship in meters.
     * (Required)
     * 
     */
    @JsonProperty("length")
    @JsonPropertyDescription("The length of this starship in meters.")
    private String length;
    /**
     * The Maximum number of Megalights this starship can travel in a standard hour. A Megalight is a standard unit of distance and has never been defined before within the Star Wars universe. This figure is only really useful for measuring the difference in speed of starships. We can assume it is similar to AU, the distance between our Sun (Sol) and Earth.
     * (Required)
     * 
     */
    @JsonProperty("MGLT")
    @JsonPropertyDescription("The Maximum number of Megalights this starship can travel in a standard hour. A Megalight is a standard unit of distance and has never been defined before within the Star Wars universe. This figure is only really useful for measuring the difference in speed of starships. We can assume it is similar to AU, the distance between our Sun (Sol) and Earth.")
    private String mglt;
    /**
     * The class of this starship, such as Starfighter or Deep Space Mobile Battlestation.
     * (Required)
     * 
     */
    @JsonProperty("starship_class")
    @JsonPropertyDescription("The class of this starship, such as Starfighter or Deep Space Mobile Battlestation.")
    private String starshipClass;
    /**
     * The ISO 8601 date format of the time that this resource was created.
     * (Required)
     * 
     */
    @JsonProperty("created")
    @JsonPropertyDescription("The ISO 8601 date format of the time that this resource was created.")
    private Date created;
    /**
     * An array of Film URL Resources that this starship has appeared in.
     * (Required)
     * 
     */
    @JsonProperty("films")
    @JsonPropertyDescription("An array of Film URL Resources that this starship has appeared in.")
    private List<Object> films = new ArrayList<Object>();
    /**
     * The model or official name of this starship. Such as T-65 X-wing or DS-1 Orbital Battle Station.
     * (Required)
     * 
     */
    @JsonProperty("model")
    @JsonPropertyDescription("The model or official name of this starship. Such as T-65 X-wing or DS-1 Orbital Battle Station.")
    private String model;
    /**
     * The cost of this starship new, in galactic credits.
     * (Required)
     * 
     */
    @JsonProperty("cost_in_credits")
    @JsonPropertyDescription("The cost of this starship new, in galactic credits.")
    private String costInCredits;
    /**
     * The manufacturer of this starship. Comma seperated if more than one.
     * (Required)
     * 
     */
    @JsonProperty("manufacturer")
    @JsonPropertyDescription("The manufacturer of this starship. Comma seperated if more than one.")
    private String manufacturer;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * The number of non-essential people this starship can transport.
     * (Required)
     * 
     */
    @JsonProperty("passengers")
    public String getPassengers() {
        return passengers;
    }

    /**
     * The number of non-essential people this starship can transport.
     * (Required)
     * 
     */
    @JsonProperty("passengers")
    public void setPassengers(String passengers) {
        this.passengers = passengers;
    }

    /**
     * An array of People URL Resources that this starship has been piloted by.
     * (Required)
     * 
     */
    @JsonProperty("pilots")
    public List<Object> getPilots() {
        return pilots;
    }

    /**
     * An array of People URL Resources that this starship has been piloted by.
     * (Required)
     * 
     */
    @JsonProperty("pilots")
    public void setPilots(List<Object> pilots) {
        this.pilots = pilots;
    }

    /**
     * The name of this starship. The common name, such as Death Star.
     * (Required)
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * The name of this starship. The common name, such as Death Star.
     * (Required)
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * The class of this starships hyperdrive.
     * (Required)
     * 
     */
    @JsonProperty("hyperdrive_rating")
    public String getHyperdriveRating() {
        return hyperdriveRating;
    }

    /**
     * The class of this starships hyperdrive.
     * (Required)
     * 
     */
    @JsonProperty("hyperdrive_rating")
    public void setHyperdriveRating(String hyperdriveRating) {
        this.hyperdriveRating = hyperdriveRating;
    }

    /**
     * The hypermedia URL of this resource.
     * (Required)
     * 
     */
    @JsonProperty("url")
    public URI getUrl() {
        return url;
    }

    /**
     * The hypermedia URL of this resource.
     * (Required)
     * 
     */
    @JsonProperty("url")
    public void setUrl(URI url) {
        this.url = url;
    }

    /**
     * The maximum number of kilograms that this starship can transport.
     * (Required)
     * 
     */
    @JsonProperty("cargo_capacity")
    public String getCargoCapacity() {
        return cargoCapacity;
    }

    /**
     * The maximum number of kilograms that this starship can transport.
     * (Required)
     * 
     */
    @JsonProperty("cargo_capacity")
    public void setCargoCapacity(String cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    /**
     * the ISO 8601 date format of the time that this resource was edited.
     * (Required)
     * 
     */
    @JsonProperty("edited")
    public Date getEdited() {
        return edited;
    }

    /**
     * the ISO 8601 date format of the time that this resource was edited.
     * (Required)
     * 
     */
    @JsonProperty("edited")
    public void setEdited(Date edited) {
        this.edited = edited;
    }

    /**
     * The maximum length of time that this starship can provide consumables for its entire crew without having to resupply.
     * (Required)
     * 
     */
    @JsonProperty("consumables")
    public String getConsumables() {
        return consumables;
    }

    /**
     * The maximum length of time that this starship can provide consumables for its entire crew without having to resupply.
     * (Required)
     * 
     */
    @JsonProperty("consumables")
    public void setConsumables(String consumables) {
        this.consumables = consumables;
    }

    /**
     * The maximum speed of this starship in atmosphere. n/a if this starship is incapable of atmosphering flight.
     * (Required)
     * 
     */
    @JsonProperty("max_atmosphering_speed")
    public String getMaxAtmospheringSpeed() {
        return maxAtmospheringSpeed;
    }

    /**
     * The maximum speed of this starship in atmosphere. n/a if this starship is incapable of atmosphering flight.
     * (Required)
     * 
     */
    @JsonProperty("max_atmosphering_speed")
    public void setMaxAtmospheringSpeed(String maxAtmospheringSpeed) {
        this.maxAtmospheringSpeed = maxAtmospheringSpeed;
    }

    /**
     * The number of personnel needed to run or pilot this starship.
     * (Required)
     * 
     */
    @JsonProperty("crew")
    public String getCrew() {
        return crew;
    }

    /**
     * The number of personnel needed to run or pilot this starship.
     * (Required)
     * 
     */
    @JsonProperty("crew")
    public void setCrew(String crew) {
        this.crew = crew;
    }

    /**
     * The length of this starship in meters.
     * (Required)
     * 
     */
    @JsonProperty("length")
    public String getLength() {
        return length;
    }

    /**
     * The length of this starship in meters.
     * (Required)
     * 
     */
    @JsonProperty("length")
    public void setLength(String length) {
        this.length = length;
    }

    /**
     * The Maximum number of Megalights this starship can travel in a standard hour. A Megalight is a standard unit of distance and has never been defined before within the Star Wars universe. This figure is only really useful for measuring the difference in speed of starships. We can assume it is similar to AU, the distance between our Sun (Sol) and Earth.
     * (Required)
     * 
     */
    @JsonProperty("MGLT")
    public String getMglt() {
        return mglt;
    }

    /**
     * The Maximum number of Megalights this starship can travel in a standard hour. A Megalight is a standard unit of distance and has never been defined before within the Star Wars universe. This figure is only really useful for measuring the difference in speed of starships. We can assume it is similar to AU, the distance between our Sun (Sol) and Earth.
     * (Required)
     * 
     */
    @JsonProperty("MGLT")
    public void setMglt(String mglt) {
        this.mglt = mglt;
    }

    /**
     * The class of this starship, such as Starfighter or Deep Space Mobile Battlestation.
     * (Required)
     * 
     */
    @JsonProperty("starship_class")
    public String getStarshipClass() {
        return starshipClass;
    }

    /**
     * The class of this starship, such as Starfighter or Deep Space Mobile Battlestation.
     * (Required)
     * 
     */
    @JsonProperty("starship_class")
    public void setStarshipClass(String starshipClass) {
        this.starshipClass = starshipClass;
    }

    /**
     * The ISO 8601 date format of the time that this resource was created.
     * (Required)
     * 
     */
    @JsonProperty("created")
    public Date getCreated() {
        return created;
    }

    /**
     * The ISO 8601 date format of the time that this resource was created.
     * (Required)
     * 
     */
    @JsonProperty("created")
    public void setCreated(Date created) {
        this.created = created;
    }

    /**
     * An array of Film URL Resources that this starship has appeared in.
     * (Required)
     * 
     */
    @JsonProperty("films")
    public List<Object> getFilms() {
        return films;
    }

    /**
     * An array of Film URL Resources that this starship has appeared in.
     * (Required)
     * 
     */
    @JsonProperty("films")
    public void setFilms(List<Object> films) {
        this.films = films;
    }

    /**
     * The model or official name of this starship. Such as T-65 X-wing or DS-1 Orbital Battle Station.
     * (Required)
     * 
     */
    @JsonProperty("model")
    public String getModel() {
        return model;
    }

    /**
     * The model or official name of this starship. Such as T-65 X-wing or DS-1 Orbital Battle Station.
     * (Required)
     * 
     */
    @JsonProperty("model")
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * The cost of this starship new, in galactic credits.
     * (Required)
     * 
     */
    @JsonProperty("cost_in_credits")
    public String getCostInCredits() {
        return costInCredits;
    }

    /**
     * The cost of this starship new, in galactic credits.
     * (Required)
     * 
     */
    @JsonProperty("cost_in_credits")
    public void setCostInCredits(String costInCredits) {
        this.costInCredits = costInCredits;
    }

    /**
     * The manufacturer of this starship. Comma seperated if more than one.
     * (Required)
     * 
     */
    @JsonProperty("manufacturer")
    public String getManufacturer() {
        return manufacturer;
    }

    /**
     * The manufacturer of this starship. Comma seperated if more than one.
     * (Required)
     * 
     */
    @JsonProperty("manufacturer")
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Starship.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("passengers");
        sb.append('=');
        sb.append(((this.passengers == null)?"<null>":this.passengers));
        sb.append(',');
        sb.append("pilots");
        sb.append('=');
        sb.append(((this.pilots == null)?"<null>":this.pilots));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("hyperdriveRating");
        sb.append('=');
        sb.append(((this.hyperdriveRating == null)?"<null>":this.hyperdriveRating));
        sb.append(',');
        sb.append("url");
        sb.append('=');
        sb.append(((this.url == null)?"<null>":this.url));
        sb.append(',');
        sb.append("cargoCapacity");
        sb.append('=');
        sb.append(((this.cargoCapacity == null)?"<null>":this.cargoCapacity));
        sb.append(',');
        sb.append("edited");
        sb.append('=');
        sb.append(((this.edited == null)?"<null>":this.edited));
        sb.append(',');
        sb.append("consumables");
        sb.append('=');
        sb.append(((this.consumables == null)?"<null>":this.consumables));
        sb.append(',');
        sb.append("maxAtmospheringSpeed");
        sb.append('=');
        sb.append(((this.maxAtmospheringSpeed == null)?"<null>":this.maxAtmospheringSpeed));
        sb.append(',');
        sb.append("crew");
        sb.append('=');
        sb.append(((this.crew == null)?"<null>":this.crew));
        sb.append(',');
        sb.append("length");
        sb.append('=');
        sb.append(((this.length == null)?"<null>":this.length));
        sb.append(',');
        sb.append("mglt");
        sb.append('=');
        sb.append(((this.mglt == null)?"<null>":this.mglt));
        sb.append(',');
        sb.append("starshipClass");
        sb.append('=');
        sb.append(((this.starshipClass == null)?"<null>":this.starshipClass));
        sb.append(',');
        sb.append("created");
        sb.append('=');
        sb.append(((this.created == null)?"<null>":this.created));
        sb.append(',');
        sb.append("films");
        sb.append('=');
        sb.append(((this.films == null)?"<null>":this.films));
        sb.append(',');
        sb.append("model");
        sb.append('=');
        sb.append(((this.model == null)?"<null>":this.model));
        sb.append(',');
        sb.append("costInCredits");
        sb.append('=');
        sb.append(((this.costInCredits == null)?"<null>":this.costInCredits));
        sb.append(',');
        sb.append("manufacturer");
        sb.append('=');
        sb.append(((this.manufacturer == null)?"<null>":this.manufacturer));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.films == null)? 0 :this.films.hashCode()));
        result = ((result* 31)+((this.passengers == null)? 0 :this.passengers.hashCode()));
        result = ((result* 31)+((this.pilots == null)? 0 :this.pilots.hashCode()));
        result = ((result* 31)+((this.edited == null)? 0 :this.edited.hashCode()));
        result = ((result* 31)+((this.consumables == null)? 0 :this.consumables.hashCode()));
        result = ((result* 31)+((this.created == null)? 0 :this.created.hashCode()));
        result = ((result* 31)+((this.length == null)? 0 :this.length.hashCode()));
        result = ((result* 31)+((this.costInCredits == null)? 0 :this.costInCredits.hashCode()));
        result = ((result* 31)+((this.cargoCapacity == null)? 0 :this.cargoCapacity.hashCode()));
        result = ((result* 31)+((this.url == null)? 0 :this.url.hashCode()));
        result = ((result* 31)+((this.maxAtmospheringSpeed == null)? 0 :this.maxAtmospheringSpeed.hashCode()));
        result = ((result* 31)+((this.crew == null)? 0 :this.crew.hashCode()));
        result = ((result* 31)+((this.manufacturer == null)? 0 :this.manufacturer.hashCode()));
        result = ((result* 31)+((this.mglt == null)? 0 :this.mglt.hashCode()));
        result = ((result* 31)+((this.starshipClass == null)? 0 :this.starshipClass.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.hyperdriveRating == null)? 0 :this.hyperdriveRating.hashCode()));
        result = ((result* 31)+((this.model == null)? 0 :this.model.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Starship) == false) {
            return false;
        }
        Starship rhs = ((Starship) other);
        return ((((((((((((((((((((this.films == rhs.films)||((this.films!= null)&&this.films.equals(rhs.films)))&&((this.passengers == rhs.passengers)||((this.passengers!= null)&&this.passengers.equals(rhs.passengers))))&&((this.pilots == rhs.pilots)||((this.pilots!= null)&&this.pilots.equals(rhs.pilots))))&&((this.edited == rhs.edited)||((this.edited!= null)&&this.edited.equals(rhs.edited))))&&((this.consumables == rhs.consumables)||((this.consumables!= null)&&this.consumables.equals(rhs.consumables))))&&((this.created == rhs.created)||((this.created!= null)&&this.created.equals(rhs.created))))&&((this.length == rhs.length)||((this.length!= null)&&this.length.equals(rhs.length))))&&((this.costInCredits == rhs.costInCredits)||((this.costInCredits!= null)&&this.costInCredits.equals(rhs.costInCredits))))&&((this.cargoCapacity == rhs.cargoCapacity)||((this.cargoCapacity!= null)&&this.cargoCapacity.equals(rhs.cargoCapacity))))&&((this.url == rhs.url)||((this.url!= null)&&this.url.equals(rhs.url))))&&((this.maxAtmospheringSpeed == rhs.maxAtmospheringSpeed)||((this.maxAtmospheringSpeed!= null)&&this.maxAtmospheringSpeed.equals(rhs.maxAtmospheringSpeed))))&&((this.crew == rhs.crew)||((this.crew!= null)&&this.crew.equals(rhs.crew))))&&((this.manufacturer == rhs.manufacturer)||((this.manufacturer!= null)&&this.manufacturer.equals(rhs.manufacturer))))&&((this.mglt == rhs.mglt)||((this.mglt!= null)&&this.mglt.equals(rhs.mglt))))&&((this.starshipClass == rhs.starshipClass)||((this.starshipClass!= null)&&this.starshipClass.equals(rhs.starshipClass))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.hyperdriveRating == rhs.hyperdriveRating)||((this.hyperdriveRating!= null)&&this.hyperdriveRating.equals(rhs.hyperdriveRating))))&&((this.model == rhs.model)||((this.model!= null)&&this.model.equals(rhs.model))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
