// Generated by Enunciate
package fm.setlist.api.model;

/**
 *  This class represents a city where {@link Venues} are located. Most of the
 *  original city data was taken from <a
 *  href="http://geonames.org/">Geonames.org</a>.
 */
@javax.xml.bind.annotation.XmlType (
  name = "city",
  namespace = ""
)
@javax.xml.bind.annotation.XmlRootElement (
  name = "city",
  namespace = ""
)
public class City implements java.io.Serializable {

  private java.lang.String _id;
  private java.lang.String _name;
  private java.lang.String _state;
  private java.lang.String _stateCode;
  private fm.setlist.api.model.Coords _coords;
  private fm.setlist.api.model.Country _country;

  /**
   * unique identifier
   */
  @javax.xml.bind.annotation.XmlAttribute (
    name = "id",
    namespace = "",
    required = false
  )
  public java.lang.String getId() {
    return this._id;
  }

  /**
   * unique identifier
   */
  public void setId(java.lang.String _id) {
    this._id = _id;
  }

  /**
   * the city's name, depending on the language valid values are e.g.
   * <em>&quot;M&uuml;chen&quot;</em> or <em>Munich</em>
   */
  @javax.xml.bind.annotation.XmlAttribute (
    name = "name",
    namespace = "",
    required = false
  )
  public java.lang.String getName() {
    return this._name;
  }

  /**
   * the city's name, depending on the language valid values are e.g.
   * <em>&quot;M&uuml;chen&quot;</em> or <em>Munich</em>
   */
  public void setName(java.lang.String _name) {
    this._name = _name;
  }

  /**
   * The name of city's state, e.g. <em>&quot;Bavaria&quot;</em> or
   * <em>&quot;Florida&quot;</em>
   */
  @javax.xml.bind.annotation.XmlAttribute (
    name = "state",
    namespace = "",
    required = false
  )
  public java.lang.String getState() {
    return this._state;
  }

  /**
   * The name of city's state, e.g. <em>&quot;Bavaria&quot;</em> or
   * <em>&quot;Florida&quot;</em>
   */
  public void setState(java.lang.String _state) {
    this._state = _state;
  }

  /**
   * The code of the city's state. For most countries this two-digit
   * numeric code, with which the state can be identified uniquely in
   * the specific Country. The code can also be a String for
   * other cities. Valid examples are <em>&quot;CA&quot;</em> or
   * <em>&quot;02&quot;</em>
   * 
   * which in turn get uniquely identifiable when combined with the
   * state's country:
   * 
   * <em>&quot;US.CA&quot;</em> for California, United States or
   * <em>&quot;DE.02&quot;</em> for Bavaria, Germany
   * 
   * For a complete list of available states (that aren't necessarily
   * used in this database) is available in <a
   * href="http://download.geonames.org/export/dump/admin1Codes.txt">a
   * textfile on geonames.org</a>.
   * 
   * Note that this code is only unique combined with the city's
   * Country. The code alone is <strong>not</strong> unique.
   */
  @javax.xml.bind.annotation.XmlAttribute (
    name = "stateCode",
    namespace = "",
    required = false
  )
  public java.lang.String getStateCode() {
    return this._stateCode;
  }

  /**
   * The code of the city's state. For most countries this two-digit
   * numeric code, with which the state can be identified uniquely in
   * the specific Country. The code can also be a String for
   * other cities. Valid examples are <em>&quot;CA&quot;</em> or
   * <em>&quot;02&quot;</em>
   * 
   * which in turn get uniquely identifiable when combined with the
   * state's country:
   * 
   * <em>&quot;US.CA&quot;</em> for California, United States or
   * <em>&quot;DE.02&quot;</em> for Bavaria, Germany
   * 
   * For a complete list of available states (that aren't necessarily
   * used in this database) is available in <a
   * href="http://download.geonames.org/export/dump/admin1Codes.txt">a
   * textfile on geonames.org</a>.
   * 
   * Note that this code is only unique combined with the city's
   * Country. The code alone is <strong>not</strong> unique.
   */
  public void setStateCode(java.lang.String _stateCode) {
    this._stateCode = _stateCode;
  }

  /**
   * The city's coordinates. Usually the coordinates of the city centre are
   * used.
   */
  @javax.xml.bind.annotation.XmlElement (
    name = "coords",
    namespace = ""
  )
  public fm.setlist.api.model.Coords getCoords() {
    return this._coords;
  }

  /**
   * The city's coordinates. Usually the coordinates of the city centre are
   * used.
   */
  public void setCoords(fm.setlist.api.model.Coords _coords) {
    this._coords = _coords;
  }

  /**
   * The city's country.
   */
  @javax.xml.bind.annotation.XmlElement (
    name = "country",
    namespace = ""
  )
  public fm.setlist.api.model.Country getCountry() {
    return this._country;
  }

  /**
   * The city's country.
   */
  public void setCountry(fm.setlist.api.model.Country _country) {
    this._country = _country;
  }

}