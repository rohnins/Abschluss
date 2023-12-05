package abschlussapp.schulverwaltungsapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SchulverwaltungsappApplication {

	public static void main(String[] args) {
		SpringApplication.run(SchulverwaltungsappApplication.class, args);
	}

}


// spring should connect to the database. that database has the connections to the other seperate databases, which we want to call. in the login we want to enter the right value that connects to another database and also the credentials to login to that database.
// in the database we have to make a table with the name of the other database and the credentials to login to that database.
// in the login we have to enter the name of the database and the credentials to login to that database.
// the database has to be a mysql database.
// the databases are local but they are seperated from each other. they are not in the same database. they are in different databases.
// we want to get the data from the other databases and show them in the frontend and call them in the backend.
// we want to use webservices.
// lets write the code