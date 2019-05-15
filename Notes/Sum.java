class Sum{
      public static void main(String[] args){
      
      int sum=0;
      for(String data:args){
          int number=Integer.parseInt(data);
          sum=sum+number;
      }

      System.out.println("Sum: "+sum);
      
      }
}