package io.snyk;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.io.File;
import java.io.IOException;

public class GreetPerson {

  public static void main(String[] args)
    throws JsonGenerationException, IOException {
    Person person = new Person();
    JsonFactory factory = new JsonFactory();
    File jsonFile = new File("person.json");
    if (jsonFile.exists()) {
      JsonParser parser = factory.createParser(jsonFile);
      if (parser.nextToken() != JsonToken.START_OBJECT) {
        throw new IOException("Expected data to start with an Object");
      }
      while (parser.nextToken() != JsonToken.END_OBJECT) {
        String fieldName = parser.getCurrentName();
        parser.nextToken();
        if (fieldName.equals("firstName")) {
          String firstName = parser.getText();
          person.setFirstName(firstName);
        } else if (fieldName.equals("lastName")) {
          String lastName = parser.getText();
          person.setLastName(lastName);
        } else {
          throw new IOException("Unrecognized field '" + fieldName + "'");
        }
      }
      parser.close();
    }
    System.out.println(person.getGreeting());
  }
}
