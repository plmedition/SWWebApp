
package com.example.swapp.object;

import com.fasterxml.jackson.annotation.*;

import java.net.URI;
import java.util.*;


/**
 * People
 * <p>
 * A person within the Star Wars universe
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "starships",
    "edited",
    "name",
    "created",
    "url",
    "gender",
    "vehicles",
    "skin_color",
    "hair_color",
    "height",
    "eye_color",
    "mass",
    "films",
    "species",
    "homeworld",
    "birth_year"
})
public class People {

    /**
     * An array of starship resources that this person has piloted
     * (Required)
     * 
     */
    @JsonProperty("starships")
    @JsonPropertyDescription("An array of starship resources that this person has piloted")
    private List<Object> starships = new ArrayList<Object>();
    /**
     * the ISO 8601 date format of the time that this resource was edited.
     * (Required)
     * 
     */
    @JsonProperty("edited")
    @JsonPropertyDescription("the ISO 8601 date format of the time that this resource was edited.")
    private Date edited;
    /**
     * The name of this person.
     * (Required)
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("The name of this person.")
    private String name;
    /**
     * The ISO 8601 date format of the time that this resource was created.
     * (Required)
     * 
     */
    @JsonProperty("created")
    @JsonPropertyDescription("The ISO 8601 date format of the time that this resource was created.")
    private Date created;
    /**
     * The url of this resource
     * (Required)
     * 
     */
    @JsonProperty("url")
    @JsonPropertyDescription("The url of this resource")
    private URI url;
    /**
     * The gender of this person (if known).
     * (Required)
     * 
     */
    @JsonProperty("gender")
    @JsonPropertyDescription("The gender of this person (if known).")
    private String gender;
    /**
     * An array of vehicle resources that this person has piloted
     * (Required)
     * 
     */
    @JsonProperty("vehicles")
    @JsonPropertyDescription("An array of vehicle resources that this person has piloted")
    private List<Object> vehicles = new ArrayList<Object>();
    /**
     * The skin color of this person.
     * (Required)
     * 
     */
    @JsonProperty("skin_color")
    @JsonPropertyDescription("The skin color of this person.")
    private String skinColor;
    /**
     * The hair color of this person.
     * (Required)
     * 
     */
    @JsonProperty("hair_color")
    @JsonPropertyDescription("The hair color of this person.")
    private String hairColor;
    /**
     * The height of this person in meters.
     * (Required)
     * 
     */
    @JsonProperty("height")
    @JsonPropertyDescription("The height of this person in meters.")
    private String height;
    /**
     * The eye color of this person.
     * (Required)
     * 
     */
    @JsonProperty("eye_color")
    @JsonPropertyDescription("The eye color of this person.")
    private String eyeColor;
    /**
     * The mass of this person in kilograms.
     * (Required)
     * 
     */
    @JsonProperty("mass")
    @JsonPropertyDescription("The mass of this person in kilograms.")
    private String mass;
    /**
     * An array of urls of film resources that this person has been in.
     * (Required)
     * 
     */
    @JsonProperty("films")
    @JsonPropertyDescription("An array of urls of film resources that this person has been in.")
    private List<Object> films = new ArrayList<Object>();
    /**
     * The url of the species resource that this person is.
     * (Required)
     * 
     */
    @JsonProperty("species")
    @JsonPropertyDescription("The url of the species resource that this person is.")
    private List<Object> species = new ArrayList<Object>();
    /**
     * The url of the planet resource that this person was born on.
     * (Required)
     * 
     */
    @JsonProperty("homeworld")
    @JsonPropertyDescription("The url of the planet resource that this person was born on.")
    private String homeworld;
    /**
     * The birth year of this person. BBY (Before the Battle of Yavin) or ABY (After the Battle of Yavin).
     * (Required)
     * 
     */
    @JsonProperty("birth_year")
    @JsonPropertyDescription("The birth year of this person. BBY (Before the Battle of Yavin) or ABY (After the Battle of Yavin).")
    private String birthYear;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * An array of starship resources that this person has piloted
     * (Required)
     * 
     */
    @JsonProperty("starships")
    public List<Object> getStarships() {
        return starships;
    }

    /**
     * An array of starship resources that this person has piloted
     * (Required)
     * 
     */
    @JsonProperty("starships")
    public void setStarships(List<Object> starships) {
        this.starships = starships;
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
     * The name of this person.
     * (Required)
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * The name of this person.
     * (Required)
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
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
     * The url of this resource
     * (Required)
     * 
     */
    @JsonProperty("url")
    public URI getUrl() {
        return url;
    }

    /**
     * The url of this resource
     * (Required)
     * 
     */
    @JsonProperty("url")
    public void setUrl(URI url) {
        this.url = url;
    }

    /**
     * The gender of this person (if known).
     * (Required)
     * 
     */
    @JsonProperty("gender")
    public String getGender() {
        return gender;
    }

    /**
     * The gender of this person (if known).
     * (Required)
     * 
     */
    @JsonProperty("gender")
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * An array of vehicle resources that this person has piloted
     * (Required)
     * 
     */
    @JsonProperty("vehicles")
    public List<Object> getVehicles() {
        return vehicles;
    }

    /**
     * An array of vehicle resources that this person has piloted
     * (Required)
     * 
     */
    @JsonProperty("vehicles")
    public void setVehicles(List<Object> vehicles) {
        this.vehicles = vehicles;
    }

    /**
     * The skin color of this person.
     * (Required)
     * 
     */
    @JsonProperty("skin_color")
    public String getSkinColor() {
        return skinColor;
    }

    /**
     * The skin color of this person.
     * (Required)
     * 
     */
    @JsonProperty("skin_color")
    public void setSkinColor(String skinColor) {
        this.skinColor = skinColor;
    }

    /**
     * The hair color of this person.
     * (Required)
     * 
     */
    @JsonProperty("hair_color")
    public String getHairColor() {
        return hairColor;
    }

    /**
     * The hair color of this person.
     * (Required)
     * 
     */
    @JsonProperty("hair_color")
    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    /**
     * The height of this person in meters.
     * (Required)
     * 
     */
    @JsonProperty("height")
    public String getHeight() {
        return height;
    }

    /**
     * The height of this person in meters.
     * (Required)
     * 
     */
    @JsonProperty("height")
    public void setHeight(String height) {
        this.height = height;
    }

    /**
     * The eye color of this person.
     * (Required)
     * 
     */
    @JsonProperty("eye_color")
    public String getEyeColor() {
        return eyeColor;
    }

    /**
     * The eye color of this person.
     * (Required)
     * 
     */
    @JsonProperty("eye_color")
    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    /**
     * The mass of this person in kilograms.
     * (Required)
     * 
     */
    @JsonProperty("mass")
    public String getMass() {
        return mass;
    }

    /**
     * The mass of this person in kilograms.
     * (Required)
     * 
     */
    @JsonProperty("mass")
    public void setMass(String mass) {
        this.mass = mass;
    }

    /**
     * An array of urls of film resources that this person has been in.
     * (Required)
     * 
     */
    @JsonProperty("films")
    public List<Object> getFilms() {
        return films;
    }

    /**
     * An array of urls of film resources that this person has been in.
     * (Required)
     * 
     */
    @JsonProperty("films")
    public void setFilms(List<Object> films) {
        this.films = films;
    }

    /**
     * The url of the species resource that this person is.
     * (Required)
     * 
     */
    @JsonProperty("species")
    public List<Object> getSpecies() {
        return species;
    }

    /**
     * The url of the species resource that this person is.
     * (Required)
     * 
     */
    @JsonProperty("species")
    public void setSpecies(List<Object> species) {
        this.species = species;
    }

    /**
     * The url of the planet resource that this person was born on.
     * (Required)
     * 
     */
    @JsonProperty("homeworld")
    public String getHomeworld() {
        return homeworld;
    }

    /**
     * The url of the planet resource that this person was born on.
     * (Required)
     * 
     */
    @JsonProperty("homeworld")
    public void setHomeworld(String homeworld) {
        this.homeworld = homeworld;
    }

    /**
     * The birth year of this person. BBY (Before the Battle of Yavin) or ABY (After the Battle of Yavin).
     * (Required)
     * 
     */
    @JsonProperty("birth_year")
    public String getBirthYear() {
        return birthYear;
    }

    /**
     * The birth year of this person. BBY (Before the Battle of Yavin) or ABY (After the Battle of Yavin).
     * (Required)
     * 
     */
    @JsonProperty("birth_year")
    public void setBirthYear(String birthYear) {
        this.birthYear = birthYear;
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
        sb.append(People.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("starships");
        sb.append('=');
        sb.append(((this.starships == null)?"<null>":this.starships));
        sb.append(',');
        sb.append("edited");
        sb.append('=');
        sb.append(((this.edited == null)?"<null>":this.edited));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("created");
        sb.append('=');
        sb.append(((this.created == null)?"<null>":this.created));
        sb.append(',');
        sb.append("url");
        sb.append('=');
        sb.append(((this.url == null)?"<null>":this.url));
        sb.append(',');
        sb.append("gender");
        sb.append('=');
        sb.append(((this.gender == null)?"<null>":this.gender));
        sb.append(',');
        sb.append("vehicles");
        sb.append('=');
        sb.append(((this.vehicles == null)?"<null>":this.vehicles));
        sb.append(',');
        sb.append("skinColor");
        sb.append('=');
        sb.append(((this.skinColor == null)?"<null>":this.skinColor));
        sb.append(',');
        sb.append("hairColor");
        sb.append('=');
        sb.append(((this.hairColor == null)?"<null>":this.hairColor));
        sb.append(',');
        sb.append("height");
        sb.append('=');
        sb.append(((this.height == null)?"<null>":this.height));
        sb.append(',');
        sb.append("eyeColor");
        sb.append('=');
        sb.append(((this.eyeColor == null)?"<null>":this.eyeColor));
        sb.append(',');
        sb.append("mass");
        sb.append('=');
        sb.append(((this.mass == null)?"<null>":this.mass));
        sb.append(',');
        sb.append("films");
        sb.append('=');
        sb.append(((this.films == null)?"<null>":this.films));
        sb.append(',');
        sb.append("species");
        sb.append('=');
        sb.append(((this.species == null)?"<null>":this.species));
        sb.append(',');
        sb.append("homeworld");
        sb.append('=');
        sb.append(((this.homeworld == null)?"<null>":this.homeworld));
        sb.append(',');
        sb.append("birthYear");
        sb.append('=');
        sb.append(((this.birthYear == null)?"<null>":this.birthYear));
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
        result = ((result* 31)+((this.homeworld == null)? 0 :this.homeworld.hashCode()));
        result = ((result* 31)+((this.gender == null)? 0 :this.gender.hashCode()));
        result = ((result* 31)+((this.edited == null)? 0 :this.edited.hashCode()));
        result = ((result* 31)+((this.skinColor == null)? 0 :this.skinColor.hashCode()));
        result = ((result* 31)+((this.created == null)? 0 :this.created.hashCode()));
        result = ((result* 31)+((this.mass == null)? 0 :this.mass.hashCode()));
        result = ((result* 31)+((this.vehicles == null)? 0 :this.vehicles.hashCode()));
        result = ((result* 31)+((this.url == null)? 0 :this.url.hashCode()));
        result = ((result* 31)+((this.eyeColor == null)? 0 :this.eyeColor.hashCode()));
        result = ((result* 31)+((this.starships == null)? 0 :this.starships.hashCode()));
        result = ((result* 31)+((this.species == null)? 0 :this.species.hashCode()));
        result = ((result* 31)+((this.birthYear == null)? 0 :this.birthYear.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.hairColor == null)? 0 :this.hairColor.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.height == null)? 0 :this.height.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof People) == false) {
            return false;
        }
        People rhs = ((People) other);
        return ((((((((((((((((((this.films == rhs.films)||((this.films!= null)&&this.films.equals(rhs.films)))&&((this.homeworld == rhs.homeworld)||((this.homeworld!= null)&&this.homeworld.equals(rhs.homeworld))))&&((this.gender == rhs.gender)||((this.gender!= null)&&this.gender.equals(rhs.gender))))&&((this.edited == rhs.edited)||((this.edited!= null)&&this.edited.equals(rhs.edited))))&&((this.skinColor == rhs.skinColor)||((this.skinColor!= null)&&this.skinColor.equals(rhs.skinColor))))&&((this.created == rhs.created)||((this.created!= null)&&this.created.equals(rhs.created))))&&((this.mass == rhs.mass)||((this.mass!= null)&&this.mass.equals(rhs.mass))))&&((this.vehicles == rhs.vehicles)||((this.vehicles!= null)&&this.vehicles.equals(rhs.vehicles))))&&((this.url == rhs.url)||((this.url!= null)&&this.url.equals(rhs.url))))&&((this.eyeColor == rhs.eyeColor)||((this.eyeColor!= null)&&this.eyeColor.equals(rhs.eyeColor))))&&((this.starships == rhs.starships)||((this.starships!= null)&&this.starships.equals(rhs.starships))))&&((this.species == rhs.species)||((this.species!= null)&&this.species.equals(rhs.species))))&&((this.birthYear == rhs.birthYear)||((this.birthYear!= null)&&this.birthYear.equals(rhs.birthYear))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.hairColor == rhs.hairColor)||((this.hairColor!= null)&&this.hairColor.equals(rhs.hairColor))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.height == rhs.height)||((this.height!= null)&&this.height.equals(rhs.height))));
    }

}
