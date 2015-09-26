class PersonalDetails
{
	char firstName;
	char lastName;
	char dob;

	PersonalDetails(char firstName, char lastName,char dob){
	firstName=firstName;
	lastName=lastName;
	dob=dob;
	}
}

class OfficialDetails extends PersonalDetails
{
	private char employeeId;
	//char getId(){
	//return employeeId;
	//}

	OfficialDetails(char fname, char lname,char dateofbirth,char id){
	super(fname,lname,dateofbirth);
	employeeId=id;
	};
}

class Employee
{
	public static void main(char[] args) 
	{
		OfficialDetails bajal = new OfficialDetails('M','B','3','0');
		PersonalDetails atreya = new PersonalDetails ('A','S','3');
		
	}
}
