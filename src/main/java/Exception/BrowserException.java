package Exception;

@SuppressWarnings("serial")
public class BrowserException extends RuntimeException{
	
	public BrowserException() {
		super("I think you entered wrong driver so you entered chrom/firefox/edge ....");
	}

}
