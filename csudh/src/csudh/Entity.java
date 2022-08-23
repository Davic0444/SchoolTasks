package csudh;

public class Entity {

    private String domainName;
    private String ipAddress;

    public Entity(String domainName, String ipAddress) {
        this.domainName = domainName;
        this.ipAddress = ipAddress;
    }

    public String getDomainName() {
        return domainName;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    @Override
    public String toString() {
        return "Entity{" +
                "domainName='" + domainName + '\'' +
                ", ipAddress='" + ipAddress + '\'' +
                '}';
    }
}
