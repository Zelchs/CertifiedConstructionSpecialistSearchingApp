package io.codelex;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

public class CertifiedConstructionSpecialistSearchingApp {
    static LocalDate currentDate = LocalDate.now();
    static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
    static String formattedDate = currentDate.format(formatter);


    static final String CSV_URL = "https://data.gov.lv/dati/dataset/f44f8d2f-4121-4494-b009-368f48992603/resource/443d4936-2b81-40a0-9f95-932f5b480c3f/download/sertificetie-buvspecialisti-"
            + formattedDate
            + ".csv";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CertifiedConstructionSpecialistCSVReader csvReader = new CertifiedConstructionSpecialistCSVReader(CSV_URL);

        System.out.println("In this app you can search Certified Construction Specialists.");
        printSearchResults(scanner, csvReader);

    }

    private static void printSearchResults(Scanner scanner, CertifiedConstructionSpecialistCSVReader csvReader) {
        System.out.println("Search records by (lastname) or (activity) ?");
        String userInput = scanner.nextLine().trim().toLowerCase();

        if ("lastname".equals(userInput)) {
            searchByLastName(scanner, csvReader);
        } else if ("activity".equals(userInput)) {
            searchByActivity(scanner, csvReader);
        } else {
            System.out.println("Invalid input. Please enter (lastname) or (activity):");
        }
    }

    private static void searchByLastName(Scanner scanner, CertifiedConstructionSpecialistCSVReader csvReader) {
        System.out.println("Enter last name to search:");
        String lastName = scanner.nextLine();
        List<CertifiedConstructionSpecialist> results = csvReader.findSpecialistsbyLastName(lastName);
        printResults(scanner, results);
    }

    private static void searchByActivity(Scanner scanner, CertifiedConstructionSpecialistCSVReader csvReader) {
        System.out.println("Enter activity to search:");
        String keyword = scanner.nextLine();
        List<CertifiedConstructionSpecialist> results = csvReader.findSpecialistsByFieldOfActivity(keyword);
        printResults(scanner, results);
    }

    private static void printResults(Scanner scanner, List<CertifiedConstructionSpecialist> results) {
        if (results.isEmpty()) {
            System.out.println("No records found.");
            return;
        }

        int maxResultsToShow = 200;
        for (int i = 0; i < Math.min(results.size(), maxResultsToShow); i++) {
            System.out.println(results.get(i));
        }

        if (results.size() > maxResultsToShow) {
            printMoreResults(scanner, results.subList(maxResultsToShow, results.size()));
        }
    }

    private static void printMoreResults(Scanner scanner, List<CertifiedConstructionSpecialist> remainingResults) {
        System.out.println("\nMore than 200 results found. Do you want to list more (yes)/(no)?");
        String userInput = scanner.nextLine().trim().toLowerCase();
        if ("yes".equals(userInput)) {
            for (CertifiedConstructionSpecialist specialist : remainingResults) {
                System.out.println(specialist);
            }
        } else {
            System.out.println("No more results displayed.");
        }
    }

}