import javax.swing.JOptionPane;
 
public class MovieTicket
 
{
	public static void main (String[] args )
	{
		String movieName;
		String inputStr;
		String outputStr;
		double adultTicketPrice;
		double childTicketPrice;
		int noOfAdultTicketsSold;
		int noOfChildTicketsSold;
		double percentDonation;
		double amountDonated;
		double netSaleAmount;
		double grossAmount;
 
		movieName = JOptionPane.showInputDialog("Enter the movie name: ");
 
		inputStr = JOptionPane.showInputDialog
			("Enter the price of an adult ticket: ");
		adultTicketPrice = Double.parseDouble(inputStr);
 
		inputStr = JOptionPane.showInputDialog
			("Enter the price of an child ticket: ");
		childTicketPrice = Double.parseDouble(inputStr);
 
		inputStr = JOptionPane.showInputDialog
			("Enter the number of an adult ticket sold : ");
		noOfAdultTicketsSold = Integer.parseInt(inputStr);
 
		inputStr = JOptionPane.showInputDialog
			("Enter the number of an child ticket sold : ");
		noOfChildTicketsSold = Integer.parseInt(inputStr);
 
		inputStr = JOptionPane.showInputDialog
			("Enter the percentage of the donation : ");
		percentDonation = Double.parseDouble(inputStr);
 
		grossAmount = adultTicketPrice * noOfAdultTicketsSold + childTicketPrice * noOfChildTicketsSold;
 
		amountDonated = grossAmount * percentDonation / 100;
 
		netSaleAmount = grossAmount - amountDonated;
 
		outputStr = " Movie Name: " + movieName + "\n"
			+ "Number of Ticket Sold: "
				+ (noOfAdultTicketsSold + noOfChildTicketsSold) + "\n"
					+ " Gross Amount: $"
						+ String.format("%.2f", grossAmount) + "\n"
							+ " Percentage of the Gross Amount Donated: "
								+ String.format("%.2f%%", percentDonation) + "\n"
									+ "Amount Donated: $"
										+ String.format("%.2f", amountDonated) + "\n"
											+ "Net Sale: $"
												+ String.format("%.2f", netSaleAmount);
 
				JOptionPane.showMessageDialog(null, outputStr,
					"Theater Sales Data",
							JOptionPane.INFORMATION_MESSAGE); 
	}
}