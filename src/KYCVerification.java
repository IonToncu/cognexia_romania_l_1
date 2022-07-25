public class KYCVerification {
    private String panNumber;
    private long adharNumber;
    private String documentType;

    public KYCVerification(String panNumber, long adharNumber, String documentType, String documentNumber) {
        this.panNumber = panNumber;
        this.adharNumber = adharNumber;
        this.documentType = documentType;
        this.documentNumber = documentNumber;
    }

    @Override
    public String toString() {
        return "KYCVerification{" +
                "panNumber='" + panNumber + '\'' +
                ", adharNumber=" + adharNumber +
                ", documentType='" + documentType + '\'' +
                ", documentNumber='" + documentNumber + '\'' +
                '}';
    }

    private String documentNumber;

}
