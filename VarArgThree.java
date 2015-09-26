class VarArgThree {
       public void invoke(Integer j, int ... i) {
          System.out.println("Integer and Var-Arg invoked");
       }
       public void invoke(Integer i, Integer j) {
          System.out.println("Integer and Integer invoked");
       }
       public static void main(String[] args) {                 
            new VarArgThree().invoke(10, 'a');
			new VarArgThree().invoke(10, 1);
        }
    }