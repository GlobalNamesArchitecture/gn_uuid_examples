import org.apache.commons.id.uuid.UUID;

public class GlobalNamesUUID {
  public static void main(String[] args) {
    String scientific_name = args[0];
    UUID gn = UUID.fromString("90181196-fecf-5082-a4c1-411d4f314cda");
    UUID uuid5 = UUID.nameUUIDFromString(scientific_name, gn,
      UUID.SHA1_ENCODING);
    System.out.println("Scientific name: " +  args[0]);
    System.out.println("GlobalNames UUID: " +  uuid5.toString());


  }
}
