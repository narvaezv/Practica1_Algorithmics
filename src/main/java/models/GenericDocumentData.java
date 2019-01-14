package models;

import java.util.List;

public class GenericDocumentData {

    private String euCode;
    private String name;
    private List<DocumentData> document;

    /**
     * @return the euCode
     */
    public String getEuCode() {
        return euCode;
    }

    /**
     * @param euCode the euCode to set
     */
    public void setEuCode(String euCode) {
        this.euCode = euCode;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the document
     */
    public List<DocumentData> getDocument() {
        return document;
    }

    /**
     * @param grupoA the document to set
     */
    public void setDocument(List<DocumentData> grupoA) {
        this.document = grupoA;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "GenericDocumentData [euCode=" + euCode + ", name=" + name + ", document=" + document + "]";
    }

}