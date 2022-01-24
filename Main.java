class Main {
  public static void printDelim(String title) {
    System.out.println();
    System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
    System.out.println(title);
    System.out.println("+++++++++++++====+++++++++++++");
    System.out.println();
  }

  public static void main(String[] args) {
    printDelim("Демография");
    System.out.println("Name: Vova");
    System.out.println("Male: Man");
    printDelim("Возраст");
    System.out.println("Age: 47");
    printDelim("Финансы");
    System.out.println("Money: 35000");
    System.out.println("Debt: 800_000");
    printDelim("Локация");
    System.out.println("Touwn: Kovrov");
  }
}