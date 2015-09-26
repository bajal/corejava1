enum Drinks {
        COFFEE("hot", 10.0), TEA("hot", 5.0), JUICE("cold", 20.0), LASSI(8.0);
        String  state;
        double price;
        private Drinks(String s, double p) {
            state = s;
            price = p;
        }
        private Drinks(double p) {
            price = p;
        }
        private Drinks(Double p) {
            price = p; 
        }
        public String toString() {
             return "This Item is " + state + " and costs $" + price;
        }
     }
     class EnumThree {
      public static void main(String[] args) {
        System.out.println(Drinks.LASSI);    
      }
    }