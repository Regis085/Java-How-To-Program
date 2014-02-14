package teste_End_Of_File;
import java.util.Scanner; 
public class EndOfFileTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
        // hasNext() blocks until something appears in the System.in
        // byte stream being processed by Scanner or an end of stream
        // occurs which is CTRL-Z in Windows and CTRL-D in UNIX/Linux
        // When hasNext() unblocks, it returns boolean false
        // if the stream ended or boolean true if the input was anything else
        // other than an end of input stream
        // repeat as long as we don't receive an end of input
        // i.e. CTRL-Z on Windows or CTRL-D on UNIX/Linux...
        while ( input.hasNext() ) { 
              System.out.println(input.nextLine());
        }
        input.close();
	}
	// para que o ctrl + z funcione mude o foco do console para outra área da IDE e depois volte.
}
