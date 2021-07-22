package io.snyk;

public class Person {

  private String firstName;
  private String lastName;

  public Person() {}

  public void setFirstName(final String firstName) {
    this.firstName = firstName;
  }

  public void setLastName(final String lastName) {
    this.lastName = lastName;
  }

  public String getGreeting() {
    StringBuilder sb = new StringBuilder();
    sb.append("Hello");
    if (this.firstName != null && !this.firstName.trim().isEmpty()) {
      sb.append(" ");
      sb.append(this.firstName);
    }
    if (this.lastName != null && !this.lastName.trim().isEmpty()) {
      sb.append(" ");
      sb.append(this.lastName);
    }
    return sb.toString();
  }
}
