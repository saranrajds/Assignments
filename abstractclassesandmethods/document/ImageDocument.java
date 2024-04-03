package abstractclassesandmethods.document;

public class ImageDocument extends Document{

	@Override
	public void Print() {
		System.out.println("PDFDocument Print");
	}

	public void getDocumentType() {
		System.out.println("ImageDocument");
	}
}
