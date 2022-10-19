
public class AddressBook {
	 	String FirstName;
	    String LastName;
	    String Address;
	    String City;
	    String State;
	    int ZipCode;
	    long PhoneNumber;
	    String EmailAddress;



	    public AddressBook(String firstName, String lastName, String address, String city, String state, int zip, long phoneNumber,
	                   String email) {
	        super();
	        this.FirstName = firstName;
	        this.LastName = lastName;
	        this.Address = address;
	        this.City = city;
	        this.State = state;
	        this.ZipCode = zip;
	        this.PhoneNumber = phoneNumber;
	        this.EmailAddress = email;
	    }

	    public String getFirstName() {
	        return FirstName;
	    }
	    public void setFirstName(String firstName) {
	        this.FirstName = firstName;
	    }
	    @Override
	    public String toString() {
	        return  "  \nfirstName=" + FirstName +
	        		" \n lastName=" + LastName +
	        		" \n address=" + Address +
	        		" \ncity=" + City +
	                " \nstate=" + State +
	                " \n zip=" + ZipCode +
	                " \n phone=" + PhoneNumber +
	                " \n email=" + EmailAddress + "]";
}
}