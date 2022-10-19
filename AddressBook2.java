
import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook2 {
	 public static ArrayList<AddressBook> addressBook = new ArrayList<AddressBook>();

	    public AddressBook inputDetails() {

			Scanner scan = new Scanner(System.in);

	        System.out.print(" Enter the first name: ");
	        String firstName = scan.next();

	        System.out.print(" Enter the last name: ");
	        String lastName = scan.next();

	        System.out.print(" Enter the address: ");
	        String address = scan.next();

	        System.out.print(" Enter the city: ");
	        String city = scan.next();

	        System.out.print(" Enter the state: ");
	        String state = scan.next();

	        System.out.print(" Enter the zip: ");
	        int zip = scan.nextInt();

	        System.out.print(" Enter the phone number: ");
	        long phoneNumber = scan.nextLong();

	        System.out.print(" Enter the email: ");
	        String email = scan.next();


	        AddressBook contact = new AddressBook(firstName, lastName, address, city, state, zip, phoneNumber, email);
	        return contact;
	    }
	    public void displayContacts() {

	        for (AddressBook contact : addressBook) {
	            System.out.println(contact);
	        }
	    }

	    public void addContact() {
	        addressBook.add(inputDetails());
	    }

	    //Edit existing contact using name

	    public void editContact() {

	        Scanner scanner = new Scanner(System.in);

	        System.out.print(" Please enter the first name:");
	        String firstName = scanner.next();

	        int index = findContact();

	        if (index == -1) {
	            System.out.println(" ERROR: No such contact");
	            return;
	        }
	        addressBook.set(index, inputDetails());
	    }

	    public void deleteContact() {

	        int index = findContact();

	        if (index == -1) {
	            System.out.println(" ERROR: No such contact");
	            return;
	        }

	        addressBook.remove(index);
	        System.out.println(" Contact deleted!");

	    }

	    private int findContact() {
	        return 0;
	    }



}