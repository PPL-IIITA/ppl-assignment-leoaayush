package pplq3;
/**
 * Details of a choosy girl
 * @author Aayush
 *
 */
public class Girl_choosy extends Girls {

	/**
	 * nameg-Name of the girl
	 */
		public String nameg ;// name of the girl		
	/**
	 * attg-attractiveness of the girl
	 */
		public int attg; // attractiveness of girl
		/**
		 * maintg-maintenance amount of the girl
		 */
		public int maintg;// maintainence cost of girl
		/**
		 * intelg-intelligence of the girl
		 */
		public int  intelg; // intelligence level of girl
		/**
		 *choice- type of boy required 1-most attractive 2- most rich 3-most intelligent
		 */
		public int choice; 
		/**
		 * flagg to check whether girl is single=0 or commited
		 */
		public int flagg=0;
	/**
	 *  type of girl 1-choosy 
	 */
		public int typeg;
		/**
		 * records the totalcost of gifts given to the girl
		 */
		public int totalcost;

}
