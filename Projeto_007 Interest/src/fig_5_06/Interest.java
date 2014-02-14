//Explicação: Página 160 e 161 do livro.
package fig_5_06;

public class Interest {

	public static void main(String[] args) {
		double amount;
		double principal = 1000.0;
		double rate = 0.05;

		System.out.printf("%s%20s\n", "Year", "Amount on deposit");

		for (int year = 1; year <= 10; year++) {
			amount = principal * Math.pow(1.0 + rate, year);

			System.out.printf("%4d%,20.2f\n", year, amount);
			// The comma (,) formatting flag indicates that the floating-point
			// value should be output with a grouping separator.
		}

	}
}
/*
 * The integer 20 between the % and the conversion charactersindicates that the
 * value should be displayed with a field widthof 20—that is,printfdisplays the
 * value with at least 20 character positions. If the value to be output is less
 * than 20 character positions wide (17 characters in this example), the value
 * isright justifiedinthefieldbydefault.Iftheyearvalue to be output were more
 * than four character positions wide, the field width would be extended to the
 * right to accommodate the entire value—this would push theamountfield to the
 * right, upsetting the neat columns of our tabular output. To output valuesleft
 * justified,simplyprecede the field width with theminus sign (–) formatting
 * flag(e.g.,%-20s).
 */