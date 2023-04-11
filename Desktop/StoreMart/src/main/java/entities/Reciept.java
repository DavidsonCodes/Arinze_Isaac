package entities;

public class Reciept {
      private int numberOfItems;

      private double totalAmount;

      public Reciept(int numberOfItems, double totalAmount) {
            this.numberOfItems = numberOfItems;
            this.totalAmount = totalAmount;
      }
      public Reciept(){}

      public int getNumberOfItems() {
            return numberOfItems;
      }

      public void setNumberOfItems(int numberOfItems) {
            this.numberOfItems = numberOfItems;
      }

      public double getTotalAmount() {
            return totalAmount;
      }

      public void setTotalAmount(double totalAmount) {
            this.totalAmount = totalAmount;
      }

      @Override
      public String toString() {
            return "Reciept{" +
                    "numberOfItems=" + numberOfItems +
                    ", totalAmount=" + totalAmount +
                    '}';
      }
}
