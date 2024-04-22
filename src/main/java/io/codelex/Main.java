package io.codelex;

public class Main {
    public static void main(String[] args) {
        String csvUrl = "https://data.gov.lv/dati/dataset/f44f8d2f-4121-4494-b009-368f48992603/resource/443d4936-2b81-40a0-9f95-932f5b480c3f/download/sertificetie-buvspecialisti-22.04.2024.csv";

        CertifiedConstructionSpecialistCSVReader csvReader = new CertifiedConstructionSpecialistCSVReader(csvUrl);
        csvReader.getCertifiedConstructionSpecialists().forEach(System.out::println);

    }
}