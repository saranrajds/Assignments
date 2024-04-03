package abstractclassesandmethods.document;

public class DocumentDemo {

	public static void main(String[] args) {
		
		Document textDocument = new TextDocument();
		textDocument.getDocumentType();
		Document pdfDocument = new PDFDocument();
		pdfDocument.getDocumentType();
		Document imageDocument = new ImageDocument();
		imageDocument.getDocumentType();
	}
}
