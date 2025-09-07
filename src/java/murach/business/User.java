package murach.business;

import java.io.Serializable;

public class User implements Serializable {
    private String firstName;
    private String lastName;
    private String email;
    private String dob;           // ngày sinh
    private String source;        // nguồn biết đến
    private String updates;       // có muốn cập nhật không
    private String emailUpdates;  // có muốn email không
    private String contactMethod; // cách liên hệ

    public User() {
        firstName = "";
        lastName = "";
        email = "";
        dob = "";
        source = "";
        updates = "";
        emailUpdates = "";
        contactMethod = "";
    }

    public User(String firstName, String lastName, String email,
                String dob, String source, String updates,
                String emailUpdates, String contactMethod) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.dob = dob;
        this.source = source;
        this.updates = updates;
        this.emailUpdates = emailUpdates;
        this.contactMethod = contactMethod;
    }

    // Getter Setter
    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getDob() { return dob; }
    public void setDob(String dob) { this.dob = dob; }

    public String getSource() { return source; }
    public void setSource(String source) { this.source = source; }

    public String getUpdates() { return updates; }
    public void setUpdates(String updates) { this.updates = updates; }

    public String getEmailUpdates() { return emailUpdates; }
    public void setEmailUpdates(String emailUpdates) { this.emailUpdates = emailUpdates; }

    public String getContactMethod() { return contactMethod; }
    public void setContactMethod(String contactMethod) { this.contactMethod = contactMethod; }
}
