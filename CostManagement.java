public class CostManagement {
	public static void main(String[] args) {
		CostManagement manage = new CostManagement();

		/// if user enter handleable data
		try {
			double todayCost = Double.parseDouble(args[0]);
			if (todayCost > 14000) {							/// over limit costs start
				manage.overLimitAndSug("callMom");
			} else if (todayCost > 12000) {
				manage.overLimitAndSug("Snack");
			} else if (todayCost > 10500) {
				manage.overLimitAndSug("Phone Bill");
			} else if (todayCost > 10000) {
				manage.overLimitAndSug("Flower for Soulmate"); /// over limit costs end
			} else if (todayCost == 10000) {
				System.out.println("Perfect... Keep That Balance for your future!\n");
			} else {
				int i = (int) todayCost;
				/// check if cost is double or integer and return value according to type
				String save = i == todayCost ? String.valueOf(10000 - i) : String.valueOf(10000 - todayCost);
				System.out.println("Respect... Keep exceed " + save + "MMK to money-box.\n");
			}
		}
		/// in case user enter data beyond number types
		catch (Exception e) {
			System.out.println("Please Enter Cost Only in Numbers(mmk)\n");
		}
	}

	/// Method to generate output for over limit costs
	void overLimitAndSug(String costToCut) {
		System.out.println("Oh... You're OVER LIMIT!");
		String suggestion = costToCut != "callMom" ? "You should reduce " + costToCut + " Cost for Tomorrow.\n"
				: "Mom... He don't want to be rich! Beat Him!\n";
		System.out.println(suggestion);
	}
}