package io.codelex;

import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class CertifiedConstructionSpecialistCSVReader {

    private final List<CertifiedConstructionSpecialist> certifiedConstructionSpecialists;

    public CertifiedConstructionSpecialistCSVReader(String csvUrl) {
        this.certifiedConstructionSpecialists = readCsv(csvUrl);
    }

    private List<CertifiedConstructionSpecialist> readCsv(String csvUrl) {
        List<CertifiedConstructionSpecialist> specialists = new ArrayList<>();

        try {
            URL url = new URI(csvUrl).toURL();
            BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream(), StandardCharsets.UTF_8));
            CsvToBean<CertifiedConstructionSpecialist> csvToBean = new CsvToBeanBuilder<CertifiedConstructionSpecialist>(br)
                    .withType(CertifiedConstructionSpecialist.class)
                    .withSeparator(',')
                    .build();

            for (CertifiedConstructionSpecialist specialist : csvToBean) {
                if ("Aktīvs".equals(specialist.getCertificateActualStatus())) {
                    specialists.add(specialist);
                }
            }

            br.close();
        } catch (URISyntaxException | IOException e) {
            throw new RuntimeException(e);
        }

        return specialists;
    }

    public List<CertifiedConstructionSpecialist> findSpecialistsbyLastName(String lastName) {
        List<CertifiedConstructionSpecialist> specialists = new ArrayList<>();
        for (CertifiedConstructionSpecialist specialist : certifiedConstructionSpecialists) {
            if (specialist.getSpecialistLastName().toLowerCase().contains(lastName.toLowerCase())) {
                specialists.add(specialist);
            }
        }
        return specialists;
    }

    public List<CertifiedConstructionSpecialist> findSpecialistsByFieldOfActivity(String keyword) {
        List<CertifiedConstructionSpecialist> specialists = new ArrayList<>();
        for (CertifiedConstructionSpecialist specialist : certifiedConstructionSpecialists) {
            if (specialist.getFieldOfActivity().toLowerCase().contains(keyword.toLowerCase())) {
                specialists.add(specialist);
            }
        }
        return specialists;
    }

    public List<CertifiedConstructionSpecialist> getCertifiedConstructionSpecialists() {
        return certifiedConstructionSpecialists;
    }
}
