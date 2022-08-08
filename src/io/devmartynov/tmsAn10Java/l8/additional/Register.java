package io.devmartynov.tmsAn10Java.l8.additional;

import io.devmartynov.tmsAn10Java.l8.additional.document.Document;

/**
 * Register
 */
public class Register {
    private static final int MAX_DOCUMENTS_COUNT = 10;
    private Document[] documents;

    /**
     * Ctor.
     */
    public Register() {
        this(new Document[MAX_DOCUMENTS_COUNT]);
    }

    /**
     * Ctor.
     *
     * @param documents documents
     */
    public Register(Document[] documents) {
        this.documents = documents;
    }

    public boolean saveDocument(Document document) {
        for (int i = 0; i < documents.length; i++) {
            if (documents[i] == null) {
                documents[i] = document;
                return true;
            }
        }
        return false;
    }

    public void displayDocumentInfo(Document document) {
        document.displayInfo();
    }
}
