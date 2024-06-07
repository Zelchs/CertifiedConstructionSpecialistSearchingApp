package io.codelex;

import com.opencsv.bean.CsvBindByPosition;

import java.util.Objects;

public class CertifiedConstructionSpecialist {
    @CsvBindByPosition(position = 0)
    private String specialistName;

    @CsvBindByPosition(position = 1)
    private String specialistLastName;

    @CsvBindByPosition(position = 2)
    private String certificateNumber;

    @CsvBindByPosition(position = 3)
    private String certificateDate;

    @CsvBindByPosition(position = 4)
    private String certificateActualStatus;

    @CsvBindByPosition(position = 5)
    private String scopeNumber;

    @CsvBindByPosition(position = 6)
    private String fieldOfActivity;

    @CsvBindByPosition(position = 7)
    private String responsibleCertificationBodyName;

    @CsvBindByPosition(position = 8)
    private String responsibleCertificationBodyRegistrationNumber;

    @CsvBindByPosition(position = 9)
    private String fieldOfActivityAssignmentDate;

    @CsvBindByPosition(position = 10)
    private String fieldOfActivityStatus;

    public String getSpecialistName() {
        return specialistName;
    }

    public void setSpecialistName(String specialistName) {
        this.specialistName = specialistName;
    }

    public String getSpecialistLastName() {
        return specialistLastName;
    }

    public void setSpecialistLastName(String specialistLastName) {
        this.specialistLastName = specialistLastName;
    }

    public String getCertificateNumber() {
        return certificateNumber;
    }

    public void setCertificateNumber(String certificateNumber) {
        this.certificateNumber = certificateNumber;
    }

    public String getCertificateDate() {
        return certificateDate;
    }

    public void setCertificateDate(String certificateDate) {
        this.certificateDate = certificateDate;
    }

    public String getCertificateActualStatus() {
        return certificateActualStatus;
    }

    public void setCertificateActualStatus(String certificateActualStatus) {
        this.certificateActualStatus = certificateActualStatus;
    }

    public String getScopeNumber() {
        return scopeNumber;
    }

    public void setScopeNumber(String scopeNumber) {
        this.scopeNumber = scopeNumber;
    }

    public String getFieldOfActivity() {
        return fieldOfActivity;
    }

    public void setFieldOfActivity(String fieldOfActivity) {
        this.fieldOfActivity = fieldOfActivity;
    }

    public String getResponsibleCertificationBodyName() {
        return responsibleCertificationBodyName;
    }

    public void setResponsibleCertificationBodyName(String responsibleCertificationBodyName) {
        this.responsibleCertificationBodyName = responsibleCertificationBodyName;
    }

    public String getResponsibleCertificationBodyRegistrationNumber() {
        return responsibleCertificationBodyRegistrationNumber;
    }

    public void setResponsibleCertificationBodyRegistrationNumber(String responsibleCertificationBodyRegistrationNumber) {
        this.responsibleCertificationBodyRegistrationNumber = responsibleCertificationBodyRegistrationNumber;
    }

    public String getFieldOfActivityAssignmentDate() {
        return fieldOfActivityAssignmentDate;
    }

    public void setFieldOfActivityAssignmentDate(String fieldOfActivityAssignmentDate) {
        this.fieldOfActivityAssignmentDate = fieldOfActivityAssignmentDate;
    }

    public String getFieldOfActivityStatus() {
        return fieldOfActivityStatus;
    }

    public void setFieldOfActivityStatus(String fieldOfActivityStatus) {
        this.fieldOfActivityStatus = fieldOfActivityStatus;
    }

    @Override
    public String toString() {
        return "CertifiedConstructionSpecialist{" +
                "specialistName='" + specialistName + '\'' +
                ", specialistLastName='" + specialistLastName + '\'' +
                ", certificateNumber='" + certificateNumber + '\'' +
                ", certificateDate='" + certificateDate + '\'' +
                ", certificateActualStatus='" + certificateActualStatus + '\'' +
                ", scopeNumber='" + scopeNumber + '\'' +
                ", fieldOfActivity='" + fieldOfActivity + '\'' +
                ", responsibleCertificationBodyName='" + responsibleCertificationBodyName + '\'' +
                ", responsibleCertificationBodyRegistrationNumber='" + responsibleCertificationBodyRegistrationNumber + '\'' +
                ", fieldOfActivityAssignmentDate='" + fieldOfActivityAssignmentDate + '\'' +
                ", fieldOfActivityStatus='" + fieldOfActivityStatus + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CertifiedConstructionSpecialist that = (CertifiedConstructionSpecialist) o;
        return Objects.equals(specialistName, that.specialistName) && Objects.equals(specialistLastName, that.specialistLastName) && Objects.equals(certificateNumber, that.certificateNumber) && Objects.equals(certificateDate, that.certificateDate) && Objects.equals(certificateActualStatus, that.certificateActualStatus) && Objects.equals(scopeNumber, that.scopeNumber) && Objects.equals(fieldOfActivity, that.fieldOfActivity) && Objects.equals(responsibleCertificationBodyName, that.responsibleCertificationBodyName) && Objects.equals(responsibleCertificationBodyRegistrationNumber, that.responsibleCertificationBodyRegistrationNumber) && Objects.equals(fieldOfActivityAssignmentDate, that.fieldOfActivityAssignmentDate) && Objects.equals(fieldOfActivityStatus, that.fieldOfActivityStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(specialistName, specialistLastName, certificateNumber, certificateDate, certificateActualStatus, scopeNumber, fieldOfActivity, responsibleCertificationBodyName, responsibleCertificationBodyRegistrationNumber, fieldOfActivityAssignmentDate, fieldOfActivityStatus);
    }
}
