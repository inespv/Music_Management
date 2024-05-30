package music;
/**
 * Class to store music platforms names
 */
public abstract class Platform {

    String name;
    /**
     *
     * @param name A String with the platform name
     */
    public Platform(String name) {
        this.name = name;
    }
    /**
     * returns platform's name
     * @return name Platform's name
     */
    public String getName() {
        return name;
    }
    /**
     * Establishes platform's name
     * @param name Platform's name
     */
    public void setName(String name) {
        this.name = name;
    }
}