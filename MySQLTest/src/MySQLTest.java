import javax.swing.plaf.nimbus.State;
import java.sql.*;
import java.util.Scanner;

public class MySQLTest {
    public static void main(String[] args) throws SQLException {

        System.out.println("\n****** \nProgram til hurtigt at sammensætte dagens trænings program, on the go. \n****** ");

        //#1. Connect to the database
        Connection connection = null;
        connection = DriverManager.getConnection(
                "jdbc:mysql://localhost/træningsøvelser?serverTimezone=UTC",
                "root",
                "Patr9301");

        System.out.println("/nDatabase connected.");

        // #2. Create a statement

        String typeØvelser = "";
        Statement statement = connection.createStatement();


        // ** Med Scanner kan vi få brugeren til at indtaste, hvilket land, de vil se info om
        while (!typeØvelser.equalsIgnoreCase("exit")) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Hvilke øvelsestype søger du, benøvelser, bicepsøvelser, brystøvelser, rygøvelser, skulderøvelser eller tricepsøvelser? :  ±" + "\nØnsker du at afslutte program, skriv exit");
            typeØvelser = scanner.nextLine();
            if (typeØvelser.equalsIgnoreCase("benøvelser")) {
                String mitQuery = "SELECT * FROM træningsøvelser.benøvelser";
                ResultSet resultSet = statement.executeQuery(mitQuery);
                while (resultSet.next())
                    System.out.println(resultSet.getString(1) + " " +
                            resultSet.getString(2) + ", " +
                            resultSet.getString(3));


                System.out.println("Ønsker du at træne med let, middel eller tung vægt? : ");
                String sætmgentagelser = scanner.nextLine();
                if (sætmgentagelser.equalsIgnoreCase("let")) {
                    mitQuery = "SELECT * FROM træningsøvelser.sætmgentagelser WHERE gentagelse = 15 and sæt = 3";
                    resultSet = statement.executeQuery(mitQuery);
                    while (resultSet.next())
                        System.out.println(resultSet.getString(2) + ", " +
                                resultSet.getString(3) + ", " +
                                "gentagelser og sæt");

                }
                    System.out.println("Ønsker du øget udfordring ? : ");
                    String ekstraUdfordring = scanner.nextLine();
                    if (ekstraUdfordring.equalsIgnoreCase("ja")) {
                        mitQuery = "SELECT * FROM træningsøvelser.ekstraudfordring";
                        resultSet = statement.executeQuery(mitQuery);
                        while (resultSet.next())
                            System.out.println(resultSet.getString(1) + " " +
                                    resultSet.getString(2) + ", " +
                                    resultSet.getString(3));


                    }
                } else if (typeØvelser.equalsIgnoreCase("bicepsøvelser")) {
                    String mitQuery = "SELECT * FROM træningsøvelser.bicepsøvelser";
                    ResultSet resultSet = statement.executeQuery(mitQuery);
                    while (resultSet.next())
                        System.out.println(resultSet.getString(1) + " " +
                                resultSet.getString(2) + ", " +
                                resultSet.getString(3));

                    System.out.println("Ønsker du øget udfordring ? : ");
                    String ekstraUdfordring = scanner.nextLine();
                    if (ekstraUdfordring.equalsIgnoreCase("ja")) {
                        mitQuery = "SELECT * FROM træningsøvelser.ekstraudfordring";
                        resultSet = statement.executeQuery(mitQuery);
                        while (resultSet.next())
                            System.out.println(resultSet.getString(1) + " " +
                                    resultSet.getString(2) + ", " +
                                    resultSet.getString(3));


                    }
                } else if (typeØvelser.equalsIgnoreCase("rygøvelser")) {
                    String mitQuery = "SELECT * FROM træningsøvelser.rygøvelser";
                    ResultSet resultSet = statement.executeQuery(mitQuery);
                    while (resultSet.next())
                        System.out.println(resultSet.getString(1) + " " +
                                resultSet.getString(2) + ", " +
                                resultSet.getString(3));

                    System.out.println("Ønsker du øget udfordring ? : ");
                    String ekstraUdfordring = scanner.nextLine();
                    if (ekstraUdfordring.equalsIgnoreCase("ja")) {
                        mitQuery = "SELECT * FROM træningsøvelser.ekstraudfordring";
                        resultSet = statement.executeQuery(mitQuery);
                        while (resultSet.next())
                            System.out.println(resultSet.getString(1) + " " +
                                    resultSet.getString(2) + ", " +
                                    resultSet.getString(3));


                    }
                } else if (typeØvelser.equalsIgnoreCase("brystøvelser")) {
                    String mitQuery = "SELECT * FROM træningsøvelser.brystøvelser";
                    ResultSet resultSet = statement.executeQuery(mitQuery);
                    while (resultSet.next())
                        System.out.println(resultSet.getString(1) + " " +
                                resultSet.getString(2) + ", " +
                                resultSet.getString(3));

                    System.out.println("Ønsker du øget udfordring ? : ");
                    String ekstraUdfordring = scanner.nextLine();
                    if (ekstraUdfordring.equalsIgnoreCase("ja")) {
                        mitQuery = "SELECT * FROM træningsøvelser.ekstraudfordring";
                        resultSet = statement.executeQuery(mitQuery);
                        while (resultSet.next())
                            System.out.println(resultSet.getString(1) + " " +
                                    resultSet.getString(2) + ", " +
                                    resultSet.getString(3));


                    }
                } else if (typeØvelser.equalsIgnoreCase("tricepsøvelser")) {
                    String mitQuery = "SELECT * FROM træningsøvelser.tricepsøvelser";
                    ResultSet resultSet = statement.executeQuery(mitQuery);
                    while (resultSet.next())
                        System.out.println(resultSet.getString(1) + " " +
                                resultSet.getString(2) + ", " +
                                resultSet.getString(3));

                    System.out.println("Ønsker du øget udfordring ? : ");
                    String ekstraUdfordring = scanner.nextLine();
                    if (ekstraUdfordring.equalsIgnoreCase("ja")) {
                        mitQuery = "SELECT * FROM træningsøvelser.ekstraudfordring";
                        resultSet = statement.executeQuery(mitQuery);
                        while (resultSet.next())
                            System.out.println(resultSet.getString(1) + " " +
                                    resultSet.getString(2) + ", " +
                                    resultSet.getString(3));


                    }
                } else if (typeØvelser.equalsIgnoreCase("skulderøvelser")) {
                    String mitQuery = "SELECT * FROM træningsøvelser.skulderøvelser";
                    ResultSet resultSet = statement.executeQuery(mitQuery);
                    while (resultSet.next())
                        System.out.println(resultSet.getString(1) + " " +
                                resultSet.getString(2) + ", " +
                                resultSet.getString(3));

                    System.out.println("Ønsker du øget udfordring ? : ");
                    String ekstraUdfordring = scanner.nextLine();
                    if (ekstraUdfordring.equalsIgnoreCase("ja")) {
                        mitQuery = "SELECT * FROM træningsøvelser.ekstraudfordring";
                        resultSet = statement.executeQuery(mitQuery);
                        while (resultSet.next())
                            System.out.println(resultSet.getString(1) + " " +
                                    resultSet.getString(2) + ", " +
                                    resultSet.getString(3));
                    }
                }
            }
            // #5. Close the connection (always!)
            connection.close();
            System.out.println();
        }
    }

